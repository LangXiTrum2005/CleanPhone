package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;
import android.widget.Toast;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.foI;
import com.bytedance.sdk.openadsdk.core.kqm;
import com.bytedance.sdk.openadsdk.utils.aH;
import com.bytedance.sdk.openadsdk.utils.hg;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.umeng.analytics.pro.bc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class NXR extends IeN {
    static final ArrayList<String> ZU = new ArrayList<>(Arrays.asList("ja", "en", "ko", "zh", "th", "vi", "id", "ru", "ar", "fr", DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "it", "es", "hi", "pt", "zh-Hant", "ms", bc.aF, "tr"));
    private Set<String> JXs;
    public boolean lk;

    public NXR(IeN.Lxb lxb) {
        super("tt_sdk_settings.prop", lxb);
        this.JXs = Collections.synchronizedSet(new HashSet());
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0263  */
    /* JADX WARN: Code duplicated, block: B:110:0x027e  */
    /* JADX WARN: Code duplicated, block: B:113:0x028d  */
    /* JADX WARN: Code duplicated, block: B:114:0x0296  */
    /* JADX WARN: Code duplicated, block: B:117:0x029d  */
    /* JADX WARN: Code duplicated, block: B:120:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:123:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:124:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:12:0x0071  */
    /* JADX WARN: Code duplicated, block: B:137:0x02ec A[Catch: all -> 0x02f8, LOOP:0: B:135:0x02e6->B:137:0x02ec, LOOP_END, TryCatch #2 {all -> 0x02f8, blocks: (B:130:0x02d4, B:132:0x02df, B:135:0x02e6, B:137:0x02ec, B:140:0x02fa), top: B:361:0x02d4 }] */
    /* JADX WARN: Code duplicated, block: B:13:0x0079  */
    /* JADX WARN: Code duplicated, block: B:145:0x0320  */
    /* JADX WARN: Code duplicated, block: B:148:0x0339  */
    /* JADX WARN: Code duplicated, block: B:150:0x0341  */
    /* JADX WARN: Code duplicated, block: B:151:0x0350  */
    /* JADX WARN: Code duplicated, block: B:154:0x035b  */
    /* JADX WARN: Code duplicated, block: B:157:0x036e  */
    /* JADX WARN: Code duplicated, block: B:160:0x0381  */
    /* JADX WARN: Code duplicated, block: B:163:0x0394  */
    /* JADX WARN: Code duplicated, block: B:166:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:168:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:169:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:16:0x008f  */
    /* JADX WARN: Code duplicated, block: B:172:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:178:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:179:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:183:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:186:0x0402  */
    /* JADX WARN: Code duplicated, block: B:194:0x041c  */
    /* JADX WARN: Code duplicated, block: B:202:0x0436  */
    /* JADX WARN: Code duplicated, block: B:206:0x0440  */
    /* JADX WARN: Code duplicated, block: B:20:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:210:0x044c  */
    /* JADX WARN: Code duplicated, block: B:213:0x045c  */
    /* JADX WARN: Code duplicated, block: B:215:0x0464  */
    /* JADX WARN: Code duplicated, block: B:218:0x0474  */
    /* JADX WARN: Code duplicated, block: B:221:0x0486  */
    /* JADX WARN: Code duplicated, block: B:224:0x0496  */
    /* JADX WARN: Code duplicated, block: B:227:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:230:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:233:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:236:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:239:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:242:0x0502  */
    /* JADX WARN: Code duplicated, block: B:245:0x0516  */
    /* JADX WARN: Code duplicated, block: B:248:0x0529  */
    /* JADX WARN: Code duplicated, block: B:24:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:251:0x053d  */
    /* JADX WARN: Code duplicated, block: B:254:0x0552  */
    /* JADX WARN: Code duplicated, block: B:257:0x0562  */
    /* JADX WARN: Code duplicated, block: B:260:0x0573  */
    /* JADX WARN: Code duplicated, block: B:265:0x058b A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:267:0x0593 A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:269:0x059f A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:274:0x05b0 A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:276:0x05bc A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:279:0x05c9 A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:282:0x05dc A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:285:0x05ef A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:288:0x0602 A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:291:0x0616 A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:300:0x0643 A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:303:0x0657 A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:305:0x0663 A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:308:0x0670 A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:311:0x0684 A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:314:0x0696 A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:317:0x06a9 A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:320:0x06bc A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:323:0x06cf A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:326:0x06e2 A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:329:0x06f5 A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:332:0x0709 A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:335:0x071d A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:338:0x0730 A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:341:0x0744 A[Catch: all -> 0x05a5, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:344:0x0758 A[Catch: all -> 0x05a5, TRY_LEAVE, TryCatch #0 {all -> 0x05a5, blocks: (B:263:0x0585, B:265:0x058b, B:267:0x0593, B:269:0x059f, B:272:0x05a8, B:274:0x05b0, B:276:0x05bc, B:277:0x05c1, B:279:0x05c9, B:280:0x05d4, B:282:0x05dc, B:283:0x05e7, B:285:0x05ef, B:286:0x05fa, B:288:0x0602, B:289:0x060e, B:291:0x0616, B:292:0x0622, B:294:0x062a, B:297:0x0636, B:298:0x063b, B:300:0x0643, B:301:0x064f, B:303:0x0657, B:305:0x0663, B:306:0x0668, B:308:0x0670, B:309:0x067c, B:311:0x0684, B:312:0x068e, B:314:0x0696, B:315:0x06a1, B:317:0x06a9, B:318:0x06b4, B:320:0x06bc, B:321:0x06c7, B:323:0x06cf, B:324:0x06da, B:326:0x06e2, B:327:0x06ed, B:329:0x06f5, B:330:0x0701, B:332:0x0709, B:333:0x0715, B:335:0x071d, B:336:0x0728, B:338:0x0730, B:339:0x073c, B:341:0x0744, B:342:0x0750, B:344:0x0758), top: B:357:0x0585 }] */
    /* JADX WARN: Code duplicated, block: B:354:0x07ad  */
    /* JADX WARN: Code duplicated, block: B:357:0x0585 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:361:0x02d4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:38:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:41:0x0104  */
    /* JADX WARN: Code duplicated, block: B:42:0x010c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0116  */
    /* JADX WARN: Code duplicated, block: B:48:0x0126  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0141  */
    /* JADX WARN: Code duplicated, block: B:54:0x014d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0176  */
    /* JADX WARN: Code duplicated, block: B:65:0x0185  */
    /* JADX WARN: Code duplicated, block: B:68:0x0198  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:74:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:77:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x0200  */
    /* JADX WARN: Code duplicated, block: B:89:0x021d  */
    /* JADX WARN: Code duplicated, block: B:92:0x022d  */
    /* JADX WARN: Code duplicated, block: B:95:0x023f  */
    /* JADX WARN: Code duplicated, block: B:98:0x024c  */
    @Override // com.bytedance.sdk.openadsdk.core.settings.JXs
    public void Lxb(JSONObject jSONObject) {
        String str;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONObject jSONObjectOptJSONObject4;
        String str2;
        JSONObject jSONObjectOptJSONObject5;
        String str3;
        JSONObject jSONObjectOptJSONObject6;
        JSONObject jSONObjectOptJSONObject7;
        String strOptString;
        int iOptInt;
        String strOptString2;
        String strOptString3;
        String str4;
        String str5;
        String str6;
        int iOptInt2;
        int iOptInt3;
        int iOptInt4;
        int i;
        int iOptInt5;
        boolean z;
        String strOptString4;
        boolean z2;
        boolean z3;
        JSONArray jSONArrayOptJSONArray;
        int i2;
        String strOptString5;
        int iOptInt6;
        long jOptLong;
        String str7 = "read_video_from_cache";
        JXs.Lxb Lxb = Lxb();
        JSONObject jSONObjectJXs = VVE.TA().JXs();
        JSONObject jSONObjectOptJSONObject8 = jSONObject.optJSONObject("digest");
        try {
            if (jSONObjectOptJSONObject8 != null && jSONObjectJXs != null) {
                str = "video_cache_config";
                boolean z4 = jSONObjectOptJSONObject8.toString().equals(jSONObjectJXs.toString());
                this.lk = z4;
                if (jSONObjectOptJSONObject8 != null) {
                    Lxb.Lxb("digest", jSONObjectOptJSONObject8.toString());
                } else {
                    Lxb.Lxb("digest");
                }
                Lxb.Lxb("data_time", jSONObject.optLong("data_time"));
                if (jSONObject.has("req_inter_min")) {
                    jOptLong = jSONObject.optLong("req_inter_min", 10L) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
                    if (jOptLong >= 0 || jOptLong > 86400000) {
                        jOptLong = TTAdConstant.AD_MAX_EVENT_TIME;
                    }
                    Lxb.Lxb("req_inter_min", jOptLong);
                }
                if (jSONObject.has("lp_new_style")) {
                    Lxb.Lxb("landingpage_new_style", jSONObject.optInt("lp_new_style", Integer.MAX_VALUE));
                }
                if (jSONObject.has("blank_detect_rate")) {
                    iOptInt6 = jSONObject.optInt("blank_detect_rate", 30);
                    if (iOptInt6 >= 0 || iOptInt6 > 100) {
                        iOptInt6 = 30;
                    }
                    Lxb.Lxb("blank_detect_rate", iOptInt6);
                }
                jSONObjectOptJSONObject = jSONObject.optJSONObject("feq_policy");
                if (jSONObjectOptJSONObject != null) {
                    if (jSONObjectOptJSONObject.has("duration")) {
                        Lxb.Lxb("duration", jSONObjectOptJSONObject.optLong("duration") * 1000);
                    }
                    if (jSONObjectOptJSONObject.has("max")) {
                        Lxb.Lxb("max", jSONObjectOptJSONObject.optInt("max"));
                    }
                } else {
                    str7 = "read_video_from_cache";
                }
                if (jSONObject.has("vbtt")) {
                    Lxb.Lxb("vbtt", jSONObject.optInt("vbtt", 5));
                }
                jSONObjectOptJSONObject2 = jSONObject.optJSONObject("abtest");
                if (jSONObjectOptJSONObject2 != null) {
                    if (jSONObjectOptJSONObject2.has("version")) {
                        Lxb.Lxb("ab_test_version", jSONObjectOptJSONObject2.optString("version"));
                    }
                    if (jSONObjectOptJSONObject2.has("param")) {
                        Lxb.Lxb("ab_test_param", jSONObjectOptJSONObject2.optString("param"));
                    }
                } else {
                    VVE.TA().ebl();
                }
                jSONObjectOptJSONObject3 = jSONObject.optJSONObject("log_rate_conf");
                if (jSONObjectOptJSONObject3 != null && jSONObjectOptJSONObject3.has("global_rate")) {
                    Lxb.Lxb("global_rate", (float) jSONObjectOptJSONObject3.optDouble("global_rate", 1.0d));
                }
                if (jSONObject.has("pyload_h5")) {
                    Lxb.Lxb("pyload_h5", jSONObject.optString("pyload_h5"));
                }
                if (jSONObject.has("pure_pyload_h5")) {
                    Lxb.Lxb("playableLoadH5Url", jSONObject.optString("pure_pyload_h5"));
                }
                if (jSONObject.has("ads_url")) {
                    Lxb.Lxb("ads_url", jSONObject.optString("ads_url"));
                }
                if (jSONObject.has("app_log_url")) {
                    Lxb.Lxb("app_log_url", jSONObject.optString("app_log_url"));
                }
                if (jSONObject.has("coppa")) {
                    int iOptInt7 = jSONObject.optInt("coppa", -99);
                    com.bytedance.sdk.openadsdk.core.QAg.LD().ZU(iOptInt7);
                    Lxb.Lxb("coppa", iOptInt7);
                }
                if (jSONObject.has(CampaignEx.JSON_KEY_PRIVACY_URL)) {
                    Lxb.Lxb("policy_url", jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL));
                }
                if (jSONObject.has("consent_url")) {
                    Lxb.Lxb("consent_url", jSONObject.optString("consent_url"));
                }
                if (jSONObject.has("ivrv_downward")) {
                    Lxb.Lxb("ivrv_downward", jSONObject.optInt("ivrv_downward", 0));
                }
                if (jSONObject.has("dc")) {
                    Lxb.Lxb("dc", jSONObject.optString("dc"));
                }
                VVE.TA().Lxb(jSONObject, Lxb);
                VVE.TA().LD(jSONObject, Lxb);
                if (jSONObject.has("if_both_open")) {
                    Lxb.Lxb("if_both_open", jSONObject.optInt("if_both_open", 0));
                }
                if (jSONObject.has("support_tnc")) {
                    Lxb.Lxb("support_tnc", jSONObject.optInt("support_tnc", 1));
                }
                if (jSONObject.has("insert_js_config")) {
                    Lxb.Lxb("insert_js_config", jSONObject.optString("insert_js_config", ""));
                }
                if (jSONObject.has("max_tpl_cnts")) {
                    Lxb.Lxb("max_tpl_cnts", jSONObject.optInt("max_tpl_cnts", 100));
                }
                jSONObjectOptJSONObject4 = jSONObject.optJSONObject("app_common_config");
                if (jSONObjectOptJSONObject4 != null) {
                    if (jSONObjectOptJSONObject4.has("force_language")) {
                        strOptString5 = jSONObjectOptJSONObject4.optString("force_language");
                        if (!TextUtils.isEmpty(strOptString5) && ZU.contains(strOptString5)) {
                            Lxb.Lxb("force_language", strOptString5);
                        }
                    }
                    if (jSONObjectOptJSONObject4.has("fetch_tpl_timeout_ctrl")) {
                        Lxb.Lxb("fetch_tpl_timeout_ctrl", jSONObjectOptJSONObject4.optInt("fetch_tpl_timeout_ctrl", PathInterpolatorCompat.MAX_NUM_POINTS));
                    }
                    if (jSONObjectOptJSONObject4.has("fetch_tpl_second")) {
                        z2 = false;
                        Lxb.Lxb("fetch_tpl_second", jSONObjectOptJSONObject4.optInt("fetch_tpl_second", 0));
                    } else {
                        z2 = false;
                    }
                    if (jSONObjectOptJSONObject4.has("support_gzip")) {
                        Lxb.Lxb("support_gzip", jSONObjectOptJSONObject4.optBoolean("support_gzip", z2));
                    }
                    if (jSONObjectOptJSONObject4.has("aes_key")) {
                        Lxb.Lxb("aes_key", jSONObjectOptJSONObject4.optString("aes_key"));
                    }
                    if (jSONObjectOptJSONObject4.has("support_rtl")) {
                        z3 = false;
                        Lxb.Lxb("support_rtl", jSONObjectOptJSONObject4.optBoolean("support_rtl", false));
                    } else {
                        z3 = false;
                    }
                    if (jSONObjectOptJSONObject4.has("ad_revenue_enable")) {
                        Lxb.Lxb("ad_revenue_enable", jSONObjectOptJSONObject4.optBoolean("ad_revenue_enable", z3));
                    }
                    if (jSONObjectOptJSONObject4.has("gecko_hosts")) {
                        try {
                            this.JXs.clear();
                            jSONArrayOptJSONArray = jSONObjectOptJSONObject4.optJSONArray("gecko_hosts");
                            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() != 0) {
                                for (i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                    this.JXs.add(jSONArrayOptJSONArray.getString(i2));
                                }
                            }
                            this.JXs = Lxb(this.JXs);
                            Lxb.Lxb("gecko_hosts", jSONArrayOptJSONArray.toString());
                        } catch (Throwable th) {
                            com.bytedance.sdk.component.utils.sLN.LD("GeckoLog: settings json error ".concat(String.valueOf(th)));
                        }
                    }
                }
                str2 = str7;
                if (jSONObject.has(str2)) {
                    Lxb.Lxb(str2, jSONObject.optInt(str2, 1));
                }
                lk.Lxb(jSONObject.optJSONArray("ad_slot_conf_list"));
                jSONObjectOptJSONObject5 = jSONObject.optJSONObject("privacy");
                if (jSONObjectOptJSONObject5 != null) {
                    if (jSONObjectOptJSONObject5.has("ad_enable")) {
                        i = Integer.MAX_VALUE;
                        Lxb.Lxb("privacy_ad_enable", jSONObjectOptJSONObject5.optInt("ad_enable", Integer.MAX_VALUE));
                    } else {
                        i = Integer.MAX_VALUE;
                    }
                    if (jSONObjectOptJSONObject5.has("personalized_ad")) {
                        Lxb.Lxb("privacy_personalized_ad", jSONObjectOptJSONObject5.optInt("personalized_ad", i));
                    }
                    if (jSONObjectOptJSONObject5.has("sladar_enable")) {
                        Lxb.Lxb("privacy_sladar_enable", jSONObjectOptJSONObject5.optInt("sladar_enable", i));
                    }
                    if (jSONObjectOptJSONObject5.has("app_log_enable")) {
                        Lxb.Lxb("privacy_app_log_enable", jSONObjectOptJSONObject5.optInt("app_log_enable", i));
                    }
                    if (jSONObjectOptJSONObject5.has("debug_unlock")) {
                        Lxb.Lxb("privacy_debug_unlock", jSONObjectOptJSONObject5.optInt("debug_unlock", i));
                    }
                    if (jSONObjectOptJSONObject5.has("fields_allowed")) {
                        strOptString4 = jSONObjectOptJSONObject5.optString("fields_allowed", "");
                        if (TextUtils.isEmpty(strOptString4)) {
                            Lxb.Lxb("privacy_fields_allowed");
                        } else {
                            Lxb.Lxb("privacy_fields_allowed", strOptString4);
                        }
                    }
                    if (jSONObjectOptJSONObject5.has("app_reg")) {
                        iOptInt5 = jSONObjectOptJSONObject5.optInt("app_reg", 1);
                        if (iOptInt5 == 0 && foI.Lxb().ebl() == 1) {
                            hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.NXR.1
                                @Override // java.lang.Runnable
                                public void run() {
                                    Toast.makeText(kqm.Lxb(), "Appid is not registered on pangle media platform", 1).show();
                                }
                            });
                        }
                        if (iOptInt5 != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        Lxb.Lxb("privacy_app_reg", z);
                    }
                }
                str3 = str;
                if (jSONObject.has(str3)) {
                    Lxb.Lxb(str3, jSONObject.optString(str3));
                }
                if (jSONObject.has("loaded_recall_time")) {
                    iOptInt4 = jSONObject.optInt("loaded_recall_time", 0);
                    if (iOptInt4 != 0 && iOptInt4 != 1) {
                        iOptInt4 = 0;
                    }
                    Lxb.Lxb("loadedCallbackOpportunity", iOptInt4);
                }
                if (jSONObject.has("load_strategy")) {
                    iOptInt3 = jSONObject.optInt("load_strategy", 0);
                    if (iOptInt3 != 0 && iOptInt3 != 1) {
                        iOptInt3 = 0;
                    }
                    Lxb.Lxb("load_callback_strategy", iOptInt3);
                }
                if (jSONObject.has("splash_video_load_strategy")) {
                    iOptInt2 = jSONObject.optInt("splash_video_load_strategy", 0);
                    if (iOptInt2 >= 0 || iOptInt2 > 3) {
                        iOptInt2 = 0;
                    }
                    Lxb.Lxb("splash_video_load_strategy", iOptInt2);
                }
                if (jSONObject.has("allow_blind_mode_request_ad")) {
                    Lxb.Lxb("allow_blind_mode_request_ad", jSONObject.optBoolean("allow_blind_mode_request_ad", false));
                }
                jSONObjectOptJSONObject6 = jSONObject.optJSONObject("bus_con");
                if (jSONObjectOptJSONObject6 != null) {
                    if (jSONObjectOptJSONObject6.has("bus_con_send_log_type")) {
                        Lxb.Lxb("bus_con_send_log_type", jSONObjectOptJSONObject6.optInt("bus_con_send_log_type", 1));
                    }
                    if (jSONObjectOptJSONObject6.has("bus_con_sec_type")) {
                        Lxb.Lxb("bus_con_sec_type", jSONObjectOptJSONObject6.optInt("bus_con_sec_type", Integer.MAX_VALUE));
                    }
                    if (jSONObjectOptJSONObject6.has("bus_con_dislike_report_raw")) {
                        Lxb.Lxb("bus_con_dislike_report_raw", jSONObjectOptJSONObject6.optBoolean("bus_con_dislike_report_raw", false));
                    }
                    if (jSONObjectOptJSONObject6.has("bus_con_adshow_check_enable")) {
                        Lxb.Lxb("bus_con_adshow_check_enable", jSONObjectOptJSONObject6.optBoolean("bus_con_adshow_check_enable", true));
                    }
                    if (jSONObjectOptJSONObject6.has("bus_con_tnc_interval")) {
                        Lxb.Lxb("bus_con_tnc_interval", jSONObjectOptJSONObject6.optLong("bus_con_tnc_interval", TTAdConstant.AD_MAX_EVENT_TIME));
                    }
                    if (jSONObjectOptJSONObject6.has("bus_con_token_thread_count")) {
                        Lxb.Lxb("bus_con_token_thread_count", jSONObjectOptJSONObject6.optInt("bus_con_token_thread_count", 4));
                    }
                    if (jSONObjectOptJSONObject6.has("bus_con_video_keep_screen_on")) {
                        Lxb.Lxb("bus_con_video_keep_screen_on", jSONObjectOptJSONObject6.optInt("bus_con_video_keep_screen_on", 1));
                    }
                    if (jSONObjectOptJSONObject6.has("bus_con_auto_click_delay")) {
                        Lxb.Lxb("bus_con_auto_click_delay", jSONObjectOptJSONObject6.optInt("bus_con_auto_click_delay", PathInterpolatorCompat.MAX_NUM_POINTS));
                    }
                    if (jSONObjectOptJSONObject6.has("bus_con_express_host")) {
                        Lxb.Lxb("bus_con_express_host", jSONObjectOptJSONObject6.optString("bus_con_express_host", "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/"));
                    }
                    if (jSONObjectOptJSONObject6.has("bus_con_rewardedfull_link")) {
                        Lxb.Lxb("bus_con_rewardedfull_link", jSONObjectOptJSONObject6.optInt("bus_con_rewardedfull_link", 0));
                    }
                    if (jSONObjectOptJSONObject6.has("bus_con_check_clz")) {
                        Lxb.Lxb("bus_con_check_clz", jSONObjectOptJSONObject6.optString("bus_con_check_clz", ""));
                    }
                    if (jSONObjectOptJSONObject6.has("bus_con_url_check")) {
                        Lxb.Lxb("bus_con_url_check", jSONObjectOptJSONObject6.optInt("bus_con_url_check", 1));
                    }
                    if (jSONObjectOptJSONObject6.has("bus_con_behavior_count")) {
                        Lxb.Lxb("bus_con_behavior_count", jSONObjectOptJSONObject6.optInt("bus_con_behavior_count", 300));
                    }
                    str4 = VVE.Lxb;
                    if (jSONObjectOptJSONObject6.has(str4)) {
                        Lxb.Lxb(str4, jSONObjectOptJSONObject6.optBoolean(str4, false));
                    }
                    str5 = VVE.LD;
                    if (jSONObjectOptJSONObject6.has(str5)) {
                        Lxb.Lxb(str5, jSONObjectOptJSONObject6.optInt(str5, 10000));
                    }
                    str6 = VVE.lk;
                    if (jSONObjectOptJSONObject6.has(str6)) {
                        Lxb.Lxb(str6, (float) jSONObjectOptJSONObject6.optDouble(str6, 1.0d));
                    }
                }
                if (jSONObject.has("perf_con")) {
                    try {
                        jSONObjectOptJSONObject7 = jSONObject.optJSONObject("perf_con");
                        if (jSONObjectOptJSONObject7 != null) {
                            if (jSONObjectOptJSONObject7.has("perf_con_stats_rate")) {
                                strOptString3 = jSONObjectOptJSONObject7.optString("perf_con_stats_rate");
                                if (!TextUtils.isEmpty(strOptString3)) {
                                    Lxb.Lxb("perf_con_stats_rate", strOptString3);
                                }
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_applog_send")) {
                                strOptString2 = jSONObjectOptJSONObject7.optString("perf_con_applog_send");
                                if (!TextUtils.isEmpty(strOptString2)) {
                                    Lxb.Lxb("perf_con_applog_send", strOptString2);
                                }
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_apm_native")) {
                                Lxb.Lxb("perf_con_apm_native", jSONObjectOptJSONObject7.optInt("perf_con_apm_native"));
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_webview_preload_cache")) {
                                Lxb.Lxb("perf_con_webview_preload_cache", jSONObjectOptJSONObject7.optInt("perf_con_webview_preload_cache"));
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_webview_preload_cache_v3")) {
                                Lxb.Lxb("perf_con_webview_preload_cache_v3", jSONObjectOptJSONObject7.optInt("perf_con_webview_preload_cache_v3"));
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_webview_cache_count")) {
                                Lxb.Lxb("perf_con_webview_cache_count", jSONObjectOptJSONObject7.optInt("perf_con_webview_cache_count", 0));
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_webview_cache_count_v3")) {
                                Lxb.Lxb("perf_con_webview_cache_count_v3", jSONObjectOptJSONObject7.optInt("perf_con_webview_cache_count_v3", 0));
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_thread_stack_size") && (iOptInt = jSONObjectOptJSONObject7.optInt("perf_con_thread_stack_size")) >= -524288 && iOptInt <= 0) {
                                Lxb.Lxb("perf_con_thread_stack_size", iOptInt);
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_use_new_thread_pool")) {
                                Lxb.Lxb("perf_con_use_new_thread_pool", jSONObjectOptJSONObject7.optInt("perf_con_use_new_thread_pool", 0));
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_thread_pool_config")) {
                                strOptString = jSONObjectOptJSONObject7.optString("perf_con_thread_pool_config");
                                if (!TextUtils.isEmpty(strOptString)) {
                                    Lxb.Lxb("perf_con_thread_pool_config", strOptString);
                                }
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_is_new_net_thread")) {
                                Lxb.Lxb("perf_con_is_new_net_thread", jSONObjectOptJSONObject7.optInt("perf_con_is_new_net_thread", 0));
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_use_prop")) {
                                aH.Lxb(jSONObjectOptJSONObject7.optInt("perf_con_use_prop", 1));
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_adlog_expire_time")) {
                                Lxb.Lxb("perf_con_adlog_expire_time", jSONObjectOptJSONObject7.optLong("perf_con_adlog_expire_time"));
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_adlog_turn_off_retry_ad")) {
                                Lxb.Lxb("perf_con_adlog_turn_off_retry_ad", jSONObjectOptJSONObject7.optLong("perf_con_adlog_turn_off_retry_ad"));
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_adlog_turn_off_retry_stats")) {
                                Lxb.Lxb("perf_con_adlog_turn_off_retry_stats", jSONObjectOptJSONObject7.optLong("perf_con_adlog_turn_off_retry_stats"));
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_applog_rate")) {
                                Lxb.Lxb("perf_con_applog_rate", jSONObjectOptJSONObject7.optString("perf_con_applog_rate"));
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_track_url_strategy")) {
                                Lxb.Lxb("perf_con_track_url_strategy", jSONObjectOptJSONObject7.optString("perf_con_track_url_strategy"));
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_drawable_code")) {
                                Lxb.Lxb("perf_con_drawable_code", jSONObjectOptJSONObject7.optInt("perf_con_drawable_code", 0));
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_close_button_delay_check_time")) {
                                Lxb.Lxb("perf_con_close_button_delay_check_time", jSONObjectOptJSONObject7.optInt("perf_con_close_button_delay_check_time", -1));
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_drop2rt_skip_label_list")) {
                                Lxb.Lxb("perf_con_drop2rt_skip_label_list", jSONObjectOptJSONObject7.optString("perf_con_drop2rt_skip_label_list"));
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_crypt_V4_get_ad")) {
                                Lxb.Lxb("perf_con_crypt_V4_get_ad", jSONObjectOptJSONObject7.optBoolean("perf_con_crypt_V4_get_ad", false));
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_crypt_V4_applog")) {
                                Lxb.Lxb("perf_con_crypt_V4_applog", jSONObjectOptJSONObject7.optBoolean("perf_con_crypt_V4_applog", false));
                            }
                            if (jSONObjectOptJSONObject7.has("perf_con_crypt_V4")) {
                                Lxb.Lxb("perf_con_crypt_V4", jSONObjectOptJSONObject7.optBoolean("perf_con_crypt_V4", false));
                            }
                        }
                    } catch (Throwable th2) {
                        com.bytedance.sdk.component.utils.sLN.Lxb("SettingsDefaultRepository", th2.getMessage());
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("app_common_config", jSONObjectOptJSONObject4);
                jSONObject2.put("perf_con", jSONObject.optJSONObject("perf_con"));
                jSONObject2.put("bus_con", jSONObject.optJSONObject("bus_con"));
                Lxb.Lxb("core_settings", jSONObject2.toString());
                if (jSONObject.has("dual_event_url")) {
                    Lxb.Lxb("dual_event_url", jSONObject.optString("dual_event_url"));
                }
                Lxb.Lxb();
                VVE.TA().Ivz();
                ZU();
            }
            str = "video_cache_config";
            jSONObject2.put("app_common_config", jSONObjectOptJSONObject4);
            jSONObject2.put("perf_con", jSONObject.optJSONObject("perf_con"));
            jSONObject2.put("bus_con", jSONObject.optJSONObject("bus_con"));
        } catch (JSONException e) {
            com.bytedance.sdk.component.utils.sLN.Lxb("SettingsDefaultRepository", "coreSettingJson", e.getMessage());
        }
        this.lk = z4;
        if (jSONObjectOptJSONObject8 != null) {
            Lxb.Lxb("digest", jSONObjectOptJSONObject8.toString());
        } else {
            Lxb.Lxb("digest");
        }
        Lxb.Lxb("data_time", jSONObject.optLong("data_time"));
        if (jSONObject.has("req_inter_min")) {
            jOptLong = jSONObject.optLong("req_inter_min", 10L) * ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
            if (jOptLong >= 0) {
                jOptLong = TTAdConstant.AD_MAX_EVENT_TIME;
            } else {
                jOptLong = TTAdConstant.AD_MAX_EVENT_TIME;
            }
            Lxb.Lxb("req_inter_min", jOptLong);
        }
        if (jSONObject.has("lp_new_style")) {
            Lxb.Lxb("landingpage_new_style", jSONObject.optInt("lp_new_style", Integer.MAX_VALUE));
        }
        if (jSONObject.has("blank_detect_rate")) {
            iOptInt6 = jSONObject.optInt("blank_detect_rate", 30);
            if (iOptInt6 >= 0) {
                iOptInt6 = 30;
            } else {
                iOptInt6 = 30;
            }
            Lxb.Lxb("blank_detect_rate", iOptInt6);
        }
        jSONObjectOptJSONObject = jSONObject.optJSONObject("feq_policy");
        if (jSONObjectOptJSONObject != null) {
            if (jSONObjectOptJSONObject.has("duration")) {
                Lxb.Lxb("duration", jSONObjectOptJSONObject.optLong("duration") * 1000);
            }
            if (jSONObjectOptJSONObject.has("max")) {
                Lxb.Lxb("max", jSONObjectOptJSONObject.optInt("max"));
            }
        } else {
            str7 = "read_video_from_cache";
        }
        if (jSONObject.has("vbtt")) {
            Lxb.Lxb("vbtt", jSONObject.optInt("vbtt", 5));
        }
        jSONObjectOptJSONObject2 = jSONObject.optJSONObject("abtest");
        if (jSONObjectOptJSONObject2 != null) {
            if (jSONObjectOptJSONObject2.has("version")) {
                Lxb.Lxb("ab_test_version", jSONObjectOptJSONObject2.optString("version"));
            }
            if (jSONObjectOptJSONObject2.has("param")) {
                Lxb.Lxb("ab_test_param", jSONObjectOptJSONObject2.optString("param"));
            }
        } else {
            VVE.TA().ebl();
        }
        jSONObjectOptJSONObject3 = jSONObject.optJSONObject("log_rate_conf");
        if (jSONObjectOptJSONObject3 != null) {
            Lxb.Lxb("global_rate", (float) jSONObjectOptJSONObject3.optDouble("global_rate", 1.0d));
        }
        if (jSONObject.has("pyload_h5")) {
            Lxb.Lxb("pyload_h5", jSONObject.optString("pyload_h5"));
        }
        if (jSONObject.has("pure_pyload_h5")) {
            Lxb.Lxb("playableLoadH5Url", jSONObject.optString("pure_pyload_h5"));
        }
        if (jSONObject.has("ads_url")) {
            Lxb.Lxb("ads_url", jSONObject.optString("ads_url"));
        }
        if (jSONObject.has("app_log_url")) {
            Lxb.Lxb("app_log_url", jSONObject.optString("app_log_url"));
        }
        if (jSONObject.has("coppa")) {
            int iOptInt8 = jSONObject.optInt("coppa", -99);
            com.bytedance.sdk.openadsdk.core.QAg.LD().ZU(iOptInt8);
            Lxb.Lxb("coppa", iOptInt8);
        }
        if (jSONObject.has(CampaignEx.JSON_KEY_PRIVACY_URL)) {
            Lxb.Lxb("policy_url", jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL));
        }
        if (jSONObject.has("consent_url")) {
            Lxb.Lxb("consent_url", jSONObject.optString("consent_url"));
        }
        if (jSONObject.has("ivrv_downward")) {
            Lxb.Lxb("ivrv_downward", jSONObject.optInt("ivrv_downward", 0));
        }
        if (jSONObject.has("dc")) {
            Lxb.Lxb("dc", jSONObject.optString("dc"));
        }
        VVE.TA().Lxb(jSONObject, Lxb);
        VVE.TA().LD(jSONObject, Lxb);
        if (jSONObject.has("if_both_open")) {
            Lxb.Lxb("if_both_open", jSONObject.optInt("if_both_open", 0));
        }
        if (jSONObject.has("support_tnc")) {
            Lxb.Lxb("support_tnc", jSONObject.optInt("support_tnc", 1));
        }
        if (jSONObject.has("insert_js_config")) {
            Lxb.Lxb("insert_js_config", jSONObject.optString("insert_js_config", ""));
        }
        if (jSONObject.has("max_tpl_cnts")) {
            Lxb.Lxb("max_tpl_cnts", jSONObject.optInt("max_tpl_cnts", 100));
        }
        jSONObjectOptJSONObject4 = jSONObject.optJSONObject("app_common_config");
        if (jSONObjectOptJSONObject4 != null) {
            if (jSONObjectOptJSONObject4.has("force_language")) {
                strOptString5 = jSONObjectOptJSONObject4.optString("force_language");
                if (!TextUtils.isEmpty(strOptString5)) {
                    Lxb.Lxb("force_language", strOptString5);
                }
            }
            if (jSONObjectOptJSONObject4.has("fetch_tpl_timeout_ctrl")) {
                Lxb.Lxb("fetch_tpl_timeout_ctrl", jSONObjectOptJSONObject4.optInt("fetch_tpl_timeout_ctrl", PathInterpolatorCompat.MAX_NUM_POINTS));
            }
            if (jSONObjectOptJSONObject4.has("fetch_tpl_second")) {
                z2 = false;
                Lxb.Lxb("fetch_tpl_second", jSONObjectOptJSONObject4.optInt("fetch_tpl_second", 0));
            } else {
                z2 = false;
            }
            if (jSONObjectOptJSONObject4.has("support_gzip")) {
                Lxb.Lxb("support_gzip", jSONObjectOptJSONObject4.optBoolean("support_gzip", z2));
            }
            if (jSONObjectOptJSONObject4.has("aes_key")) {
                Lxb.Lxb("aes_key", jSONObjectOptJSONObject4.optString("aes_key"));
            }
            if (jSONObjectOptJSONObject4.has("support_rtl")) {
                z3 = false;
                Lxb.Lxb("support_rtl", jSONObjectOptJSONObject4.optBoolean("support_rtl", false));
            } else {
                z3 = false;
            }
            if (jSONObjectOptJSONObject4.has("ad_revenue_enable")) {
                Lxb.Lxb("ad_revenue_enable", jSONObjectOptJSONObject4.optBoolean("ad_revenue_enable", z3));
            }
            if (jSONObjectOptJSONObject4.has("gecko_hosts")) {
                this.JXs.clear();
                jSONArrayOptJSONArray = jSONObjectOptJSONObject4.optJSONArray("gecko_hosts");
                if (jSONArrayOptJSONArray != null) {
                    while (i2 < jSONArrayOptJSONArray.length()) {
                        this.JXs.add(jSONArrayOptJSONArray.getString(i2));
                    }
                }
                this.JXs = Lxb(this.JXs);
                Lxb.Lxb("gecko_hosts", jSONArrayOptJSONArray.toString());
            }
        }
        str2 = str7;
        if (jSONObject.has(str2)) {
            Lxb.Lxb(str2, jSONObject.optInt(str2, 1));
        }
        lk.Lxb(jSONObject.optJSONArray("ad_slot_conf_list"));
        jSONObjectOptJSONObject5 = jSONObject.optJSONObject("privacy");
        if (jSONObjectOptJSONObject5 != null) {
            if (jSONObjectOptJSONObject5.has("ad_enable")) {
                i = Integer.MAX_VALUE;
                Lxb.Lxb("privacy_ad_enable", jSONObjectOptJSONObject5.optInt("ad_enable", Integer.MAX_VALUE));
            } else {
                i = Integer.MAX_VALUE;
            }
            if (jSONObjectOptJSONObject5.has("personalized_ad")) {
                Lxb.Lxb("privacy_personalized_ad", jSONObjectOptJSONObject5.optInt("personalized_ad", i));
            }
            if (jSONObjectOptJSONObject5.has("sladar_enable")) {
                Lxb.Lxb("privacy_sladar_enable", jSONObjectOptJSONObject5.optInt("sladar_enable", i));
            }
            if (jSONObjectOptJSONObject5.has("app_log_enable")) {
                Lxb.Lxb("privacy_app_log_enable", jSONObjectOptJSONObject5.optInt("app_log_enable", i));
            }
            if (jSONObjectOptJSONObject5.has("debug_unlock")) {
                Lxb.Lxb("privacy_debug_unlock", jSONObjectOptJSONObject5.optInt("debug_unlock", i));
            }
            if (jSONObjectOptJSONObject5.has("fields_allowed")) {
                strOptString4 = jSONObjectOptJSONObject5.optString("fields_allowed", "");
                if (TextUtils.isEmpty(strOptString4)) {
                    Lxb.Lxb("privacy_fields_allowed", strOptString4);
                } else {
                    Lxb.Lxb("privacy_fields_allowed");
                }
            }
            if (jSONObjectOptJSONObject5.has("app_reg")) {
                iOptInt5 = jSONObjectOptJSONObject5.optInt("app_reg", 1);
                if (iOptInt5 == 0) {
                    hg.Lxb(new Runnable() { // from class: com.bytedance.sdk.openadsdk.core.settings.NXR.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Toast.makeText(kqm.Lxb(), "Appid is not registered on pangle media platform", 1).show();
                        }
                    });
                }
                if (iOptInt5 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                Lxb.Lxb("privacy_app_reg", z);
            }
        }
        str3 = str;
        if (jSONObject.has(str3)) {
            Lxb.Lxb(str3, jSONObject.optString(str3));
        }
        if (jSONObject.has("loaded_recall_time")) {
            iOptInt4 = jSONObject.optInt("loaded_recall_time", 0);
            if (iOptInt4 != 0) {
                iOptInt4 = 0;
            }
            Lxb.Lxb("loadedCallbackOpportunity", iOptInt4);
        }
        if (jSONObject.has("load_strategy")) {
            iOptInt3 = jSONObject.optInt("load_strategy", 0);
            if (iOptInt3 != 0) {
                iOptInt3 = 0;
            }
            Lxb.Lxb("load_callback_strategy", iOptInt3);
        }
        if (jSONObject.has("splash_video_load_strategy")) {
            iOptInt2 = jSONObject.optInt("splash_video_load_strategy", 0);
            if (iOptInt2 >= 0) {
                iOptInt2 = 0;
            } else {
                iOptInt2 = 0;
            }
            Lxb.Lxb("splash_video_load_strategy", iOptInt2);
        }
        if (jSONObject.has("allow_blind_mode_request_ad")) {
            Lxb.Lxb("allow_blind_mode_request_ad", jSONObject.optBoolean("allow_blind_mode_request_ad", false));
        }
        jSONObjectOptJSONObject6 = jSONObject.optJSONObject("bus_con");
        if (jSONObjectOptJSONObject6 != null) {
            if (jSONObjectOptJSONObject6.has("bus_con_send_log_type")) {
                Lxb.Lxb("bus_con_send_log_type", jSONObjectOptJSONObject6.optInt("bus_con_send_log_type", 1));
            }
            if (jSONObjectOptJSONObject6.has("bus_con_sec_type")) {
                Lxb.Lxb("bus_con_sec_type", jSONObjectOptJSONObject6.optInt("bus_con_sec_type", Integer.MAX_VALUE));
            }
            if (jSONObjectOptJSONObject6.has("bus_con_dislike_report_raw")) {
                Lxb.Lxb("bus_con_dislike_report_raw", jSONObjectOptJSONObject6.optBoolean("bus_con_dislike_report_raw", false));
            }
            if (jSONObjectOptJSONObject6.has("bus_con_adshow_check_enable")) {
                Lxb.Lxb("bus_con_adshow_check_enable", jSONObjectOptJSONObject6.optBoolean("bus_con_adshow_check_enable", true));
            }
            if (jSONObjectOptJSONObject6.has("bus_con_tnc_interval")) {
                Lxb.Lxb("bus_con_tnc_interval", jSONObjectOptJSONObject6.optLong("bus_con_tnc_interval", TTAdConstant.AD_MAX_EVENT_TIME));
            }
            if (jSONObjectOptJSONObject6.has("bus_con_token_thread_count")) {
                Lxb.Lxb("bus_con_token_thread_count", jSONObjectOptJSONObject6.optInt("bus_con_token_thread_count", 4));
            }
            if (jSONObjectOptJSONObject6.has("bus_con_video_keep_screen_on")) {
                Lxb.Lxb("bus_con_video_keep_screen_on", jSONObjectOptJSONObject6.optInt("bus_con_video_keep_screen_on", 1));
            }
            if (jSONObjectOptJSONObject6.has("bus_con_auto_click_delay")) {
                Lxb.Lxb("bus_con_auto_click_delay", jSONObjectOptJSONObject6.optInt("bus_con_auto_click_delay", PathInterpolatorCompat.MAX_NUM_POINTS));
            }
            if (jSONObjectOptJSONObject6.has("bus_con_express_host")) {
                Lxb.Lxb("bus_con_express_host", jSONObjectOptJSONObject6.optString("bus_con_express_host", "https://sf16-static.i18n-pglstatp.com/obj/ad-pattern-sg/"));
            }
            if (jSONObjectOptJSONObject6.has("bus_con_rewardedfull_link")) {
                Lxb.Lxb("bus_con_rewardedfull_link", jSONObjectOptJSONObject6.optInt("bus_con_rewardedfull_link", 0));
            }
            if (jSONObjectOptJSONObject6.has("bus_con_check_clz")) {
                Lxb.Lxb("bus_con_check_clz", jSONObjectOptJSONObject6.optString("bus_con_check_clz", ""));
            }
            if (jSONObjectOptJSONObject6.has("bus_con_url_check")) {
                Lxb.Lxb("bus_con_url_check", jSONObjectOptJSONObject6.optInt("bus_con_url_check", 1));
            }
            if (jSONObjectOptJSONObject6.has("bus_con_behavior_count")) {
                Lxb.Lxb("bus_con_behavior_count", jSONObjectOptJSONObject6.optInt("bus_con_behavior_count", 300));
            }
            str4 = VVE.Lxb;
            if (jSONObjectOptJSONObject6.has(str4)) {
                Lxb.Lxb(str4, jSONObjectOptJSONObject6.optBoolean(str4, false));
            }
            str5 = VVE.LD;
            if (jSONObjectOptJSONObject6.has(str5)) {
                Lxb.Lxb(str5, jSONObjectOptJSONObject6.optInt(str5, 10000));
            }
            str6 = VVE.lk;
            if (jSONObjectOptJSONObject6.has(str6)) {
                Lxb.Lxb(str6, (float) jSONObjectOptJSONObject6.optDouble(str6, 1.0d));
            }
        }
        if (jSONObject.has("perf_con")) {
            jSONObjectOptJSONObject7 = jSONObject.optJSONObject("perf_con");
            if (jSONObjectOptJSONObject7 != null) {
                if (jSONObjectOptJSONObject7.has("perf_con_stats_rate")) {
                    strOptString3 = jSONObjectOptJSONObject7.optString("perf_con_stats_rate");
                    if (!TextUtils.isEmpty(strOptString3)) {
                        Lxb.Lxb("perf_con_stats_rate", strOptString3);
                    }
                }
                if (jSONObjectOptJSONObject7.has("perf_con_applog_send")) {
                    strOptString2 = jSONObjectOptJSONObject7.optString("perf_con_applog_send");
                    if (!TextUtils.isEmpty(strOptString2)) {
                        Lxb.Lxb("perf_con_applog_send", strOptString2);
                    }
                }
                if (jSONObjectOptJSONObject7.has("perf_con_apm_native")) {
                    Lxb.Lxb("perf_con_apm_native", jSONObjectOptJSONObject7.optInt("perf_con_apm_native"));
                }
                if (jSONObjectOptJSONObject7.has("perf_con_webview_preload_cache")) {
                    Lxb.Lxb("perf_con_webview_preload_cache", jSONObjectOptJSONObject7.optInt("perf_con_webview_preload_cache"));
                }
                if (jSONObjectOptJSONObject7.has("perf_con_webview_preload_cache_v3")) {
                    Lxb.Lxb("perf_con_webview_preload_cache_v3", jSONObjectOptJSONObject7.optInt("perf_con_webview_preload_cache_v3"));
                }
                if (jSONObjectOptJSONObject7.has("perf_con_webview_cache_count")) {
                    Lxb.Lxb("perf_con_webview_cache_count", jSONObjectOptJSONObject7.optInt("perf_con_webview_cache_count", 0));
                }
                if (jSONObjectOptJSONObject7.has("perf_con_webview_cache_count_v3")) {
                    Lxb.Lxb("perf_con_webview_cache_count_v3", jSONObjectOptJSONObject7.optInt("perf_con_webview_cache_count_v3", 0));
                }
                if (jSONObjectOptJSONObject7.has("perf_con_thread_stack_size")) {
                    Lxb.Lxb("perf_con_thread_stack_size", iOptInt);
                }
                if (jSONObjectOptJSONObject7.has("perf_con_use_new_thread_pool")) {
                    Lxb.Lxb("perf_con_use_new_thread_pool", jSONObjectOptJSONObject7.optInt("perf_con_use_new_thread_pool", 0));
                }
                if (jSONObjectOptJSONObject7.has("perf_con_thread_pool_config")) {
                    strOptString = jSONObjectOptJSONObject7.optString("perf_con_thread_pool_config");
                    if (!TextUtils.isEmpty(strOptString)) {
                        Lxb.Lxb("perf_con_thread_pool_config", strOptString);
                    }
                }
                if (jSONObjectOptJSONObject7.has("perf_con_is_new_net_thread")) {
                    Lxb.Lxb("perf_con_is_new_net_thread", jSONObjectOptJSONObject7.optInt("perf_con_is_new_net_thread", 0));
                }
                if (jSONObjectOptJSONObject7.has("perf_con_use_prop")) {
                    aH.Lxb(jSONObjectOptJSONObject7.optInt("perf_con_use_prop", 1));
                }
                if (jSONObjectOptJSONObject7.has("perf_con_adlog_expire_time")) {
                    Lxb.Lxb("perf_con_adlog_expire_time", jSONObjectOptJSONObject7.optLong("perf_con_adlog_expire_time"));
                }
                if (jSONObjectOptJSONObject7.has("perf_con_adlog_turn_off_retry_ad")) {
                    Lxb.Lxb("perf_con_adlog_turn_off_retry_ad", jSONObjectOptJSONObject7.optLong("perf_con_adlog_turn_off_retry_ad"));
                }
                if (jSONObjectOptJSONObject7.has("perf_con_adlog_turn_off_retry_stats")) {
                    Lxb.Lxb("perf_con_adlog_turn_off_retry_stats", jSONObjectOptJSONObject7.optLong("perf_con_adlog_turn_off_retry_stats"));
                }
                if (jSONObjectOptJSONObject7.has("perf_con_applog_rate")) {
                    Lxb.Lxb("perf_con_applog_rate", jSONObjectOptJSONObject7.optString("perf_con_applog_rate"));
                }
                if (jSONObjectOptJSONObject7.has("perf_con_track_url_strategy")) {
                    Lxb.Lxb("perf_con_track_url_strategy", jSONObjectOptJSONObject7.optString("perf_con_track_url_strategy"));
                }
                if (jSONObjectOptJSONObject7.has("perf_con_drawable_code")) {
                    Lxb.Lxb("perf_con_drawable_code", jSONObjectOptJSONObject7.optInt("perf_con_drawable_code", 0));
                }
                if (jSONObjectOptJSONObject7.has("perf_con_close_button_delay_check_time")) {
                    Lxb.Lxb("perf_con_close_button_delay_check_time", jSONObjectOptJSONObject7.optInt("perf_con_close_button_delay_check_time", -1));
                }
                if (jSONObjectOptJSONObject7.has("perf_con_drop2rt_skip_label_list")) {
                    Lxb.Lxb("perf_con_drop2rt_skip_label_list", jSONObjectOptJSONObject7.optString("perf_con_drop2rt_skip_label_list"));
                }
                if (jSONObjectOptJSONObject7.has("perf_con_crypt_V4_get_ad")) {
                    Lxb.Lxb("perf_con_crypt_V4_get_ad", jSONObjectOptJSONObject7.optBoolean("perf_con_crypt_V4_get_ad", false));
                }
                if (jSONObjectOptJSONObject7.has("perf_con_crypt_V4_applog")) {
                    Lxb.Lxb("perf_con_crypt_V4_applog", jSONObjectOptJSONObject7.optBoolean("perf_con_crypt_V4_applog", false));
                }
                if (jSONObjectOptJSONObject7.has("perf_con_crypt_V4")) {
                    Lxb.Lxb("perf_con_crypt_V4", jSONObjectOptJSONObject7.optBoolean("perf_con_crypt_V4", false));
                }
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        Lxb.Lxb("core_settings", jSONObject3.toString());
        if (jSONObject.has("dual_event_url")) {
            Lxb.Lxb("dual_event_url", jSONObject.optString("dual_event_url"));
        }
        Lxb.Lxb();
        VVE.TA().Ivz();
        ZU();
    }

    public static Set<String> Lxb(Set<String> set) {
        try {
            if (set == null) {
                return new HashSet();
            }
            HashSet hashSet = new HashSet();
            for (String str : set) {
                if (!TextUtils.isEmpty(str)) {
                    hashSet.add(str);
                }
            }
            return hashSet;
        } catch (Throwable unused) {
            return new HashSet();
        }
    }
}
