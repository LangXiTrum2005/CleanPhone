package com.thinkup.network.admob;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.MobileAds;
import com.thinkup.core.api.TUInitMediation;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class AdmobTUConst {
    public static final int ADAPTIVE_ANCHORED = 0;
    public static final int ADAPTIVE_INLINE = 1;
    public static final String ADAPTIVE_ORIENTATION = "adaptive_orientation";
    public static final String ADAPTIVE_TYPE = "adaptive_type";
    public static final String ADAPTIVE_WIDTH = "adaptive_width";
    public static final String ADMOB_IS_COLLAPSIBLE = "admob_is_collapsible";
    public static final String CONTENT_KEYWORDS = "admob_keywords";
    public static final String CONTENT_URLS = "admob_content_urls";
    public static final long IMPRESSION_DEALY = 500;
    public static final int NETWORK_FIRM_ID = 2;
    public static final int ORIENTATION_CURRENT = 0;
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;
    public static String TAG = "AdmobTUConst";
    private static boolean m = false;
    private static String o;

    public static class DEBUGGER_CONFIG {
        public static final int Admob_INTERSTITIAL_IMAGE = 1;
        public static final int Admob_INTERSTITIAL_VIDEO = 2;
        public static final int Admob_NATIVE_IMAGE = 1;
        public static final int Admob_NATIVE_VIDEO = 2;
        public static final int Admob_NETWORK = 2;
    }

    public static class ORIENTATION {
        public static final int LANDSCAPE = 2;
        public static final int PORTRAIT = 1;
    }

    public static class REWARD_EXTRA {
        public static final String REWARD_EXTRA_KEY_REWARD_AMOUNT = "admob_reward_amount";
        public static final String REWARD_EXTRA_KEY_REWARD_TYPE = "admob_reward_type";
    }

    public static String getNetworkVersion() {
        String str = o;
        if (str != null) {
            return str;
        }
        try {
            String string = MobileAds.getVersion().toString();
            o = string;
            return string;
        } catch (Throwable unused) {
            o = "";
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074 A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x0002, B:6:0x000f, B:8:0x0015, B:10:0x0027, B:11:0x002d, B:14:0x0037, B:17:0x0050, B:52:0x00f4, B:54:0x00fe, B:18:0x006e, B:19:0x0074, B:20:0x007c, B:46:0x00c4, B:47:0x00c7, B:48:0x00e9, B:49:0x00ec, B:50:0x00ef, B:51:0x00f2, B:22:0x0080, B:25:0x008a, B:28:0x0094, B:31:0x009e, B:34:0x00a7, B:37:0x00af), top: B:59:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x007f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0080 A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x0002, B:6:0x000f, B:8:0x0015, B:10:0x0027, B:11:0x002d, B:14:0x0037, B:17:0x0050, B:52:0x00f4, B:54:0x00fe, B:18:0x006e, B:19:0x0074, B:20:0x007c, B:46:0x00c4, B:47:0x00c7, B:48:0x00e9, B:49:0x00ec, B:50:0x00ef, B:51:0x00f2, B:22:0x0080, B:25:0x008a, B:28:0x0094, B:31:0x009e, B:34:0x00a7, B:37:0x00af), top: B:59:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x0002, B:6:0x000f, B:8:0x0015, B:10:0x0027, B:11:0x002d, B:14:0x0037, B:17:0x0050, B:52:0x00f4, B:54:0x00fe, B:18:0x006e, B:19:0x0074, B:20:0x007c, B:46:0x00c4, B:47:0x00c7, B:48:0x00e9, B:49:0x00ec, B:50:0x00ef, B:51:0x00f2, B:22:0x0080, B:25:0x008a, B:28:0x0094, B:31:0x009e, B:34:0x00a7, B:37:0x00af), top: B:59:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0092  */
    /* JADX WARN: Code duplicated, block: B:28:0x0094 A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x0002, B:6:0x000f, B:8:0x0015, B:10:0x0027, B:11:0x002d, B:14:0x0037, B:17:0x0050, B:52:0x00f4, B:54:0x00fe, B:18:0x006e, B:19:0x0074, B:20:0x007c, B:46:0x00c4, B:47:0x00c7, B:48:0x00e9, B:49:0x00ec, B:50:0x00ef, B:51:0x00f2, B:22:0x0080, B:25:0x008a, B:28:0x0094, B:31:0x009e, B:34:0x00a7, B:37:0x00af), top: B:59:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:31:0x009e A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x0002, B:6:0x000f, B:8:0x0015, B:10:0x0027, B:11:0x002d, B:14:0x0037, B:17:0x0050, B:52:0x00f4, B:54:0x00fe, B:18:0x006e, B:19:0x0074, B:20:0x007c, B:46:0x00c4, B:47:0x00c7, B:48:0x00e9, B:49:0x00ec, B:50:0x00ef, B:51:0x00f2, B:22:0x0080, B:25:0x008a, B:28:0x0094, B:31:0x009e, B:34:0x00a7, B:37:0x00af), top: B:59:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a7 A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x0002, B:6:0x000f, B:8:0x0015, B:10:0x0027, B:11:0x002d, B:14:0x0037, B:17:0x0050, B:52:0x00f4, B:54:0x00fe, B:18:0x006e, B:19:0x0074, B:20:0x007c, B:46:0x00c4, B:47:0x00c7, B:48:0x00e9, B:49:0x00ec, B:50:0x00ef, B:51:0x00f2, B:22:0x0080, B:25:0x008a, B:28:0x0094, B:31:0x009e, B:34:0x00a7, B:37:0x00af), top: B:59:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:37:0x00af A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x0002, B:6:0x000f, B:8:0x0015, B:10:0x0027, B:11:0x002d, B:14:0x0037, B:17:0x0050, B:52:0x00f4, B:54:0x00fe, B:18:0x006e, B:19:0x0074, B:20:0x007c, B:46:0x00c4, B:47:0x00c7, B:48:0x00e9, B:49:0x00ec, B:50:0x00ef, B:51:0x00f2, B:22:0x0080, B:25:0x008a, B:28:0x0094, B:31:0x009e, B:34:0x00a7, B:37:0x00af), top: B:59:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00be A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x00c4 A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x0002, B:6:0x000f, B:8:0x0015, B:10:0x0027, B:11:0x002d, B:14:0x0037, B:17:0x0050, B:52:0x00f4, B:54:0x00fe, B:18:0x006e, B:19:0x0074, B:20:0x007c, B:46:0x00c4, B:47:0x00c7, B:48:0x00e9, B:49:0x00ec, B:50:0x00ef, B:51:0x00f2, B:22:0x0080, B:25:0x008a, B:28:0x0094, B:31:0x009e, B:34:0x00a7, B:37:0x00af), top: B:59:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7 A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x0002, B:6:0x000f, B:8:0x0015, B:10:0x0027, B:11:0x002d, B:14:0x0037, B:17:0x0050, B:52:0x00f4, B:54:0x00fe, B:18:0x006e, B:19:0x0074, B:20:0x007c, B:46:0x00c4, B:47:0x00c7, B:48:0x00e9, B:49:0x00ec, B:50:0x00ef, B:51:0x00f2, B:22:0x0080, B:25:0x008a, B:28:0x0094, B:31:0x009e, B:34:0x00a7, B:37:0x00af), top: B:59:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00e9 A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x0002, B:6:0x000f, B:8:0x0015, B:10:0x0027, B:11:0x002d, B:14:0x0037, B:17:0x0050, B:52:0x00f4, B:54:0x00fe, B:18:0x006e, B:19:0x0074, B:20:0x007c, B:46:0x00c4, B:47:0x00c7, B:48:0x00e9, B:49:0x00ec, B:50:0x00ef, B:51:0x00f2, B:22:0x0080, B:25:0x008a, B:28:0x0094, B:31:0x009e, B:34:0x00a7, B:37:0x00af), top: B:59:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ec A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x0002, B:6:0x000f, B:8:0x0015, B:10:0x0027, B:11:0x002d, B:14:0x0037, B:17:0x0050, B:52:0x00f4, B:54:0x00fe, B:18:0x006e, B:19:0x0074, B:20:0x007c, B:46:0x00c4, B:47:0x00c7, B:48:0x00e9, B:49:0x00ec, B:50:0x00ef, B:51:0x00f2, B:22:0x0080, B:25:0x008a, B:28:0x0094, B:31:0x009e, B:34:0x00a7, B:37:0x00af), top: B:59:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00ef A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x0002, B:6:0x000f, B:8:0x0015, B:10:0x0027, B:11:0x002d, B:14:0x0037, B:17:0x0050, B:52:0x00f4, B:54:0x00fe, B:18:0x006e, B:19:0x0074, B:20:0x007c, B:46:0x00c4, B:47:0x00c7, B:48:0x00e9, B:49:0x00ec, B:50:0x00ef, B:51:0x00f2, B:22:0x0080, B:25:0x008a, B:28:0x0094, B:31:0x009e, B:34:0x00a7, B:37:0x00af), top: B:59:0x0002 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00f2 A[Catch: all -> 0x0101, TryCatch #0 {all -> 0x0101, blocks: (B:3:0x0002, B:6:0x000f, B:8:0x0015, B:10:0x0027, B:11:0x002d, B:14:0x0037, B:17:0x0050, B:52:0x00f4, B:54:0x00fe, B:18:0x006e, B:19:0x0074, B:20:0x007c, B:46:0x00c4, B:47:0x00c7, B:48:0x00e9, B:49:0x00ec, B:50:0x00ef, B:51:0x00f2, B:22:0x0080, B:25:0x008a, B:28:0x0094, B:31:0x009e, B:34:0x00a7, B:37:0x00af), top: B:59:0x0002 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static AdSize o(Context context, Map<String, Object> map, Map<String, Object> map2) {
        AdSize currentOrientationAnchoredAdaptiveBannerAdSize;
        try {
            byte b2 = 0;
            int intFromMap = TUInitMediation.getIntFromMap(map, "key_width", 0);
            if (!m && intFromMap > 0 && !map.containsKey(ADAPTIVE_TYPE)) {
                map.put(ADAPTIVE_TYPE, 0);
                map.put(ADAPTIVE_ORIENTATION, 0);
            }
            if (intFromMap <= 0) {
                intFromMap = TUInitMediation.getIntFromMap(map, ADAPTIVE_WIDTH, 0);
            }
            String stringFromMap = TUInitMediation.getStringFromMap(map2, "size");
            if (intFromMap > 0) {
                int i2 = (int) ((context.getResources().getDisplayMetrics().density * 300.0f) + 0.5f);
                if ("300x250".equals(stringFromMap)) {
                    switch (stringFromMap.hashCode()) {
                        case -1306012042:
                            if (stringFromMap.equals(sg.bigo.ads.api.AdSize.ADAPTIVE)) {
                                b2 = -1;
                            } else {
                                b2 = 4;
                            }
                            break;
                        case -559799608:
                            if (stringFromMap.equals("300x250")) {
                                b2 = -1;
                            } else {
                                b2 = 1;
                            }
                            break;
                        case -502542422:
                            if (stringFromMap.equals("320x100")) {
                                b2 = -1;
                            }
                            break;
                        case 1507809730:
                            if (stringFromMap.equals("320x50")) {
                                b2 = -1;
                            } else {
                                b2 = 5;
                            }
                            break;
                        case 1540371324:
                            if (stringFromMap.equals("468x60")) {
                                b2 = -1;
                            } else {
                                b2 = 2;
                            }
                            break;
                        case 1622564786:
                            if (stringFromMap.equals("728x90")) {
                                b2 = -1;
                            } else {
                                b2 = 3;
                            }
                            break;
                        default:
                            b2 = -1;
                            break;
                    }
                    if (b2 != 0) {
                        currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.LARGE_BANNER;
                    } else if (b2 != 1) {
                        currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.MEDIUM_RECTANGLE;
                    } else if (b2 != 2) {
                        currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.FULL_BANNER;
                    } else if (b2 != 3) {
                        currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.LEADERBOARD;
                    } else if (b2 != 4) {
                        currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.BANNER;
                    } else {
                        currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, o(context, Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels)));
                    }
                } else if (intFromMap < i2) {
                    Log.e("thinkup_network", TAG + ": The width is too small. It is recommended to be larger than 300dp to avoid affecting the ad fill rate.");
                    currentOrientationAnchoredAdaptiveBannerAdSize = o(context, map, i2);
                } else {
                    currentOrientationAnchoredAdaptiveBannerAdSize = o(context, map, intFromMap);
                }
            } else {
                switch (stringFromMap.hashCode()) {
                    case -1306012042:
                        if (stringFromMap.equals(sg.bigo.ads.api.AdSize.ADAPTIVE)) {
                            b2 = -1;
                        } else {
                            b2 = 4;
                        }
                        break;
                    case -559799608:
                        if (stringFromMap.equals("300x250")) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case -502542422:
                        if (stringFromMap.equals("320x100")) {
                            b2 = -1;
                        }
                        break;
                    case 1507809730:
                        if (stringFromMap.equals("320x50")) {
                            b2 = -1;
                        } else {
                            b2 = 5;
                        }
                        break;
                    case 1540371324:
                        if (stringFromMap.equals("468x60")) {
                            b2 = -1;
                        } else {
                            b2 = 2;
                        }
                        break;
                    case 1622564786:
                        if (stringFromMap.equals("728x90")) {
                            b2 = -1;
                        } else {
                            b2 = 3;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 != 0) {
                    currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.LARGE_BANNER;
                } else if (b2 != 1) {
                    currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.MEDIUM_RECTANGLE;
                } else if (b2 != 2) {
                    currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.FULL_BANNER;
                } else if (b2 != 3) {
                    currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.LEADERBOARD;
                } else if (b2 != 4) {
                    currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.BANNER;
                } else {
                    currentOrientationAnchoredAdaptiveBannerAdSize = AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, o(context, Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels)));
                }
            }
            currentOrientationAnchoredAdaptiveBannerAdSize.getWidth();
            currentOrientationAnchoredAdaptiveBannerAdSize.getHeight();
            return currentOrientationAnchoredAdaptiveBannerAdSize == AdSize.INVALID ? AdSize.BANNER : currentOrientationAnchoredAdaptiveBannerAdSize;
        } catch (Throwable th) {
            Log.e(TAG, "getAdaptiveBannerAdSize() >>> failed: " + th.getMessage());
            return AdSize.BANNER;
        }
    }

    public static void setDisableAutoUseAdaptiveBanner(boolean z2) {
        Log.e(TAG, "setDisableAutoUseAdaptiveBanner: ".concat(String.valueOf(z2)));
        m = z2;
    }

    private static AdSize o(Context context, Map<String, Object> map, int i2) {
        int intFromMap = TUInitMediation.getIntFromMap(map, ADAPTIVE_TYPE, 0);
        int intFromMap2 = TUInitMediation.getIntFromMap(map, ADAPTIVE_ORIENTATION, 0);
        int iO = o(context, i2);
        if (intFromMap2 == 1) {
            if (intFromMap == 1) {
                return AdSize.getPortraitInlineAdaptiveBannerAdSize(context, iO);
            }
            return AdSize.getPortraitAnchoredAdaptiveBannerAdSize(context, iO);
        }
        if (intFromMap2 != 2) {
            if (intFromMap == 1) {
                return AdSize.getCurrentOrientationInlineAdaptiveBannerAdSize(context, iO);
            }
            return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, iO);
        }
        if (intFromMap == 1) {
            return AdSize.getLandscapeInlineAdaptiveBannerAdSize(context, iO);
        }
        return AdSize.getLandscapeAnchoredAdaptiveBannerAdSize(context, iO);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    private static AdSize o(Context context, String str) {
        byte b2;
        switch (str) {
            case "adaptive":
                b2 = 4;
                break;
            case "300x250":
                b2 = 1;
                break;
            case "320x100":
                b2 = 0;
                break;
            case "320x50":
                b2 = 5;
                break;
            case "468x60":
                b2 = 2;
                break;
            case "728x90":
                b2 = 3;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return AdSize.LARGE_BANNER;
        }
        if (b2 == 1) {
            return AdSize.MEDIUM_RECTANGLE;
        }
        if (b2 == 2) {
            return AdSize.FULL_BANNER;
        }
        if (b2 == 3) {
            return AdSize.LEADERBOARD;
        }
        if (b2 != 4) {
            return AdSize.BANNER;
        }
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(context, o(context, Math.min(context.getResources().getDisplayMetrics().widthPixels, context.getResources().getDisplayMetrics().heightPixels)));
    }

    private static int o(Context context, float f) {
        float f2 = context.getResources().getDisplayMetrics().density;
        if (f2 <= 0.0f) {
            f2 = 1.0f;
        }
        return (int) ((f / f2) + 0.5f);
    }

    private static int o(Context context) {
        return (int) ((context.getResources().getDisplayMetrics().density * 300.0f) + 0.5f);
    }
}
