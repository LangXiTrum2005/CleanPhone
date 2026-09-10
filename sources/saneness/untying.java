package saneness;

import ads_mobile_sdk.cd1;
import ads_mobile_sdk.j;
import ads_mobile_sdk.qc1;
import ads_mobile_sdk.vf;
import ads_mobile_sdk.vm0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class untying extends vm0 {
    public untying() {
        super(vf.DEFAULT_INSTANCE);
    }

    public final Map adultoid() {
        return Collections.unmodifiableMap(Collections.unmodifiableMap(((vf) this.b).admobSignalAdapterConfigs_));
    }

    public final Map apical() {
        return Collections.unmodifiableMap(Collections.unmodifiableMap(((vf) this.b).adManagerSignalAdapterConfigs_));
    }

    public final void attabal(long j) {
        b();
        vf vfVar = (vf) this.b;
        vfVar.bitField0_ |= 2;
        vfVar.lastUpdateTimeMs_ = j;
    }

    public final void beachfront(long j) {
        b();
        vf vfVar = (vf) this.b;
        vfVar.bitField0_ |= 4;
        vfVar.serverCacheTtlSecs_ = j;
    }

    public final void competently(String str) {
        b();
        vf vfVar = (vf) this.b;
        vfVar.getClass();
        vfVar.bitField0_ |= 8;
        vfVar.commonSettingsJson_ = str;
    }

    public final void dern(String str) {
        b();
        vf vfVar = (vf) this.b;
        vfVar.getClass();
        str.getClass();
        vfVar.bitField0_ |= 1;
        vfVar.appSettingsJson_ = str;
    }

    public final List dovishness() {
        return Collections.unmodifiableList(((vf) this.b).loggingOnlyExperimentIds_);
    }

    public final void formularize(LinkedHashMap linkedHashMap) {
        b();
        vf vfVar = (vf) this.b;
        cd1 cd1Var = vfVar.adUnitPatterns_;
        if (!cd1Var.a) {
            vfVar.adUnitPatterns_ = cd1Var.b();
        }
        vfVar.adUnitPatterns_.putAll(linkedHashMap);
    }

    public final Map gintrap() {
        return Collections.unmodifiableMap(Collections.unmodifiableMap(((vf) this.b).signalAdapterConfigs_));
    }

    public final Map graveside() {
        return Collections.unmodifiableMap(Collections.unmodifiableMap(((vf) this.b).adapterInitializationConfigs_));
    }

    public final Map impassible() {
        return Collections.unmodifiableMap(Collections.unmodifiableMap(((vf) this.b).adUnitAndFormatToMediationConfigs_));
    }

    public final void impromptu(LinkedHashMap linkedHashMap) {
        b();
        vf vfVar = (vf) this.b;
        cd1 cd1Var = vfVar.adUnitAndFormatToMediationConfigs_;
        if (!cd1Var.a) {
            vfVar.adUnitAndFormatToMediationConfigs_ = cd1Var.b();
        }
        vfVar.adUnitAndFormatToMediationConfigs_.putAll(linkedHashMap);
    }

    public final Map kowloon() {
        return Collections.unmodifiableMap(Collections.unmodifiableMap(((vf) this.b).adUnitAndFormatToRequestSignals_));
    }

    public final void marial(LinkedHashMap linkedHashMap) {
        b();
        vf vfVar = (vf) this.b;
        cd1 cd1Var = vfVar.adManagerSignalAdapterConfigs_;
        if (!cd1Var.a) {
            vfVar.adManagerSignalAdapterConfigs_ = cd1Var.b();
        }
        vfVar.adManagerSignalAdapterConfigs_.putAll(linkedHashMap);
    }

    public final void molybdenite(LinkedHashMap linkedHashMap) {
        b();
        vf vfVar = (vf) this.b;
        cd1 cd1Var = vfVar.signalAdapterConfigs_;
        if (!cd1Var.a) {
            vfVar.signalAdapterConfigs_ = cd1Var.b();
        }
        vfVar.signalAdapterConfigs_.putAll(linkedHashMap);
    }

    public final void monoploid(LinkedHashMap linkedHashMap) {
        b();
        vf vfVar = (vf) this.b;
        cd1 cd1Var = vfVar.admobSignalAdapterConfigs_;
        if (!cd1Var.a) {
            vfVar.admobSignalAdapterConfigs_ = cd1Var.b();
        }
        vfVar.admobSignalAdapterConfigs_.putAll(linkedHashMap);
    }

    public final Map polloi() {
        return Collections.unmodifiableMap(Collections.unmodifiableMap(((vf) this.b).adUnitPatterns_));
    }

    public final void taiyuan(LinkedHashMap linkedHashMap) {
        b();
        vf vfVar = (vf) this.b;
        cd1 cd1Var = vfVar.adUnitAndFormatToRequestSignals_;
        if (!cd1Var.a) {
            vfVar.adUnitAndFormatToRequestSignals_ = cd1Var.b();
        }
        vfVar.adUnitAndFormatToRequestSignals_.putAll(linkedHashMap);
    }

    public final void triweekly(LinkedHashMap linkedHashMap) {
        b();
        vf vfVar = (vf) this.b;
        cd1 cd1Var = vfVar.adapterInitializationConfigs_;
        if (!cd1Var.a) {
            vfVar.adapterInitializationConfigs_ = cd1Var.b();
        }
        vfVar.adapterInitializationConfigs_.putAll(linkedHashMap);
    }

    public final void wireman(ArrayList arrayList) {
        b();
        vf vfVar = (vf) this.b;
        RandomAccess randomAccess = vfVar.loggingOnlyExperimentIds_;
        if (!((j) randomAccess).a) {
            qc1 qc1Var = (qc1) randomAccess;
            vfVar.loggingOnlyExperimentIds_ = qc1Var.a(qc1Var.c * 2);
        }
        lamplit.a(arrayList, vfVar.loggingOnlyExperimentIds_);
    }
}
