package uh;

import b2.w;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.qm;
import java.util.HashMap;
import java.util.Objects;
import m0.s1;
import m5.k;
import n5.i;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends QueryInfoGenerationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f52212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f52213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f52214c;

    public /* synthetic */ a(int i10) {
        this.f52212a = i10;
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onFailure(String str) {
        i iVar;
        i iVar2;
        switch (this.f52212a) {
            case 0:
                k kVar = (k) this.f52214c;
                ((s1) kVar.f45903c).f45752c = str;
                w wVar = (w) kVar.f45902b;
                synchronized (wVar) {
                    int i10 = wVar.f5410b - 1;
                    wVar.f5410b = i10;
                    if (i10 <= 0 && (iVar = (i) wVar.f5411c) != null) {
                        iVar.run();
                    }
                    break;
                }
                return;
            case 1:
                k kVar2 = (k) this.f52214c;
                ((s1) kVar2.f45903c).f45752c = str;
                w wVar2 = (w) kVar2.f45902b;
                synchronized (wVar2) {
                    int i11 = wVar2.f5410b - 1;
                    wVar2.f5410b = i11;
                    if (i11 <= 0 && (iVar2 = (i) wVar2.f5411c) != null) {
                        iVar2.run();
                    }
                    break;
                }
                return;
            default:
                int i12 = zze.zza;
                zzo.zzi("Failed to generate query info for Custom Tab error: ".concat(String.valueOf(str)));
                try {
                    qm qmVar = (qm) this.f52214c;
                    qmVar.f19121g.a(qmVar.b(this.f52213b, str).toString());
                    return;
                } catch (JSONException e10) {
                    zzo.zzg("Error creating PACT Error Response JSON: ", e10);
                    return;
                }
        }
    }

    @Override // com.google.android.gms.ads.query.QueryInfoGenerationCallback
    public final void onSuccess(QueryInfo queryInfo) {
        i iVar;
        i iVar2;
        switch (this.f52212a) {
            case 0:
                k kVar = (k) this.f52214c;
                ((HashMap) ((s1) kVar.f45903c).f45751b).put(this.f52213b, queryInfo.getQuery());
                w wVar = (w) kVar.f45902b;
                synchronized (wVar) {
                    int i10 = wVar.f5410b - 1;
                    wVar.f5410b = i10;
                    if (i10 <= 0 && (iVar = (i) wVar.f5411c) != null) {
                        iVar.run();
                    }
                    break;
                }
                return;
            case 1:
                k kVar2 = (k) this.f52214c;
                ((HashMap) ((s1) kVar2.f45903c).f45751b).put(this.f52213b, queryInfo.getQuery());
                w wVar2 = (w) kVar2.f45902b;
                synchronized (wVar2) {
                    int i11 = wVar2.f5410b - 1;
                    wVar2.f5410b = i11;
                    if (i11 <= 0 && (iVar2 = (i) wVar2.f5411c) != null) {
                        iVar2.run();
                    }
                    break;
                }
                return;
            default:
                String query = queryInfo.getQuery();
                try {
                    qm qmVar = (qm) this.f52214c;
                    qmVar.f19121g.a(qmVar.c(this.f52213b, query).toString());
                    return;
                } catch (JSONException e10) {
                    int i12 = zze.zza;
                    zzo.zzg("Error creating PACT Signal Response JSON: ", e10);
                    return;
                }
        }
    }

    public a(qm qmVar, String str) {
        this.f52212a = 2;
        this.f52213b = str;
        Objects.requireNonNull(qmVar);
        this.f52214c = qmVar;
    }
}
