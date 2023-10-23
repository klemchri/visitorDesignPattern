package AnderePatterns.Bridge;

// Laute für verschiedene Tiere
class MiauLaut implements LautImplementierung {
    @Override
    public void macheLaut() {
        System.out.println("Miau");
    }
}
