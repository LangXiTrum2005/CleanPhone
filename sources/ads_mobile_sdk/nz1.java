package ads_mobile_sdk;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TableRow;
import android.widget.TextView;
import com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd;
import com.unity3d.services.UnityAdsConstants;
import complexometry.competently;
import complexometry.cutely;
import formularization.beachfront;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.objectweb.asm.Opcodes;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;
import saneness.adultoid;
import saneness.canephora;
import saneness.coffeecake;
import saneness.demilitarize;
import saneness.fishpound;
import saneness.interaction;
import saneness.pigboat;

/* JADX INFO: loaded from: classes.dex */
public final class nz1 {
    public final Context a;
    public final ip0 b;
    public final x c;
    public final wz0 d;
    public final adultoid e;
    public final adultoid f;
    public final adultoid g;
    public final adultoid h;
    public final adultoid i;
    public final formularization.attabal j;
    public final LinkedHashMap k;

    public nz1(Context applicationContext, ip0 gmaUtil, x activityTracker, wz0 inspectorManager, coffeecake appOpenComponentProvider, coffeecake bannerComponentProvider, coffeecake interstitialComponentProvider, coffeecake nativeComponentProvider, coffeecake rewardedComponentProvider) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(gmaUtil, "gmaUtil");
        Intrinsics.checkNotNullParameter(activityTracker, "activityTracker");
        Intrinsics.checkNotNullParameter(inspectorManager, "inspectorManager");
        Intrinsics.checkNotNullParameter(appOpenComponentProvider, "appOpenComponentProvider");
        Intrinsics.checkNotNullParameter(bannerComponentProvider, "bannerComponentProvider");
        Intrinsics.checkNotNullParameter(interstitialComponentProvider, "interstitialComponentProvider");
        Intrinsics.checkNotNullParameter(nativeComponentProvider, "nativeComponentProvider");
        Intrinsics.checkNotNullParameter(rewardedComponentProvider, "rewardedComponentProvider");
        this.a = applicationContext;
        this.b = gmaUtil;
        this.c = activityTracker;
        this.d = inspectorManager;
        this.e = appOpenComponentProvider;
        this.f = bannerComponentProvider;
        this.g = interstitialComponentProvider;
        this.h = nativeComponentProvider;
        this.i = rewardedComponentProvider;
        this.j = beachfront.saneness(false, 1, null);
        this.k = new LinkedHashMap();
    }

    public static final TextView a(nz1 nz1Var, Context context, String str, String str2) {
        nz1Var.getClass();
        TextView textView = new TextView(context);
        textView.setTag(str2);
        textView.setText(str);
        textView.setTextAppearance(R.style.TextAppearance.Small);
        textView.setTextColor(-9210245);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        } else {
            Intrinsics.beachfront(layoutParams);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.width = -2;
        marginLayoutParams.height = -2;
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        return textView;
    }

    public static final TextView b(nz1 nz1Var, Context context, String str, String str2) {
        nz1Var.getClass();
        TextView textView = new TextView(context);
        textView.setTag(str2);
        textView.setText(str);
        textView.setTextAppearance(R.style.TextAppearance.Medium);
        textView.setTextColor(-16777216);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new TableRow.LayoutParams();
        } else {
            Intrinsics.beachfront(layoutParams);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.width = -2;
        marginLayoutParams.height = -2;
        marginLayoutParams.bottomMargin = (int) TypedValue.applyDimension(1, 12.0f, textView.getResources().getDisplayMetrics());
        textView.setLayoutParams(marginLayoutParams);
        return textView;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0108 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(pigboat pigboatVar, pz1 pz1Var, wretchedly.dern dernVar) throws Throwable {
        jz1 jz1Var;
        nz1 nz1Var;
        pigboat pigboatVar2;
        formularization.attabal attabalVar;
        pz1 pz1Var2;
        canephora canephoraVar;
        Object objM;
        if (dernVar instanceof jz1) {
            jz1Var = (jz1) dernVar;
            int i = jz1Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                jz1Var.h = i - Integer.MIN_VALUE;
            } else {
                jz1Var = new jz1(this, dernVar);
            }
        } else {
            jz1Var = new jz1(this, dernVar);
        }
        Object objA = jz1Var.f;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = jz1Var.h;
        if (i2 == 0) {
            p002kotlin.dern.saneness(objA);
            k92 k92VarB = pigboatVar.b();
            jz1Var.a = this;
            jz1Var.b = pigboatVar;
            jz1Var.c = pz1Var;
            jz1Var.h = 1;
            objA = k92VarB.a(jz1Var);
            if (objA != objBeachfront) {
                nz1Var = this;
            }
            return objBeachfront;
        }
        if (i2 == 1) {
            pz1Var = jz1Var.c;
            pigboatVar = jz1Var.b;
            nz1 nz1Var2 = jz1Var.a;
            p002kotlin.dern.saneness(objA);
            nz1Var = nz1Var2;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p002kotlin.dern.saneness(objA);
                return objA;
            }
            attabalVar = jz1Var.e;
            canephoraVar = jz1Var.d;
            pz1Var2 = jz1Var.c;
            pigboatVar2 = jz1Var.b;
            nz1Var = jz1Var.a;
            p002kotlin.dern.saneness(objA);
        }
        try {
            nz1Var.k.put(pz1Var2.a(), new Pair(pigboatVar2.a(), ((m92) canephoraVar).a()));
            if ((((m92) canephoraVar).a() instanceof k71) && pz1Var2.b() != null) {
                Object objA2 = ((m92) canephoraVar).a();
                Intrinsics.competently(objA2, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.rewarded.InternalRewardedAd");
                ((k71) objA2).a(pz1Var2.b());
            }
            Unit unit = Unit.f29295attabal;
            attabalVar.wireman(null);
            wz0 wz0Var = nz1Var.d;
            jz1Var.a = null;
            jz1Var.b = null;
            jz1Var.c = null;
            jz1Var.d = null;
            jz1Var.e = null;
            jz1Var.h = 3;
            objM = wz0Var.m(jz1Var);
            if (objM == objBeachfront) {
                return objBeachfront;
            }
            return objM;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
        canephora canephoraVar2 = (canephora) objA;
        if (canephoraVar2 instanceof m92) {
            formularization.attabal attabalVar2 = nz1Var.j;
            jz1Var.a = nz1Var;
            jz1Var.b = pigboatVar;
            jz1Var.c = pz1Var;
            jz1Var.d = canephoraVar2;
            jz1Var.e = attabalVar2;
            jz1Var.h = 2;
            if (attabalVar2.attabal(null, jz1Var) != objBeachfront) {
                pigboatVar2 = pigboatVar;
                attabalVar = attabalVar2;
                pz1Var2 = pz1Var;
                canephoraVar = canephoraVar2;
                nz1Var.k.put(pz1Var2.a(), new Pair(pigboatVar2.a(), ((m92) canephoraVar).a()));
                if (((m92) canephoraVar).a() instanceof k71) {
                    Object objA3 = ((m92) canephoraVar).a();
                    Intrinsics.competently(objA3, "null cannot be cast to non-null type com.google.android.libraries.ads.mobile.sdk.internal.rewarded.InternalRewardedAd");
                    ((k71) objA3).a(pz1Var2.b());
                }
                Unit unit2 = Unit.f29295attabal;
                attabalVar.wireman(null);
                wz0 wz0Var2 = nz1Var.d;
                jz1Var.a = null;
                jz1Var.b = null;
                jz1Var.c = null;
                jz1Var.d = null;
                jz1Var.e = null;
                jz1Var.h = 3;
                objM = wz0Var2.m(jz1Var);
                if (objM == objBeachfront) {
                    return objM;
                }
            }
        } else {
            if (canephoraVar2 instanceof l92) {
                y13.a("OOCT request failed to load: " + ((l92) canephoraVar2).a(), null, 6);
            }
            wz0 wz0Var3 = nz1Var.d;
            jz1Var.a = null;
            jz1Var.b = null;
            jz1Var.c = null;
            jz1Var.d = null;
            jz1Var.e = null;
            jz1Var.h = 3;
            objM = wz0Var3.m(jz1Var);
            if (objM == objBeachfront) {
                return objM;
            }
        }
        return objBeachfront;
    }

    public final Object a(pz1 pz1Var, wretchedly.dern dernVar) throws Throwable {
        yf2 yf2Var = pz1Var.b;
        competently competentlyVarGraveside = pz1Var.d;
        if (competentlyVarGraveside == null) {
            competentlyVarGraveside = new competently.attabal(pz1Var.a).graveside();
        }
        s80 s80Var = (s80) ((demilitarize) ((s80) ((demilitarize) ((s80) ((demilitarize) this.i.get())).a(yf2Var))).a(competentlyVarGraveside));
        s80Var.c = competentlyVarGraveside;
        Object objA = a(((s80) ((demilitarize) ((s80) ((demilitarize) s80Var.b(true))).a(false))).b(), pz1Var, dernVar);
        return objA == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objA : Unit.f29295attabal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(competently competentlyVar, cutely cutelyVar) {
        Iterator<T> it = competentlyVar.molybdenite().iterator();
        while (it.hasNext()) {
            cutelyVar.dern((String) it.next());
        }
        cutelyVar.monoploid(competentlyVar.getGoogleExtrasBundle());
        for (Map.Entry<String, String> entry : competentlyVar.monoploid().entrySet()) {
            cutelyVar.triweekly(entry.getKey(), entry.getValue());
        }
        String contentUrl = competentlyVar.getContentUrl();
        if (contentUrl != null) {
        }
        cutelyVar.polloi(competentlyVar.graveside());
        String publisherProvidedId = competentlyVar.getPublisherProvidedId();
        if (publisherProvidedId != null) {
        }
        Iterator<T> it2 = competentlyVar.kowloon().iterator();
        while (it2.hasNext()) {
            cutelyVar.saneness((String) it2.next());
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009e  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00db  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:55:0x0113  */
    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    /* JADX WARN: Code duplicated, block: B:58:0x0134  */
    /* JADX WARN: Code duplicated, block: B:60:0x0138  */
    /* JADX WARN: Code duplicated, block: B:64:0x0163 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static Object a(nz1 nz1Var, pz1 pz1Var, wretchedly.dern dernVar) throws Throwable {
        kz1 kz1Var;
        formularization.attabal attabalVar;
        nz1 nz1Var2;
        Object obj;
        Context contextB;
        Object objM;
        if (dernVar instanceof kz1) {
            kz1Var = (kz1) dernVar;
            int i = kz1Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                kz1Var.f = i - Integer.MIN_VALUE;
            } else {
                kz1Var = new kz1(nz1Var, dernVar);
            }
        } else {
            kz1Var = new kz1(nz1Var, dernVar);
        }
        Object obj2 = kz1Var.d;
        Object objBeachfront = p002kotlin.coroutines.intrinsics.attabal.beachfront();
        int i2 = kz1Var.f;
        try {
            if (i2 == 0) {
                p002kotlin.dern.saneness(obj2);
                attabalVar = nz1Var.j;
                kz1Var.a = nz1Var;
                kz1Var.b = pz1Var;
                kz1Var.c = attabalVar;
                kz1Var.f = 1;
                if (attabalVar.attabal(null, kz1Var) != objBeachfront) {
                }
                return objBeachfront;
            }
            if (i2 == 1) {
                formularization.attabal attabalVar2 = (formularization.attabal) kz1Var.c;
                pz1Var = kz1Var.b;
                nz1 nz1Var3 = kz1Var.a;
                p002kotlin.dern.saneness(obj2);
                attabalVar = attabalVar2;
                nz1Var = nz1Var3;
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    p002kotlin.dern.saneness(obj2);
                    return obj2;
                }
                obj = kz1Var.c;
                pz1Var = kz1Var.b;
                nz1Var2 = kz1Var.a;
                p002kotlin.dern.saneness(obj2);
            }
            if (obj instanceof bl) {
                bl blVar = (bl) obj;
                blVar.l = pz1Var.m;
                blVar.m = true;
            }
            contextB = nz1Var2.c.b();
            if (contextB == null) {
                contextB = nz1Var2.a;
            }
            if (obj instanceof fishpound) {
                ((fishpound) obj).a(contextB);
            } else if (obj instanceof interaction) {
                ((interaction) obj).a(contextB);
            } else if (obj instanceof k71) {
                ((k71) obj).a(contextB);
            } else if (obj instanceof d41) {
                Intent intentA = nz1Var2.b.a(contextB, new lz1(pz1Var, (d41) obj));
                intentA.addFlags(Opcodes.ASM8);
                intentA.addFlags(134217728);
                nz1Var2.b.a(intentA);
            } else if (obj instanceof InternalNativeAd) {
                Intent intentA2 = nz1Var2.b.a(contextB, new mz1(contextB, nz1Var2, (InternalNativeAd) obj, pz1Var.n));
                intentA2.addFlags(Opcodes.ASM8);
                intentA2.addFlags(134217728);
                nz1Var2.b.a(intentA2);
            } else if (obj instanceof li1) {
                Intent intentA3 = nz1Var2.b.a(contextB, new mz1(contextB, nz1Var2, ((li1) obj).a, pz1Var.n));
                intentA3.addFlags(Opcodes.ASM8);
                intentA3.addFlags(134217728);
                nz1Var2.b.a(intentA3);
            } else if (obj instanceof ki1) {
                Intent intentA4 = nz1Var2.b.a(contextB, new lz1(pz1Var, ((ki1) obj).a));
                intentA4.addFlags(Opcodes.ASM8);
                intentA4.addFlags(134217728);
                nz1Var2.b.a(intentA4);
            }
            wz0 wz0Var = nz1Var2.d;
            kz1Var.a = null;
            kz1Var.b = null;
            kz1Var.c = null;
            kz1Var.f = 3;
            objM = wz0Var.m(kz1Var);
            if (objM != objBeachfront) {
                return objBeachfront;
            }
            return objM;
            Pair pair = (Pair) nz1Var.k.remove(pz1Var.a);
            if (pair == null) {
                Unit unit = Unit.f29295attabal;
                attabalVar.wireman(null);
                return unit;
            }
            attabalVar.wireman(null);
            gy0 gy0Var = (gy0) pair.component1();
            Object objComponent2 = pair.component2();
            kz1Var.a = nz1Var;
            kz1Var.b = pz1Var;
            kz1Var.c = objComponent2;
            kz1Var.f = 2;
            if (gy0Var.a(kz1Var) != objBeachfront) {
                nz1Var2 = nz1Var;
                obj = objComponent2;
                if (obj instanceof bl) {
                    bl blVar2 = (bl) obj;
                    blVar2.l = pz1Var.m;
                    blVar2.m = true;
                }
                contextB = nz1Var2.c.b();
                if (contextB == null) {
                    contextB = nz1Var2.a;
                }
                if (obj instanceof fishpound) {
                    ((fishpound) obj).a(contextB);
                } else if (obj instanceof interaction) {
                    ((interaction) obj).a(contextB);
                } else if (obj instanceof k71) {
                    ((k71) obj).a(contextB);
                } else if (obj instanceof d41) {
                    Intent intentA5 = nz1Var2.b.a(contextB, new lz1(pz1Var, (d41) obj));
                    intentA5.addFlags(Opcodes.ASM8);
                    intentA5.addFlags(134217728);
                    nz1Var2.b.a(intentA5);
                } else if (obj instanceof InternalNativeAd) {
                    Intent intentA6 = nz1Var2.b.a(contextB, new mz1(contextB, nz1Var2, (InternalNativeAd) obj, pz1Var.n));
                    intentA6.addFlags(Opcodes.ASM8);
                    intentA6.addFlags(134217728);
                    nz1Var2.b.a(intentA6);
                } else if (obj instanceof li1) {
                    Intent intentA7 = nz1Var2.b.a(contextB, new mz1(contextB, nz1Var2, ((li1) obj).a, pz1Var.n));
                    intentA7.addFlags(Opcodes.ASM8);
                    intentA7.addFlags(134217728);
                    nz1Var2.b.a(intentA7);
                } else if (obj instanceof ki1) {
                    Intent intentA8 = nz1Var2.b.a(contextB, new lz1(pz1Var, ((ki1) obj).a));
                    intentA8.addFlags(Opcodes.ASM8);
                    intentA8.addFlags(134217728);
                    nz1Var2.b.a(intentA8);
                }
                wz0 wz0Var2 = nz1Var2.d;
                kz1Var.a = null;
                kz1Var.b = null;
                kz1Var.c = null;
                kz1Var.f = 3;
                objM = wz0Var2.m(kz1Var);
                if (objM != objBeachfront) {
                    return objM;
                }
            }
            return objBeachfront;
        } catch (Throwable th) {
            attabalVar.wireman(null);
            throw th;
        }
    }
}
