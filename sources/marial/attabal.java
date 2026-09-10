package marial;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.X3;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ActivityResultContract.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\nB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u000f\u001a\u00028\u00012\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00112\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lmarial/attabal;", "I", "O", "", "<init>", "()V", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "attabal", "(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;", "", X3.f.f, "intent", "dern", "(ILandroid/content/Intent;)Ljava/lang/Object;", "Lmarial/attabal$attabal;", "saneness", "(Landroid/content/Context;Ljava/lang/Object;)Lmarial/attabal$attabal;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class attabal<I, O> {

    /* JADX INFO: renamed from: marial.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ActivityResultContract.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lmarial/attabal$attabal;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "value", "<init>", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "attabal", "()Ljava/lang/Object;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0727attabal<T> {
        private final T value;

        public C0727attabal(T t) {
            this.value = t;
        }

        public final T attabal() {
            return this.value;
        }
    }

    public abstract Intent attabal(Context context, I input);

    public abstract O dern(int resultCode, Intent intent);

    public C0727attabal<O> saneness(Context context, I input) {
        Intrinsics.checkNotNullParameter(context, "context");
        return null;
    }
}
