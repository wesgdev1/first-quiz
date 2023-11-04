package org.velezreyes.quiz.question6;

public class VendingMachineImpl implements VendingMachine {

  public static VendingMachine getInstance() {
    
    return new VendingMachineImpl();
    
  }

   private boolean quarterInserted = false;

    @Override
    public void insertQuarter() {
        quarterInserted = true;
    }

    @Override
    public Drink pressButton(String name) throws NotEnoughMoneyException, UnknownDrinkException {
        if (!quarterInserted) {
            throw new NotEnoughMoneyException();
        }

        if ("ScottCola".equals(name)) {
            quarterInserted = false;
            return new ScottCola();
        } else if ("KarenTea".equals(name)) {
            if (quarterInserted) {
                quarterInserted = false;
                return new KarenTea();
            } else {
                throw new NotEnoughMoneyException();
            }
        } else {
            throw new UnknownDrinkException();
        }
    }

    private class ScottCola implements Drink {
        @Override
        public String getName() {
            return "ScottCola";
        }

        @Override
        public boolean isFizzy() {
            return true;
        }
    }

    private class KarenTea implements Drink {
        @Override
        public String getName() {
            return "KarenTea";
        }

        @Override
        public boolean isFizzy() {
            return false;
        }
    }
}
