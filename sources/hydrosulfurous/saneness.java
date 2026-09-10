package hydrosulfurous;

import kotlinx.coroutines.merc;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\u0003J\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lhydrosulfurous/saneness;", "Lhydrosulfurous/marial;", "<init>", "()V", "", "parallelism", "", "name", "Lkotlinx/coroutines/merc;", "sayid", "(ILjava/lang/String;)Lkotlinx/coroutines/merc;", "", "close", "toString", "()Ljava/lang/String;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class saneness extends marial {

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final saneness f28333dovishness = new saneness();

    public saneness() {
        super(taiyuan.f28336dern, taiyuan.f28339wireman, taiyuan.f28337marial, taiyuan.f28334attabal);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.merc
    public merc sayid(int parallelism, String name) {
        pigboat.apical.attabal(parallelism);
        return parallelism >= taiyuan.f28336dern ? pigboat.apical.saneness(this, name) : super.sayid(parallelism, name);
    }

    @Override // kotlinx.coroutines.merc
    /* JADX INFO: renamed from: toString */
    public String getName() {
        return "Dispatchers.Default";
    }
}
