package habitue;

import bren.wireman;
import com.google.android.gms.ads.RequestConfiguration;
import kurbash.formularize;
import p002kotlin.Metadata;
import p002kotlin.UninitializedPropertyAccessException;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: NotNUllVar.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\r\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013¨\u0006\u0014"}, d2 = {"Lhabitue/saneness;", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lbren/wireman;", "", "once", "<init>", "(Z)V", "thisRef", "Lkurbash/formularize;", "property", "getValue", "(Ljava/lang/Object;Lkurbash/formularize;)Ljava/lang/Object;", "value", "", "setValue", "(Ljava/lang/Object;Lkurbash/formularize;Ljava/lang/Object;)V", "attabal", "Z", "Ljava/lang/Object;", "tools_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class saneness<T> implements wireman<Object, T> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final boolean once;
    private T value;

    public saneness(boolean z) {
        this.once = z;
    }

    @Override // bren.wireman, bren.dern
    public T getValue(Object thisRef, formularize<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        T t = this.value;
        if (t != null) {
            return t;
        }
        throw new UninitializedPropertyAccessException(property.getName() + " 未初始化");
    }

    @Override // bren.wireman
    public void setValue(Object thisRef, formularize<?> property, T value) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        Intrinsics.checkNotNullParameter(value, "value");
        T t = this.value;
        if (t == null || !(t == null || this.once)) {
            this.value = value;
        } else if (this.once) {
            throw new IllegalStateException(property.getName() + " 已经初始化，不能再次设置");
        }
    }
}
