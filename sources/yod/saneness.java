package yod;

/* JADX INFO: compiled from: MiddleOutStrategy.java */
/* JADX INFO: loaded from: classes3.dex */
public class saneness implements wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f39744attabal;

    public saneness(int i) {
        this.f39744attabal = i;
    }

    @Override // yod.wireman
    public StackTraceElement[] attabal(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i = this.f39744attabal;
        if (length <= i) {
            return stackTraceElementArr;
        }
        int i2 = i / 2;
        int i3 = i - i2;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i3);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i2, stackTraceElementArr2, i3, i2);
        return stackTraceElementArr2;
    }
}
