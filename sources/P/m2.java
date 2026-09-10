package p;

import android.widget.EditText;
import androidx.appcompat.widget.SwitchCompat;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 extends x0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47722a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f47723b;

    public m2(EditText editText) {
        this.f47723b = new WeakReference(editText);
    }

    @Override // x0.e
    public void a() {
        switch (this.f47722a) {
            case 0:
                SwitchCompat switchCompat = (SwitchCompat) this.f47723b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
        }
    }

    @Override // x0.e
    public final void b() {
        switch (this.f47722a) {
            case 0:
                SwitchCompat switchCompat = (SwitchCompat) this.f47723b.get();
                if (switchCompat != null) {
                    switchCompat.c();
                }
                break;
            default:
                z0.h.a((EditText) this.f47723b.get(), 1);
                break;
        }
    }

    public m2(SwitchCompat switchCompat) {
        this.f47723b = new WeakReference(switchCompat);
    }
}
