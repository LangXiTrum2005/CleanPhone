package j1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import bc.s;
import l1.w;
import p1.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f43576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f43577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f43578c;

    public a(s sVar, w wVar, v vVar) {
        this.f43578c = sVar;
        this.f43577b = wVar;
        this.f43576a = vVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
            this.f43577b.c(new com.mbridge.msdk.config.component.info.provider.subprovider.f(this, 18));
        }
    }
}
