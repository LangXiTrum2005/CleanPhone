package kotlin.jvm.internal;

import androidx.datastore.preferences.protobuf.a;
import java.io.Serializable;
import kotlin.reflect.KDeclarationContainer;

/* JADX INFO: loaded from: classes7.dex */
public class AdaptedFunctionReference implements FunctionBase, Serializable {
    private final int arity;
    private final int flags;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private final String signature;

    public AdaptedFunctionReference(Class cls) {
        this(9, CallableReference.NO_RECEIVER, cls, "<init>", "<init>(Lcom/chartboost/sdk/internal/AdUnitManager/loaders/AdUnitLoader;Lcom/chartboost/sdk/internal/AdUnitManager/render/AdUnitRenderer;Lcom/chartboost/sdk/internal/UiPoster;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/ScheduledExecutorService;Lcom/chartboost/sdk/internal/api/AdApiCallbackSender;Lcom/chartboost/sdk/tracking/Session;Lcom/chartboost/sdk/internal/utils/Base64Wrapper;Lcom/chartboost/sdk/tracking/EventTrackerExtensions;Lkotlin/jvm/functions/Function0;)V", 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdaptedFunctionReference)) {
            return false;
        }
        AdaptedFunctionReference adaptedFunctionReference = (AdaptedFunctionReference) obj;
        return this.isTopLevel == adaptedFunctionReference.isTopLevel && this.arity == adaptedFunctionReference.arity && this.flags == adaptedFunctionReference.flags && Intrinsics.a(this.receiver, adaptedFunctionReference.receiver) && Intrinsics.a(this.owner, adaptedFunctionReference.owner) && this.name.equals(adaptedFunctionReference.name) && this.signature.equals(adaptedFunctionReference.signature);
    }

    @Override // kotlin.jvm.internal.FunctionBase
    public int getArity() {
        return this.arity;
    }

    public KDeclarationContainer getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? Reflection.f43333a.c(cls, "") : Reflection.f43333a.b(cls);
    }

    public int hashCode() {
        Object obj = this.receiver;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
        Class cls = this.owner;
        return ((((a.b(this.signature, a.b(this.name, (iHashCode + (cls != null ? cls.hashCode() : 0)) * 31, 31), 31) + (this.isTopLevel ? 1231 : 1237)) * 31) + this.arity) * 31) + this.flags;
    }

    public String toString() {
        return Reflection.f43333a.k(this);
    }

    public AdaptedFunctionReference(int i2, Object obj, Class cls, String str, String str2, int i3) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = false;
        this.arity = i2;
        this.flags = i3 >> 1;
    }
}
