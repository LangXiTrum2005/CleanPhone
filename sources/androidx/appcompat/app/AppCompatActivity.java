package androidx.appcompat.app;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import b0.b;
import com.adjust.sdk.h0;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.services.UnityAdsConstants;
import i0.e;
import j4.a;
import java.util.ArrayList;
import k.f0;
import k.g;
import k.h;
import k.k;
import k.l;
import k.p;
import k.v;
import n.c;
import n.j;
import p.h2;
import p.t;
import p.x2;
import p.z2;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class AppCompatActivity extends FragmentActivity implements h {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public v f3837h;

    public AppCompatActivity() {
        getSavedStateRegistry().c("androidx:appcompat", new a(this));
        addOnContextAvailableListener(new g(this));
    }

    public final l H() {
        if (this.f3837h == null) {
            k kVar = l.f44125a;
            this.f3837h = new v(this, null, this, this);
        }
        return this.f3837h;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        v vVar = (v) H();
        vVar.v();
        ((ViewGroup) vVar.A.findViewById(R.id.content)).addView(view, layoutParams);
        vVar.f44173m.a(vVar.l.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0194  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:111:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01be  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:121:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:44:0x0099  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:57:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:66:0x0106  */
    /* JADX WARN: Code duplicated, block: B:69:0x010e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0116  */
    /* JADX WARN: Code duplicated, block: B:75:0x011e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0126  */
    /* JADX WARN: Code duplicated, block: B:81:0x012e  */
    /* JADX WARN: Code duplicated, block: B:84:0x013a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0149  */
    /* JADX WARN: Code duplicated, block: B:90:0x0158  */
    /* JADX WARN: Code duplicated, block: B:93:0x0167  */
    /* JADX WARN: Code duplicated, block: B:96:0x0176  */
    /* JADX WARN: Code duplicated, block: B:99:0x0185  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        Configuration configuration2;
        c cVar;
        float f10;
        float f11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        int i34;
        int i35;
        int i36;
        int i37;
        int i38;
        int i39;
        int i40;
        int i41;
        int i42;
        int i43;
        int i44;
        int i45;
        int i46;
        int i47;
        int i48;
        int i49;
        v vVar = (v) H();
        vVar.O = true;
        int i50 = vVar.S;
        if (i50 == -100) {
            i50 = l.f44126b;
        }
        int iB = vVar.B(context, i50);
        if (l.b(context) && l.b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (l.f44133i) {
                    try {
                        e eVar = l.f44127c;
                        if (eVar == null) {
                            if (l.f44128d == null) {
                                l.f44128d = e.a(b.g(context));
                            }
                            if (!l.f44128d.f42488a.f42489a.isEmpty()) {
                                l.f44127c = l.f44128d;
                            }
                        } else if (!eVar.equals(l.f44128d)) {
                            e eVar2 = l.f44127c;
                            l.f44128d = eVar2;
                            b.f(context, eVar2.f42488a.f42489a.toLanguageTags());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else if (!l.f44130f) {
                l.f44125a.execute(new h0(context, 3));
            }
        }
        e eVarN = v.n(context);
        Configuration configuration3 = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(v.s(context, iB, eVarN, null, false));
            } catch (IllegalStateException unused) {
                if (context instanceof c) {
                    try {
                        ((c) context).a(v.s(context, iB, eVarN, null, false));
                    } catch (IllegalStateException unused2) {
                        if (v.f44164j0) {
                            Configuration configuration4 = new Configuration();
                            configuration4.uiMode = -1;
                            configuration4.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            configuration = context.createConfigurationContext(configuration4).getResources().getConfiguration();
                            configuration2 = context.getResources().getConfiguration();
                            configuration.uiMode = configuration2.uiMode;
                            if (!configuration.equals(configuration2)) {
                                configuration3 = new Configuration();
                                configuration3.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                if (configuration.diff(configuration2) != 0) {
                                    f10 = configuration.fontScale;
                                    f11 = configuration2.fontScale;
                                    if (f10 != f11) {
                                        configuration3.fontScale = f11;
                                    }
                                    i10 = configuration.mcc;
                                    i11 = configuration2.mcc;
                                    if (i10 != i11) {
                                        configuration3.mcc = i11;
                                    }
                                    i12 = configuration.mnc;
                                    i13 = configuration2.mnc;
                                    if (i12 != i13) {
                                        configuration3.mnc = i13;
                                    }
                                    p.a(configuration, configuration2, configuration3);
                                    i14 = configuration.touchscreen;
                                    i15 = configuration2.touchscreen;
                                    if (i14 != i15) {
                                        configuration3.touchscreen = i15;
                                    }
                                    i16 = configuration.keyboard;
                                    i17 = configuration2.keyboard;
                                    if (i16 != i17) {
                                        configuration3.keyboard = i17;
                                    }
                                    i18 = configuration.keyboardHidden;
                                    i19 = configuration2.keyboardHidden;
                                    if (i18 != i19) {
                                        configuration3.keyboardHidden = i19;
                                    }
                                    i20 = configuration.navigation;
                                    i21 = configuration2.navigation;
                                    if (i20 != i21) {
                                        configuration3.navigation = i21;
                                    }
                                    i22 = configuration.navigationHidden;
                                    i23 = configuration2.navigationHidden;
                                    if (i22 != i23) {
                                        configuration3.navigationHidden = i23;
                                    }
                                    i24 = configuration.orientation;
                                    i25 = configuration2.orientation;
                                    if (i24 != i25) {
                                        configuration3.orientation = i25;
                                    }
                                    i26 = configuration.screenLayout & 15;
                                    i27 = configuration2.screenLayout & 15;
                                    if (i26 != i27) {
                                        configuration3.screenLayout |= i27;
                                    }
                                    i28 = configuration.screenLayout & PsExtractor.AUDIO_STREAM;
                                    i29 = configuration2.screenLayout & PsExtractor.AUDIO_STREAM;
                                    if (i28 != i29) {
                                        configuration3.screenLayout |= i29;
                                    }
                                    i30 = configuration.screenLayout & 48;
                                    i31 = configuration2.screenLayout & 48;
                                    if (i30 != i31) {
                                        configuration3.screenLayout |= i31;
                                    }
                                    i32 = configuration.screenLayout & 768;
                                    i33 = configuration2.screenLayout & 768;
                                    if (i32 != i33) {
                                        configuration3.screenLayout |= i33;
                                    }
                                    i34 = configuration.colorMode & 3;
                                    i35 = configuration2.colorMode & 3;
                                    if (i34 != i35) {
                                        configuration3.colorMode |= i35;
                                    }
                                    i36 = configuration.colorMode & 12;
                                    i37 = configuration2.colorMode & 12;
                                    if (i36 != i37) {
                                        configuration3.colorMode |= i37;
                                    }
                                    i38 = configuration.uiMode & 15;
                                    i39 = configuration2.uiMode & 15;
                                    if (i38 != i39) {
                                        configuration3.uiMode |= i39;
                                    }
                                    i40 = configuration.uiMode & 48;
                                    i41 = configuration2.uiMode & 48;
                                    if (i40 != i41) {
                                        configuration3.uiMode |= i41;
                                    }
                                    i42 = configuration.screenWidthDp;
                                    i43 = configuration2.screenWidthDp;
                                    if (i42 != i43) {
                                        configuration3.screenWidthDp = i43;
                                    }
                                    i44 = configuration.screenHeightDp;
                                    i45 = configuration2.screenHeightDp;
                                    if (i44 != i45) {
                                        configuration3.screenHeightDp = i45;
                                    }
                                    i46 = configuration.smallestScreenWidthDp;
                                    i47 = configuration2.smallestScreenWidthDp;
                                    if (i46 != i47) {
                                        configuration3.smallestScreenWidthDp = i47;
                                    }
                                    i48 = configuration.densityDpi;
                                    i49 = configuration2.densityDpi;
                                    if (i48 != i49) {
                                        configuration3.densityDpi = i49;
                                    }
                                }
                            }
                            Configuration configurationS = v.s(context, iB, eVarN, configuration3, true);
                            cVar = new c(context, com.storage.androidcleaner.R.style.Theme_AppCompat_Empty);
                            cVar.a(configurationS);
                            try {
                                if (context.getTheme() != null) {
                                    cVar.getTheme().rebase();
                                }
                            } catch (NullPointerException unused3) {
                            }
                            context = cVar;
                        }
                    }
                } else if (v.f44164j0) {
                    Configuration configuration5 = new Configuration();
                    configuration5.uiMode = -1;
                    configuration5.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                    configuration = context.createConfigurationContext(configuration5).getResources().getConfiguration();
                    configuration2 = context.getResources().getConfiguration();
                    configuration.uiMode = configuration2.uiMode;
                    if (!configuration.equals(configuration2)) {
                        configuration3 = new Configuration();
                        configuration3.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                        if (configuration.diff(configuration2) != 0) {
                            f10 = configuration.fontScale;
                            f11 = configuration2.fontScale;
                            if (f10 != f11) {
                                configuration3.fontScale = f11;
                            }
                            i10 = configuration.mcc;
                            i11 = configuration2.mcc;
                            if (i10 != i11) {
                                configuration3.mcc = i11;
                            }
                            i12 = configuration.mnc;
                            i13 = configuration2.mnc;
                            if (i12 != i13) {
                                configuration3.mnc = i13;
                            }
                            p.a(configuration, configuration2, configuration3);
                            i14 = configuration.touchscreen;
                            i15 = configuration2.touchscreen;
                            if (i14 != i15) {
                                configuration3.touchscreen = i15;
                            }
                            i16 = configuration.keyboard;
                            i17 = configuration2.keyboard;
                            if (i16 != i17) {
                                configuration3.keyboard = i17;
                            }
                            i18 = configuration.keyboardHidden;
                            i19 = configuration2.keyboardHidden;
                            if (i18 != i19) {
                                configuration3.keyboardHidden = i19;
                            }
                            i20 = configuration.navigation;
                            i21 = configuration2.navigation;
                            if (i20 != i21) {
                                configuration3.navigation = i21;
                            }
                            i22 = configuration.navigationHidden;
                            i23 = configuration2.navigationHidden;
                            if (i22 != i23) {
                                configuration3.navigationHidden = i23;
                            }
                            i24 = configuration.orientation;
                            i25 = configuration2.orientation;
                            if (i24 != i25) {
                                configuration3.orientation = i25;
                            }
                            i26 = configuration.screenLayout & 15;
                            i27 = configuration2.screenLayout & 15;
                            if (i26 != i27) {
                                configuration3.screenLayout |= i27;
                            }
                            i28 = configuration.screenLayout & PsExtractor.AUDIO_STREAM;
                            i29 = configuration2.screenLayout & PsExtractor.AUDIO_STREAM;
                            if (i28 != i29) {
                                configuration3.screenLayout |= i29;
                            }
                            i30 = configuration.screenLayout & 48;
                            i31 = configuration2.screenLayout & 48;
                            if (i30 != i31) {
                                configuration3.screenLayout |= i31;
                            }
                            i32 = configuration.screenLayout & 768;
                            i33 = configuration2.screenLayout & 768;
                            if (i32 != i33) {
                                configuration3.screenLayout |= i33;
                            }
                            i34 = configuration.colorMode & 3;
                            i35 = configuration2.colorMode & 3;
                            if (i34 != i35) {
                                configuration3.colorMode |= i35;
                            }
                            i36 = configuration.colorMode & 12;
                            i37 = configuration2.colorMode & 12;
                            if (i36 != i37) {
                                configuration3.colorMode |= i37;
                            }
                            i38 = configuration.uiMode & 15;
                            i39 = configuration2.uiMode & 15;
                            if (i38 != i39) {
                                configuration3.uiMode |= i39;
                            }
                            i40 = configuration.uiMode & 48;
                            i41 = configuration2.uiMode & 48;
                            if (i40 != i41) {
                                configuration3.uiMode |= i41;
                            }
                            i42 = configuration.screenWidthDp;
                            i43 = configuration2.screenWidthDp;
                            if (i42 != i43) {
                                configuration3.screenWidthDp = i43;
                            }
                            i44 = configuration.screenHeightDp;
                            i45 = configuration2.screenHeightDp;
                            if (i44 != i45) {
                                configuration3.screenHeightDp = i45;
                            }
                            i46 = configuration.smallestScreenWidthDp;
                            i47 = configuration2.smallestScreenWidthDp;
                            if (i46 != i47) {
                                configuration3.smallestScreenWidthDp = i47;
                            }
                            i48 = configuration.densityDpi;
                            i49 = configuration2.densityDpi;
                            if (i48 != i49) {
                                configuration3.densityDpi = i49;
                            }
                        }
                    }
                    Configuration configurationS2 = v.s(context, iB, eVarN, configuration3, true);
                    cVar = new c(context, com.storage.androidcleaner.R.style.Theme_AppCompat_Empty);
                    cVar.a(configurationS2);
                    if (context.getTheme() != null) {
                        cVar.getTheme().rebase();
                    }
                    context = cVar;
                }
            }
        } else if (context instanceof c) {
            ((c) context).a(v.s(context, iB, eVarN, null, false));
        } else if (v.f44164j0) {
            Configuration configuration6 = new Configuration();
            configuration6.uiMode = -1;
            configuration6.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            configuration = context.createConfigurationContext(configuration6).getResources().getConfiguration();
            configuration2 = context.getResources().getConfiguration();
            configuration.uiMode = configuration2.uiMode;
            if (!configuration.equals(configuration2)) {
                configuration3 = new Configuration();
                configuration3.fontScale = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (configuration.diff(configuration2) != 0) {
                    f10 = configuration.fontScale;
                    f11 = configuration2.fontScale;
                    if (f10 != f11) {
                        configuration3.fontScale = f11;
                    }
                    i10 = configuration.mcc;
                    i11 = configuration2.mcc;
                    if (i10 != i11) {
                        configuration3.mcc = i11;
                    }
                    i12 = configuration.mnc;
                    i13 = configuration2.mnc;
                    if (i12 != i13) {
                        configuration3.mnc = i13;
                    }
                    p.a(configuration, configuration2, configuration3);
                    i14 = configuration.touchscreen;
                    i15 = configuration2.touchscreen;
                    if (i14 != i15) {
                        configuration3.touchscreen = i15;
                    }
                    i16 = configuration.keyboard;
                    i17 = configuration2.keyboard;
                    if (i16 != i17) {
                        configuration3.keyboard = i17;
                    }
                    i18 = configuration.keyboardHidden;
                    i19 = configuration2.keyboardHidden;
                    if (i18 != i19) {
                        configuration3.keyboardHidden = i19;
                    }
                    i20 = configuration.navigation;
                    i21 = configuration2.navigation;
                    if (i20 != i21) {
                        configuration3.navigation = i21;
                    }
                    i22 = configuration.navigationHidden;
                    i23 = configuration2.navigationHidden;
                    if (i22 != i23) {
                        configuration3.navigationHidden = i23;
                    }
                    i24 = configuration.orientation;
                    i25 = configuration2.orientation;
                    if (i24 != i25) {
                        configuration3.orientation = i25;
                    }
                    i26 = configuration.screenLayout & 15;
                    i27 = configuration2.screenLayout & 15;
                    if (i26 != i27) {
                        configuration3.screenLayout |= i27;
                    }
                    i28 = configuration.screenLayout & PsExtractor.AUDIO_STREAM;
                    i29 = configuration2.screenLayout & PsExtractor.AUDIO_STREAM;
                    if (i28 != i29) {
                        configuration3.screenLayout |= i29;
                    }
                    i30 = configuration.screenLayout & 48;
                    i31 = configuration2.screenLayout & 48;
                    if (i30 != i31) {
                        configuration3.screenLayout |= i31;
                    }
                    i32 = configuration.screenLayout & 768;
                    i33 = configuration2.screenLayout & 768;
                    if (i32 != i33) {
                        configuration3.screenLayout |= i33;
                    }
                    i34 = configuration.colorMode & 3;
                    i35 = configuration2.colorMode & 3;
                    if (i34 != i35) {
                        configuration3.colorMode |= i35;
                    }
                    i36 = configuration.colorMode & 12;
                    i37 = configuration2.colorMode & 12;
                    if (i36 != i37) {
                        configuration3.colorMode |= i37;
                    }
                    i38 = configuration.uiMode & 15;
                    i39 = configuration2.uiMode & 15;
                    if (i38 != i39) {
                        configuration3.uiMode |= i39;
                    }
                    i40 = configuration.uiMode & 48;
                    i41 = configuration2.uiMode & 48;
                    if (i40 != i41) {
                        configuration3.uiMode |= i41;
                    }
                    i42 = configuration.screenWidthDp;
                    i43 = configuration2.screenWidthDp;
                    if (i42 != i43) {
                        configuration3.screenWidthDp = i43;
                    }
                    i44 = configuration.screenHeightDp;
                    i45 = configuration2.screenHeightDp;
                    if (i44 != i45) {
                        configuration3.screenHeightDp = i45;
                    }
                    i46 = configuration.smallestScreenWidthDp;
                    i47 = configuration2.smallestScreenWidthDp;
                    if (i46 != i47) {
                        configuration3.smallestScreenWidthDp = i47;
                    }
                    i48 = configuration.densityDpi;
                    i49 = configuration2.densityDpi;
                    if (i48 != i49) {
                        configuration3.densityDpi = i49;
                    }
                }
            }
            Configuration configurationS3 = v.s(context, iB, eVarN, configuration3, true);
            cVar = new c(context, com.storage.androidcleaner.R.style.Theme_AppCompat_Empty);
            cVar.a(configurationS3);
            if (context.getTheme() != null) {
                cVar.getTheme().rebase();
            }
            context = cVar;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((v) H()).z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((v) H()).z();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public final View findViewById(int i10) {
        v vVar = (v) H();
        vVar.v();
        return vVar.l.findViewById(i10);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        v vVar = (v) H();
        if (vVar.f44176p == null) {
            vVar.z();
            f0 f0Var = vVar.f44175o;
            vVar.f44176p = new n.h(f0Var != null ? f0Var.b0() : vVar.f44172k);
        }
        return vVar.f44176p;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i10 = z2.f47877a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        v vVar = (v) H();
        if (vVar.f44175o != null) {
            vVar.z();
            vVar.f44175o.getClass();
            vVar.A(0);
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        v vVar = (v) H();
        if (vVar.F && vVar.f44186z) {
            vVar.z();
            f0 f0Var = vVar.f44175o;
            if (f0Var != null) {
                f0Var.e0(f0Var.f44097a.getResources().getBoolean(com.storage.androidcleaner.R.bool.abc_action_bar_embed_tabs));
            }
        }
        t tVarA = t.a();
        Context context = vVar.f44172k;
        synchronized (tVarA) {
            h2 h2Var = tVarA.f47813a;
            synchronized (h2Var) {
                x.g gVar = (x.g) h2Var.f47665b.get(context);
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
        vVar.R = new Configuration(vVar.f44172k.getResources().getConfiguration());
        vVar.l(false, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        H().e();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        Intent intentC;
        if (!super.onMenuItemSelected(i10, menuItem)) {
            v vVar = (v) H();
            vVar.z();
            f0 f0Var = vVar.f44175o;
            if (menuItem.getItemId() != 16908332 || f0Var == null || (((x2) f0Var.f44101e).f47855b & 4) == 0 || (intentC = b.c(this)) == null) {
                return false;
            }
            if (!shouldUpRecreateTask(intentC)) {
                navigateUpTo(intentC);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent intentC2 = b.c(this);
            if (intentC2 == null) {
                intentC2 = b.c(this);
            }
            if (intentC2 != null) {
                ComponentName component = intentC2.getComponent();
                if (component == null) {
                    component = intentC2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent intentD = b.d(this, component);
                    while (intentD != null) {
                        arrayList.add(size, intentD);
                        intentD = b.d(this, intentD.getComponent());
                    }
                    arrayList.add(intentC2);
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e10);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
            } catch (IllegalStateException unused) {
                finish();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((v) H()).v();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        v vVar = (v) H();
        vVar.z();
        f0 f0Var = vVar.f44175o;
        if (f0Var != null) {
            f0Var.f44115t = true;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        ((v) H()).l(true, false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
        v vVar = (v) H();
        vVar.z();
        f0 f0Var = vVar.f44175o;
        if (f0Var != null) {
            f0Var.f44115t = false;
            j jVar = f0Var.f44114s;
            if (jVar != null) {
                jVar.b();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i10) {
        super.onTitleChanged(charSequence, i10);
        H().k(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((v) H()).z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(int i10) {
        initializeViewTreeOwners();
        H().h(i10);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        super.setTheme(i10);
        ((v) H()).T = i10;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        H().i(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initializeViewTreeOwners();
        H().j(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}
