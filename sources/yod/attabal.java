package yod;

/* JADX INFO: compiled from: MiddleOutFallbackStrategy.java */
/* JADX INFO: loaded from: classes3.dex */
public class attabal implements wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final int f39736attabal;

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public final saneness f39737dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final wireman[] f39738saneness;

    public attabal(int i, wireman... wiremanVarArr) {
        this.f39736attabal = i;
        this.f39738saneness = wiremanVarArr;
        this.f39737dern = new saneness(i);
    }

    @Override // yod.wireman
    public StackTraceElement[] attabal(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f39736attabal) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrAttabal = stackTraceElementArr;
        for (wireman wiremanVar : this.f39738saneness) {
            if (stackTraceElementArrAttabal.length <= this.f39736attabal) {
                break;
            }
            stackTraceElementArrAttabal = wiremanVar.attabal(stackTraceElementArr);
        }
        return stackTraceElementArrAttabal.length > this.f39736attabal ? this.f39737dern.attabal(stackTraceElementArrAttabal) : stackTraceElementArrAttabal;
    }
}
