package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.app.UiModeManager;
import android.os.ParcelFileDescriptor;
import android.view.View;
import com.google.android.gms.ads.rewarded.RewardedAd;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class Dn0 implements Vm0, Em0, Lm0, InterfaceC3854kB, DZ, InterfaceC2763St, InterfaceC4507rg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2990a;
    public final Object b;

    public /* synthetic */ Dn0(Object obj, int i) {
        this.f2990a = i;
        this.b = obj;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Vm0, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Em0, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lm0
    public final JSONObject a(View view) {
        int currentModeType;
        int currentModeType2;
        int currentModeType3;
        int i = 2;
        switch (this.f2990a) {
            case 0:
                JSONObject jSONObjectA = En0.a(0, 0, 0, 0);
                UiModeManager uiModeManager = AbstractC2995aW.e;
                if (uiModeManager != null && (currentModeType = uiModeManager.getCurrentModeType()) != 1 && currentModeType == 4) {
                    i = FW.f;
                }
                try {
                    jSONObjectA.put("noOutputDevice", An0.f2836a[DM.D(i)] == 1);
                    break;
                } catch (JSONException unused) {
                }
                return jSONObjectA;
            case 1:
                JSONObject jSONObjectA2 = Gn0.a(0, 0, 0, 0);
                UiModeManager uiModeManager2 = AbstractC2871Wx.k;
                if (uiModeManager2 != null && (currentModeType2 = uiModeManager2.getCurrentModeType()) != 1 && currentModeType2 == 4) {
                    i = BF.j;
                }
                try {
                    jSONObjectA2.put("noOutputDevice", AbstractC5137yn0.f5299a[DM.D(i)] == 1);
                    break;
                } catch (JSONException unused2) {
                }
                return jSONObjectA2;
            default:
                JSONObject jSONObjectA3 = In0.a(0, 0, 0, 0);
                UiModeManager uiModeManager3 = WD.j;
                if (uiModeManager3 != null && (currentModeType3 = uiModeManager3.getCurrentModeType()) != 1 && currentModeType3 == 4) {
                    i = AbstractC4496rb.p;
                }
                try {
                    jSONObjectA3.put("noOutputDevice", AbstractC5225zn0.f5343a[DM.D(i)] == 1);
                    break;
                } catch (JSONException unused3) {
                }
                return jSONObjectA3;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB b(C2346Cr c2346Cr) {
        InterfaceC3854kB interfaceC3854kB = (InterfaceC3854kB) this.b;
        if (interfaceC3854kB != null) {
            return interfaceC3854kB.b(c2346Cr);
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3416fB build() {
        InterfaceC3854kB interfaceC3854kB = (InterfaceC3854kB) this.b;
        if (interfaceC3854kB != null) {
            return interfaceC3854kB.build();
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB c() {
        InterfaceC3854kB interfaceC3854kB = (InterfaceC3854kB) this.b;
        if (interfaceC3854kB != null) {
            return interfaceC3854kB.c();
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB d(LD ld) {
        InterfaceC3854kB interfaceC3854kB = (InterfaceC3854kB) this.b;
        if (interfaceC3854kB != null) {
            return interfaceC3854kB.d(ld);
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4507rg0
    public final FileChannel e() throws IOException {
        Object obj = this.b;
        if (((ParcelFileDescriptor) obj).getStatSize() != -1) {
            return new ParcelFileDescriptor.AutoCloseInputStream((ParcelFileDescriptor) obj).getChannel();
        }
        ((ParcelFileDescriptor) obj).close();
        throw new IllegalArgumentException("Not a file: " + ((ParcelFileDescriptor) obj));
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Lm0
    public final void f(View view, JSONObject jSONObject, Bm0 bm0, boolean z, boolean z2) {
        Iterator it = r().iterator();
        while (it.hasNext()) {
            ((C3008ae0) bm0).a((View) it.next(), (Lm0) this.b, jSONObject, z2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB g() {
        InterfaceC3854kB interfaceC3854kB = (InterfaceC3854kB) this.b;
        if (interfaceC3854kB != null) {
            return interfaceC3854kB.g();
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB h(L8 l8) {
        InterfaceC3854kB interfaceC3854kB = (InterfaceC3854kB) this.b;
        if (interfaceC3854kB != null) {
            return interfaceC3854kB.h(l8);
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Em0
    public final void i(View view, JSONObject jSONObject, Am0 am0, boolean z, boolean z2) {
        Iterator it = r().iterator();
        while (it.hasNext()) {
            ((Zd0) am0).a((View) it.next(), (Em0) this.b, jSONObject, z2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB j(C2443Gk c2443Gk) {
        InterfaceC3854kB interfaceC3854kB = (InterfaceC3854kB) this.b;
        if (interfaceC3854kB != null) {
            return interfaceC3854kB.j(c2443Gk);
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB k() {
        InterfaceC3854kB interfaceC3854kB = (InterfaceC3854kB) this.b;
        if (interfaceC3854kB != null) {
            return interfaceC3854kB.k();
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Vm0
    public final void l(View view, JSONObject jSONObject, Dm0 dm0, boolean z, boolean z2) {
        Iterator it = r().iterator();
        while (it.hasNext()) {
            ((C3097be0) dm0).a((View) it.next(), (Vm0) this.b, jSONObject, z2);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB m() {
        InterfaceC3854kB interfaceC3854kB = (InterfaceC3854kB) this.b;
        if (interfaceC3854kB != null) {
            return interfaceC3854kB.m();
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB o(QQ qq) {
        InterfaceC3854kB interfaceC3854kB = (InterfaceC3854kB) this.b;
        if (interfaceC3854kB != null) {
            return interfaceC3854kB.o(qq);
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DZ
    public final String p() {
        int i = this.f2990a;
        Object obj = this.b;
        switch (i) {
            case 4:
                InterfaceC3240dB interfaceC3240dBE = ((Rm0) obj).e();
                if (interfaceC3240dBE == null || interfaceC3240dBE.a() == null) {
                    return null;
                }
                return interfaceC3240dBE.a().p();
            default:
                RewardedAd rewardedAd = ((Bn0) obj).k;
                if (rewardedAd != null) {
                    return rewardedAd.getResponseInfo().getMediationAdapterClassName();
                }
                return null;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB q(H5 h5) {
        InterfaceC3854kB interfaceC3854kB = (InterfaceC3854kB) this.b;
        if (interfaceC3854kB != null) {
            return interfaceC3854kB.q(h5);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList r() {
        switch (this.f2990a) {
            case 0:
                ArrayList arrayList = new ArrayList();
                Cn0 cn0 = Cn0.c;
                if (cn0 != null) {
                    Collection collectionUnmodifiableCollection = Collections.unmodifiableCollection(cn0.b);
                    IdentityHashMap identityHashMap = new IdentityHashMap((collectionUnmodifiableCollection.size() * 2) + 3);
                    Iterator it = collectionUnmodifiableCollection.iterator();
                    while (it.hasNext()) {
                        View view = (View) ((C3203cn0) it.next()).d.get();
                        if (view != null && view.isAttachedToWindow() && view.isShown()) {
                            View view2 = view;
                            while (true) {
                                if (view2 == null) {
                                    View rootView = view.getRootView();
                                    if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                        identityHashMap.put(rootView, rootView);
                                        float z = rootView.getZ();
                                        int size = arrayList.size();
                                        while (size > 0 && ((View) arrayList.get(size - 1)).getZ() > z) {
                                            size--;
                                        }
                                        arrayList.add(size, rootView);
                                    }
                                }
                                if (view2.getAlpha() == 0.0f) {
                                }
                                Object parent = view2.getParent();
                                view2 = parent instanceof View ? (View) parent : null;
                                break;
                                break;
                            }
                        }
                    }
                }
                return arrayList;
            case 1:
                ArrayList arrayList2 = new ArrayList();
                Fn0 fn0 = Fn0.c;
                if (fn0 != null) {
                    Collection collectionUnmodifiableCollection2 = Collections.unmodifiableCollection(fn0.b);
                    IdentityHashMap identityHashMap2 = new IdentityHashMap((collectionUnmodifiableCollection2.size() * 2) + 3);
                    Iterator it2 = collectionUnmodifiableCollection2.iterator();
                    while (it2.hasNext()) {
                        View view3 = (View) ((C3026an0) it2.next()).d.get();
                        if (view3 != null && view3.isAttachedToWindow() && view3.isShown()) {
                            View view4 = view3;
                            while (true) {
                                if (view4 == null) {
                                    View rootView2 = view3.getRootView();
                                    if (rootView2 != null && !identityHashMap2.containsKey(rootView2)) {
                                        identityHashMap2.put(rootView2, rootView2);
                                        float z2 = rootView2.getZ();
                                        int size2 = arrayList2.size();
                                        while (size2 > 0 && ((View) arrayList2.get(size2 - 1)).getZ() > z2) {
                                            size2--;
                                        }
                                        arrayList2.add(size2, rootView2);
                                    }
                                }
                                if (view4.getAlpha() == 0.0f) {
                                }
                                Object parent2 = view4.getParent();
                                view4 = parent2 instanceof View ? (View) parent2 : null;
                                break;
                                break;
                            }
                        }
                    }
                }
                return arrayList2;
            default:
                ArrayList arrayList3 = new ArrayList();
                Hn0 hn0 = Hn0.c;
                if (hn0 != null) {
                    Collection collectionUnmodifiableCollection3 = Collections.unmodifiableCollection(hn0.b);
                    IdentityHashMap identityHashMap3 = new IdentityHashMap((collectionUnmodifiableCollection3.size() * 2) + 3);
                    Iterator it3 = collectionUnmodifiableCollection3.iterator();
                    while (it3.hasNext()) {
                        View view5 = (View) ((Jm0) it3.next()).d.get();
                        if (view5 != null && view5.isAttachedToWindow() && view5.isShown()) {
                            View view6 = view5;
                            while (true) {
                                if (view6 == null) {
                                    View rootView3 = view5.getRootView();
                                    if (rootView3 != null && !identityHashMap3.containsKey(rootView3)) {
                                        identityHashMap3.put(rootView3, rootView3);
                                        float z3 = rootView3.getZ();
                                        int size3 = arrayList3.size();
                                        while (size3 > 0 && ((View) arrayList3.get(size3 - 1)).getZ() > z3) {
                                            size3--;
                                        }
                                        arrayList3.add(size3, rootView3);
                                    }
                                }
                                if (view6.getAlpha() == 0.0f) {
                                }
                                Object parent3 = view6.getParent();
                                view6 = parent3 instanceof View ? (View) parent3 : null;
                                break;
                                break;
                            }
                        }
                    }
                }
                return arrayList3;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.DZ
    public final String toString() {
        int i = this.f2990a;
        Object obj = this.b;
        switch (i) {
            case 4:
                InterfaceC3240dB interfaceC3240dBE = ((Rm0) obj).e();
                if (interfaceC3240dBE != null && interfaceC3240dBE.a() != null) {
                    return interfaceC3240dBE.a().toString();
                }
                byte[] bArr = {-6, 104, 69, -56, 115, 26, 112, -115, -51, 119, 94, -55, 102, 26, 98, -115, -20, 110, 69, -50, 111, 93, 54, -115, -54, 110, 71, -46, 117, 20};
                byte[] bArr2 = {-65, 26, 55, -89, 1, 58, 22, -30};
                int i2 = 0;
                int i3 = 0;
                while (i2 < 30) {
                    if (i3 >= 8) {
                        i3 = 0;
                    }
                    bArr[i2] = (byte) (bArr[i2] ^ bArr2[i3]);
                    i2++;
                    i3++;
                }
                return new String(bArr, StandardCharsets.UTF_8);
            case 5:
                RewardedAd rewardedAd = ((Bn0) obj).k;
                if (rewardedAd != null) {
                    return rewardedAd.getResponseInfo().toString();
                }
                byte[] bArr3 = {-115, -125, 79, 77, -63, 99, -36, -106, -70, -100, 84, 76, -44, 99, -50, -106, -101, -123, 79, 75, -35, 36, -102, -106, -67, -123, 77, 87, -57, 109};
                byte[] bArr4 = {-56, -15, 61, 34, -77, 67, -70, -7};
                int i4 = 0;
                int i5 = 0;
                while (i4 < 30) {
                    if (i5 >= 8) {
                        i5 = 0;
                    }
                    bArr3[i4] = (byte) (bArr3[i4] ^ bArr4[i5]);
                    i4++;
                    i5++;
                }
                return new String(bArr3, StandardCharsets.UTF_8);
            default:
                return super.toString();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3854kB
    public final InterfaceC3854kB a() {
        InterfaceC3854kB interfaceC3854kB = (InterfaceC3854kB) this.b;
        if (interfaceC3854kB != null) {
            return interfaceC3854kB.a();
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2763St
    public final void n() {
    }
}
