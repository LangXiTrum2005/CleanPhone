package bh;

import ah.c;
import ak.i;
import android.media.MediaCodecInfo;
import android.util.Log;
import cn.w;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import f8.e;
import g8.f;
import java.util.List;
import java.util.Map;
import java.util.Set;
import jk.b;
import kotlin.jvm.internal.n;
import lj.m0;
import nj.g;
import tj.p0;
import tj.s0;
import tj.w0;
import wi.d;
import wj.h;
import wj.r;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5701a;

    public /* synthetic */ a(int i10) {
        this.f5701a = i10;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        int i10 = this.f5701a;
        boolean z10 = true;
        r rVar = r.f53297a;
        switch (i10) {
            case 0:
                Map.Entry it = (Map.Entry) obj;
                n.f(it, "it");
                return (List) it.getValue();
            case 1:
                i iVar = (i) obj;
                if (iVar instanceof w) {
                    return (w) iVar;
                }
                return null;
            case 2:
                jg.b it2 = (jg.b) obj;
                n.f(it2, "it");
                return it2.getLocation();
            case 3:
                e it3 = (e) obj;
                n.f(it3, "it");
                return d.i(it3.f40699a, " ", it3.f40700b ? "asc" : CampaignEx.JSON_KEY_DESC);
            case 4:
                n.d(obj, "null cannot be cast to non-null type kotlin.collections.Map<*, *>");
                Map map = (Map) obj;
                Object obj2 = map.get("column");
                n.d(obj2, "null cannot be cast to non-null type kotlin.String");
                String str = (String) obj2;
                Object obj3 = map.get("isAsc");
                n.d(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                return d.i(str, " ", ((Boolean) obj3).booleanValue() ? "ASC" : "DESC");
            case 5:
                dh.a f10 = (dh.a) obj;
                n.f(f10, "f");
                c cVar = f10.f38870b;
                return Boolean.valueOf((cVar == c.OTHER || cVar == c.OTHER_SCREENSHOTS) && f10.f38871c.size() < cVar.d());
            case 6:
                Map.Entry entry = (Map.Entry) obj;
                n.f(entry, "<destruct>");
                ah.d dVar = ((dh.b) entry.getValue()).f38877b;
                if (dVar != ah.d.VIDEO && dVar != ah.d.SCREEN_RECORDING) {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 7:
                Map.Entry entry2 = (Map.Entry) obj;
                n.f(entry2, "<destruct>");
                return (String) entry2.getKey();
            case 8:
                n.f((String) obj, "it");
                return "?";
            case 9:
                n.f((String) obj, "it");
                return "?";
            case 10:
                n.f((String) obj, "it");
                return "?";
            case 11:
                g8.e eVar = f.f41737a;
                n.f((String) obj, "it");
                return "?";
            case 12:
                return l1.d.e(((Integer) obj).intValue(), "media_type = ");
            case 13:
                Throwable th2 = ((m0) obj).f45414c;
                if (th2 != null) {
                    Log.e("IN_APP_PURCHASE", "userSelectedalternativeBilling handler error: " + th2);
                }
                return rVar;
            case 14:
                Throwable th3 = ((m0) obj).f45414c;
                if (th3 != null) {
                    Log.e("IN_APP_PURCHASE", "onBillingServiceDisconnected handler error: " + th3);
                }
                return rVar;
            case 15:
                Throwable th4 = ((m0) obj).f45414c;
                if (th4 != null) {
                    Log.e("IN_APP_PURCHASE", "onPurchaseUpdated handler error: " + th4);
                }
                return rVar;
            case 16:
                ((g) obj).getClass();
                return rVar;
            case 17:
                Throwable thA = h.a(((h) obj).f53286a);
                if (thA != null) {
                    Log.e("QuickActionsAndroid", "Failed to handle launch action: " + thA.getMessage());
                }
                return rVar;
            case 18:
                w0.b bVar = (w0.b) obj;
                w0.d dVar2 = rc.i.f49564c;
                long j10 = 0;
                for (Map.Entry entry3 : bVar.a().entrySet()) {
                    if (entry3.getValue() instanceof Set) {
                        w0.d dVar3 = (w0.d) entry3.getKey();
                        Set set = (Set) entry3.getValue();
                        String strB = rc.i.b(System.currentTimeMillis());
                        if (set.contains(strB)) {
                            bVar.e(dVar3, Set.of(strB));
                            j10++;
                        } else {
                            bVar.d(dVar3);
                        }
                    }
                }
                if (j10 == 0) {
                    bVar.d(dVar2);
                } else {
                    bVar.e(dVar2, Long.valueOf(j10));
                }
                return null;
            case 19:
                n.f((String) obj, "it");
                return "?";
            case 20:
                n.f((String) obj, "it");
                return "?";
            case 21:
                n.f((String) obj, "it");
                return "?";
            case 22:
                n.f((String) obj, "it");
                return "?";
            case 23:
                n.f((String) obj, "it");
                return "?";
            case 24:
                return null;
            case 25:
                int i11 = p0.f50884h;
                return null;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_LOAD_STARTED_AD_VIEWER_VALUE:
                int i12 = s0.f50904c;
                return null;
            case 27:
                int i13 = w0.f50927d;
                return null;
            case DIAGNOSTIC_EVENT_TYPE_NATIVE_MEMORY_WARNING_VALUE:
                s0.b ex = (s0.b) obj;
                n.f(ex, "ex");
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", ex);
                return xd.h.f53754b;
            default:
                MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) obj;
                String name = mediaCodecInfo.getName();
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                n.e(supportedTypes, "getSupportedTypes(...)");
                return q4.a.i(name, " (", k.v0(supportedTypes, null, null, null, null, 63), ")");
        }
    }

    public /* synthetic */ a(Object obj, int i10) {
        this.f5701a = i10;
    }
}
