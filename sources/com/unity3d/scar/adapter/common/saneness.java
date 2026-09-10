package com.unity3d.scar.adapter.common;

/* JADX INFO: compiled from: GMAAdsError.java */
/* JADX INFO: loaded from: classes4.dex */
public class saneness extends apical {
    public saneness(GMAEvent gMAEvent, Object... objArr) {
        super(gMAEvent, null, objArr);
    }

    public static saneness attabal(astigmatic.dern dernVar) {
        String str = String.format("Cannot show ad that is not loaded for placement %s", dernVar.dern());
        return new saneness(GMAEvent.AD_NOT_LOADED_ERROR, str, dernVar.dern(), dernVar.wireman(), str);
    }

    public static saneness beachfront(String str, String str2, String str3) {
        return new saneness(GMAEvent.NO_AD_ERROR, str3, str, str2, str3);
    }

    public static saneness dern(astigmatic.dern dernVar, String str) {
        return new saneness(GMAEvent.INTERNAL_LOAD_ERROR, str, dernVar.dern(), dernVar.wireman(), str);
    }

    public static saneness marial(String str) {
        return new saneness(GMAEvent.INTERNAL_SIGNALS_ERROR, str, str);
    }

    public static saneness saneness(String str) {
        return new saneness(GMAEvent.SCAR_UNSUPPORTED, str, new Object[0]);
    }

    public static saneness wireman(astigmatic.dern dernVar, String str) {
        return new saneness(GMAEvent.INTERNAL_SHOW_ERROR, str, dernVar.dern(), dernVar.wireman(), str);
    }

    @Override // com.unity3d.scar.adapter.common.apical
    public String getDomain() {
        return "GMA";
    }

    public saneness(GMAEvent gMAEvent, String str, Object... objArr) {
        super(gMAEvent, str, objArr);
    }
}
