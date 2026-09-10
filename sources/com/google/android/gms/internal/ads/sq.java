package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class sq implements oq {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f20017d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzb f20018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kv f20019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b21 f20020c;

    static {
        String[] strArr = {"resize", "playVideo", "storePicture", "createCalendarEvent", "setOrientationProperties", "closeResizedAd", "unload"};
        Integer[] numArr = {1, 2, 3, 4, 5, 6, 7};
        x.e eVar = new x.e(7);
        for (int i10 = 0; i10 < 7; i10++) {
            eVar.put(strArr[i10], numArr[i10]);
        }
        f20017d = Collections.unmodifiableMap(eVar);
    }

    public sq(zzb zzbVar, kv kvVar, b21 b21Var) {
        this.f20018a = zzbVar;
        this.f20019b = kvVar;
        this.f20020c = b21Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:187:0x03ad A[Catch: all -> 0x01d3, PHI: r16
  0x03ad: PHI (r16v17 int) = (r16v8 int), (r16v9 int), (r16v10 int), (r16v11 int), (r16v13 int), (r16v18 int) binds: [B:185:0x0397, B:180:0x0382, B:176:0x0370, B:171:0x0359, B:166:0x0339, B:160:0x0312] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x01d3, blocks: (B:94:0x01c8, B:96:0x01cc, B:97:0x01d1, B:101:0x01d6, B:103:0x01de, B:104:0x01e3, B:106:0x01e5, B:108:0x01ef, B:109:0x01f4, B:111:0x01f6, B:113:0x01fc, B:114:0x0201, B:116:0x0203, B:118:0x0211, B:119:0x0222, B:121:0x0230, B:122:0x0241, B:124:0x024f, B:125:0x0260, B:127:0x026e, B:128:0x027f, B:130:0x028d, B:131:0x029b, B:133:0x02a9, B:134:0x02ab, B:136:0x02af, B:138:0x02b3, B:140:0x02b9, B:143:0x02c1, B:147:0x02e1, B:153:0x02f1, B:216:0x0430, B:217:0x0435, B:219:0x0437, B:221:0x0454, B:223:0x0460, B:225:0x0499, B:231:0x0509, B:254:0x0564, B:255:0x057c, B:256:0x0598, B:258:0x05a0, B:259:0x05ab, B:260:0x05d3, B:263:0x05d6, B:265:0x0604, B:266:0x0616, B:235:0x051a, B:239:0x052b, B:243:0x053a, B:247:0x0549, B:252:0x055a, B:253:0x055e, B:224:0x0496, B:268:0x0618, B:269:0x061d, B:155:0x02ff, B:157:0x0303, B:187:0x03ad, B:182:0x038b, B:189:0x03ba, B:191:0x03be, B:193:0x03c2, B:198:0x03d0, B:199:0x03df, B:206:0x0407, B:212:0x0417, B:209:0x040d, B:211:0x0415, B:202:0x03fe, B:204:0x0404, B:163:0x031e, B:167:0x033b, B:173:0x0365, B:172:0x035b, B:177:0x0372, B:181:0x0384, B:186:0x0399, B:213:0x041c, B:214:0x0425, B:271:0x061f, B:272:0x0624, B:274:0x0626, B:275:0x062b), top: B:300:0x01c8, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x0430 A[Catch: all -> 0x01d3, TryCatch #1 {all -> 0x01d3, blocks: (B:94:0x01c8, B:96:0x01cc, B:97:0x01d1, B:101:0x01d6, B:103:0x01de, B:104:0x01e3, B:106:0x01e5, B:108:0x01ef, B:109:0x01f4, B:111:0x01f6, B:113:0x01fc, B:114:0x0201, B:116:0x0203, B:118:0x0211, B:119:0x0222, B:121:0x0230, B:122:0x0241, B:124:0x024f, B:125:0x0260, B:127:0x026e, B:128:0x027f, B:130:0x028d, B:131:0x029b, B:133:0x02a9, B:134:0x02ab, B:136:0x02af, B:138:0x02b3, B:140:0x02b9, B:143:0x02c1, B:147:0x02e1, B:153:0x02f1, B:216:0x0430, B:217:0x0435, B:219:0x0437, B:221:0x0454, B:223:0x0460, B:225:0x0499, B:231:0x0509, B:254:0x0564, B:255:0x057c, B:256:0x0598, B:258:0x05a0, B:259:0x05ab, B:260:0x05d3, B:263:0x05d6, B:265:0x0604, B:266:0x0616, B:235:0x051a, B:239:0x052b, B:243:0x053a, B:247:0x0549, B:252:0x055a, B:253:0x055e, B:224:0x0496, B:268:0x0618, B:269:0x061d, B:155:0x02ff, B:157:0x0303, B:187:0x03ad, B:182:0x038b, B:189:0x03ba, B:191:0x03be, B:193:0x03c2, B:198:0x03d0, B:199:0x03df, B:206:0x0407, B:212:0x0417, B:209:0x040d, B:211:0x0415, B:202:0x03fe, B:204:0x0404, B:163:0x031e, B:167:0x033b, B:173:0x0365, B:172:0x035b, B:177:0x0372, B:181:0x0384, B:186:0x0399, B:213:0x041c, B:214:0x0425, B:271:0x061f, B:272:0x0624, B:274:0x0626, B:275:0x062b), top: B:300:0x01c8, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:219:0x0437 A[Catch: all -> 0x01d3, TryCatch #1 {all -> 0x01d3, blocks: (B:94:0x01c8, B:96:0x01cc, B:97:0x01d1, B:101:0x01d6, B:103:0x01de, B:104:0x01e3, B:106:0x01e5, B:108:0x01ef, B:109:0x01f4, B:111:0x01f6, B:113:0x01fc, B:114:0x0201, B:116:0x0203, B:118:0x0211, B:119:0x0222, B:121:0x0230, B:122:0x0241, B:124:0x024f, B:125:0x0260, B:127:0x026e, B:128:0x027f, B:130:0x028d, B:131:0x029b, B:133:0x02a9, B:134:0x02ab, B:136:0x02af, B:138:0x02b3, B:140:0x02b9, B:143:0x02c1, B:147:0x02e1, B:153:0x02f1, B:216:0x0430, B:217:0x0435, B:219:0x0437, B:221:0x0454, B:223:0x0460, B:225:0x0499, B:231:0x0509, B:254:0x0564, B:255:0x057c, B:256:0x0598, B:258:0x05a0, B:259:0x05ab, B:260:0x05d3, B:263:0x05d6, B:265:0x0604, B:266:0x0616, B:235:0x051a, B:239:0x052b, B:243:0x053a, B:247:0x0549, B:252:0x055a, B:253:0x055e, B:224:0x0496, B:268:0x0618, B:269:0x061d, B:155:0x02ff, B:157:0x0303, B:187:0x03ad, B:182:0x038b, B:189:0x03ba, B:191:0x03be, B:193:0x03c2, B:198:0x03d0, B:199:0x03df, B:206:0x0407, B:212:0x0417, B:209:0x040d, B:211:0x0415, B:202:0x03fe, B:204:0x0404, B:163:0x031e, B:167:0x033b, B:173:0x0365, B:172:0x035b, B:177:0x0372, B:181:0x0384, B:186:0x0399, B:213:0x041c, B:214:0x0425, B:271:0x061f, B:272:0x0624, B:274:0x0626, B:275:0x062b), top: B:300:0x01c8, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:221:0x0454 A[Catch: all -> 0x01d3, TryCatch #1 {all -> 0x01d3, blocks: (B:94:0x01c8, B:96:0x01cc, B:97:0x01d1, B:101:0x01d6, B:103:0x01de, B:104:0x01e3, B:106:0x01e5, B:108:0x01ef, B:109:0x01f4, B:111:0x01f6, B:113:0x01fc, B:114:0x0201, B:116:0x0203, B:118:0x0211, B:119:0x0222, B:121:0x0230, B:122:0x0241, B:124:0x024f, B:125:0x0260, B:127:0x026e, B:128:0x027f, B:130:0x028d, B:131:0x029b, B:133:0x02a9, B:134:0x02ab, B:136:0x02af, B:138:0x02b3, B:140:0x02b9, B:143:0x02c1, B:147:0x02e1, B:153:0x02f1, B:216:0x0430, B:217:0x0435, B:219:0x0437, B:221:0x0454, B:223:0x0460, B:225:0x0499, B:231:0x0509, B:254:0x0564, B:255:0x057c, B:256:0x0598, B:258:0x05a0, B:259:0x05ab, B:260:0x05d3, B:263:0x05d6, B:265:0x0604, B:266:0x0616, B:235:0x051a, B:239:0x052b, B:243:0x053a, B:247:0x0549, B:252:0x055a, B:253:0x055e, B:224:0x0496, B:268:0x0618, B:269:0x061d, B:155:0x02ff, B:157:0x0303, B:187:0x03ad, B:182:0x038b, B:189:0x03ba, B:191:0x03be, B:193:0x03c2, B:198:0x03d0, B:199:0x03df, B:206:0x0407, B:212:0x0417, B:209:0x040d, B:211:0x0415, B:202:0x03fe, B:204:0x0404, B:163:0x031e, B:167:0x033b, B:173:0x0365, B:172:0x035b, B:177:0x0372, B:181:0x0384, B:186:0x0399, B:213:0x041c, B:214:0x0425, B:271:0x061f, B:272:0x0624, B:274:0x0626, B:275:0x062b), top: B:300:0x01c8, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:223:0x0460 A[Catch: all -> 0x01d3, TryCatch #1 {all -> 0x01d3, blocks: (B:94:0x01c8, B:96:0x01cc, B:97:0x01d1, B:101:0x01d6, B:103:0x01de, B:104:0x01e3, B:106:0x01e5, B:108:0x01ef, B:109:0x01f4, B:111:0x01f6, B:113:0x01fc, B:114:0x0201, B:116:0x0203, B:118:0x0211, B:119:0x0222, B:121:0x0230, B:122:0x0241, B:124:0x024f, B:125:0x0260, B:127:0x026e, B:128:0x027f, B:130:0x028d, B:131:0x029b, B:133:0x02a9, B:134:0x02ab, B:136:0x02af, B:138:0x02b3, B:140:0x02b9, B:143:0x02c1, B:147:0x02e1, B:153:0x02f1, B:216:0x0430, B:217:0x0435, B:219:0x0437, B:221:0x0454, B:223:0x0460, B:225:0x0499, B:231:0x0509, B:254:0x0564, B:255:0x057c, B:256:0x0598, B:258:0x05a0, B:259:0x05ab, B:260:0x05d3, B:263:0x05d6, B:265:0x0604, B:266:0x0616, B:235:0x051a, B:239:0x052b, B:243:0x053a, B:247:0x0549, B:252:0x055a, B:253:0x055e, B:224:0x0496, B:268:0x0618, B:269:0x061d, B:155:0x02ff, B:157:0x0303, B:187:0x03ad, B:182:0x038b, B:189:0x03ba, B:191:0x03be, B:193:0x03c2, B:198:0x03d0, B:199:0x03df, B:206:0x0407, B:212:0x0417, B:209:0x040d, B:211:0x0415, B:202:0x03fe, B:204:0x0404, B:163:0x031e, B:167:0x033b, B:173:0x0365, B:172:0x035b, B:177:0x0372, B:181:0x0384, B:186:0x0399, B:213:0x041c, B:214:0x0425, B:271:0x061f, B:272:0x0624, B:274:0x0626, B:275:0x062b), top: B:300:0x01c8, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:224:0x0496 A[Catch: all -> 0x01d3, TryCatch #1 {all -> 0x01d3, blocks: (B:94:0x01c8, B:96:0x01cc, B:97:0x01d1, B:101:0x01d6, B:103:0x01de, B:104:0x01e3, B:106:0x01e5, B:108:0x01ef, B:109:0x01f4, B:111:0x01f6, B:113:0x01fc, B:114:0x0201, B:116:0x0203, B:118:0x0211, B:119:0x0222, B:121:0x0230, B:122:0x0241, B:124:0x024f, B:125:0x0260, B:127:0x026e, B:128:0x027f, B:130:0x028d, B:131:0x029b, B:133:0x02a9, B:134:0x02ab, B:136:0x02af, B:138:0x02b3, B:140:0x02b9, B:143:0x02c1, B:147:0x02e1, B:153:0x02f1, B:216:0x0430, B:217:0x0435, B:219:0x0437, B:221:0x0454, B:223:0x0460, B:225:0x0499, B:231:0x0509, B:254:0x0564, B:255:0x057c, B:256:0x0598, B:258:0x05a0, B:259:0x05ab, B:260:0x05d3, B:263:0x05d6, B:265:0x0604, B:266:0x0616, B:235:0x051a, B:239:0x052b, B:243:0x053a, B:247:0x0549, B:252:0x055a, B:253:0x055e, B:224:0x0496, B:268:0x0618, B:269:0x061d, B:155:0x02ff, B:157:0x0303, B:187:0x03ad, B:182:0x038b, B:189:0x03ba, B:191:0x03be, B:193:0x03c2, B:198:0x03d0, B:199:0x03df, B:206:0x0407, B:212:0x0417, B:209:0x040d, B:211:0x0415, B:202:0x03fe, B:204:0x0404, B:163:0x031e, B:167:0x033b, B:173:0x0365, B:172:0x035b, B:177:0x0372, B:181:0x0384, B:186:0x0399, B:213:0x041c, B:214:0x0425, B:271:0x061f, B:272:0x0624, B:274:0x0626, B:275:0x062b), top: B:300:0x01c8, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x0501  */
    /* JADX WARN: Code duplicated, block: B:231:0x0509 A[Catch: all -> 0x01d3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01d3, blocks: (B:94:0x01c8, B:96:0x01cc, B:97:0x01d1, B:101:0x01d6, B:103:0x01de, B:104:0x01e3, B:106:0x01e5, B:108:0x01ef, B:109:0x01f4, B:111:0x01f6, B:113:0x01fc, B:114:0x0201, B:116:0x0203, B:118:0x0211, B:119:0x0222, B:121:0x0230, B:122:0x0241, B:124:0x024f, B:125:0x0260, B:127:0x026e, B:128:0x027f, B:130:0x028d, B:131:0x029b, B:133:0x02a9, B:134:0x02ab, B:136:0x02af, B:138:0x02b3, B:140:0x02b9, B:143:0x02c1, B:147:0x02e1, B:153:0x02f1, B:216:0x0430, B:217:0x0435, B:219:0x0437, B:221:0x0454, B:223:0x0460, B:225:0x0499, B:231:0x0509, B:254:0x0564, B:255:0x057c, B:256:0x0598, B:258:0x05a0, B:259:0x05ab, B:260:0x05d3, B:263:0x05d6, B:265:0x0604, B:266:0x0616, B:235:0x051a, B:239:0x052b, B:243:0x053a, B:247:0x0549, B:252:0x055a, B:253:0x055e, B:224:0x0496, B:268:0x0618, B:269:0x061d, B:155:0x02ff, B:157:0x0303, B:187:0x03ad, B:182:0x038b, B:189:0x03ba, B:191:0x03be, B:193:0x03c2, B:198:0x03d0, B:199:0x03df, B:206:0x0407, B:212:0x0417, B:209:0x040d, B:211:0x0415, B:202:0x03fe, B:204:0x0404, B:163:0x031e, B:167:0x033b, B:173:0x0365, B:172:0x035b, B:177:0x0372, B:181:0x0384, B:186:0x0399, B:213:0x041c, B:214:0x0425, B:271:0x061f, B:272:0x0624, B:274:0x0626, B:275:0x062b), top: B:300:0x01c8, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:233:0x0512  */
    /* JADX WARN: Code duplicated, block: B:235:0x051a A[Catch: all -> 0x01d3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01d3, blocks: (B:94:0x01c8, B:96:0x01cc, B:97:0x01d1, B:101:0x01d6, B:103:0x01de, B:104:0x01e3, B:106:0x01e5, B:108:0x01ef, B:109:0x01f4, B:111:0x01f6, B:113:0x01fc, B:114:0x0201, B:116:0x0203, B:118:0x0211, B:119:0x0222, B:121:0x0230, B:122:0x0241, B:124:0x024f, B:125:0x0260, B:127:0x026e, B:128:0x027f, B:130:0x028d, B:131:0x029b, B:133:0x02a9, B:134:0x02ab, B:136:0x02af, B:138:0x02b3, B:140:0x02b9, B:143:0x02c1, B:147:0x02e1, B:153:0x02f1, B:216:0x0430, B:217:0x0435, B:219:0x0437, B:221:0x0454, B:223:0x0460, B:225:0x0499, B:231:0x0509, B:254:0x0564, B:255:0x057c, B:256:0x0598, B:258:0x05a0, B:259:0x05ab, B:260:0x05d3, B:263:0x05d6, B:265:0x0604, B:266:0x0616, B:235:0x051a, B:239:0x052b, B:243:0x053a, B:247:0x0549, B:252:0x055a, B:253:0x055e, B:224:0x0496, B:268:0x0618, B:269:0x061d, B:155:0x02ff, B:157:0x0303, B:187:0x03ad, B:182:0x038b, B:189:0x03ba, B:191:0x03be, B:193:0x03c2, B:198:0x03d0, B:199:0x03df, B:206:0x0407, B:212:0x0417, B:209:0x040d, B:211:0x0415, B:202:0x03fe, B:204:0x0404, B:163:0x031e, B:167:0x033b, B:173:0x0365, B:172:0x035b, B:177:0x0372, B:181:0x0384, B:186:0x0399, B:213:0x041c, B:214:0x0425, B:271:0x061f, B:272:0x0624, B:274:0x0626, B:275:0x062b), top: B:300:0x01c8, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:237:0x0523  */
    /* JADX WARN: Code duplicated, block: B:239:0x052b A[Catch: all -> 0x01d3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01d3, blocks: (B:94:0x01c8, B:96:0x01cc, B:97:0x01d1, B:101:0x01d6, B:103:0x01de, B:104:0x01e3, B:106:0x01e5, B:108:0x01ef, B:109:0x01f4, B:111:0x01f6, B:113:0x01fc, B:114:0x0201, B:116:0x0203, B:118:0x0211, B:119:0x0222, B:121:0x0230, B:122:0x0241, B:124:0x024f, B:125:0x0260, B:127:0x026e, B:128:0x027f, B:130:0x028d, B:131:0x029b, B:133:0x02a9, B:134:0x02ab, B:136:0x02af, B:138:0x02b3, B:140:0x02b9, B:143:0x02c1, B:147:0x02e1, B:153:0x02f1, B:216:0x0430, B:217:0x0435, B:219:0x0437, B:221:0x0454, B:223:0x0460, B:225:0x0499, B:231:0x0509, B:254:0x0564, B:255:0x057c, B:256:0x0598, B:258:0x05a0, B:259:0x05ab, B:260:0x05d3, B:263:0x05d6, B:265:0x0604, B:266:0x0616, B:235:0x051a, B:239:0x052b, B:243:0x053a, B:247:0x0549, B:252:0x055a, B:253:0x055e, B:224:0x0496, B:268:0x0618, B:269:0x061d, B:155:0x02ff, B:157:0x0303, B:187:0x03ad, B:182:0x038b, B:189:0x03ba, B:191:0x03be, B:193:0x03c2, B:198:0x03d0, B:199:0x03df, B:206:0x0407, B:212:0x0417, B:209:0x040d, B:211:0x0415, B:202:0x03fe, B:204:0x0404, B:163:0x031e, B:167:0x033b, B:173:0x0365, B:172:0x035b, B:177:0x0372, B:181:0x0384, B:186:0x0399, B:213:0x041c, B:214:0x0425, B:271:0x061f, B:272:0x0624, B:274:0x0626, B:275:0x062b), top: B:300:0x01c8, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:241:0x0532  */
    /* JADX WARN: Code duplicated, block: B:243:0x053a A[Catch: all -> 0x01d3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01d3, blocks: (B:94:0x01c8, B:96:0x01cc, B:97:0x01d1, B:101:0x01d6, B:103:0x01de, B:104:0x01e3, B:106:0x01e5, B:108:0x01ef, B:109:0x01f4, B:111:0x01f6, B:113:0x01fc, B:114:0x0201, B:116:0x0203, B:118:0x0211, B:119:0x0222, B:121:0x0230, B:122:0x0241, B:124:0x024f, B:125:0x0260, B:127:0x026e, B:128:0x027f, B:130:0x028d, B:131:0x029b, B:133:0x02a9, B:134:0x02ab, B:136:0x02af, B:138:0x02b3, B:140:0x02b9, B:143:0x02c1, B:147:0x02e1, B:153:0x02f1, B:216:0x0430, B:217:0x0435, B:219:0x0437, B:221:0x0454, B:223:0x0460, B:225:0x0499, B:231:0x0509, B:254:0x0564, B:255:0x057c, B:256:0x0598, B:258:0x05a0, B:259:0x05ab, B:260:0x05d3, B:263:0x05d6, B:265:0x0604, B:266:0x0616, B:235:0x051a, B:239:0x052b, B:243:0x053a, B:247:0x0549, B:252:0x055a, B:253:0x055e, B:224:0x0496, B:268:0x0618, B:269:0x061d, B:155:0x02ff, B:157:0x0303, B:187:0x03ad, B:182:0x038b, B:189:0x03ba, B:191:0x03be, B:193:0x03c2, B:198:0x03d0, B:199:0x03df, B:206:0x0407, B:212:0x0417, B:209:0x040d, B:211:0x0415, B:202:0x03fe, B:204:0x0404, B:163:0x031e, B:167:0x033b, B:173:0x0365, B:172:0x035b, B:177:0x0372, B:181:0x0384, B:186:0x0399, B:213:0x041c, B:214:0x0425, B:271:0x061f, B:272:0x0624, B:274:0x0626, B:275:0x062b), top: B:300:0x01c8, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:245:0x0541  */
    /* JADX WARN: Code duplicated, block: B:247:0x0549 A[Catch: all -> 0x01d3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x01d3, blocks: (B:94:0x01c8, B:96:0x01cc, B:97:0x01d1, B:101:0x01d6, B:103:0x01de, B:104:0x01e3, B:106:0x01e5, B:108:0x01ef, B:109:0x01f4, B:111:0x01f6, B:113:0x01fc, B:114:0x0201, B:116:0x0203, B:118:0x0211, B:119:0x0222, B:121:0x0230, B:122:0x0241, B:124:0x024f, B:125:0x0260, B:127:0x026e, B:128:0x027f, B:130:0x028d, B:131:0x029b, B:133:0x02a9, B:134:0x02ab, B:136:0x02af, B:138:0x02b3, B:140:0x02b9, B:143:0x02c1, B:147:0x02e1, B:153:0x02f1, B:216:0x0430, B:217:0x0435, B:219:0x0437, B:221:0x0454, B:223:0x0460, B:225:0x0499, B:231:0x0509, B:254:0x0564, B:255:0x057c, B:256:0x0598, B:258:0x05a0, B:259:0x05ab, B:260:0x05d3, B:263:0x05d6, B:265:0x0604, B:266:0x0616, B:235:0x051a, B:239:0x052b, B:243:0x053a, B:247:0x0549, B:252:0x055a, B:253:0x055e, B:224:0x0496, B:268:0x0618, B:269:0x061d, B:155:0x02ff, B:157:0x0303, B:187:0x03ad, B:182:0x038b, B:189:0x03ba, B:191:0x03be, B:193:0x03c2, B:198:0x03d0, B:199:0x03df, B:206:0x0407, B:212:0x0417, B:209:0x040d, B:211:0x0415, B:202:0x03fe, B:204:0x0404, B:163:0x031e, B:167:0x033b, B:173:0x0365, B:172:0x035b, B:177:0x0372, B:181:0x0384, B:186:0x0399, B:213:0x041c, B:214:0x0425, B:271:0x061f, B:272:0x0624, B:274:0x0626, B:275:0x062b), top: B:300:0x01c8, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:249:0x0550  */
    /* JADX WARN: Code duplicated, block: B:251:0x0558  */
    /* JADX WARN: Code duplicated, block: B:253:0x055e A[Catch: all -> 0x01d3, TryCatch #1 {all -> 0x01d3, blocks: (B:94:0x01c8, B:96:0x01cc, B:97:0x01d1, B:101:0x01d6, B:103:0x01de, B:104:0x01e3, B:106:0x01e5, B:108:0x01ef, B:109:0x01f4, B:111:0x01f6, B:113:0x01fc, B:114:0x0201, B:116:0x0203, B:118:0x0211, B:119:0x0222, B:121:0x0230, B:122:0x0241, B:124:0x024f, B:125:0x0260, B:127:0x026e, B:128:0x027f, B:130:0x028d, B:131:0x029b, B:133:0x02a9, B:134:0x02ab, B:136:0x02af, B:138:0x02b3, B:140:0x02b9, B:143:0x02c1, B:147:0x02e1, B:153:0x02f1, B:216:0x0430, B:217:0x0435, B:219:0x0437, B:221:0x0454, B:223:0x0460, B:225:0x0499, B:231:0x0509, B:254:0x0564, B:255:0x057c, B:256:0x0598, B:258:0x05a0, B:259:0x05ab, B:260:0x05d3, B:263:0x05d6, B:265:0x0604, B:266:0x0616, B:235:0x051a, B:239:0x052b, B:243:0x053a, B:247:0x0549, B:252:0x055a, B:253:0x055e, B:224:0x0496, B:268:0x0618, B:269:0x061d, B:155:0x02ff, B:157:0x0303, B:187:0x03ad, B:182:0x038b, B:189:0x03ba, B:191:0x03be, B:193:0x03c2, B:198:0x03d0, B:199:0x03df, B:206:0x0407, B:212:0x0417, B:209:0x040d, B:211:0x0415, B:202:0x03fe, B:204:0x0404, B:163:0x031e, B:167:0x033b, B:173:0x0365, B:172:0x035b, B:177:0x0372, B:181:0x0384, B:186:0x0399, B:213:0x041c, B:214:0x0425, B:271:0x061f, B:272:0x0624, B:274:0x0626, B:275:0x062b), top: B:300:0x01c8, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:258:0x05a0 A[Catch: all -> 0x01d3, TryCatch #1 {all -> 0x01d3, blocks: (B:94:0x01c8, B:96:0x01cc, B:97:0x01d1, B:101:0x01d6, B:103:0x01de, B:104:0x01e3, B:106:0x01e5, B:108:0x01ef, B:109:0x01f4, B:111:0x01f6, B:113:0x01fc, B:114:0x0201, B:116:0x0203, B:118:0x0211, B:119:0x0222, B:121:0x0230, B:122:0x0241, B:124:0x024f, B:125:0x0260, B:127:0x026e, B:128:0x027f, B:130:0x028d, B:131:0x029b, B:133:0x02a9, B:134:0x02ab, B:136:0x02af, B:138:0x02b3, B:140:0x02b9, B:143:0x02c1, B:147:0x02e1, B:153:0x02f1, B:216:0x0430, B:217:0x0435, B:219:0x0437, B:221:0x0454, B:223:0x0460, B:225:0x0499, B:231:0x0509, B:254:0x0564, B:255:0x057c, B:256:0x0598, B:258:0x05a0, B:259:0x05ab, B:260:0x05d3, B:263:0x05d6, B:265:0x0604, B:266:0x0616, B:235:0x051a, B:239:0x052b, B:243:0x053a, B:247:0x0549, B:252:0x055a, B:253:0x055e, B:224:0x0496, B:268:0x0618, B:269:0x061d, B:155:0x02ff, B:157:0x0303, B:187:0x03ad, B:182:0x038b, B:189:0x03ba, B:191:0x03be, B:193:0x03c2, B:198:0x03d0, B:199:0x03df, B:206:0x0407, B:212:0x0417, B:209:0x040d, B:211:0x0415, B:202:0x03fe, B:204:0x0404, B:163:0x031e, B:167:0x033b, B:173:0x0365, B:172:0x035b, B:177:0x0372, B:181:0x0384, B:186:0x0399, B:213:0x041c, B:214:0x0425, B:271:0x061f, B:272:0x0624, B:274:0x0626, B:275:0x062b), top: B:300:0x01c8, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:268:0x0618 A[Catch: all -> 0x01d3, TryCatch #1 {all -> 0x01d3, blocks: (B:94:0x01c8, B:96:0x01cc, B:97:0x01d1, B:101:0x01d6, B:103:0x01de, B:104:0x01e3, B:106:0x01e5, B:108:0x01ef, B:109:0x01f4, B:111:0x01f6, B:113:0x01fc, B:114:0x0201, B:116:0x0203, B:118:0x0211, B:119:0x0222, B:121:0x0230, B:122:0x0241, B:124:0x024f, B:125:0x0260, B:127:0x026e, B:128:0x027f, B:130:0x028d, B:131:0x029b, B:133:0x02a9, B:134:0x02ab, B:136:0x02af, B:138:0x02b3, B:140:0x02b9, B:143:0x02c1, B:147:0x02e1, B:153:0x02f1, B:216:0x0430, B:217:0x0435, B:219:0x0437, B:221:0x0454, B:223:0x0460, B:225:0x0499, B:231:0x0509, B:254:0x0564, B:255:0x057c, B:256:0x0598, B:258:0x05a0, B:259:0x05ab, B:260:0x05d3, B:263:0x05d6, B:265:0x0604, B:266:0x0616, B:235:0x051a, B:239:0x052b, B:243:0x053a, B:247:0x0549, B:252:0x055a, B:253:0x055e, B:224:0x0496, B:268:0x0618, B:269:0x061d, B:155:0x02ff, B:157:0x0303, B:187:0x03ad, B:182:0x038b, B:189:0x03ba, B:191:0x03be, B:193:0x03c2, B:198:0x03d0, B:199:0x03df, B:206:0x0407, B:212:0x0417, B:209:0x040d, B:211:0x0415, B:202:0x03fe, B:204:0x0404, B:163:0x031e, B:167:0x033b, B:173:0x0365, B:172:0x035b, B:177:0x0372, B:181:0x0384, B:186:0x0399, B:213:0x041c, B:214:0x0425, B:271:0x061f, B:272:0x0624, B:274:0x0626, B:275:0x062b), top: B:300:0x01c8, inners: #0 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.oq
    public final void b(Object obj, Map map) {
        int i10;
        int i11;
        int i12;
        int[] iArr;
        int iZzE;
        int iZzE2;
        ViewParent parent;
        ViewGroup viewGroup;
        PopupWindow popupWindow;
        RelativeLayout.LayoutParams layoutParams;
        String str;
        b21 b21Var;
        int i13;
        int iR;
        int iR2;
        int i14;
        int iR3;
        int i15;
        b30 b30Var = (b30) obj;
        int iIntValue = ((Integer) f20017d.get((String) map.get("a"))).intValue();
        boolean z10 = true;
        if (iIntValue != 5) {
            if (iIntValue != 7) {
                zzb zzbVar = this.f20018a;
                if (!zzbVar.zzb()) {
                    zzbVar.zzc(null);
                    return;
                }
                int i16 = 0;
                if (iIntValue == 1) {
                    kv kvVar = this.f20019b;
                    synchronized (kvVar.l) {
                        try {
                            Activity activity = kvVar.f16535n;
                            if (activity == null) {
                                kvVar.i("Not an activity context. Cannot resize.");
                                return;
                            }
                            b30 b30Var2 = kvVar.f16534m;
                            if (b30Var2.zzN() == null) {
                                kvVar.i("Webview is not yet available, size is not set.");
                                return;
                            }
                            if (b30Var2.zzN().b()) {
                                kvVar.i("Is interstitial. Cannot resize an interstitial.");
                                return;
                            }
                            if (b30Var2.i()) {
                                kvVar.i("Cannot resize an expanded banner.");
                                return;
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                                zzt.zzc();
                                kvVar.f16533k = zzs.zzS((String) map.get("width"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                                zzt.zzc();
                                kvVar.f16530h = zzs.zzS((String) map.get("height"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                                zzt.zzc();
                                kvVar.f16531i = zzs.zzS((String) map.get("offsetX"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                                zzt.zzc();
                                kvVar.f16532j = zzs.zzS((String) map.get("offsetY"));
                            }
                            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                                kvVar.f16527e = Boolean.parseBoolean((String) map.get("allowOffscreen"));
                            }
                            String str2 = (String) map.get("customClosePosition");
                            if (!TextUtils.isEmpty(str2)) {
                                kvVar.f16526d = str2;
                            }
                            if (kvVar.f16533k < 0 || kvVar.f16530h < 0) {
                                kvVar.i("Invalid width and height options. Cannot resize.");
                                return;
                            }
                            Window window = activity.getWindow();
                            if (window != null && window.getDecorView() != null) {
                                zzt.zzc();
                                int[] iArrZzaa = zzs.zzaa(activity);
                                zzt.zzc();
                                int[] iArrZzW = zzs.zzW(activity);
                                int i17 = iArrZzaa[0];
                                int i18 = iArrZzaa[1];
                                int i19 = kvVar.f16533k;
                                if (i19 < 50 || i19 > i17) {
                                    i11 = 0;
                                    i12 = 50;
                                    int i20 = zze.zza;
                                    zzo.zzi("Width is too small or too large.");
                                } else {
                                    int i21 = kvVar.f16530h;
                                    if (i21 < 50 || i21 > i18) {
                                        i11 = 0;
                                        i12 = 50;
                                        int i22 = zze.zza;
                                        zzo.zzi("Height is too small or too large.");
                                    } else {
                                        if (i21 != i18 || i19 != i17) {
                                            boolean z11 = kvVar.f16527e;
                                            if (z11) {
                                                String str3 = kvVar.f16526d;
                                                i12 = 50;
                                                switch (str3.hashCode()) {
                                                    case -1364013995:
                                                        i11 = 0;
                                                        if (!str3.equals(TtmlNode.CENTER)) {
                                                            iR = l1.d.r(kvVar.f16528f, kvVar.f16531i, i19, -50);
                                                            i14 = kvVar.f16529g;
                                                            iR2 = i14 + kvVar.f16532j;
                                                        } else {
                                                            iR = l1.d.r(kvVar.f16528f, kvVar.f16531i, i19 >> 1, -25);
                                                            iR2 = ((kvVar.f16529g + kvVar.f16532j) + (i21 >> 1)) - 25;
                                                        }
                                                        break;
                                                    case -1012429441:
                                                        i11 = 0;
                                                        if (str3.equals(X3.e.f27730c)) {
                                                            iR = kvVar.f16528f + kvVar.f16531i;
                                                            i14 = kvVar.f16529g;
                                                        } else {
                                                            iR = l1.d.r(kvVar.f16528f, kvVar.f16531i, i19, -50);
                                                            i14 = kvVar.f16529g;
                                                        }
                                                        iR2 = i14 + kvVar.f16532j;
                                                        break;
                                                    case -655373719:
                                                        i11 = 0;
                                                        if (str3.equals(X3.e.f27732e)) {
                                                            iR3 = kvVar.f16528f + kvVar.f16531i;
                                                            i15 = kvVar.f16529g;
                                                            int i23 = iR3;
                                                            iR2 = l1.d.r(i15, kvVar.f16532j, i21, -50);
                                                            iR = i23;
                                                        }
                                                        iR = l1.d.r(kvVar.f16528f, kvVar.f16531i, i19, -50);
                                                        i14 = kvVar.f16529g;
                                                        iR2 = i14 + kvVar.f16532j;
                                                        break;
                                                    case 1163912186:
                                                        i11 = 0;
                                                        if (str3.equals(X3.e.f27731d)) {
                                                            iR3 = l1.d.r(kvVar.f16528f, kvVar.f16531i, i19, -50);
                                                            i15 = kvVar.f16529g;
                                                            int i24 = iR3;
                                                            iR2 = l1.d.r(i15, kvVar.f16532j, i21, -50);
                                                            iR = i24;
                                                        }
                                                        iR = l1.d.r(kvVar.f16528f, kvVar.f16531i, i19, -50);
                                                        i14 = kvVar.f16529g;
                                                        iR2 = i14 + kvVar.f16532j;
                                                        break;
                                                    case 1288627767:
                                                        i11 = 0;
                                                        if (str3.equals("bottom-center")) {
                                                            iR3 = l1.d.r(kvVar.f16528f, kvVar.f16531i, i19 >> 1, -25);
                                                            i15 = kvVar.f16529g;
                                                            int i25 = iR3;
                                                            iR2 = l1.d.r(i15, kvVar.f16532j, i21, -50);
                                                            iR = i25;
                                                        }
                                                        iR = l1.d.r(kvVar.f16528f, kvVar.f16531i, i19, -50);
                                                        i14 = kvVar.f16529g;
                                                        iR2 = i14 + kvVar.f16532j;
                                                        break;
                                                    case 1755462605:
                                                        if (str3.equals("top-center")) {
                                                            iR = l1.d.r(kvVar.f16528f, kvVar.f16531i, i19 >> 1, -25);
                                                            iR2 = kvVar.f16529g + kvVar.f16532j;
                                                            i11 = 0;
                                                            break;
                                                        }
                                                    default:
                                                        i11 = 0;
                                                        iR = l1.d.r(kvVar.f16528f, kvVar.f16531i, i19, -50);
                                                        i14 = kvVar.f16529g;
                                                        iR2 = i14 + kvVar.f16532j;
                                                        break;
                                                }
                                                if (iR < 0 || iR + 50 > i17 || iR2 < iArrZzW[i11] || iR2 + 50 > iArrZzW[1]) {
                                                }
                                                if (iArr == null) {
                                                    kvVar.i("Resize location out of screen or close button is not visible.");
                                                    return;
                                                }
                                                zzay.zza();
                                                iZzE = zzf.zzE(activity, kvVar.f16533k);
                                                zzay.zza();
                                                iZzE2 = zzf.zzE(activity, kvVar.f16530h);
                                                parent = ((View) b30Var2).getParent();
                                                if (!(parent instanceof ViewGroup)) {
                                                    kvVar.i("Webview is detached, probably in the middle of a resize or expand.");
                                                    return;
                                                }
                                                viewGroup = (ViewGroup) parent;
                                                viewGroup.removeView((View) b30Var2);
                                                popupWindow = kvVar.f16540s;
                                                if (popupWindow == null) {
                                                    kvVar.f16542u = viewGroup;
                                                    zzt.zzc();
                                                    ((View) b30Var2).setDrawingCacheEnabled(true);
                                                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) b30Var2).getDrawingCache());
                                                    ((View) b30Var2).setDrawingCacheEnabled(i11);
                                                    ImageView imageView = new ImageView(activity);
                                                    kvVar.f16537p = imageView;
                                                    imageView.setImageBitmap(bitmapCreateBitmap);
                                                    kvVar.f16536o = b30Var2.zzN();
                                                    kvVar.f16542u.addView(kvVar.f16537p);
                                                } else {
                                                    popupWindow.dismiss();
                                                }
                                                RelativeLayout relativeLayout = new RelativeLayout(activity);
                                                kvVar.f16541t = relativeLayout;
                                                relativeLayout.setBackgroundColor(0);
                                                kvVar.f16541t.setLayoutParams(new ViewGroup.LayoutParams(iZzE, iZzE2));
                                                zzt.zzc();
                                                PopupWindow popupWindow2 = new PopupWindow((View) kvVar.f16541t, iZzE, iZzE2, false);
                                                kvVar.f16540s = popupWindow2;
                                                popupWindow2.setOutsideTouchable(false);
                                                kvVar.f16540s.setTouchable(true);
                                                kvVar.f16540s.setClippingEnabled(!kvVar.f16527e);
                                                kvVar.f16541t.addView((View) b30Var2, -1, -1);
                                                kvVar.f16538q = new LinearLayout(activity);
                                                zzay.zza();
                                                int i26 = i12;
                                                int iZzE3 = zzf.zzE(activity, i26);
                                                zzay.zza();
                                                layoutParams = new RelativeLayout.LayoutParams(iZzE3, zzf.zzE(activity, i26));
                                                str = kvVar.f16526d;
                                                switch (str.hashCode()) {
                                                    case -1364013995:
                                                        if (!str.equals(TtmlNode.CENTER)) {
                                                            layoutParams.addRule(10);
                                                            layoutParams.addRule(11);
                                                        } else {
                                                            layoutParams.addRule(13);
                                                        }
                                                        break;
                                                    case -1012429441:
                                                        if (!str.equals(X3.e.f27730c)) {
                                                            layoutParams.addRule(10);
                                                            layoutParams.addRule(11);
                                                        } else {
                                                            layoutParams.addRule(10);
                                                            layoutParams.addRule(9);
                                                        }
                                                        break;
                                                    case -655373719:
                                                        if (!str.equals(X3.e.f27732e)) {
                                                            layoutParams.addRule(10);
                                                            layoutParams.addRule(11);
                                                        } else {
                                                            layoutParams.addRule(12);
                                                            layoutParams.addRule(9);
                                                        }
                                                        break;
                                                    case 1163912186:
                                                        if (!str.equals(X3.e.f27731d)) {
                                                            layoutParams.addRule(10);
                                                            layoutParams.addRule(11);
                                                        } else {
                                                            layoutParams.addRule(12);
                                                            layoutParams.addRule(11);
                                                        }
                                                        break;
                                                    case 1288627767:
                                                        if (!str.equals("bottom-center")) {
                                                            layoutParams.addRule(10);
                                                            layoutParams.addRule(11);
                                                        } else {
                                                            layoutParams.addRule(12);
                                                            layoutParams.addRule(14);
                                                        }
                                                        break;
                                                    case 1755462605:
                                                        if (!str.equals("top-center")) {
                                                            layoutParams.addRule(10);
                                                            layoutParams.addRule(11);
                                                        } else {
                                                            layoutParams.addRule(10);
                                                            layoutParams.addRule(14);
                                                        }
                                                        break;
                                                    default:
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(11);
                                                        break;
                                                }
                                                kvVar.f16538q.setOnClickListener(new jv(kvVar));
                                                kvVar.f16538q.setContentDescription("Close button");
                                                kvVar.f16541t.addView(kvVar.f16538q, layoutParams);
                                                try {
                                                    PopupWindow popupWindow3 = kvVar.f16540s;
                                                    View decorView = window.getDecorView();
                                                    zzay.zza();
                                                    int iZzE4 = zzf.zzE(activity, iArr[0]);
                                                    zzay.zza();
                                                    popupWindow3.showAtLocation(decorView, 0, iZzE4, zzf.zzE(activity, iArr[1]));
                                                    int i27 = iArr[0];
                                                    int i28 = iArr[1];
                                                    b21Var = kvVar.f16539r;
                                                    if (b21Var != null) {
                                                        ((dh0) b21Var.f12616b).f13525c.S0(jq.l);
                                                    }
                                                    kvVar.f16534m.F(new t0(1, iZzE, iZzE2));
                                                    int i29 = iArr[0];
                                                    int i30 = iArr[1];
                                                    zzt.zzc();
                                                    kvVar.j(i29, i30 - zzs.zzW(kvVar.f16535n)[0], kvVar.f16533k, kvVar.f16530h);
                                                    kvVar.k("resized");
                                                    return;
                                                } catch (RuntimeException e10) {
                                                    String message = e10.getMessage();
                                                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 26);
                                                    sb2.append("Cannot show popup window: ");
                                                    sb2.append(message);
                                                    kvVar.i(sb2.toString());
                                                    RelativeLayout relativeLayout2 = kvVar.f16541t;
                                                    b30 b30Var3 = kvVar.f16534m;
                                                    relativeLayout2.removeView((View) b30Var3);
                                                    ViewGroup viewGroup2 = kvVar.f16542u;
                                                    if (viewGroup2 != null) {
                                                        viewGroup2.removeView(kvVar.f16537p);
                                                        kvVar.f16542u.addView((View) b30Var3);
                                                        b30Var3.F(kvVar.f16536o);
                                                    }
                                                    return;
                                                }
                                            }
                                            i11 = 0;
                                            i12 = 50;
                                            if (z11) {
                                                iArr = new int[]{kvVar.f16528f + kvVar.f16531i, kvVar.f16529g + kvVar.f16532j};
                                            } else {
                                                zzt.zzc();
                                                int[] iArrZzaa2 = zzs.zzaa(activity);
                                                zzt.zzc();
                                                int[] iArrZzW2 = zzs.zzW(activity);
                                                int i31 = iArrZzaa2[i11];
                                                int i32 = kvVar.f16528f + kvVar.f16531i;
                                                int i33 = kvVar.f16529g + kvVar.f16532j;
                                                if (i32 < 0) {
                                                    i13 = i11;
                                                } else {
                                                    int i34 = kvVar.f16533k;
                                                    i13 = i32 + i34 > i31 ? i31 - i34 : i32;
                                                }
                                                int i35 = iArrZzW2[i11];
                                                if (i33 < i35) {
                                                    i33 = i35;
                                                } else {
                                                    int i36 = kvVar.f16530h;
                                                    int i37 = i33 + i36;
                                                    int i38 = iArrZzW2[1];
                                                    if (i37 > i38) {
                                                        i33 = i38 - i36;
                                                    }
                                                }
                                                iArr = new int[]{i13, i33};
                                            }
                                            if (iArr == null) {
                                                kvVar.i("Resize location out of screen or close button is not visible.");
                                                return;
                                            }
                                            zzay.zza();
                                            iZzE = zzf.zzE(activity, kvVar.f16533k);
                                            zzay.zza();
                                            iZzE2 = zzf.zzE(activity, kvVar.f16530h);
                                            parent = ((View) b30Var2).getParent();
                                            if (!(parent instanceof ViewGroup)) {
                                                kvVar.i("Webview is detached, probably in the middle of a resize or expand.");
                                                return;
                                            }
                                            viewGroup = (ViewGroup) parent;
                                            viewGroup.removeView((View) b30Var2);
                                            popupWindow = kvVar.f16540s;
                                            if (popupWindow == null) {
                                                kvVar.f16542u = viewGroup;
                                                zzt.zzc();
                                                ((View) b30Var2).setDrawingCacheEnabled(true);
                                                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(((View) b30Var2).getDrawingCache());
                                                ((View) b30Var2).setDrawingCacheEnabled(i11);
                                                ImageView imageView2 = new ImageView(activity);
                                                kvVar.f16537p = imageView2;
                                                imageView2.setImageBitmap(bitmapCreateBitmap2);
                                                kvVar.f16536o = b30Var2.zzN();
                                                kvVar.f16542u.addView(kvVar.f16537p);
                                            } else {
                                                popupWindow.dismiss();
                                            }
                                            RelativeLayout relativeLayout3 = new RelativeLayout(activity);
                                            kvVar.f16541t = relativeLayout3;
                                            relativeLayout3.setBackgroundColor(0);
                                            kvVar.f16541t.setLayoutParams(new ViewGroup.LayoutParams(iZzE, iZzE2));
                                            zzt.zzc();
                                            PopupWindow popupWindow4 = new PopupWindow((View) kvVar.f16541t, iZzE, iZzE2, false);
                                            kvVar.f16540s = popupWindow4;
                                            popupWindow4.setOutsideTouchable(false);
                                            kvVar.f16540s.setTouchable(true);
                                            kvVar.f16540s.setClippingEnabled(!kvVar.f16527e);
                                            kvVar.f16541t.addView((View) b30Var2, -1, -1);
                                            kvVar.f16538q = new LinearLayout(activity);
                                            zzay.zza();
                                            int i210 = i12;
                                            int iZzE5 = zzf.zzE(activity, i210);
                                            zzay.zza();
                                            layoutParams = new RelativeLayout.LayoutParams(iZzE5, zzf.zzE(activity, i210));
                                            str = kvVar.f16526d;
                                            switch (str.hashCode()) {
                                                case -1364013995:
                                                    if (!str.equals(TtmlNode.CENTER)) {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(11);
                                                    } else {
                                                        layoutParams.addRule(13);
                                                    }
                                                    break;
                                                case -1012429441:
                                                    if (!str.equals(X3.e.f27730c)) {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(11);
                                                    } else {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(9);
                                                    }
                                                    break;
                                                case -655373719:
                                                    if (!str.equals(X3.e.f27732e)) {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(11);
                                                    } else {
                                                        layoutParams.addRule(12);
                                                        layoutParams.addRule(9);
                                                    }
                                                    break;
                                                case 1163912186:
                                                    if (!str.equals(X3.e.f27731d)) {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(11);
                                                    } else {
                                                        layoutParams.addRule(12);
                                                        layoutParams.addRule(11);
                                                    }
                                                    break;
                                                case 1288627767:
                                                    if (!str.equals("bottom-center")) {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(11);
                                                    } else {
                                                        layoutParams.addRule(12);
                                                        layoutParams.addRule(14);
                                                    }
                                                    break;
                                                case 1755462605:
                                                    if (!str.equals("top-center")) {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(11);
                                                    } else {
                                                        layoutParams.addRule(10);
                                                        layoutParams.addRule(14);
                                                    }
                                                    break;
                                                default:
                                                    layoutParams.addRule(10);
                                                    layoutParams.addRule(11);
                                                    break;
                                            }
                                            kvVar.f16538q.setOnClickListener(new jv(kvVar));
                                            kvVar.f16538q.setContentDescription("Close button");
                                            kvVar.f16541t.addView(kvVar.f16538q, layoutParams);
                                            PopupWindow popupWindow5 = kvVar.f16540s;
                                            View decorView2 = window.getDecorView();
                                            zzay.zza();
                                            int iZzE6 = zzf.zzE(activity, iArr[0]);
                                            zzay.zza();
                                            popupWindow5.showAtLocation(decorView2, 0, iZzE6, zzf.zzE(activity, iArr[1]));
                                            int i211 = iArr[0];
                                            int i212 = iArr[1];
                                            b21Var = kvVar.f16539r;
                                            if (b21Var != null) {
                                                ((dh0) b21Var.f12616b).f13525c.S0(jq.l);
                                            }
                                            kvVar.f16534m.F(new t0(1, iZzE, iZzE2));
                                            int i213 = iArr[0];
                                            int i39 = iArr[1];
                                            zzt.zzc();
                                            kvVar.j(i213, i39 - zzs.zzW(kvVar.f16535n)[0], kvVar.f16533k, kvVar.f16530h);
                                            kvVar.k("resized");
                                            return;
                                        }
                                        int i40 = zze.zza;
                                        zzo.zzi("Cannot resize to a full-screen ad.");
                                        i11 = 0;
                                        i12 = 50;
                                    }
                                }
                                iArr = null;
                                if (iArr == null) {
                                    kvVar.i("Resize location out of screen or close button is not visible.");
                                    return;
                                }
                                zzay.zza();
                                iZzE = zzf.zzE(activity, kvVar.f16533k);
                                zzay.zza();
                                iZzE2 = zzf.zzE(activity, kvVar.f16530h);
                                parent = ((View) b30Var2).getParent();
                                if (!(parent instanceof ViewGroup)) {
                                    kvVar.i("Webview is detached, probably in the middle of a resize or expand.");
                                    return;
                                }
                                viewGroup = (ViewGroup) parent;
                                viewGroup.removeView((View) b30Var2);
                                popupWindow = kvVar.f16540s;
                                if (popupWindow == null) {
                                    kvVar.f16542u = viewGroup;
                                    zzt.zzc();
                                    ((View) b30Var2).setDrawingCacheEnabled(true);
                                    Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(((View) b30Var2).getDrawingCache());
                                    ((View) b30Var2).setDrawingCacheEnabled(i11);
                                    ImageView imageView3 = new ImageView(activity);
                                    kvVar.f16537p = imageView3;
                                    imageView3.setImageBitmap(bitmapCreateBitmap3);
                                    kvVar.f16536o = b30Var2.zzN();
                                    kvVar.f16542u.addView(kvVar.f16537p);
                                } else {
                                    popupWindow.dismiss();
                                }
                                RelativeLayout relativeLayout4 = new RelativeLayout(activity);
                                kvVar.f16541t = relativeLayout4;
                                relativeLayout4.setBackgroundColor(0);
                                kvVar.f16541t.setLayoutParams(new ViewGroup.LayoutParams(iZzE, iZzE2));
                                zzt.zzc();
                                PopupWindow popupWindow6 = new PopupWindow((View) kvVar.f16541t, iZzE, iZzE2, false);
                                kvVar.f16540s = popupWindow6;
                                popupWindow6.setOutsideTouchable(false);
                                kvVar.f16540s.setTouchable(true);
                                kvVar.f16540s.setClippingEnabled(!kvVar.f16527e);
                                kvVar.f16541t.addView((View) b30Var2, -1, -1);
                                kvVar.f16538q = new LinearLayout(activity);
                                zzay.zza();
                                int i214 = i12;
                                int iZzE7 = zzf.zzE(activity, i214);
                                zzay.zza();
                                layoutParams = new RelativeLayout.LayoutParams(iZzE7, zzf.zzE(activity, i214));
                                str = kvVar.f16526d;
                                switch (str.hashCode()) {
                                    case -1364013995:
                                        if (!str.equals(TtmlNode.CENTER)) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(13);
                                        }
                                        break;
                                    case -1012429441:
                                        if (!str.equals(X3.e.f27730c)) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(9);
                                        }
                                        break;
                                    case -655373719:
                                        if (!str.equals(X3.e.f27732e)) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(12);
                                            layoutParams.addRule(9);
                                        }
                                        break;
                                    case 1163912186:
                                        if (!str.equals(X3.e.f27731d)) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(12);
                                            layoutParams.addRule(11);
                                        }
                                        break;
                                    case 1288627767:
                                        if (!str.equals("bottom-center")) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(12);
                                            layoutParams.addRule(14);
                                        }
                                        break;
                                    case 1755462605:
                                        if (!str.equals("top-center")) {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(11);
                                        } else {
                                            layoutParams.addRule(10);
                                            layoutParams.addRule(14);
                                        }
                                        break;
                                    default:
                                        layoutParams.addRule(10);
                                        layoutParams.addRule(11);
                                        break;
                                }
                                kvVar.f16538q.setOnClickListener(new jv(kvVar));
                                kvVar.f16538q.setContentDescription("Close button");
                                kvVar.f16541t.addView(kvVar.f16538q, layoutParams);
                                PopupWindow popupWindow7 = kvVar.f16540s;
                                View decorView3 = window.getDecorView();
                                zzay.zza();
                                int iZzE8 = zzf.zzE(activity, iArr[0]);
                                zzay.zza();
                                popupWindow7.showAtLocation(decorView3, 0, iZzE8, zzf.zzE(activity, iArr[1]));
                                int i215 = iArr[0];
                                int i216 = iArr[1];
                                b21Var = kvVar.f16539r;
                                if (b21Var != null) {
                                    ((dh0) b21Var.f12616b).f13525c.S0(jq.l);
                                }
                                kvVar.f16534m.F(new t0(1, iZzE, iZzE2));
                                int i217 = iArr[0];
                                int i310 = iArr[1];
                                zzt.zzc();
                                kvVar.j(i217, i310 - zzs.zzW(kvVar.f16535n)[0], kvVar.f16533k, kvVar.f16530h);
                                kvVar.k("resized");
                                return;
                            }
                            kvVar.i("Activity context is not ready, cannot get window or decor view.");
                            return;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                if (iIntValue == 3) {
                    mv mvVar = new mv(b30Var, map);
                    Activity activity2 = mvVar.f17551d;
                    if (activity2 == null) {
                        mvVar.i("Activity context is not available");
                        return;
                    }
                    zzt.zzc();
                    if (!((Boolean) zzcb.zza(activity2, rl.f19604b)).booleanValue() || r9.c.a(activity2).f40681b.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                        mvVar.i("Feature is not supported by the device.");
                        return;
                    }
                    String str4 = (String) map.get("iurl");
                    if (TextUtils.isEmpty(str4)) {
                        mvVar.i("Image url cannot be empty.");
                        return;
                    }
                    if (!URLUtil.isValidUrl(str4)) {
                        mvVar.i("Invalid image url: ".concat(String.valueOf(str4)));
                        return;
                    }
                    String lastPathSegment = Uri.parse(str4).getLastPathSegment();
                    zzt.zzc();
                    if (TextUtils.isEmpty(lastPathSegment) || !lastPathSegment.matches("([^\\s]+(\\.(?i)(jpg|png|gif|bmp|webp))$)")) {
                        mvVar.i("Image type not recognized: ".concat(String.valueOf(lastPathSegment)));
                        return;
                    }
                    Resources resourcesC = zzt.zzh().c();
                    zzt.zzc();
                    AlertDialog.Builder builderZzN = zzs.zzN(activity2);
                    builderZzN.setTitle(resourcesC != null ? resourcesC.getString(R.string.f10710s1) : "Save image");
                    builderZzN.setMessage(resourcesC != null ? resourcesC.getString(R.string.f10711s2) : "Allow Ad to store image in Picture gallery?");
                    builderZzN.setPositiveButton(resourcesC != null ? resourcesC.getString(R.string.f10712s3) : "Accept", new yl0(mvVar, str4, lastPathSegment));
                    builderZzN.setNegativeButton(resourcesC != null ? resourcesC.getString(R.string.f10713s4) : "Decline", new lv(mvVar, i16));
                    builderZzN.create().show();
                    return;
                }
                if (iIntValue == 4) {
                    iv ivVar = new iv(b30Var, map);
                    Activity activity3 = ivVar.f15855e;
                    if (activity3 == null) {
                        ivVar.i("Activity context is not available.");
                        return;
                    }
                    zzt.zzc();
                    Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
                    k9.c0.i(type, "Intent can not be null");
                    if (activity3.getPackageManager().queryIntentActivities(type, 0).isEmpty()) {
                        ivVar.i("This feature is not available on the device.");
                        return;
                    }
                    zzt.zzc();
                    AlertDialog.Builder builderZzN2 = zzs.zzN(activity3);
                    Resources resourcesC2 = zzt.zzh().c();
                    builderZzN2.setTitle(resourcesC2 != null ? resourcesC2.getString(R.string.f10714s5) : "Create calendar event");
                    builderZzN2.setMessage(resourcesC2 != null ? resourcesC2.getString(R.string.f10715s6) : "Allow Ad to create a calendar event?");
                    builderZzN2.setPositiveButton(resourcesC2 != null ? resourcesC2.getString(R.string.f10712s3) : "Accept", new hv(ivVar, i16));
                    builderZzN2.setNegativeButton(resourcesC2 != null ? resourcesC2.getString(R.string.f10713s4) : "Decline", new hv(ivVar, z10 ? 1 : 0));
                    builderZzN2.create().show();
                    return;
                }
                if (iIntValue != 5) {
                    if (iIntValue == 6) {
                        this.f20019b.m(true);
                        return;
                    } else if (iIntValue != 7) {
                        int i41 = zze.zza;
                        zzo.zzh("Unknown MRAID command called.");
                        return;
                    }
                }
            }
            ((dh0) this.f20020c.f12616b).f13534m.zza();
            return;
        }
        String str5 = (String) map.get("forceOrientation");
        boolean z12 = map.containsKey("allowOrientationChange") ? Boolean.parseBoolean((String) map.get("allowOrientationChange")) : true;
        if (b30Var == null) {
            int i42 = zze.zza;
            zzo.zzi("AdWebView is null");
            return;
        }
        if (X3.i.D.equalsIgnoreCase(str5)) {
            i10 = 7;
        } else if (X3.i.C.equalsIgnoreCase(str5)) {
            i10 = 6;
        } else {
            i10 = z12 ? -1 : 14;
        }
        b30Var.U(i10);
    }
}
