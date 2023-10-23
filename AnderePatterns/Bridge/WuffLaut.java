package AnderePatterns.Bridge;

class WuffLaut implements LautImplementierung {
    @Override
    public void macheLaut() {
        System.out.println("Wuff");
    }
}