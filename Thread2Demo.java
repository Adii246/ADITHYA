package java_lab;
import java.util.Random;

class NumberManager {
    private int generatedNumber;
    private boolean numberGenerated = false;
    
    public synchronized void generateNumber() {
        
        generatedNumber = new Random().nextInt(99) + 2;
        System.out.println("Generated Number: " + generatedNumber);
        numberGenerated = true;
        notifyAll();
    }

    public synchronized void caculateSquare() {
        try {
            while (!numberGenerated || generatedNumber % 2 != 0) {
                wait();
            }
          
            System.out.println("The random number is even and it's squre is:"+generatedNumber*generatedNumber);
            numberGenerated = false;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void calculateCube() {
        try {
          
            while (!numberGenerated || generatedNumber % 2 == 0) {
                wait();
            }
            System.out.println("The random number is odd and it's cube is:"+generatedNumber*generatedNumber*generatedNumber);
            numberGenerated = false;

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class NumberGenerator extends Thread {
    private NumberManager numberManager;

    public NumberGenerator(NumberManager numberManager) {
        this.numberManager = numberManager;
    }

    public void run() {
        while (true) {
            numberManager.generateNumber();

            try {        
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class EvenSquareThread extends Thread {
    private NumberManager numberManager;

    public EvenSquareThread(NumberManager numberManager) {
        this.numberManager = numberManager;
    }

    public void run() {
        while (true) {
            numberManager.caculateSquare();
        }
    }
}

class OddCubeThread extends Thread {
    private NumberManager numberManager;

    public OddCubeThread(NumberManager numberManager) {
        this.numberManager = numberManager;
    }

    public void run() {
        while (true) {
            numberManager.calculateCube();
        }
    }
}

   public class Thread2Demo{
    public static void main(String[] args) {
        NumberManager numberManager = new NumberManager();     
        NumberGenerator numberGenerator = new NumberGenerator(numberManager);
        EvenSquareThread EvenSquareThread = new EvenSquareThread(numberManager);
        OddCubeThread OddCubeThread = new OddCubeThread(numberManager);      
        numberGenerator.start();
        EvenSquareThread.start();
        OddCubeThread.start();
    }
}