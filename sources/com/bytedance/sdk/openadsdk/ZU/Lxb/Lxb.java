package com.bytedance.sdk.openadsdk.ZU.Lxb;

/* JADX INFO: loaded from: classes2.dex */
public class Lxb {
    public static final LD Lxb = new LD(0);
    public static final LD LD = new LD(1);
    public static final LD lk = new LD(2);
    public static final LD ZU = new LD(0);
    public static final LD JXs = new LD(1);
    public static final LD lc = new LD(2);

    public static void LD() {
        try {
            com.bytedance.sdk.openadsdk.STP.lk.LD("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.LD("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("tt_sdk_event_net_ad");
            com.bytedance.sdk.openadsdk.STP.lk.LD("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.LD("tt_sdk_event_net_state", "tt_sdk_event_net_state", ""));
            com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("tt_sdk_event_net_state");
            com.bytedance.sdk.openadsdk.STP.lk.LD("net_upload_monitor", com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.LD("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("tt_sdk_event_net_trail");
            com.bytedance.sdk.openadsdk.STP.lk.LD("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.LD("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", ""));
            com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("tt_sdk_event_db_ad");
            com.bytedance.sdk.openadsdk.STP.lk.LD("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.LD("tt_sdk_event_db_state", "tt_sdk_event_db_state", ""));
            com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("tt_sdk_event_db_state");
            com.bytedance.sdk.openadsdk.STP.lk.LD("db_upload_monitor", com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.LD("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", ""));
            com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("tt_sdk_event_db_trail");
        } catch (Throwable unused) {
        }
    }

    public static void Lxb(LD ld, boolean z, int i, long j) {
        try {
            ld.ebl.getAndSet(true);
            if (z) {
                ld.Lxb.incrementAndGet();
                ld.lk.addAndGet(j);
                return;
            }
            ld.LD.incrementAndGet();
            Integer num = ld.lc.get(Integer.valueOf(i));
            if (num != null) {
                ld.lc.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
            } else {
                ld.lc.put(Integer.valueOf(i), 1);
            }
        } catch (Throwable unused) {
        }
    }

    public static void Lxb(LD ld, boolean z) {
        try {
            ld.ebl.getAndSet(true);
            if (z) {
                ld.Lxb.incrementAndGet();
            } else {
                ld.LD.incrementAndGet();
            }
        } catch (Throwable unused) {
        }
    }

    public static void Lxb(LD ld) {
        try {
            ld.ebl.getAndSet(true);
            ld.JXs.incrementAndGet();
        } catch (Throwable unused) {
        }
    }

    public static void Lxb() {
        try {
            LD ld = Lxb;
            if (ld.ebl.get()) {
                com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("tt_sdk_event_net_ad", "tt_sdk_event_net_ad", ld.Lxb().toString());
            }
            LD ld2 = LD;
            if (ld2.ebl.get()) {
                com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("tt_sdk_event_net_state", "tt_sdk_event_net_state", ld2.Lxb().toString());
            }
            LD ld3 = lk;
            if (ld3.ebl.get()) {
                com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("tt_sdk_event_net_trail", "tt_sdk_event_net_trail", ld3.Lxb().toString());
            }
            LD ld4 = ZU;
            if (ld4.ebl.get()) {
                com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("tt_sdk_event_db_ad", "tt_sdk_event_db_ad", ld4.LD().toString());
            }
            LD ld5 = JXs;
            if (ld5.ebl.get()) {
                com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("tt_sdk_event_db_state", "tt_sdk_event_db_state", ld5.LD().toString());
            }
            LD ld6 = lc;
            if (ld6.ebl.get()) {
                com.bytedance.sdk.openadsdk.multipro.ZU.Lxb.Lxb("tt_sdk_event_db_trail", "tt_sdk_event_db_trail", ld6.LD().toString());
            }
        } catch (Throwable unused) {
        }
    }
}
