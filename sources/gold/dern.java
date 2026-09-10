package gold;

import org.objectweb.asm.Opcodes;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: TaskQueue.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgold/dern;", "Lgold/attabal;", "", "beachfront", "()J", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = Opcodes.ARETURN)
public final class dern extends attabal {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f27332beachfront;

    /* JADX INFO: renamed from: marial, reason: collision with root package name */
    public final /* synthetic */ boolean f27333marial;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name */
    public final /* synthetic */ String f27334wireman;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dern(String str, boolean z, Function0<Unit> function0) {
        super(str, z);
        this.f27334wireman = str;
        this.f27333marial = z;
        this.f27332beachfront = function0;
    }

    @Override // gold.attabal
    public long beachfront() {
        this.f27332beachfront.invoke();
        return -1L;
    }
}
