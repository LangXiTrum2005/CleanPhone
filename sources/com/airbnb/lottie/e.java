package com.airbnb.lottie;

import android.content.Context;
import android.util.Pair;
import com.airbnb.lottie.model.LottieCompositionCache;
import com.airbnb.lottie.network.DefaultLottieFetchResult;
import com.airbnb.lottie.network.DefaultLottieNetworkFetcher;
import com.airbnb.lottie.network.FileExtension;
import com.airbnb.lottie.network.LottieNetworkCacheProvider;
import com.airbnb.lottie.network.NetworkCache;
import com.airbnb.lottie.network.NetworkFetcher;
import com.airbnb.lottie.utils.Logger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Context f9683Y;
    public final /* synthetic */ String Z;
    public final /* synthetic */ String e0;

    public /* synthetic */ e(Context context, String str, int i2, String str2) {
        this.X = i2;
        this.f9683Y = context;
        this.Z = str;
        this.e0 = str2;
    }

    /* JADX INFO: Removed unreachable split cross block B:107:0x012f */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Pair pair;
        LottieComposition lottieComposition;
        LottieResult lottieResult;
        Object obj;
        NetworkFetcher networkFetcher;
        NetworkCache networkCache;
        switch (this.X) {
            case 0:
                Context context = this.f9683Y;
                String str = this.Z;
                String str2 = this.e0;
                HashMap map = LottieCompositionFactory.f9522a;
                NetworkFetcher networkFetcher2 = L.f9508b;
                NetworkFetcher networkFetcher3 = networkFetcher2;
                if (networkFetcher2 == null) {
                    synchronized (NetworkFetcher.class) {
                        try {
                            NetworkFetcher networkFetcher4 = L.f9508b;
                            networkFetcher = networkFetcher4;
                            if (networkFetcher4 == null) {
                                Context applicationContext = context.getApplicationContext();
                                NetworkCache networkCache2 = L.f9509c;
                                if (networkCache2 == null) {
                                    synchronized (NetworkCache.class) {
                                        try {
                                            networkCache = L.f9509c;
                                            if (networkCache == null) {
                                                networkCache = new NetworkCache(new LottieNetworkCacheProvider() { // from class: com.airbnb.lottie.L.1

                                                    /* JADX INFO: renamed from: a */
                                                    public final /* synthetic */ Context f9510a;

                                                    public AnonymousClass1() {
                                                        context = applicationContext;
                                                    }

                                                    @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
                                                    public final File a() {
                                                        return new File(context.getCacheDir(), "lottie_network_cache");
                                                    }
                                                });
                                                L.f9509c = networkCache;
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        break;
                                    }
                                    networkCache2 = networkCache;
                                }
                                NetworkFetcher networkFetcher5 = new NetworkFetcher(networkCache2, new DefaultLottieNetworkFetcher());
                                L.f9508b = networkFetcher5;
                                networkFetcher = networkFetcher5;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    networkFetcher3 = networkFetcher;
                }
                FileExtension fileExtension = FileExtension.ZIP;
                DefaultLottieFetchResult defaultLottieFetchResultA = null;
                if (str2 == null) {
                    lottieComposition = null;
                } else {
                    NetworkCache networkCache3 = networkFetcher3.f9872a;
                    try {
                        File fileB = networkCache3.b();
                        FileExtension fileExtension2 = FileExtension.JSON;
                        File file = new File(fileB, NetworkCache.a(str, fileExtension2, false));
                        if (!file.exists()) {
                            file = new File(networkCache3.b(), NetworkCache.a(str, fileExtension, false));
                            if (!file.exists()) {
                                file = null;
                            }
                        }
                        if (file == null) {
                            pair = null;
                        } else {
                            FileInputStream fileInputStream = new FileInputStream(file);
                            if (file.getAbsolutePath().endsWith(".zip")) {
                                fileExtension2 = fileExtension;
                            }
                            file.getAbsolutePath();
                            Logger.a();
                            pair = new Pair(fileExtension2, fileInputStream);
                        }
                    } catch (FileNotFoundException unused) {
                    }
                    if (pair == null) {
                        lottieComposition = null;
                    } else {
                        FileExtension fileExtension3 = (FileExtension) pair.first;
                        InputStream inputStream = (InputStream) pair.second;
                        Object obj2 = (fileExtension3 == fileExtension ? LottieCompositionFactory.f(new ZipInputStream(inputStream), str) : LottieCompositionFactory.c(inputStream, str)).f9547a;
                        if (obj2 != null) {
                            lottieComposition = (LottieComposition) obj2;
                        } else {
                            lottieComposition = null;
                        }
                    }
                }
                if (lottieComposition == null) {
                    Logger.a();
                    Logger.a();
                    try {
                        try {
                            defaultLottieFetchResultA = networkFetcher3.f9873b.a(str);
                            try {
                                if (defaultLottieFetchResultA.h()) {
                                    LottieResult lottieResultA = networkFetcher3.a(str, defaultLottieFetchResultA.X.getInputStream(), defaultLottieFetchResultA.X.getContentType(), str2);
                                    Logger.a();
                                    defaultLottieFetchResultA.close();
                                    lottieResult = lottieResultA;
                                } else {
                                    LottieResult lottieResult2 = new LottieResult((Throwable) new IllegalArgumentException(defaultLottieFetchResultA.d()));
                                    defaultLottieFetchResultA.close();
                                    lottieResult = lottieResult2;
                                }
                            } catch (IOException e2) {
                                Logger.c("LottieFetchResult close failed ", e2);
                                lottieResult = str;
                            }
                        } catch (Throwable th3) {
                            if (defaultLottieFetchResultA != null) {
                                try {
                                    defaultLottieFetchResultA.close();
                                } catch (IOException e3) {
                                    Logger.c("LottieFetchResult close failed ", e3);
                                }
                                break;
                            }
                            throw th3;
                        }
                    } catch (Exception e4) {
                        LottieResult lottieResult3 = new LottieResult((Throwable) e4);
                        if (defaultLottieFetchResultA != null) {
                            try {
                                defaultLottieFetchResultA.close();
                            } catch (IOException e5) {
                                Logger.c("LottieFetchResult close failed ", e5);
                            }
                        }
                        lottieResult = lottieResult3;
                        break;
                    }
                    break;
                } else {
                    lottieResult = new LottieResult(lottieComposition);
                }
                if (str2 != null && (obj = lottieResult.f9547a) != null) {
                    LottieCompositionCache.f9730b.f9731a.put(str2, (LottieComposition) obj);
                }
                return lottieResult;
            default:
                return LottieCompositionFactory.b(this.f9683Y, this.Z, this.e0);
        }
    }
}
