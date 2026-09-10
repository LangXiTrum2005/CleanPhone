package A;

import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.WindowInsets;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAudio;
import com.inmobi.media.AbstractC3148nb;
import com.inmobi.media.AbstractC3230se;
import com.inmobi.media.AbstractC3294we;
import com.inmobi.media.C2960c1;
import com.inmobi.media.C2967c8;
import com.inmobi.media.C2978d2;
import com.inmobi.media.C3011f2;
import com.inmobi.media.C3016f7;
import com.inmobi.media.C3074j1;
import com.inmobi.media.C3088k;
import com.inmobi.media.C3114l9;
import com.inmobi.media.C3127m6;
import com.inmobi.media.C3164ob;
import com.inmobi.media.C3177p8;
import com.inmobi.media.C3193q8;
import com.inmobi.media.C3233t1;
import com.inmobi.media.C3338za;
import com.inmobi.media.D1;
import com.inmobi.media.D9;
import com.inmobi.media.E1;
import com.inmobi.media.E6;
import com.inmobi.media.F6;
import com.inmobi.media.GestureDetectorOnGestureListenerC3005ec;
import com.inmobi.media.H7;
import com.inmobi.media.Hd;
import com.inmobi.media.Ia;
import com.inmobi.media.J6;
import com.inmobi.media.Ma;
import com.inmobi.media.Q8;
import com.inmobi.media.S0;
import com.inmobi.media.T8;
import com.inmobi.media.U3;
import com.inmobi.media.Xe;
import com.inmobi.media.Yd;
import java.io.IOException;
import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: A.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC0905n implements Runnable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f3186Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ RunnableC0905n(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f3186Y = obj;
        this.Z = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException, IOException {
        switch (this.X) {
            case 0:
                D9.a((Q8) this.f3186Y, (T8) this.Z);
                break;
            case 1:
                E1.a((E1) this.f3186Y, (InMobiAudio) this.Z);
                break;
            case 2:
                E6.a((E6) this.f3186Y, (C3011f2) this.Z);
                break;
            case 3:
                H7.a((C2978d2) this.f3186Y, (H7) this.Z);
                break;
            case 4:
                Hd.a((Intent) this.f3186Y, (Context) this.Z);
                break;
            case 5:
                Ia.a((Ia) this.f3186Y, (String) this.Z);
                break;
            case 6:
                com.inmobi.media.J0.a((C3177p8) this.f3186Y, (S0) this.Z);
                break;
            case 7:
                J6.a((LinkedHashMap) this.f3186Y, (F6) this.Z);
                break;
            case 8:
                Ma.a((Ma) this.f3186Y, (C3338za) this.Z);
                break;
            case 9:
                S0.a((S0) this.f3186Y, (Yd) this.Z);
                break;
            case 10:
                S0.a((S0) this.f3186Y, (JSONObject) this.Z);
                break;
            case 11:
                S0.a((Context) this.f3186Y, (S0) this.Z);
                break;
            case 12:
                U3.a((Integer) this.f3186Y, (Context) this.Z);
                break;
            case 13:
                U3.b((WindowInsets) this.f3186Y, (Context) this.Z);
                break;
            case 14:
                U3.a((LinkedHashMap) this.f3186Y, (Context) this.Z);
                break;
            case 15:
                C2960c1.a((C2960c1) this.f3186Y, (ApplicationExitInfo) this.Z);
                break;
            case 16:
                C2967c8.a((C2967c8) this.f3186Y, (Xe) this.Z);
                break;
            case 17:
                GestureDetectorOnGestureListenerC3005ec.b((GestureDetectorOnGestureListenerC3005ec) this.f3186Y, (String) this.Z);
                break;
            case 18:
                C3016f7.a((C3016f7) this.f3186Y, (Context) this.Z);
                break;
            case 19:
                C3074j1.a((Context) this.f3186Y, (C3074j1) this.Z);
                break;
            case 20:
                C3114l9.a((C3114l9) this.f3186Y, (Uri) this.Z);
                break;
            case 21:
                C3127m6.a((C3127m6) this.f3186Y, (com.inmobi.media.F0) this.Z);
                break;
            case 22:
                C3164ob.a((Function1) this.f3186Y, (AbstractC3148nb) this.Z);
                break;
            case 23:
                C3193q8.a(this.f3186Y, (C3193q8) this.Z);
                break;
            case 24:
                AbstractC3230se.a((AbstractC3230se) this.f3186Y, this.Z);
                break;
            case 25:
                C3233t1.b((C3088k) this.f3186Y, (String) this.Z);
                break;
            case 26:
                AbstractC3294we.a((AbstractC3294we) this.f3186Y, (Yd) this.Z);
                break;
            case 27:
                AbstractC3294we.a((AbstractC3294we) this.f3186Y, (AdMetaInfo) this.Z);
                break;
            case 28:
                AbstractC3294we.a((AbstractC3294we) this.f3186Y, (D1) this.Z);
                break;
            default:
                AbstractC3294we.a((AbstractC3294we) this.f3186Y, (byte[]) this.Z);
                break;
        }
    }
}
