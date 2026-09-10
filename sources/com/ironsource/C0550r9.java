package com.ironsource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.sdk.AppLovinMediationProvider;
import com.ironsource.environment.StringUtils;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;

/* JADX INFO: renamed from: com.ironsource.r9, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class C0550r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f30152a = "IntegrationHelper";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f30153b = "getNetworkSDKVersion";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f30154c = "getAdapterSDKVersion";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f30155d = "getAdapterVersion";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f30156e = "getVersion";

    /* JADX INFO: renamed from: com.ironsource.r9$a */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f30157a;

        public a(Context context) {
            this.f30157a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Log.w(C0550r9.f30152a, "--------------- Google Play Services --------------");
                if (!this.f30157a.getPackageManager().getApplicationInfo(this.f30157a.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    Log.e(C0550r9.f30152a, "Google Play Services - MISSING");
                    return;
                }
                Log.i(C0550r9.f30152a, "Google Play Services - VERIFIED");
                String strB = com.ironsource.mediationsdk.p.h().b(this.f30157a);
                if (TextUtils.isEmpty(strB)) {
                    return;
                }
                Log.i(C0550r9.f30152a, "GAID is: " + strB + " (use this for test devices)");
            } catch (Exception e10) {
                C0474n4.d().a(e10);
                Log.e(C0550r9.f30152a, "Google Play Services - MISSING");
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    private static boolean a(Context context, String str) {
        byte b10;
        Object objNewInstance;
        try {
            String lowerCase = StringUtils.toLowerCase(str);
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -805296079) {
                if (iHashCode != 92668925) {
                    if (iHashCode == 497130182 && lowerCase.equals("facebook")) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                } else if (lowerCase.equals(AppLovinMediationProvider.ADMOB)) {
                    b10 = 1;
                } else {
                    b10 = -1;
                }
            } else if (lowerCase.equals("vungle")) {
                b10 = 2;
            } else {
                b10 = -1;
            }
            if (b10 == 0) {
                Log.i(f30152a, "--------------- Meta --------------");
            } else if (b10 == 1) {
                Log.i(f30152a, "--------------- Google (AdMob and Ad Manager) --------------");
            } else if (b10 != 2) {
                Log.i(f30152a, "--------------- " + str + " --------------");
            } else {
                Log.i(f30152a, "--------------- Liftoff Monetization --------------");
            }
            try {
                try {
                    Class<?> cls = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                    try {
                        objNewInstance = cls.getDeclaredConstructor(String.class).newInstance(str);
                    } catch (NoSuchMethodException unused) {
                        objNewInstance = cls.getConstructor(null).newInstance(null);
                    }
                    b(objNewInstance);
                    a(objNewInstance);
                    return true;
                } catch (Exception e10) {
                    C0474n4.d().a(e10);
                    Log.e(f30152a, "Failed to instantiate adapter");
                    return false;
                }
            } catch (ClassNotFoundException e11) {
                C0474n4.d().a(e11);
                Log.e(f30152a, "Adapter - MISSING");
                return false;
            }
        } catch (Exception e12) {
            C0474n4.d().a(e12);
            Log.e(f30152a, "isAdapterValid " + str, e12);
            return false;
        }
    }

    public static void b(Context context) {
        Log.i(f30152a, "Verifying Integration:");
        c(context);
        String[] strArr = {"AppLovin", "APS", "BidMachine", "Bigo", "Chartboost", "Fyber", "AdMob", "HyprMX", "InMobi", "IronSource", "Vungle", "Line", "Facebook", "Mintegral", "MobileFuse", "Moloco", "MyTarget", "Ogury", "Pangle", "PubMatic", "Smaato", "SuperAwesome", O6.H1, "Verve", "Yandex", "YSO"};
        for (int i10 = 0; i10 < 26; i10++) {
            String str = strArr[i10];
            if (!a(context, str)) {
                String lowerCase = StringUtils.toLowerCase(str);
                lowerCase.getClass();
                switch (lowerCase) {
                    case "vungle":
                        Log.i(f30152a, ">>>> Liftoff Monetization - NOT VERIFIED");
                        break;
                    case "admob":
                        Log.i(f30152a, ">>>> Google (AdMob and Ad Manager) - NOT VERIFIED");
                        break;
                    case "facebook":
                        Log.i(f30152a, ">>>> Meta - NOT VERIFIED");
                        break;
                    default:
                        Log.e(f30152a, ">>>> " + str + " - NOT VERIFIED");
                        break;
                }
            } else {
                String lowerCase2 = StringUtils.toLowerCase(str);
                lowerCase2.getClass();
                switch (lowerCase2.hashCode()) {
                    case -805296079:
                        if (lowerCase2.equals("vungle")) {
                        }
                        break;
                    case 92668925:
                        if (lowerCase2.equals(AppLovinMediationProvider.ADMOB)) {
                        }
                        break;
                    case 497130182:
                        if (!lowerCase2.equals("facebook")) {
                        }
                        break;
                    default:
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:195)
                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:173)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
                    */
                /*
                    Method dump skipped, instruction units count: 316
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C0550r9.b(android.content.Context):void");
            }

            private static void c(Context context) {
                Log.i(f30152a, "*** Permissions ***");
                PackageManager packageManager = context.getPackageManager();
                if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) == 0) {
                    Log.i(f30152a, "android.permission.INTERNET - VERIFIED");
                } else {
                    Log.e(f30152a, "android.permission.INTERNET - MISSING");
                }
                if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
                    Log.i(f30152a, "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
                } else {
                    Log.e(f30152a, "android.permission.ACCESS_NETWORK_STATE - MISSING");
                }
            }

            private static void b(Object obj) {
                String str;
                try {
                    Class<?> cls = obj.getClass();
                    if (obj instanceof LevelPlayBaseAdapter) {
                        str = f30153b;
                    } else {
                        str = f30154c;
                    }
                    Log.i(f30152a, "SDK Version - " + ((String) cls.getMethod(str, null).invoke(obj, null)));
                } catch (Exception e10) {
                    C0474n4.d().a(e10);
                    Log.w(f30152a, "Unable to get SDK version");
                }
            }

            private static void a(Context context) {
                new a(context).start();
            }

            private static void a(Object obj) {
                try {
                    Log.i(f30152a, "Adapter Version - " + ((String) obj.getClass().getMethod(obj instanceof LevelPlayBaseAdapter ? f30155d : "getVersion", null).invoke(obj, null)));
                } catch (Exception e10) {
                    C0474n4.d().a(e10);
                    Log.w(f30152a, "Unable to get adapter version");
                }
            }
        }
