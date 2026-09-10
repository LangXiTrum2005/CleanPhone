package z0;

import android.text.Editable;
import x0.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f54597a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f54598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f54599c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f54599c;
        return cls != null ? new p(cls, charSequence) : super.newEditable(charSequence);
    }
}
