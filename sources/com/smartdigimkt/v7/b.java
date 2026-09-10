package com.smartdigimkt.v7;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f39185a = "10001";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f39186b = "10002";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f39187c = "10003";
    public static final String d = "10004";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f39188e = "10005";
    public static final String f = "10006";
    public static final String g = "10007";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f39189h = "10008";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f39190i = "10009";
    public static final String j = "10010";
    public static final String k = "20001";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f39191l = "20002";
    public static final String m = "30001";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f39192n = "90001";
    public static final String o = "90002";

    public static a a(String str) {
        return a(str, "");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:63:0x00cf  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v2 int, still in use, count: 6, list:
  (r2v2 int) from 0x000d: IF  (r2v2 int) != (46730192 int)  -> B:6:0x000f A[HIDDEN]
  (r2v2 int) from 0x0012: IF  (r2v2 int) != (48577204 int)  -> B:8:0x0014 A[HIDDEN]
  (r2v2 int) from 0x0017: IF  (r2v2 int) != (47653683 int)  -> B:10:0x0019 A[HIDDEN]
  (r2v2 int) from 0x001c: IF  (r2v2 int) != (47653684 int)  -> B:12:0x001e A[HIDDEN]
  (r2v2 int) from 0x0021: IF  (r2v2 int) != (54118330 int)  -> B:14:0x0023 A[HIDDEN]
  (r2v2 int) from 0x0026: IF  (r2v2 int) != (54118331 int)  -> B:16:0x0028 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    public static a a(String str, String str2) {
        byte b2;
        if (TextUtils.isEmpty(str2)) {
            if (iHashCode != 46730192) {
                if (iHashCode != 48577204) {
                    if (iHashCode != 47653683) {
                        if (iHashCode != 47653684) {
                            if (iHashCode != 54118330) {
                                if (iHashCode != 54118331) {
                                    switch (str) {
                                        case "10001":
                                            b2 = 0;
                                            break;
                                        case "10002":
                                            b2 = 1;
                                            break;
                                        case "10003":
                                            b2 = 2;
                                            break;
                                        case "10004":
                                            b2 = 3;
                                            break;
                                        case "10005":
                                            b2 = 4;
                                            break;
                                        case "10006":
                                            b2 = 5;
                                            break;
                                        case "10007":
                                            b2 = 6;
                                            break;
                                        case "10008":
                                            b2 = 7;
                                            break;
                                        case "10009":
                                            b2 = 8;
                                            break;
                                        default:
                                            b2 = -1;
                                            break;
                                    }
                                } else if (str.equals(o)) {
                                    b2 = 10;
                                } else {
                                    b2 = -1;
                                }
                            } else if (str.equals(f39192n)) {
                                b2 = 11;
                            } else {
                                b2 = -1;
                            }
                        } else if (str.equals(f39191l)) {
                            b2 = 12;
                        } else {
                            b2 = -1;
                        }
                    } else if (str.equals("20001")) {
                        b2 = 13;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("30001")) {
                    b2 = 14;
                } else {
                    b2 = -1;
                }
            } else if (str.equals(j)) {
                b2 = 9;
            } else {
                b2 = -1;
            }
            switch (b2) {
                case 0:
                    str2 = "Parameter error.";
                    break;
                case 1:
                    str2 = "SDK is not initialized.";
                    break;
                case 2:
                    str2 = "AppId or AppKey is empty.";
                    break;
                case 3:
                    str2 = "Ad slot is loading, please wait.";
                    break;
                case 4:
                    str2 = "Ad slot loading timeout.";
                    break;
                case 5:
                    str2 = "Ad slot strategy loading failed.";
                    break;
                case 6:
                    str2 = "Bid request timeout.";
                    break;
                case 7:
                    str2 = "Bid request failed.";
                    break;
                case 8:
                    str2 = "Mediation SDK request failed.";
                    break;
                case 9:
                    str2 = "Ad request failed.";
                    break;
                case 10:
                    str2 = "Possible network issue on device. Please check your network.";
                    break;
                case 11:
                    str2 = "Service status error.";
                    break;
                case 12:
                    str2 = "Failed to display ad.";
                    break;
                case 13:
                    str2 = "Ad is loaded but not ready.";
                    break;
                default:
                    str2 = "Unknown error.";
                    break;
            }
        }
        return new a(str, str2);
    }
}
