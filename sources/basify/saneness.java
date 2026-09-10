package basify;

import android.text.Editable;
import sakeen.taiyuan;

/* JADX INFO: compiled from: EmojiEditableFactory.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness extends Editable.Factory {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final Object f14954attabal = new Object();

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static Class<?> f14955dern;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public static volatile Editable.Factory f14956saneness;

    public saneness() {
        try {
            f14955dern = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, saneness.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f14956saneness == null) {
            synchronized (f14954attabal) {
                try {
                    if (f14956saneness == null) {
                        f14956saneness = new saneness();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f14956saneness;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f14955dern;
        return cls != null ? taiyuan.dern(cls, charSequence) : super.newEditable(charSequence);
    }
}
