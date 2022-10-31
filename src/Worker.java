

public class Worker{

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }
    //public Worker(OnTaskErrorListener errorCallback) { this.errorCallback = errorCallback; }

//    @FunctionalInterface
//    interface OnTaskDoneListener {
//        void onDone(String result);
//    }

//    @FunctionalInterface
//    interface OnTaskErrorListener {
//        void onError(String result);
//    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " is Error");
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }
    }
}
