package y7;

import android.app.Dialog;
import androidx.fragment.app.FragmentActivity;
import com.storage.androidcleaner.R;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f54235a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, FragmentActivity fragmentActivity) {
        super(fragmentActivity, R.style.com_facebook_auth_dialog);
        this.f54235a = hVar;
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f54235a.getClass();
        super.onBackPressed();
    }
}
