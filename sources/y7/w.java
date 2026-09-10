package y7;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import q7.l0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends l0 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f54319o = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f54320n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(FragmentActivity context, String str, String customRedirectUri) {
        super(context, str);
        kotlin.jvm.internal.n.f(context, "context");
        kotlin.jvm.internal.n.f(customRedirectUri, "customRedirectUri");
        this.f54320n = customRedirectUri;
        this.f48712b = customRedirectUri;
    }

    @Override // q7.l0
    public final Bundle c(String str) {
        String str2 = this.f54320n;
        if (str2.length() <= 0 || !an.p.p0(str, str2, false)) {
            return super.c(str);
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            getContext().startActivity(intent);
            dismiss();
        } catch (Exception e10) {
            e(new l7.m("Failed to launch custom redirect: " + e10.getMessage(), -1, str));
        }
        return new Bundle();
    }
}
