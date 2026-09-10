package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.privatdozent;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class AFd1ySDK implements AFc1cSDK {
    private final AFc1hSDK getMonetizationNetwork;

    public AFd1ySDK(AFc1hSDK aFc1hSDK) {
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        this.getMonetizationNetwork = aFc1hSDK;
    }

    private final File AFAdRevenueData() {
        Context context = this.getMonetizationNetwork.getMonetizationNetwork;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "AFExceptionsCache");
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final boolean getCurrencyIso4217Code() {
        return getMonetizationNetwork(new String[0]);
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final int getMediationNetwork() {
        Iterator<T> it = getRevenue().iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((ExceptionInfo) it.next()).counter;
        }
        return i;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final boolean getMonetizationNetwork(String... strArr) {
        boolean zAdultoid;
        Intrinsics.checkNotNullParameter(strArr, "");
        synchronized (this) {
            try {
                File fileAFAdRevenueData = AFAdRevenueData();
                zAdultoid = true;
                if (fileAFAdRevenueData != null) {
                    if (strArr.length == 0) {
                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions", false, 4, null);
                        zAdultoid = interaction.taiyuan.adultoid(fileAFAdRevenueData);
                    } else {
                        AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "delete all exceptions except for: " + p002kotlin.collections.polloi.lerp(strArr, ", ", null, null, 0, null, null, 62, null), false, 4, null);
                        File[] fileArrListFiles = fileAFAdRevenueData.listFiles();
                        if (fileArrListFiles != null) {
                            Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                            ArrayList<File> arrayList = new ArrayList();
                            for (File file : fileArrListFiles) {
                                if (!p002kotlin.collections.polloi.polder(strArr, file.getName())) {
                                    arrayList.add(file);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList(p002kotlin.collections.dovishness.gintrap(arrayList, 10));
                            for (File file2 : arrayList) {
                                Intrinsics.checkNotNullExpressionValue(file2, "");
                                arrayList2.add(Boolean.valueOf(interaction.taiyuan.adultoid(file2)));
                            }
                            Set setPrefect = CollectionsKt.prefect(arrayList2);
                            if (setPrefect.isEmpty()) {
                                setPrefect = privatdozent.wireman(Boolean.TRUE);
                            }
                            Set set = setPrefect;
                            if (set.size() != 1 || !((Boolean) CollectionsKt.coffeecake(set)).booleanValue()) {
                                zAdultoid = false;
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zAdultoid;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final List<ExceptionInfo> getRevenue() {
        List<ExceptionInfo> listFormularize;
        File[] fileArrListFiles;
        ArrayList arrayList;
        synchronized (this) {
            try {
                File fileAFAdRevenueData = AFAdRevenueData();
                listFormularize = null;
                if (fileAFAdRevenueData != null && (fileArrListFiles = fileAFAdRevenueData.listFiles()) != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (File file : fileArrListFiles) {
                        try {
                            File[] fileArrListFiles2 = file.listFiles();
                            if (fileArrListFiles2 != null) {
                                Intrinsics.checkNotNullExpressionValue(fileArrListFiles2, "");
                                arrayList = new ArrayList();
                                for (File file2 : fileArrListFiles2) {
                                    ExceptionInfo.Companion companion = ExceptionInfo.INSTANCE;
                                    Intrinsics.checkNotNullExpressionValue(file2, "");
                                    ExceptionInfo mediationNetwork = ExceptionInfo.Companion.getMediationNetwork(interaction.competently.apical(file2, null, 1, null));
                                    if (mediationNetwork != null) {
                                        arrayList.add(mediationNetwork);
                                    }
                                }
                            } else {
                                arrayList = null;
                            }
                        } catch (Throwable th) {
                            AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not get stored exceptions\n " + th.getMessage(), false, 4, null);
                        }
                        if (arrayList != null) {
                            arrayList2.add(arrayList);
                        }
                    }
                    listFormularize = p002kotlin.collections.dovishness.preprohormone(arrayList2);
                }
                if (listFormularize == null) {
                    listFormularize = p002kotlin.collections.adultoid.formularize();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listFormularize;
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final void getCurrencyIso4217Code(int i, int i2) {
        File[] fileArrListFiles;
        synchronized (this) {
            try {
                File fileAFAdRevenueData = AFAdRevenueData();
                if (fileAFAdRevenueData != null && (fileArrListFiles = fileAFAdRevenueData.listFiles()) != null) {
                    Intrinsics.checkNotNullExpressionValue(fileArrListFiles, "");
                    ArrayList<File> arrayList = new ArrayList();
                    for (File file : fileArrListFiles) {
                        String name = file.getName();
                        Intrinsics.checkNotNullExpressionValue(name, "");
                        int mediationNetwork = AFk1xSDK.getMediationNetwork(name);
                        if (i > mediationNetwork || mediationNetwork > i2) {
                            arrayList.add(file);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(p002kotlin.collections.dovishness.gintrap(arrayList, 10));
                    for (File file2 : arrayList) {
                        Intrinsics.checkNotNullExpressionValue(file2, "");
                        arrayList2.add(Boolean.valueOf(interaction.taiyuan.adultoid(file2)));
                    }
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.appsflyer.internal.AFc1cSDK
    public final String AFAdRevenueData(Throwable th, String str) {
        String str2;
        File file;
        Intrinsics.checkNotNullParameter(th, "");
        Intrinsics.checkNotNullParameter(str, "");
        synchronized (this) {
            File fileAFAdRevenueData = AFAdRevenueData();
            str2 = null;
            if (fileAFAdRevenueData != null) {
                file = new File(fileAFAdRevenueData, "6.17.5");
                if (!file.exists()) {
                    file.mkdirs();
                }
            } else {
                file = null;
            }
            if (file != null) {
                try {
                    ExceptionInfo revenue = AFd1sSDK.getRevenue(th, str);
                    String str3 = revenue.hashName;
                    File file2 = new File(file, str3);
                    if (file2.exists()) {
                        ExceptionInfo.Companion companion = ExceptionInfo.INSTANCE;
                        ExceptionInfo mediationNetwork = ExceptionInfo.Companion.getMediationNetwork(interaction.competently.apical(file2, null, 1, null));
                        if (mediationNetwork != null) {
                            mediationNetwork.counter++;
                            revenue = mediationNetwork;
                        }
                    }
                    interaction.competently.impassible(file2, revenue.getMonetizationNetwork(), null, 2, null);
                    str2 = str3;
                } catch (Exception e) {
                    AFh1ySDK.v$default(AFLogger.INSTANCE, AFg1cSDK.EXCEPTION_MANAGER, "Could not cache exception\n " + e.getMessage(), false, 4, null);
                }
            }
        }
        return str2;
    }
}
