package com.yolo.networklibrary.common.model;

import android.app.Application;
import android.os.Build;
import com.blankj.utilcode.util.impromptu;
import com.blankj.utilcode.util.wireman;
import com.google.gson.reflect.TypeToken;
import com.yolo.networklibrary.common.util.attabal;
import com.yolo.networklibrary.common.util.beachfront;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.collections.adultoid;
import p002kotlin.dern;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: RequestContent.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \f2\u00020\u0001:\u0002\r\u000eB\u0013\b\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\b\u0010\tR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/yolo/networklibrary/common/model/RequestContent;", "", "", "initialCapacity", "<init>", "(I)V", "Ljava/util/LinkedHashMap;", "", "attabal", "()Ljava/util/LinkedHashMap;", "Ljava/util/LinkedHashMap;", "linkedHashMap", "saneness", "Builder", "Companion", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class RequestContent {

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final LinkedHashMap<String, Object> linkedHashMap;

    /* JADX INFO: compiled from: RequestContent.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00002\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0007\"\u00020\u0001¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/yolo/networklibrary/common/model/RequestContent$Builder;", "", "<init>", "()V", "obj", "attabal", "(Ljava/lang/Object;)Lcom/yolo/networklibrary/common/model/RequestContent$Builder;", "", "array", "saneness", "([Ljava/lang/Object;)Lcom/yolo/networklibrary/common/model/RequestContent$Builder;", "Ljava/util/LinkedHashMap;", "", "dern", "()Ljava/util/LinkedHashMap;", "", "wireman", "()Ljava/util/List;", "Ljava/util/List;", "paramsList", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public List<Object> paramsList;

        public final Builder attabal(Object obj) {
            Intrinsics.checkNotNullParameter(obj, "obj");
            wireman().add(obj);
            return this;
        }

        public final LinkedHashMap<String, Object> dern() {
            Object objM3351constructorimpl;
            LinkedHashMap<String, Object> linkedHashMapAttabal = new RequestContent(0, 1, null).attabal();
            if (wireman().size() > 0) {
                for (Object obj : wireman()) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        linkedHashMapAttabal.putAll((Map) impromptu.marial(impromptu.taiyuan(obj), RequestContent.INSTANCE.dern().getType()));
                        objM3351constructorimpl = Result.m3351constructorimpl(Unit.f29295attabal);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM3351constructorimpl = Result.m3351constructorimpl(dern.attabal(th));
                    }
                    Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
                    if (thM3354exceptionOrNullimpl != null) {
                        thM3354exceptionOrNullimpl.printStackTrace();
                    }
                    if (obj instanceof CommonRequest) {
                        Set<String> setKeySet = linkedHashMapAttabal.keySet();
                        Intrinsics.checkNotNullExpressionValue(setKeySet, "map.keys");
                        for (String it : setKeySet) {
                            Object obj2 = linkedHashMapAttabal.get(it);
                            if ((obj2 instanceof String) && ((CharSequence) obj2).length() == 0) {
                                Intrinsics.checkNotNullExpressionValue(it, "it");
                                linkedHashMapAttabal.put(it, "");
                            }
                        }
                    }
                    Throwable thM3354exceptionOrNullimpl2 = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
                    if (thM3354exceptionOrNullimpl2 != null) {
                        thM3354exceptionOrNullimpl2.printStackTrace();
                    }
                }
            }
            return linkedHashMapAttabal;
        }

        public final Builder saneness(Object... array) {
            Intrinsics.checkNotNullParameter(array, "array");
            wireman().addAll(adultoid.polloi(Arrays.copyOf(array, array.length)));
            return this;
        }

        public final List<Object> wireman() {
            if (this.paramsList == null) {
                this.paramsList = new ArrayList();
            }
            List<Object> list = this.paramsList;
            Intrinsics.beachfront(list);
            return list;
        }
    }

    /* JADX INFO: compiled from: RequestContent.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0004\"\u00020\u0001¢\u0006\u0004\b\b\u0010\tR&\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u000b0\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/yolo/networklibrary/common/model/RequestContent$Companion;", "", "<init>", "()V", "", "extraParams", "Ljava/util/LinkedHashMap;", "", "saneness", "([Ljava/lang/Object;)Ljava/util/LinkedHashMap;", "Lcom/google/gson/reflect/TypeToken;", "Ljava/util/TreeMap;", "dern", "()Lcom/google/gson/reflect/TypeToken;", "typeToken", "neworklibrary_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TypeToken<TreeMap<String, Object>> dern() {
            return new TypeToken<TreeMap<String, Object>>() { // from class: com.yolo.networklibrary.common.model.RequestContent$Companion$typeToken$1
            };
        }

        public final LinkedHashMap<String, Object> saneness(Object... extraParams) {
            Intrinsics.checkNotNullParameter(extraParams, "extraParams");
            CommonRequest commonRequest = new CommonRequest(null, null, null, null, null, null, null, 0L, false, false, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
            Application applicationAttabal = com.blankj.utilcode.util.adultoid.attabal();
            Intrinsics.checkNotNullExpressionValue(applicationAttabal, "getApp()");
            Builder builder = new Builder();
            String strMonoploid = com.yolo.networklibrary.common.util.dern.monoploid(applicationAttabal);
            Intrinsics.checkNotNullExpressionValue(strMonoploid, "getUniqueID(context)");
            commonRequest.saneness(strMonoploid);
            String strWireman = com.yolo.networklibrary.common.util.dern.wireman(applicationAttabal);
            Intrinsics.checkNotNullExpressionValue(strWireman, "getAdvertisingId(context)");
            commonRequest.dern(strWireman);
            commonRequest.marial(beachfront.f23962attabal.attabal(applicationAttabal));
            String strCutely = com.yolo.networklibrary.common.util.dern.cutely(applicationAttabal);
            Intrinsics.checkNotNullExpressionValue(strCutely, "getMnc(context)");
            commonRequest.beachfront(strCutely);
            String strFormularize = com.yolo.networklibrary.common.util.dern.formularize(applicationAttabal);
            Intrinsics.checkNotNullExpressionValue(strFormularize, "getOSRegionCodeLang(context)");
            commonRequest.wireman(strFormularize);
            String strSaneness = wireman.saneness();
            Intrinsics.checkNotNullExpressionValue(strSaneness, "getAppVersionName()");
            commonRequest.attabal(strSaneness);
            commonRequest.impassible(com.yolo.networklibrary.common.util.dern.arytenoidectomy());
            String strAttabal = wireman.attabal();
            Intrinsics.checkNotNullExpressionValue(strAttabal, "getAppPackageName()");
            commonRequest.cutely(strAttabal);
            commonRequest.apical(com.yolo.networklibrary.common.util.dern.molybdenite(applicationAttabal));
            commonRequest.adultoid(com.yolo.networklibrary.common.util.dern.graveside());
            String BRAND = Build.BRAND;
            Intrinsics.checkNotNullExpressionValue(BRAND, "BRAND");
            commonRequest.impromptu(BRAND);
            String MODEL = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
            commonRequest.taiyuan(MODEL);
            String RELEASE = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
            commonRequest.competently(RELEASE);
            HttpUserInfo httpUserInfoAttabal = attabal.INSTANCE.attabal();
            if (httpUserInfoAttabal != null) {
                commonRequest.triweekly(httpUserInfoAttabal.saneness());
                commonRequest.formularize(httpUserInfoAttabal.attabal());
            }
            com.yolo.networklibrary.common.util.wireman.Companion companion = com.yolo.networklibrary.common.util.wireman.INSTANCE;
            HttpInstallInfoBean httpInstallInfoBeanSaneness = companion.saneness();
            if (httpInstallInfoBeanSaneness != null) {
                String strImpromptu = httpInstallInfoBeanSaneness.impromptu();
                if (strImpromptu == null || strImpromptu.length() == 0) {
                    commonRequest.graveside(companion.attabal());
                } else {
                    commonRequest.graveside(httpInstallInfoBeanSaneness.impromptu());
                    commonRequest.kowloon(httpInstallInfoBeanSaneness.dern());
                    commonRequest.molybdenite(httpInstallInfoBeanSaneness.competently());
                    commonRequest.arytenoidectomy(httpInstallInfoBeanSaneness.wireman());
                    commonRequest.monoploid(httpInstallInfoBeanSaneness.marial());
                    commonRequest.polloi(httpInstallInfoBeanSaneness.beachfront());
                }
            }
            builder.attabal(commonRequest).saneness(Arrays.copyOf(extraParams, extraParams.length));
            Object objAttabal = AppParamsFactory.f23900attabal.attabal().attabal();
            if (objAttabal != null) {
                builder.attabal(objAttabal);
            }
            return builder.dern();
        }

        private Companion() {
        }
    }

    public RequestContent(int i) {
        this.linkedHashMap = new LinkedHashMap<>(i);
    }

    public final LinkedHashMap<String, Object> attabal() {
        return this.linkedHashMap;
    }

    public /* synthetic */ RequestContent(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }
}
