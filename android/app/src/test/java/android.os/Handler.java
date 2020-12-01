package android.os;

import android.util.Printer;

/**
 * 单元测试模拟handler
 *
 * @author leo 251719087@qq.com
 * 2020/12/1 9:21 PM
 */
public class Handler {
    public Handler() {
    }

    public Handler(Handler.Callback callback) {
    }

    public Handler(Looper looper) {
    }

    public Handler(Looper looper, Handler.Callback callback) {
    }

    public void handleMessage(Message msg) {
    }

    public void dispatchMessage(Message msg) {
    }

    public static Handler createAsync(Looper looper) {
        return new Handler();
    }

    public static Handler createAsync(Looper looper, Handler.Callback callback) {
        return new Handler(looper, callback);
    }

    public String getMessageName(Message message) {
        return message.toString();
    }

    public final Message obtainMessage() {
        return new Message();
    }

    public final Message obtainMessage(int what) {
        Message message = new Message();
        message.what = what;
        return message;
    }

    public final Message obtainMessage(int what, Object obj) {
        Message message = obtainMessage();
        message.what = what;
        message.obj = obj;
        return message;
    }

    public final Message obtainMessage(int what, int arg1, int arg2) {
        Message message = obtainMessage();
        message.what = what;
        message.arg1 = arg1;
        message.arg2 = arg2;
        return message;
    }

    public final Message obtainMessage(int what, int arg1, int arg2, Object obj) {
        Message message = obtainMessage();
        message.what = what;
        message.arg1 = arg1;
        message.arg2 = arg2;
        message.obj = obj;
        return message;
    }

    public final boolean post(Runnable r) {
        r.run();
        return true;
    }

    public final boolean postAtTime(Runnable r, long uptimeMillis) {
        throw new RuntimeException("Stub!");
    }

    public final boolean postAtTime(Runnable r, Object token, long uptimeMillis) {
        throw new RuntimeException("Stub!");
    }

    public final boolean postDelayed(Runnable r, long delayMillis) {
        throw new RuntimeException("Stub!");
    }

    public final boolean postDelayed(Runnable r, Object token, long delayMillis) {
        throw new RuntimeException("Stub!");
    }

    public final boolean postAtFrontOfQueue(Runnable r) {
        r.run();
        return true;
    }

    public final void removeCallbacks(Runnable r) {
    }

    public final void removeCallbacks(Runnable r, Object token) {
    }

    public final boolean sendMessage(Message msg) {
        handleMessage(msg);
        return true;
    }

    public final boolean sendEmptyMessage(int what) {
        handleMessage(obtainMessage(what));
        return true;
    }

    public final boolean sendEmptyMessageDelayed(int what, long delayMillis) {
        throw new RuntimeException("Stub!");
    }

    public final boolean sendEmptyMessageAtTime(int what, long uptimeMillis) {
        throw new RuntimeException("Stub!");
    }

    public final boolean sendMessageDelayed(Message msg, long delayMillis) {
        throw new RuntimeException("Stub!");
    }

    public boolean sendMessageAtTime(Message msg, long uptimeMillis) {
        throw new RuntimeException("Stub!");
    }

    public final boolean sendMessageAtFrontOfQueue(Message msg) {
        throw new RuntimeException("Stub!");
    }

    public final void removeMessages(int what) {
    }

    public final void removeMessages(int what, Object object) {
    }

    public final void removeCallbacksAndMessages(Object token) {
    }

    public final boolean hasMessages(int what) {
       return true;
    }

    public final boolean hasMessages(int what, Object object) {
        return true;
    }

    public final Looper getLooper() {
        return null;
    }

    public final void dump(Printer pw, String prefix) {
    }

    public String toString() {
        return null;
    }

    public interface Callback {
        boolean handleMessage(Message var1);
    }
}

