public class Main {
    public static void main(String[] args) {

        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListenerlistener = System.out::println;

        Worker worker = new Worker(listener, errorListenerlistener);
        worker.start();
    }
}

@FunctionalInterface
interface OnTaskDoneListener {
    void onDone(String result);
}

@FunctionalInterface
interface OnTaskErrorListener {
    void onError(String result);
}