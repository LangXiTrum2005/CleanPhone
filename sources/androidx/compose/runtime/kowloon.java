package androidx.compose.runtime;

import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.ironsource.C3700q2;
import com.ironsource.X3;
import cuirassed.IntRef;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import oilcan.ComposeStackTraceFrame;
import oilcan.ObjectLocation;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.EmptyCoroutineContext;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Composer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ö\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0002\u009e\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0004Ê\u0001â\u0001BQ\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0014H\u0002¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010\"\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010\u0016J\u0019\u0010$\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b$\u0010%J\u0011\u0010'\u001a\u0004\u0018\u00010&H\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020)2\u0006\u0010,\u001a\u00020\u0019H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020)2\u0006\u0010/\u001a\u00020)2\u0006\u00100\u001a\u00020)H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00142\u0006\u00103\u001a\u00020)H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0014H\u0002¢\u0006\u0004\b6\u0010\u0016J\u000f\u00107\u001a\u00020\u0014H\u0002¢\u0006\u0004\b7\u0010\u0016J\u000f\u00108\u001a\u00020\u0014H\u0002¢\u0006\u0004\b8\u0010\u0016J!\u0010<\u001a\u00020\u00142\u0006\u0010:\u001a\u0002092\b\u0010;\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b<\u0010=J3\u0010A\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010>\u001a\u0004\u0018\u00010\u001d2\u0006\u0010@\u001a\u00020?2\b\u0010;\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\bA\u0010BJ!\u0010E\u001a\u00020\u00142\u0006\u0010:\u001a\u0002092\b\u0010D\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0004\bE\u0010FJ\u001f\u0010I\u001a\u00020\u00142\u0006\u0010G\u001a\u00020\u00192\u0006\u0010H\u001a\u000209H\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00142\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\u0014H\u0002¢\u0006\u0004\bM\u0010\u0016J\u0017\u0010O\u001a\u00020\u00192\u0006\u0010N\u001a\u00020\u0019H\u0002¢\u0006\u0004\bO\u0010PJ\u001f\u0010R\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00192\u0006\u0010Q\u001a\u00020\u0019H\u0002¢\u0006\u0004\bR\u0010SJ/\u0010W\u001a\u00020\u00192\u0006\u0010T\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u00192\u0006\u0010U\u001a\u00020\u00192\u0006\u0010V\u001a\u00020\u0019H\u0002¢\u0006\u0004\bW\u0010XJ\u0017\u0010Y\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u0019H\u0002¢\u0006\u0004\bY\u0010PJ\u0017\u0010Z\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u0019H\u0002¢\u0006\u0004\bZ\u0010PJ\u001f\u0010\\\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00192\u0006\u0010[\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\\\u0010SJ\u000f\u0010]\u001a\u00020\u0014H\u0002¢\u0006\u0004\b]\u0010\u0016J'\u0010a\u001a\u00020\u00142\u0006\u0010^\u001a\u00020\u00192\u0006\u0010_\u001a\u00020\u00192\u0006\u0010`\u001a\u00020\u0019H\u0002¢\u0006\u0004\ba\u0010bJ\u001f\u0010d\u001a\u00020\u00142\u0006\u0010,\u001a\u00020\u00192\u0006\u0010c\u001a\u00020\u0019H\u0002¢\u0006\u0004\bd\u0010SJ/\u0010h\u001a\u00060ej\u0002`f2\u0006\u0010,\u001a\u00020\u00192\u0006\u0010U\u001a\u00020\u00192\n\u0010g\u001a\u00060ej\u0002`fH\u0002¢\u0006\u0004\bh\u0010iJ\u001b\u0010k\u001a\u00020\u0019*\u00020j2\u0006\u0010,\u001a\u00020\u0019H\u0002¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020\u0014H\u0002¢\u0006\u0004\bm\u0010\u0016J\u000f\u0010n\u001a\u00020\u0014H\u0002¢\u0006\u0004\bn\u0010\u0016J\u0017\u0010q\u001a\u00020\u00142\u0006\u0010p\u001a\u00020oH\u0002¢\u0006\u0004\bq\u0010rJ%\u0010u\u001a\u0010\u0012\u0004\u0012\u00020t\u0012\u0004\u0012\u00020\u0014\u0018\u00010s2\u0006\u0010p\u001a\u00020oH\u0002¢\u0006\u0004\bu\u0010vJ9\u0010|\u001a\u00020\u00142\u000e\u0010x\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0w2\u0006\u0010y\u001a\u00020)2\b\u0010z\u001a\u0004\u0018\u00010\u001d2\u0006\u0010{\u001a\u000209H\u0002¢\u0006\u0004\b|\u0010}J1\u0010\u0082\u0001\u001a\u00020\u00142\u001d\u0010\u0081\u0001\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0080\u00010\u007f0~H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001Jp\u0010\u008b\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010\u0084\u00012\f\b\u0002\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u00012\f\b\u0002\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0085\u00012\n\b\u0002\u0010N\u001a\u0004\u0018\u00010\u00192\u001d\b\u0002\u0010\u0088\u0001\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020o\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u007f0~2\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0089\u0001H\u0002¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0019\u0010\u008e\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010~H\u0002¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J,\u0010\u0091\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010~2\u0006\u0010,\u001a\u00020\u00192\t\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J9\u0010\u0095\u0001\u001a\u00020\u00142\u0014\u0010\u0094\u0001\u001a\u000f\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020\u001d0\u0093\u00012\u000f\u0010x\u001a\u000b\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0089\u0001H\u0002¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J \u0010\u0097\u0001\u001a\u0004\u0018\u00010\u001d*\u00020j2\u0006\u0010N\u001a\u00020\u0019H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0011\u0010\u0099\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u0099\u0001\u0010\u0016J\u001b\u0010\u009b\u0001\u001a\u00020\u00142\u0007\u0010\u009a\u0001\u001a\u00020&H\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0011\u0010\u009d\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b\u009d\u0001\u0010\u0016J\u001a\u0010\u009f\u0001\u001a\u00020\u00142\u0007\u0010\u009e\u0001\u001a\u00020\u0019H\u0002¢\u0006\u0005\b\u009f\u0001\u0010\u001cJ\u0011\u0010 \u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b \u0001\u0010\u0016J\u0011\u0010¡\u0001\u001a\u00020\u0014H\u0002¢\u0006\u0005\b¡\u0001\u0010\u0016J\u0019\u0010¢\u0001\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0005\b¢\u0001\u0010\u001cJ\u0011\u0010£\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b£\u0001\u0010\u0016J#\u0010¤\u0001\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0005\b¤\u0001\u0010 J\u0011\u0010¥\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b¥\u0001\u0010\u0016J\u0011\u0010¦\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0005\b¦\u0001\u0010\u0016J\u0011\u0010§\u0001\u001a\u00020\u0014H\u0016¢\u0006\u0005\b§\u0001\u0010\u0016J\u0011\u0010¨\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0005\b¨\u0001\u0010\u0016J\u0011\u0010©\u0001\u001a\u00020\u0014H\u0000¢\u0006\u0005\b©\u0001\u0010\u0016J\u000f\u0010ª\u0001\u001a\u00020\u0014¢\u0006\u0005\bª\u0001\u0010\u0016J\u000f\u0010«\u0001\u001a\u00020\u0014¢\u0006\u0005\b«\u0001\u0010\u0016J\u0014\u0010¬\u0001\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u0014\u0010®\u0001\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0006\b®\u0001\u0010\u00ad\u0001J\u001c\u0010¯\u0001\u001a\u0002092\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001c\u0010±\u0001\u001a\u0002092\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0006\b±\u0001\u0010°\u0001J\u001b\u0010²\u0001\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0005\b²\u0001\u0010%J\u001b\u0010³\u0001\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0001¢\u0006\u0005\b³\u0001\u0010%J\u001f\u0010µ\u0001\u001a\u00020\u00142\u000b\u0010#\u001a\u0007\u0012\u0002\b\u00030´\u0001H\u0017¢\u0006\u0006\bµ\u0001\u0010¶\u0001J\u0011\u0010·\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b·\u0001\u0010\u0016J)\u0010º\u0001\u001a\u00020\u00142\u0015\u0010¹\u0001\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030´\u00010¸\u0001H\u0017¢\u0006\u0006\bº\u0001\u0010»\u0001J\u0011\u0010¼\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\b¼\u0001\u0010\u0016J(\u0010¿\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010½\u00012\r\u0010\u001a\u001a\t\u0012\u0004\u0012\u00028\u00000¾\u0001H\u0017¢\u0006\u0006\b¿\u0001\u0010À\u0001J%\u0010Â\u0001\u001a\u0002092\u0006\u0010p\u001a\u00020o2\t\u0010Á\u0001\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u0011\u0010Ä\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bÄ\u0001\u0010\u0016J$\u0010Ç\u0001\u001a\u0002092\u0007\u0010Å\u0001\u001a\u0002092\u0007\u0010Æ\u0001\u001a\u00020\u0019H\u0017¢\u0006\u0006\bÇ\u0001\u0010È\u0001J\u0011\u0010É\u0001\u001a\u00020\u0014H\u0017¢\u0006\u0005\bÉ\u0001\u0010\u0016J\u001a\u0010Ê\u0001\u001a\u00020\u00012\u0006\u0010\u001a\u001a\u00020\u0019H\u0017¢\u0006\u0006\bÊ\u0001\u0010Ë\u0001J\u0015\u0010Í\u0001\u001a\u0005\u0018\u00010Ì\u0001H\u0017¢\u0006\u0006\bÍ\u0001\u0010Î\u0001J1\u0010Ï\u0001\u001a\u00020\u00142\u001d\u0010\u0081\u0001\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0005\u0012\u00030\u0080\u0001\u0012\u0007\u0012\u0005\u0018\u00010\u0080\u00010\u007f0~H\u0017¢\u0006\u0006\bÏ\u0001\u0010\u0083\u0001J#\u0010Ð\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010~2\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0000¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u0017\u0010Ò\u0001\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010~¢\u0006\u0006\bÒ\u0001\u0010\u008f\u0001JC\u0010Õ\u0001\u001a\u00020\u00142\u0014\u0010\u0094\u0001\u001a\u000f\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020\u001d0\u0093\u00012\r\u0010x\u001a\t\u0012\u0004\u0012\u00020\u00140\u0089\u00012\n\u0010Ô\u0001\u001a\u0005\u0018\u00010Ó\u0001H\u0000¢\u0006\u0006\bÕ\u0001\u0010Ö\u0001J\"\u0010×\u0001\u001a\u00020\u00142\u000e\u0010\u008a\u0001\u001a\t\u0012\u0004\u0012\u00020\u00140\u0089\u0001H\u0000¢\u0006\u0006\b×\u0001\u0010Ø\u0001J4\u0010Ù\u0001\u001a\u0002092\u0014\u0010\u0094\u0001\u001a\u000f\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020\u001d0\u0093\u00012\n\u0010Ô\u0001\u001a\u0005\u0018\u00010Ó\u0001H\u0000¢\u0006\u0006\bÙ\u0001\u0010Ú\u0001J&\u0010Û\u0001\u001a\u00020\u00142\u0014\u0010\u0094\u0001\u001a\u000f\u0012\u0004\u0012\u00020o\u0012\u0004\u0012\u00020\u001d0\u0093\u0001¢\u0006\u0006\bÛ\u0001\u0010Ü\u0001J\u0014\u0010Ý\u0001\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0006\bÝ\u0001\u0010\u00ad\u0001J\u001b\u0010Þ\u0001\u001a\u00020\u00142\b\u0010#\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0005\bÞ\u0001\u0010%J\u001b\u0010à\u0001\u001a\u00020\u00142\u0007\u0010p\u001a\u00030ß\u0001H\u0016¢\u0006\u0006\bà\u0001\u0010á\u0001R\"\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bâ\u0001\u0010ã\u0001\u001a\u0006\bä\u0001\u0010å\u0001R\u0016\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÍ\u0001\u0010æ\u0001R\u0016\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¿\u0001\u0010ç\u0001R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010è\u0001R\u0018\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R\u0018\u0010\r\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010ê\u0001R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010ë\u0001R\u001e\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b§\u0001\u0010ì\u0001\u001a\u0006\bí\u0001\u0010î\u0001R \u0010ò\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010C0ï\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bð\u0001\u0010ñ\u0001R\u001b\u0010ô\u0001\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010ó\u0001R\u0019\u0010÷\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0001\u0010ö\u0001R\u0019\u0010ø\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010ö\u0001R\u0019\u0010ù\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010ö\u0001R\u0018\u0010ü\u0001\u001a\u00030ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010û\u0001R\u001c\u0010ÿ\u0001\u001a\u0005\u0018\u00010ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¼\u0001\u0010þ\u0001R\u001c\u0010\u0082\u0002\u001a\u0005\u0018\u00010\u0080\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0001\u0010\u0081\u0002R\u0019\u0010\u0084\u0002\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u0083\u0002R\u0019\u0010\u0085\u0002\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010\u0083\u0002R\u0019\u0010\u0086\u0002\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¢\u0001\u0010\u0083\u0002R\u001f\u0010\u0088\u0001\u001a\n\u0012\u0005\u0012\u00030\u0088\u00020\u0087\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010\u0089\u0002R\u0018\u0010\u008b\u0002\u001a\u00030ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0002\u0010û\u0001R\u0019\u0010\u008e\u0002\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0002\u0010\u008d\u0002R\"\u0010\u0092\u0002\u001a\u000b\u0012\u0004\u0012\u00020)\u0018\u00010\u008f\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u0091\u0002R\u0019\u0010\u0094\u0002\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0002\u0010\u0083\u0002R\u0018\u0010\u0096\u0002\u001a\u00030ú\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0002\u0010û\u0001R\u0018\u0010\u0097\u0002\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0018\u0010\u0083\u0002R\u0019\u0010\u0099\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0098\u0002\u0010ö\u0001R\u0019\u0010\u009b\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0002\u0010ö\u0001R\u0018\u0010\u009c\u0002\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bn\u0010ö\u0001R\u0019\u0010\u009d\u0002\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010\u0083\u0002R\u0018\u0010 \u0002\u001a\u00030\u009e\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010\u009f\u0002R\u001d\u0010¡\u0002\u001a\t\u0012\u0004\u0012\u00020o0ï\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b]\u0010ñ\u0001R)\u0010¤\u0002\u001a\u0002092\u0006\u0010#\u001a\u0002098\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bÕ\u0001\u0010\u0083\u0002\u001a\u0006\b¢\u0002\u0010£\u0002R(\u0010¦\u0002\u001a\u0002092\u0006\u0010#\u001a\u0002098\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\bh\u0010\u0083\u0002\u001a\u0006\b¥\u0002\u0010£\u0002R(\u0010¬\u0002\u001a\u00020j8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b7\u0010§\u0002\u001a\u0006\b¨\u0002\u0010©\u0002\"\u0006\bª\u0002\u0010«\u0002R(\u0010±\u0002\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b*\u0010ç\u0001\u001a\u0006\b\u00ad\u0002\u0010®\u0002\"\u0006\b¯\u0002\u0010°\u0002R\u0019\u0010´\u0002\u001a\u00030²\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b-\u0010³\u0002R\u0019\u0010µ\u0002\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u0083\u0002R\u001b\u0010¶\u0002\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010\u008d\u0002R+\u0010»\u0002\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¨\u0001\u0010ê\u0001\u001a\u0006\b·\u0002\u0010¸\u0002\"\u0006\b¹\u0002\u0010º\u0002R\u0018\u0010¾\u0002\u001a\u00030¼\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010½\u0002R\u0019\u0010Á\u0002\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¿\u0002\u0010À\u0002R\u0019\u0010Ä\u0002\u001a\u00030Â\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bd\u0010Ã\u0002R!\u0010É\u0002\u001a\u0005\u0018\u00010Å\u00028@X\u0080\u0004¢\u0006\u000f\n\u0005\bK\u0010Æ\u0002\u001a\u0006\bÇ\u0002\u0010È\u0002R\u001f\u0010Í\u0002\u001a\u00030Ê\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b!\u0010Ë\u0002\u001a\u0006\bé\u0001\u0010Ì\u0002R/\u0010H\u001a\u0002092\u0006\u0010#\u001a\u0002098\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0006\b¥\u0001\u0010\u0083\u0002\u0012\u0005\bÏ\u0002\u0010\u0016\u001a\u0006\bÎ\u0002\u0010£\u0002R8\u0010Ô\u0002\u001a\u00060ej\u0002`f2\n\u0010#\u001a\u00060ej\u0002`f8\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0006\b«\u0001\u0010Ð\u0002\u0012\u0005\bÓ\u0002\u0010\u0016\u001a\u0006\bÑ\u0002\u0010Ò\u0002R\u001b\u0010×\u0002\u001a\u0005\u0018\u00010Õ\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0017\u0010Ö\u0002R\u0017\u0010Ù\u0002\u001a\u0002098@X\u0080\u0004¢\u0006\b\u001a\u0006\bØ\u0002\u0010£\u0002R\u001e\u0010Û\u0002\u001a\u0002098VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÚ\u0002\u0010\u0016\u001a\u0006\bâ\u0001\u0010£\u0002R\u0018\u0010Ý\u0002\u001a\u00030Õ\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\bõ\u0001\u0010Ü\u0002R\u0019\u0010à\u0002\u001a\u0004\u0018\u00010o8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÞ\u0002\u0010ß\u0002R\u001a\u0010â\u0002\u001a\u0005\u0018\u00010ß\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bð\u0001\u0010á\u0002¨\u0006ã\u0002"}, d2 = {"Landroidx/compose/runtime/kowloon;", "Landroidx/compose/runtime/taiyuan;", "Landroidx/compose/runtime/wireman;", "applier", "Landroidx/compose/runtime/graveside;", "parentContext", "Landroidx/compose/runtime/cosy;", "slotTable", "", "Landroidx/compose/runtime/basify;", "abandonSet", "Ladultoid/attabal;", "changes", "lateChanges", "Landroidx/compose/runtime/yemenite;", "observerHolder", "Landroidx/compose/runtime/gintrap;", "composition", "<init>", "(Landroidx/compose/runtime/wireman;Landroidx/compose/runtime/graveside;Landroidx/compose/runtime/cosy;Ljava/util/Set;Ladultoid/attabal;Ladultoid/attabal;Landroidx/compose/runtime/yemenite;Landroidx/compose/runtime/gintrap;)V", "", "demilitarize", "()V", "overspeculate", "cuirassed", "", X3.i.W, "fastrack", "(I)V", "", "dataKey", "cosy", "(ILjava/lang/Object;)V", "peridotite", "basify", "value", "liable", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/saneness;", "homozygous", "()Landroidx/compose/runtime/saneness;", "Landroidx/compose/runtime/palmyra;", "polder", "()Landroidx/compose/runtime/palmyra;", "group", "seminary", "(I)Landroidx/compose/runtime/palmyra;", "parentScope", "currentProviders", "tailoring", "(Landroidx/compose/runtime/palmyra;Landroidx/compose/runtime/palmyra;)Landroidx/compose/runtime/palmyra;", "providers", "mastfed", "(Landroidx/compose/runtime/palmyra;)V", "clubfoot", "merc", "milliradian", "", "isNode", "data", "tarboosh", "(ZLjava/lang/Object;)V", "objectKey", "Landroidx/compose/runtime/mathsort;", "kind", "microchemistry", "(ILjava/lang/Object;ILjava/lang/Object;)V", "Landroidx/compose/runtime/picketboat;", "newPending", "dent", "(ZLandroidx/compose/runtime/picketboat;)V", "expectedNodeCount", "inserting", "cultivated", "(IZ)V", "walach", "(Z)V", "dhss", "index", "igbo", "(I)I", "newCount", "decarock", "(II)V", "groupLocation", "recomposeGroup", "recomposeIndex", "achondroplasia", "(IIII)I", "hardpan", "twybill", "count", "libya", "kattegat", "oldGroup", "newGroup", "commonRoot", "attendance", "(III)V", "nearestCommonRoot", "hydrovane", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "recomposeKey", "restrictive", "(IIJ)J", "Landroidx/compose/runtime/fastrack;", "czestochowa", "(Landroidx/compose/runtime/fastrack;I)I", "tectonization", "oilcan", "Landroidx/compose/runtime/technofreak;", "scope", "permissivist", "(Landroidx/compose/runtime/technofreak;)V", "Lkotlin/Function1;", "Landroidx/compose/runtime/molybdenite;", "premeiotic", "(Landroidx/compose/runtime/technofreak;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/itchy;", "content", "locals", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "force", "gusty", "(Landroidx/compose/runtime/itchy;Landroidx/compose/runtime/palmyra;Ljava/lang/Object;Z)V", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/nosophobia;", "references", "sensatory", "(Ljava/util/List;)V", "R", "Landroidx/compose/runtime/supplicat;", "from", "to", "invalidations", "Lkotlin/Function0;", "block", "technofreak", "(Landroidx/compose/runtime/supplicat;Landroidx/compose/runtime/supplicat;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Loilcan/dern;", "grimness", "()Ljava/util/List;", "dataOffset", "prefect", "(ILjava/lang/Integer;)Ljava/util/List;", "Landroidx/compose/runtime/collection/beachfront;", "invalidationsRequested", "creditor", "(Landroidx/collection/grimness;Lkotlin/jvm/functions/Function2;)V", "julian", "(Landroidx/compose/runtime/fastrack;I)Ljava/lang/Object;", "miliaria", "anchor", "setterwort", "(Landroidx/compose/runtime/saneness;)V", "vesuvio", "groupBeingRemoved", "lampshade", "timberyard", "sealless", "graveside", "polloi", "pruinose", "mathsort", "yemenite", "taiyuan", "privatdozent", "saran", "cig", "splinterproof", "lightstruck", "()Ljava/lang/Object;", "monroe", "molybdenite", "(Ljava/lang/Object;)Z", "impassible", "vir", "linendraper", "Landroidx/compose/runtime/claque;", "triweekly", "(Landroidx/compose/runtime/claque;)V", "impromptu", "", "values", "adultoid", "([Landroidx/compose/runtime/claque;)V", "arytenoidectomy", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/preprohormone;", "wireman", "(Landroidx/compose/runtime/preprohormone;)Ljava/lang/Object;", C3700q2.p, "sultanate", "(Landroidx/compose/runtime/technofreak;Ljava/lang/Object;)Z", "immediately", "parametersChanged", "flags", "marial", "(ZI)Z", "kowloon", "attabal", "(I)Landroidx/compose/runtime/taiyuan;", "Landroidx/compose/runtime/licking;", "dern", "()Landroidx/compose/runtime/licking;", "wostteth", "licking", "(Ljava/lang/Object;)Ljava/util/List;", "unconsolidated", "Landroidx/compose/runtime/microchemistry;", "shouldPause", "supplicat", "(Landroidx/collection/grimness;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/microchemistry;)V", "claque", "(Lkotlin/jvm/functions/Function0;)V", "herdbook", "(Landroidx/collection/grimness;Landroidx/compose/runtime/microchemistry;)Z", "stupefactive", "(Landroidx/collection/grimness;)V", "apical", "competently", "Landroidx/compose/runtime/hardpan;", "monoploid", "(Landroidx/compose/runtime/hardpan;)V", "saneness", "Landroidx/compose/runtime/wireman;", "treadless", "()Landroidx/compose/runtime/wireman;", "Landroidx/compose/runtime/graveside;", "Landroidx/compose/runtime/cosy;", "Ljava/util/Set;", "beachfront", "Ladultoid/attabal;", "Landroidx/compose/runtime/yemenite;", "Landroidx/compose/runtime/gintrap;", "lerp", "()Landroidx/compose/runtime/gintrap;", "Landroidx/compose/runtime/rajahship;", "cutely", "Ljava/util/ArrayList;", "pendingStack", "Landroidx/compose/runtime/picketboat;", "pending", "formularize", "I", "nodeIndex", "groupNodeCount", "rGroupIndex", "Landroidx/compose/runtime/overspeculate;", "Landroidx/compose/runtime/overspeculate;", "parentStateStack", "", "[I", "nodeCountOverrides", "Landroidx/collection/trm;", "Landroidx/collection/trm;", "nodeCountVirtualOverrides", "Z", "forceRecomposeScopes", "forciblyRecompose", "nodeExpected", "", "Landroidx/compose/runtime/clubfoot;", "Ljava/util/List;", "dovishness", "entersStack", "gintrap", "Landroidx/compose/runtime/palmyra;", "rootProvider", "Landroidx/collection/yemenite;", "rotuma", "Landroidx/collection/yemenite;", "providerUpdates", "preprohormone", "providersInvalid", "cord", "providersInvalidStack", "reusing", "stratoscope", "reusingGroup", "trm", "childrenComposing", "compositionToken", "sourceMarkersEnabled", "androidx/compose/runtime/kowloon$dern", "Landroidx/compose/runtime/kowloon$dern;", "derivedStateObserver", "invalidateStack", "palmyra", "()Z", "isComposing", "isDisposed$runtime", "isDisposed", "Landroidx/compose/runtime/fastrack;", "coi", "()Landroidx/compose/runtime/fastrack;", "setReader$runtime", "(Landroidx/compose/runtime/fastrack;)V", "reader", "getInsertTable$runtime", "()Landroidx/compose/runtime/cosy;", "setInsertTable$runtime", "(Landroidx/compose/runtime/cosy;)V", "insertTable", "Landroidx/compose/runtime/cig;", "Landroidx/compose/runtime/cig;", "writer", "writerHasAProvider", "providerCache", "lotta", "()Ladultoid/attabal;", "setDeferredChanges$runtime", "(Ladultoid/attabal;)V", "deferredChanges", "Ladultoid/saneness;", "Ladultoid/saneness;", "changeListWriter", "starveling", "Landroidx/compose/runtime/saneness;", "insertAnchor", "Ladultoid/dern;", "Ladultoid/dern;", "insertFixups", "Loilcan/impromptu;", "Loilcan/impromptu;", "sayid", "()Loilcan/impromptu;", "errorContext", "Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "applyCoroutineContext", "empress", "getInserting$annotations", "J", "coffeecake", "()J", "getCompositeKeyHashCode$annotations", "compositeKeyHashCode", "Loilcan/marial;", "Loilcan/marial;", "_compositionData", "itchy", "areChildrenComposing", "getSkipping$annotations", "skipping", "()Loilcan/marial;", "compositionData", "nosophobia", "()Landroidx/compose/runtime/technofreak;", "currentRecomposeScope", "()Landroidx/compose/runtime/hardpan;", "recomposeScope", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class kowloon implements taiyuan {

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public picketboat pending;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public int[] nodeCountOverrides;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public adultoid.attabal changes;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public adultoid.attabal lateChanges;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name and from kotlin metadata */
    public final adultoid.saneness changeListWriter;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public boolean reusing;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final graveside parentContext;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public int nodeIndex;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public boolean nodeExpected;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name and from kotlin metadata */
    public boolean writerHasAProvider;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name and from kotlin metadata */
    public adultoid.dern insertFixups;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public int groupNodeCount;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public final yemenite observerHolder;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    public final ArrayList invalidateStack;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public final Set<basify> abandonSet;

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name and from kotlin metadata */
    public boolean inserting;

    /* JADX INFO: renamed from: merc, reason: collision with root package name and from kotlin metadata */
    public SlotReader reader;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public boolean forciblyRecompose;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.trm nodeCountVirtualOverrides;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public int compositionToken;

    /* JADX INFO: renamed from: overspeculate, reason: collision with root package name and from kotlin metadata */
    public oilcan.marial _compositionData;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name and from kotlin metadata */
    public final CoroutineContext applyCoroutineContext;

    /* JADX INFO: renamed from: polder, reason: collision with root package name and from kotlin metadata */
    public cosy insertTable;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public boolean forceRecomposeScopes;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public boolean providersInvalid;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name and from kotlin metadata */
    public adultoid.attabal deferredChanges;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name and from kotlin metadata */
    public boolean isDisposed;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.yemenite<palmyra> providerUpdates;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.wireman<?> applier;

    /* JADX INFO: renamed from: saran, reason: collision with root package name and from kotlin metadata */
    public palmyra providerCache;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public final dern derivedStateObserver;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name and from kotlin metadata */
    public SlotWriter writer;

    /* JADX INFO: renamed from: splinterproof, reason: collision with root package name and from kotlin metadata */
    public long compositeKeyHashCode;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.runtime.saneness insertAnchor;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
    public boolean isComposing;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public final gintrap composition;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public int rGroupIndex;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public int childrenComposing;

    /* JADX INFO: renamed from: walach, reason: collision with root package name and from kotlin metadata */
    public final oilcan.impromptu errorContext;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public final cosy slotTable;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public boolean sourceMarkersEnabled;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final ArrayList pendingStack = rajahship.dern(null, 1, null);

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final overspeculate parentStateStack = new overspeculate();

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public final List<clubfoot> invalidations = new ArrayList();

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public final overspeculate entersStack = new overspeculate();

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public palmyra rootProvider = cuirassed.taiyuan.attabal();

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final overspeculate providersInvalidStack = new overspeculate();

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public int reusingGroup = -1;

    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001R\u001b\u0010\u0004\u001a\u00060\u0002R\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/kowloon$attabal;", "Landroidx/compose/runtime/prefect;", "Landroidx/compose/runtime/kowloon$saneness;", "Landroidx/compose/runtime/kowloon;", "ref", "Landroidx/compose/runtime/kowloon$saneness;", "attabal", "()Landroidx/compose/runtime/kowloon$saneness;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class attabal implements prefect {
        public final saneness attabal() {
            throw null;
        }
    }

    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/runtime/kowloon$dern", "Landroidx/compose/runtime/seminary;", "Landroidx/compose/runtime/polder;", "derivedState", "", "saneness", "(Landroidx/compose/runtime/polder;)V", "attabal", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class dern implements seminary {
        public dern() {
        }

        @Override // androidx.compose.runtime.seminary
        public void attabal(polder<?> derivedState) {
            kowloon.this.childrenComposing--;
        }

        @Override // androidx.compose.runtime.seminary
        public void saneness(polder<?> derivedState) {
            kowloon.this.childrenComposing++;
        }
    }

    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/kowloon$saneness;", "Landroidx/compose/runtime/graveside;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class saneness extends graveside {
    }

    /* JADX INFO: compiled from: Composer.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class wireman implements Function2<taiyuan, Integer, Unit> {

        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public final /* synthetic */ Object f6053arytenoidectomy;

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ itchy<Object> f6054kowloon;

        public wireman(itchy<Object> itchyVar, Object obj) {
            this.f6054kowloon = itchyVar;
            this.f6053arytenoidectomy = obj;
        }

        public final void attabal(taiyuan taiyuanVar, int i) {
            if (!taiyuanVar.marial((i & 3) != 2, i & 1)) {
                taiyuanVar.kowloon();
                return;
            }
            if (polloi.grimness()) {
                polloi.mathsort(316014703, i, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:3477)");
            }
            this.f6054kowloon.attabal().invoke(this.f6053arytenoidectomy, taiyuanVar, 0);
            if (polloi.grimness()) {
                polloi.peridotite();
            }
        }

        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(taiyuan taiyuanVar, Integer num) {
            attabal(taiyuanVar, num.intValue());
            return Unit.f29295attabal;
        }
    }

    public kowloon(androidx.compose.runtime.wireman<?> wiremanVar, graveside gravesideVar, cosy cosyVar, Set<basify> set, adultoid.attabal attabalVar, adultoid.attabal attabalVar2, yemenite yemeniteVar, gintrap gintrapVar) {
        this.applier = wiremanVar;
        this.parentContext = gravesideVar;
        this.slotTable = cosyVar;
        this.abandonSet = set;
        this.changes = attabalVar;
        this.lateChanges = attabalVar2;
        this.observerHolder = yemeniteVar;
        this.composition = gintrapVar;
        this.sourceMarkersEnabled = gravesideVar.beachfront() || gravesideVar.wireman();
        this.derivedStateObserver = new dern();
        this.invalidateStack = rajahship.dern(null, 1, null);
        SlotReader slotReaderDovishness = cosyVar.dovishness();
        slotReaderDovishness.wireman();
        this.reader = slotReaderDovishness;
        cosy cosyVar2 = new cosy();
        if (gravesideVar.beachfront()) {
            cosyVar2.impromptu();
        }
        if (gravesideVar.wireman()) {
            cosyVar2.competently();
        }
        this.insertTable = cosyVar2;
        SlotWriter slotWriterGintrap = cosyVar2.gintrap();
        slotWriterGintrap.restrictive(true);
        this.writer = slotWriterGintrap;
        this.changeListWriter = new adultoid.saneness(this, this.changes);
        SlotReader slotReaderDovishness2 = this.insertTable.dovishness();
        try {
            androidx.compose.runtime.saneness sanenessVarAttabal = slotReaderDovishness2.attabal(0);
            slotReaderDovishness2.wireman();
            this.insertAnchor = sanenessVarAttabal;
            this.insertFixups = new adultoid.dern();
            this.errorContext = new oilcan.impromptu(this);
            CoroutineContext effectCoroutineContext = gravesideVar.getEffectCoroutineContext();
            CoroutineContext coroutineContextSayid = sayid();
            this.applyCoroutineContext = effectCoroutineContext.plus(coroutineContextSayid == null ? EmptyCoroutineContext.INSTANCE : coroutineContextSayid);
        } catch (Throwable th) {
            slotReaderDovishness2.wireman();
            throw th;
        }
    }

    public static final nosophobia deadwork(kowloon kowloonVar, int i) {
        int iTrm = kowloonVar.reader.trm(i);
        Object objOilcan = kowloonVar.reader.oilcan(i);
        ArrayList arrayList = null;
        if (iTrm != 126665345 || !(objOilcan instanceof itchy)) {
            return null;
        }
        if (kowloonVar.reader.marial(i)) {
            ArrayList arrayList2 = new ArrayList();
            molet(kowloonVar, arrayList2, i);
            if (!arrayList2.isEmpty()) {
                arrayList = arrayList2;
            }
        }
        return libyan(kowloonVar, i, arrayList);
    }

    public static final nosophobia libyan(kowloon kowloonVar, int i, List<nosophobia> list) {
        Object objOilcan = kowloonVar.reader.oilcan(i);
        Intrinsics.competently(objOilcan, "null cannot be cast to non-null type androidx.compose.runtime.MovableContent<kotlin.Any?>");
        itchy itchyVar = (itchy) objOilcan;
        Object objStratoscope = kowloonVar.reader.stratoscope(i, 0);
        androidx.compose.runtime.saneness sanenessVarAttabal = kowloonVar.reader.attabal(i);
        int iYemenite = kowloonVar.reader.yemenite(i) + i;
        ArrayList arrayList = new ArrayList();
        List<clubfoot> list2 = kowloonVar.invalidations;
        for (int iPreprohormone = polloi.preprohormone(list2, i); iPreprohormone < list2.size(); iPreprohormone++) {
            clubfoot clubfootVar = list2.get(iPreprohormone);
            if (clubfootVar.getLocation() >= iYemenite) {
                break;
            }
            arrayList.add(patroclinal.formularize.attabal(clubfootVar.getScope(), clubfootVar.getCom.ironsource.mediationsdk.d.k java.lang.String()));
        }
        return new nosophobia(itchyVar, objStratoscope, kowloonVar.getComposition(), kowloonVar.slotTable, sanenessVarAttabal, arrayList, kowloonVar.seminary(i), list);
    }

    public static final void molet(kowloon kowloonVar, List<nosophobia> list, int i) {
        int iYemenite = kowloonVar.reader.yemenite(i) + i;
        int iYemenite2 = i + 1;
        while (iYemenite2 < iYemenite) {
            if (kowloonVar.reader.sealless(iYemenite2)) {
                nosophobia nosophobiaVarDeadwork = deadwork(kowloonVar, iYemenite2);
                if (nosophobiaVarDeadwork != null) {
                    list.add(nosophobiaVarDeadwork);
                }
            } else if (kowloonVar.reader.marial(iYemenite2)) {
                molet(kowloonVar, list, iYemenite2);
            }
            iYemenite2 += kowloonVar.reader.yemenite(iYemenite2);
        }
    }

    public static final boolean osteal(Object obj, Object obj2) {
        if (obj2 == obj) {
            return true;
        }
        tectonization tectonizationVar = obj2 instanceof tectonization ? (tectonization) obj2 : null;
        return (tectonizationVar != null ? tectonizationVar.getWrapped() : null) == obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object outmarry(kowloon kowloonVar, supplicat supplicatVar, supplicat supplicatVar2, Integer num, List list, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            supplicatVar = null;
        }
        if ((i & 2) != 0) {
            supplicatVar2 = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            list = p002kotlin.collections.adultoid.formularize();
        }
        return kowloonVar.technofreak(supplicatVar, supplicatVar2, num, list, function0);
    }

    public static final List picketboat(kowloon kowloonVar) {
        return kowloonVar.grimness();
    }

    public static final Unit preterite(kowloon kowloonVar, nosophobia nosophobiaVar) {
        kowloonVar.gusty(nosophobiaVar.dern(), nosophobiaVar.getLocals(), nosophobiaVar.getCom.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD java.lang.String(), true);
        return Unit.f29295attabal;
    }

    public static final int sakeen(kowloon kowloonVar, int i, int i2, boolean z, int i3) {
        SlotReader slotReader = kowloonVar.reader;
        if (!slotReader.sealless(i2)) {
            if (!slotReader.marial(i2)) {
                if (slotReader.merc(i2)) {
                    return 1;
                }
                return slotReader.saran(i2);
            }
            int iYemenite = slotReader.yemenite(i2) + i2;
            int iSakeen = 0;
            for (int iYemenite2 = i2 + 1; iYemenite2 < iYemenite; iYemenite2 += slotReader.yemenite(iYemenite2)) {
                boolean zMerc = slotReader.merc(iYemenite2);
                if (zMerc) {
                    kowloonVar.changeListWriter.impromptu();
                    kowloonVar.changeListWriter.gintrap(slotReader.seminary(iYemenite2));
                }
                iSakeen += sakeen(kowloonVar, i, iYemenite2, zMerc || z, zMerc ? 0 : i3 + iSakeen);
                if (zMerc) {
                    kowloonVar.changeListWriter.impromptu();
                    kowloonVar.changeListWriter.cuirassed();
                }
            }
            if (slotReader.merc(i2)) {
                return 1;
            }
            return iSakeen;
        }
        int iTrm = slotReader.trm(i2);
        Object objOilcan = slotReader.oilcan(i2);
        if (iTrm != 126665345 || !(objOilcan instanceof itchy)) {
            if (iTrm == 206 && Intrinsics.wireman(objOilcan, polloi.restrictive())) {
                slotReader.stratoscope(i2, 0);
                return slotReader.saran(i2);
            }
            if (slotReader.merc(i2)) {
                return 1;
            }
            return slotReader.saran(i2);
        }
        nosophobia nosophobiaVarDeadwork = deadwork(kowloonVar, i2);
        if (nosophobiaVarDeadwork != null) {
            kowloonVar.parentContext.saneness(nosophobiaVarDeadwork);
            kowloonVar.changeListWriter.seminary();
            kowloonVar.changeListWriter.grimness(kowloonVar.getComposition(), kowloonVar.parentContext, nosophobiaVarDeadwork);
        }
        if (!z || i2 == i) {
            return slotReader.saran(i2);
        }
        kowloonVar.changeListWriter.taiyuan(i3, i2);
        return 0;
    }

    public static final List starveling(kowloon kowloonVar) {
        return kowloonVar.grimness();
    }

    public static final Unit underbelly(kowloon kowloonVar, adultoid.attabal attabalVar, SlotReader slotReader, nosophobia nosophobiaVar) {
        adultoid.saneness sanenessVar = kowloonVar.changeListWriter;
        adultoid.attabal attabalVarKowloon = sanenessVar.getChangeList();
        try {
            sanenessVar.walach(attabalVar);
            SlotReader slotReader2 = kowloonVar.reader;
            int[] iArr = kowloonVar.nodeCountOverrides;
            androidx.collection.yemenite<palmyra> yemeniteVar = kowloonVar.providerUpdates;
            kowloonVar.nodeCountOverrides = null;
            kowloonVar.providerUpdates = null;
            try {
                kowloonVar.reader = slotReader;
                adultoid.saneness sanenessVar2 = kowloonVar.changeListWriter;
                boolean zArytenoidectomy = sanenessVar2.getImplicitRootStart();
                try {
                    sanenessVar2.peridotite(false);
                    kowloonVar.gusty(nosophobiaVar.dern(), nosophobiaVar.getLocals(), nosophobiaVar.getCom.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD java.lang.String(), true);
                    sanenessVar2.peridotite(zArytenoidectomy);
                    Unit unit = Unit.f29295attabal;
                    kowloonVar.reader = slotReader2;
                    kowloonVar.nodeCountOverrides = iArr;
                    kowloonVar.providerUpdates = yemeniteVar;
                    sanenessVar.walach(attabalVarKowloon);
                    return Unit.f29295attabal;
                } catch (Throwable th) {
                    sanenessVar2.peridotite(zArytenoidectomy);
                    throw th;
                }
            } catch (Throwable th2) {
                kowloonVar.reader = slotReader2;
                kowloonVar.nodeCountOverrides = iArr;
                kowloonVar.providerUpdates = yemeniteVar;
                throw th2;
            }
        } catch (Throwable th3) {
            sanenessVar.walach(attabalVarKowloon);
            throw th3;
        }
    }

    public final int achondroplasia(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int iCreditor = this.reader.creditor(group);
        while (iCreditor != recomposeGroup && !this.reader.merc(iCreditor)) {
            iCreditor = this.reader.creditor(iCreditor);
        }
        if (this.reader.merc(iCreditor)) {
            recomposeIndex = 0;
        }
        if (iCreditor == group) {
            return recomposeIndex;
        }
        int iTwybill = (twybill(iCreditor) - this.reader.saran(group)) + recomposeIndex;
        loop1: while (recomposeIndex < iTwybill && iCreditor != groupLocation) {
            iCreditor++;
            while (iCreditor < groupLocation) {
                int iYemenite = this.reader.yemenite(iCreditor) + iCreditor;
                if (groupLocation >= iYemenite) {
                    recomposeIndex += this.reader.merc(iCreditor) ? 1 : twybill(iCreditor);
                    iCreditor = iYemenite;
                }
            }
            break loop1;
        }
        return recomposeIndex;
    }

    @Override // androidx.compose.runtime.taiyuan
    public void adultoid(claque<?>[] values) {
        palmyra palmyraVarTailoring;
        palmyra palmyraVarPolder = polder();
        cosy(201, polloi.kattegat());
        boolean z = true;
        boolean z2 = false;
        if (getInserting()) {
            palmyraVarTailoring = tailoring(palmyraVarPolder, oilcan.wireman(values, palmyraVarPolder, null, 4, null));
            this.writerHasAProvider = true;
        } else {
            Object objCuirassed = this.reader.cuirassed(0);
            Intrinsics.competently(objCuirassed, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            palmyra palmyraVar = (palmyra) objCuirassed;
            Object objCuirassed2 = this.reader.cuirassed(1);
            Intrinsics.competently(objCuirassed2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            palmyra palmyraVar2 = (palmyra) objCuirassed2;
            palmyra palmyraVarDern = oilcan.dern(values, palmyraVarPolder, palmyraVar2);
            if (saneness() && !this.reusing && Intrinsics.wireman(palmyraVar2, palmyraVarDern)) {
                basify();
                palmyraVarTailoring = palmyraVar;
            } else {
                palmyraVarTailoring = tailoring(palmyraVarPolder, palmyraVarDern);
                if (!this.reusing && Intrinsics.wireman(palmyraVarTailoring, palmyraVar)) {
                    z = false;
                }
                z2 = z;
            }
        }
        if (z2 && !getInserting()) {
            mastfed(palmyraVarTailoring);
        }
        this.providersInvalidStack.competently(polloi.polloi(this.providersInvalid));
        this.providersInvalid = z2;
        this.providerCache = palmyraVarTailoring;
        microchemistry(202, polloi.trm(), mathsort.INSTANCE.attabal(), palmyraVarTailoring);
    }

    @Override // androidx.compose.runtime.taiyuan
    public Object apical() {
        return monroe();
    }

    @Override // androidx.compose.runtime.taiyuan
    public void arytenoidectomy() {
        peridotite();
        peridotite();
        this.providersInvalid = polloi.monoploid(this.providersInvalidStack.beachfront());
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.taiyuan
    public taiyuan attabal(int key) {
        graveside(key);
        oilcan();
        return this;
    }

    public final void attendance(int oldGroup, int newGroup, int commonRoot) {
        SlotReader slotReader = this.reader;
        int iPrivatdozent = polloi.privatdozent(slotReader, oldGroup, newGroup, commonRoot);
        while (oldGroup > 0 && oldGroup != iPrivatdozent) {
            if (slotReader.merc(oldGroup)) {
                this.changeListWriter.cuirassed();
            }
            oldGroup = slotReader.creditor(oldGroup);
        }
        hydrovane(newGroup, iPrivatdozent);
    }

    public final void basify() {
        this.groupNodeCount += this.reader.walach();
    }

    @Override // androidx.compose.runtime.taiyuan
    /* JADX INFO: renamed from: beachfront, reason: from getter */
    public CoroutineContext getApplyCoroutineContext() {
        return this.applyCoroutineContext;
    }

    public final void cig() {
        this.reusingGroup = 100;
        this.reusing = true;
    }

    public final void claque(Function0<Unit> block) {
        if (this.isComposing) {
            polloi.adultoid("Preparing a composition while composing is not supported");
        }
        this.isComposing = true;
        try {
            block.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    public final void clubfoot() {
        if (this.writer.getClosed()) {
            SlotWriter slotWriterGintrap = this.insertTable.gintrap();
            this.writer = slotWriterGintrap;
            slotWriterGintrap.microchemistry();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    /* JADX INFO: renamed from: coffeecake, reason: from getter */
    public long getCompositeKeyHashCode() {
        return this.compositeKeyHashCode;
    }

    /* JADX INFO: renamed from: coi, reason: from getter */
    public final SlotReader getReader() {
        return this.reader;
    }

    @Override // androidx.compose.runtime.taiyuan
    public void competently(Object value) {
        linendraper(value);
    }

    public final void cosy(int key, Object dataKey) {
        microchemistry(key, dataKey, mathsort.INSTANCE.attabal(), null);
    }

    public final void creditor(androidx.collection.grimness<Object, Object> invalidationsRequested, Function2<? super taiyuan, ? super Integer, Unit> content) {
        if (this.isComposing) {
            polloi.adultoid("Reentrant composition is not supported");
        }
        this.observerHolder.attabal();
        cuirassed.polloi polloiVar = cuirassed.polloi.f24276attabal;
        Object objAttabal = polloiVar.attabal("Compose:recompose");
        try {
            this.compositionToken = Long.hashCode(androidx.compose.runtime.snapshots.adultoid.grimness().getSnapshotId());
            this.providerUpdates = null;
            stupefactive(invalidationsRequested);
            this.nodeIndex = 0;
            this.isComposing = true;
            try {
                demilitarize();
                Object objLightstruck = lightstruck();
                if (objLightstruck != content && content != null) {
                    Function2<? super taiyuan, ? super Integer, Unit> function2 = content;
                    vir(content);
                }
                dern dernVar = this.derivedStateObserver;
                androidx.compose.runtime.collection.dern<seminary> dernVarAttabal = liable.attabal();
                try {
                    dernVarAttabal.saneness(dernVar);
                    if (content != null) {
                        cosy(200, polloi.oilcan());
                        cuirassed.marial.attabal(this, content);
                        peridotite();
                    } else if ((!this.forciblyRecompose && !this.providersInvalid) || objLightstruck == null || Intrinsics.wireman(objLightstruck, taiyuan.INSTANCE.attabal())) {
                        immediately();
                    } else {
                        cosy(200, polloi.oilcan());
                        cuirassed.marial.attabal(this, (Function2) p002kotlin.jvm.internal.rotuma.beachfront(objLightstruck, 2));
                        peridotite();
                    }
                    dernVarAttabal.molybdenite(dernVarAttabal.getSize() - 1);
                    overspeculate();
                    this.isComposing = false;
                    this.invalidations.clear();
                    merc();
                    Unit unit = Unit.f29295attabal;
                    polloiVar.saneness(objAttabal);
                } catch (Throwable th) {
                    dernVarAttabal.molybdenite(dernVarAttabal.getSize() - 1);
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    throw oilcan.wireman.saneness(th2, new Function0() { // from class: androidx.compose.runtime.formularize
                        @Override // p002kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return kowloon.starveling(this.f5950kowloon);
                        }
                    });
                } catch (Throwable th3) {
                    this.isComposing = false;
                    this.invalidations.clear();
                    cuirassed();
                    merc();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            cuirassed.polloi.f24276attabal.saneness(objAttabal);
            throw th4;
        }
    }

    public final void cuirassed() {
        sealless();
        rajahship.attabal(this.pendingStack);
        this.parentStateStack.attabal();
        this.entersStack.attabal();
        this.providersInvalidStack.attabal();
        this.providerUpdates = null;
        this.insertFixups.attabal();
        this.compositeKeyHashCode = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
        this.reusingGroup = -1;
        if (!this.reader.getClosed()) {
            this.reader.wireman();
        }
        if (this.writer.getClosed()) {
            return;
        }
        milliradian();
    }

    public final void cultivated(int expectedNodeCount, boolean inserting) {
        picketboat picketboatVar = (picketboat) rajahship.taiyuan(this.pendingStack);
        if (picketboatVar != null && !inserting) {
            picketboatVar.formularize(picketboatVar.getGroupIndex() + 1);
        }
        this.pending = picketboatVar;
        this.nodeIndex = this.parentStateStack.beachfront() + expectedNodeCount;
        this.rGroupIndex = this.parentStateStack.beachfront();
        this.groupNodeCount = this.parentStateStack.beachfront() + expectedNodeCount;
    }

    @Override // androidx.compose.runtime.taiyuan
    public hardpan cutely() {
        return nosophobia();
    }

    public final int czestochowa(SlotReader slotReader, int i) {
        Object objCord;
        if (!slotReader.kattegat(i)) {
            int iTrm = slotReader.trm(i);
            return (iTrm != 207 || (objCord = slotReader.cord(i)) == null || Intrinsics.wireman(objCord, taiyuan.INSTANCE.attabal())) ? iTrm : objCord.hashCode();
        }
        Object objOilcan = slotReader.oilcan(i);
        if (objOilcan == null) {
            return 0;
        }
        if (objOilcan instanceof Enum) {
            return ((Enum) objOilcan).ordinal();
        }
        if (objOilcan instanceof itchy) {
            return 126665345;
        }
        return objOilcan.hashCode();
    }

    public final void decarock(int group, int newCount) {
        int iTwybill = twybill(group);
        if (iTwybill != newCount) {
            int i = newCount - iTwybill;
            int iWireman = rajahship.wireman(this.pendingStack) - 1;
            while (group != -1) {
                int iTwybill2 = twybill(group) + i;
                libya(group, iTwybill2);
                for (int i2 = iWireman; -1 < i2; i2--) {
                    picketboat picketboatVar = (picketboat) rajahship.impromptu(this.pendingStack, i2);
                    if (picketboatVar != null && picketboatVar.triweekly(group, iTwybill2)) {
                        iWireman = i2 - 1;
                        break;
                    }
                }
                if (group < 0) {
                    group = this.reader.getParent();
                } else if (this.reader.merc(group)) {
                    return;
                } else {
                    group = this.reader.creditor(group);
                }
            }
        }
    }

    public final void demilitarize() {
        this.rGroupIndex = 0;
        this.reader = this.slotTable.dovishness();
        fastrack(100);
        this.parentContext.polloi();
        palmyra palmyraVarTaiyuan = this.parentContext.taiyuan();
        this.providersInvalidStack.competently(polloi.polloi(this.providersInvalid));
        this.providersInvalid = molybdenite(palmyraVarTaiyuan);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.marial();
        }
        if (!this.sourceMarkersEnabled) {
            this.sourceMarkersEnabled = this.parentContext.beachfront();
        }
        if (this.sourceMarkersEnabled) {
            preprohormone<oilcan.beachfront> preprohormoneVarDern = oilcan.cutely.dern();
            Intrinsics.competently(preprohormoneVarDern, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            palmyraVarTaiyuan = palmyraVarTaiyuan.dern(preprohormoneVarDern, new StaticValueHolder(sayid()));
        }
        this.rootProvider = palmyraVarTaiyuan;
        Set<oilcan.marial> set = (Set) oilcan.saneness(palmyraVarTaiyuan, oilcan.kowloon.dern());
        if (set != null) {
            set.add(formularize());
            this.parentContext.arytenoidectomy(set);
        }
        fastrack(Long.hashCode(this.parentContext.competently()));
    }

    public final void dent(boolean isNode, picketboat newPending) {
        rajahship.cutely(this.pendingStack, this.pending);
        this.pending = newPending;
        this.parentStateStack.competently(this.groupNodeCount);
        this.parentStateStack.competently(this.rGroupIndex);
        this.parentStateStack.competently(this.nodeIndex);
        if (isNode) {
            this.nodeIndex = 0;
        }
        this.groupNodeCount = 0;
        this.rGroupIndex = 0;
    }

    @Override // androidx.compose.runtime.taiyuan
    public licking dern() {
        androidx.compose.runtime.saneness sanenessVarAttabal;
        technofreak technofreakVar = null;
        technofreak technofreakVar2 = rajahship.beachfront(this.invalidateStack) ? (technofreak) rajahship.taiyuan(this.invalidateStack) : null;
        if (technofreakVar2 != null) {
            technofreakVar2.kattegat(false);
            Function1<molybdenite, Unit> function1Premeiotic = premeiotic(technofreakVar2);
            if (function1Premeiotic != null) {
                this.changeListWriter.marial(function1Premeiotic, getComposition());
            }
            if (technofreakVar2.arytenoidectomy()) {
                technofreakVar2.merc(false);
                this.changeListWriter.cutely(technofreakVar2);
                technofreakVar2.polder(false);
                if (technofreakVar2.kowloon()) {
                    technofreakVar2.restrictive(false);
                    this.reusing = false;
                }
            }
        }
        if (technofreakVar2 != null && !technofreakVar2.polloi() && (technofreakVar2.molybdenite() || this.forceRecomposeScopes)) {
            if (technofreakVar2.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    sanenessVarAttabal = slotWriter.stratoscope(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    sanenessVarAttabal = slotReader.attabal(slotReader.getParent());
                }
                technofreakVar2.trm(sanenessVarAttabal);
            }
            technofreakVar2.oilcan(false);
            technofreakVar = technofreakVar2;
        }
        walach(false);
        return technofreakVar;
    }

    public final void dhss() {
        boolean z = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int iYemenite = this.reader.yemenite(parent) + parent;
        int i = this.nodeIndex;
        long compositeKeyHashCode = getCompositeKeyHashCode();
        int i2 = this.groupNodeCount;
        int i3 = this.rGroupIndex;
        clubfoot clubfootVarCuirassed = polloi.cuirassed(this.invalidations, this.reader.getCurrent(), iYemenite);
        boolean z2 = false;
        int i4 = parent;
        while (clubfootVarCuirassed != null) {
            int location = clubfootVarCuirassed.getLocation();
            technofreak scope = clubfootVarCuirassed.getScope();
            polloi.hydrovane(this.invalidations, location);
            if (clubfootVarCuirassed.wireman()) {
                this.reader.starveling(location);
                int current = this.reader.getCurrent();
                attendance(i4, current, parent);
                this.nodeIndex = achondroplasia(location, current, parent, i);
                this.rGroupIndex = hardpan(current);
                this.compositeKeyHashCode = restrictive(this.reader.creditor(current), parent, compositeKeyHashCode);
                this.providerCache = null;
                scope.marial(this);
                this.providerCache = null;
                this.reader.hydrovane(parent);
                z2 = true;
                i4 = current;
            } else {
                rajahship.cutely(this.invalidateStack, scope);
                this.observerHolder.attabal();
                scope.cuirassed();
                rajahship.taiyuan(this.invalidateStack);
            }
            clubfootVarCuirassed = polloi.cuirassed(this.invalidations, this.reader.getCurrent(), iYemenite);
        }
        if (z2) {
            attendance(i4, parent, parent);
            this.reader.peridotite();
            int iTwybill = twybill(parent);
            this.nodeIndex = i + iTwybill;
            this.groupNodeCount = i2 + iTwybill;
            this.rGroupIndex = i3;
        } else {
            tectonization();
        }
        this.compositeKeyHashCode = compositeKeyHashCode;
        this.isComposing = z;
    }

    /* JADX INFO: renamed from: empress, reason: from getter */
    public boolean getInserting() {
        return this.inserting;
    }

    public final void fastrack(int key) {
        microchemistry(key, null, mathsort.INSTANCE.attabal(), null);
    }

    @Override // androidx.compose.runtime.taiyuan
    public oilcan.marial formularize() {
        oilcan.marial marialVar = this._compositionData;
        if (marialVar != null) {
            return marialVar;
        }
        dovishness dovishnessVar = new dovishness(getComposition());
        this._compositionData = dovishnessVar;
        return dovishnessVar;
    }

    @Override // androidx.compose.runtime.taiyuan
    public void graveside(int key) {
        if (this.pending != null) {
            microchemistry(key, null, mathsort.INSTANCE.attabal(), null);
            return;
        }
        miliaria();
        this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) key), 3) ^ ((long) this.rGroupIndex);
        this.rGroupIndex++;
        SlotReader slotReader = this.reader;
        if (getInserting()) {
            slotReader.dern();
            this.writer.libya(key, taiyuan.INSTANCE.attabal());
            dent(false, null);
            return;
        }
        if (slotReader.impassible() == key && !slotReader.polloi()) {
            slotReader.splinterproof();
            dent(false, null);
            return;
        }
        if (!slotReader.supplicat()) {
            int i = this.nodeIndex;
            int current = slotReader.getCurrent();
            vesuvio();
            this.changeListWriter.creditor(i, slotReader.walach());
            polloi.walach(this.invalidations, current, slotReader.getCurrent());
        }
        slotReader.dern();
        this.inserting = true;
        this.providerCache = null;
        clubfoot();
        SlotWriter slotWriter = this.writer;
        slotWriter.sealless();
        int currentGroup = slotWriter.getCurrentGroup();
        slotWriter.libya(key, taiyuan.INSTANCE.attabal());
        this.insertAnchor = slotWriter.stratoscope(currentGroup);
        dent(false, null);
    }

    public final List<ComposeStackTraceFrame> grimness() {
        if (!this.sourceMarkersEnabled) {
            return p002kotlin.collections.adultoid.formularize();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(oilcan.saneness.dern(this.writer, null, 0, null, 7, null));
        arrayList.addAll(oilcan.saneness.attabal(this.reader));
        arrayList.addAll(unconsolidated());
        return arrayList;
    }

    public final void gusty(itchy<Object> content, palmyra locals, Object parameter, boolean force) {
        pruinose(126665345, content);
        liable(parameter);
        long compositeKeyHashCode = getCompositeKeyHashCode();
        try {
            this.compositeKeyHashCode = 126665345;
            boolean z = false;
            if (getInserting()) {
                SlotWriter.picketboat(this.writer, 0, 1, null);
            }
            if (!getInserting() && !Intrinsics.wireman(this.reader.apical(), locals)) {
                z = true;
            }
            if (z) {
                mastfed(locals);
            }
            microchemistry(202, polloi.trm(), mathsort.INSTANCE.attabal(), locals);
            this.providerCache = null;
            if (!getInserting() || force) {
                boolean z2 = this.providersInvalid;
                this.providersInvalid = z;
                cuirassed.marial.attabal(this, cuirassed.wireman.saneness(316014703, true, new wireman(content, parameter)));
                this.providersInvalid = z2;
            } else {
                this.writerHasAProvider = true;
                SlotWriter slotWriter = this.writer;
                this.parentContext.formularize(new nosophobia(content, parameter, getComposition(), this.insertTable, slotWriter.stratoscope(slotWriter.outmarry(slotWriter.getParent())), p002kotlin.collections.adultoid.formularize(), polder(), null));
            }
            peridotite();
            this.providerCache = null;
            this.compositeKeyHashCode = compositeKeyHashCode;
            mathsort();
        } catch (Throwable th) {
            try {
                throw oilcan.wireman.saneness(th, new Function0() { // from class: androidx.compose.runtime.impassible
                    @Override // p002kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return kowloon.picketboat(this.f5993kowloon);
                    }
                });
            } catch (Throwable th2) {
                peridotite();
                this.providerCache = null;
                this.compositeKeyHashCode = compositeKeyHashCode;
                mathsort();
                throw th2;
            }
        }
    }

    public final int hardpan(int group) {
        int iCreditor = this.reader.creditor(group) + 1;
        int i = 0;
        while (iCreditor < group) {
            if (!this.reader.kattegat(iCreditor)) {
                i++;
            }
            iCreditor += this.reader.yemenite(iCreditor);
        }
        return i;
    }

    public final boolean herdbook(androidx.collection.grimness<Object, Object> invalidationsRequested, microchemistry shouldPause) {
        if (!this.changes.dern()) {
            polloi.adultoid("Expected applyChanges() to have been called");
        }
        if (androidx.compose.runtime.collection.beachfront.beachfront(invalidationsRequested) <= 0 && this.invalidations.isEmpty() && !this.forciblyRecompose) {
            return false;
        }
        creditor(invalidationsRequested, null);
        return this.changes.wireman();
    }

    public final androidx.compose.runtime.saneness homozygous() {
        int i;
        int i2;
        if (getInserting()) {
            if (!polloi.seminary(this.writer)) {
                return null;
            }
            int currentGroup = this.writer.getCurrentGroup() - 1;
            int iOutmarry = this.writer.outmarry(currentGroup);
            while (true) {
                int i3 = iOutmarry;
                i2 = currentGroup;
                currentGroup = i3;
                if (currentGroup == this.writer.getParent() || currentGroup < 0) {
                    break;
                }
                iOutmarry = this.writer.outmarry(currentGroup);
            }
            return this.writer.stratoscope(i2);
        }
        if (!polloi.polder(this.reader)) {
            return null;
        }
        int current = this.reader.getCurrent() - 1;
        int iCreditor = this.reader.creditor(current);
        while (true) {
            int i4 = iCreditor;
            i = current;
            current = i4;
            if (current == this.reader.getParent() || current < 0) {
                break;
            }
            iCreditor = this.reader.creditor(current);
        }
        return this.reader.attabal(i);
    }

    public final void hydrovane(int group, int nearestCommonRoot) {
        if (group <= 0 || group == nearestCommonRoot) {
            return;
        }
        hydrovane(this.reader.creditor(group), nearestCommonRoot);
        if (this.reader.merc(group)) {
            this.changeListWriter.gintrap(julian(this.reader, group));
        }
    }

    public final int igbo(int index) {
        return (-2) - index;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008e  */
    /* JADX WARN: Code duplicated, block: B:30:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00e7  */
    public void immediately() {
        long jRotateLeft;
        long j;
        if (this.invalidations.isEmpty()) {
            basify();
            return;
        }
        SlotReader slotReader = this.reader;
        int iImpassible = slotReader.impassible();
        Object objTriweekly = slotReader.triweekly();
        Object objApical = slotReader.apical();
        int i = this.rGroupIndex;
        if (objTriweekly == null) {
            if (objApical == null || iImpassible != 207 || Intrinsics.wireman(objApical, taiyuan.INSTANCE.attabal())) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) iImpassible), 3);
                j = i;
            } else {
                this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) objApical.hashCode()), 3) ^ ((long) i);
            }
            tarboosh(slotReader.restrictive(), null);
            dhss();
            slotReader.competently();
            if (objTriweekly != null) {
                if (objTriweekly instanceof Enum) {
                    this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) ((Enum) objTriweekly).ordinal()), 3);
                } else {
                    this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) objTriweekly.hashCode()), 3);
                }
            }
            if (objApical == null && iImpassible == 207 && !Intrinsics.wireman(objApical, taiyuan.INSTANCE.attabal())) {
                this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) i), 3) ^ ((long) objApical.hashCode()), 3);
                return;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(((long) iImpassible) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) i), 3), 3);
            }
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) (objTriweekly instanceof Enum ? ((Enum) objTriweekly).ordinal() : objTriweekly.hashCode())), 3);
        j = 0;
        this.compositeKeyHashCode = jRotateLeft ^ j;
        tarboosh(slotReader.restrictive(), null);
        dhss();
        slotReader.competently();
        if (objTriweekly != null) {
            if (objApical == null) {
            }
            this.compositeKeyHashCode = Long.rotateRight(((long) iImpassible) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) i), 3), 3);
        } else if (objTriweekly instanceof Enum) {
            this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) ((Enum) objTriweekly).ordinal()), 3);
        } else {
            this.compositeKeyHashCode = Long.rotateRight(Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3) ^ ((long) objTriweekly.hashCode()), 3);
        }
    }

    @Override // androidx.compose.runtime.taiyuan
    public boolean impassible(Object value) {
        if (lightstruck() == value) {
            return false;
        }
        vir(value);
        return true;
    }

    @Override // androidx.compose.runtime.taiyuan
    public void impromptu() {
        peridotite();
        peridotite();
        this.providersInvalid = polloi.monoploid(this.providersInvalidStack.beachfront());
        this.providerCache = null;
    }

    public final boolean itchy() {
        return this.childrenComposing > 0;
    }

    public final Object julian(SlotReader slotReader, int i) {
        return slotReader.seminary(i);
    }

    public final void kattegat() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    @Override // androidx.compose.runtime.taiyuan
    public void kowloon() {
        if (!(this.groupNodeCount == 0)) {
            polloi.adultoid("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (getInserting()) {
            return;
        }
        technofreak technofreakVarNosophobia = nosophobia();
        if (technofreakVarNosophobia != null) {
            technofreakVarNosophobia.stratoscope();
        }
        if (this.invalidations.isEmpty()) {
            tectonization();
        } else {
            dhss();
        }
    }

    public final void lampshade(int groupBeingRemoved) {
        boolean zMerc = this.reader.merc(groupBeingRemoved);
        if (zMerc) {
            this.changeListWriter.impromptu();
            this.changeListWriter.gintrap(this.reader.seminary(groupBeingRemoved));
        }
        sakeen(this, groupBeingRemoved, groupBeingRemoved, zMerc, 0);
        this.changeListWriter.impromptu();
        if (zMerc) {
            this.changeListWriter.cuirassed();
        }
    }

    /* JADX INFO: renamed from: lerp, reason: from getter */
    public gintrap getComposition() {
        return this.composition;
    }

    public final void liable(Object value) {
        lightstruck();
        vir(value);
    }

    public final void libya(int group, int count) {
        if (twybill(group) != count) {
            if (group < 0) {
                androidx.collection.trm trmVar = this.nodeCountVirtualOverrides;
                if (trmVar == null) {
                    trmVar = new androidx.collection.trm(0, 1, null);
                    this.nodeCountVirtualOverrides = trmVar;
                }
                trmVar.monoploid(group, count);
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                int[] iArr2 = new int[this.reader.getGroupsSize()];
                p002kotlin.collections.arytenoidectomy.graveside(iArr2, -1, 0, 0, 6, null);
                this.nodeCountOverrides = iArr2;
                iArr = iArr2;
            }
            iArr[group] = count;
        }
    }

    public final List<ComposeStackTraceFrame> licking(final Object value) {
        List<ComposeStackTraceFrame> listUnconsolidated;
        if (!this.sourceMarkersEnabled) {
            return p002kotlin.collections.adultoid.formularize();
        }
        ObjectLocation objectLocationWireman = oilcan.saneness.wireman(this.slotTable, new Function1() { // from class: androidx.compose.runtime.triweekly
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(kowloon.osteal(value, obj));
            }
        });
        return (objectLocationWireman == null || (listUnconsolidated = CollectionsKt.unconsolidated(prefect(objectLocationWireman.getGroup(), objectLocationWireman.getDataOffset()), unconsolidated())) == null) ? p002kotlin.collections.adultoid.formularize() : listUnconsolidated;
    }

    public final Object lightstruck() {
        if (getInserting()) {
            miliaria();
            return taiyuan.INSTANCE.attabal();
        }
        Object objPolder = this.reader.polder();
        return (!this.reusing || (objPolder instanceof prefect)) ? objPolder : taiyuan.INSTANCE.attabal();
    }

    public final void linendraper(Object value) {
        boolean z = value instanceof basify;
        Object obj = value;
        if (z) {
            tectonization tectonizationVar = new tectonization((basify) value, homozygous());
            if (getInserting()) {
                this.changeListWriter.saran(tectonizationVar);
            }
            this.abandonSet.add(value);
            obj = tectonizationVar;
        }
        vir(obj);
    }

    /* JADX INFO: renamed from: lotta, reason: from getter */
    public final adultoid.attabal getDeferredChanges() {
        return this.deferredChanges;
    }

    @Override // androidx.compose.runtime.taiyuan
    public boolean marial(boolean parametersChanged, int flags) {
        return ((flags & 1) == 0 && (getInserting() || this.reusing)) || parametersChanged || !saneness();
    }

    public final void mastfed(palmyra providers) {
        androidx.collection.yemenite<palmyra> yemeniteVar = this.providerUpdates;
        if (yemeniteVar == null) {
            yemeniteVar = new androidx.collection.yemenite<>(0, 1, null);
            this.providerUpdates = yemeniteVar;
        }
        yemeniteVar.molybdenite(this.reader.getCurrent(), providers);
    }

    public void mathsort() {
        peridotite();
    }

    public final void merc() {
        if (!this.writer.getClosed()) {
            polloi.adultoid("Check failed");
        }
        milliradian();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:22:0x007d  */
    /* JADX WARN: Code duplicated, block: B:23:0x007f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:28:0x0094  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:58:0x010b  */
    /* JADX WARN: Code duplicated, block: B:61:0x011e  */
    /* JADX WARN: Code duplicated, block: B:68:0x015e  */
    /* JADX WARN: Code duplicated, block: B:70:0x0177  */
    /* JADX WARN: Code duplicated, block: B:71:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x0185  */
    /* JADX WARN: Code duplicated, block: B:74:0x0189  */
    /* JADX WARN: Code duplicated, block: B:76:0x0193  */
    /* JADX WARN: Code duplicated, block: B:78:0x0197  */
    /* JADX WARN: Code duplicated, block: B:83:0x01ca  */
    public final void microchemistry(int key, Object objectKey, int kind, Object data) {
        long jRotateLeft;
        mathsort.Companion companion;
        boolean z;
        picketboat picketboatVar;
        boolean z2;
        picketboat picketboatVar2;
        int currentGroup;
        picketboat picketboatVar3;
        miliaria();
        int i = this.rGroupIndex;
        if (objectKey == null) {
            if (data == null || key != 207 || Intrinsics.wireman(data, taiyuan.INSTANCE.attabal())) {
                jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) key), 3) ^ ((long) i);
            } else {
                this.compositeKeyHashCode = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) data.hashCode()), 3) ^ ((long) i);
            }
            if (objectKey == null) {
                this.rGroupIndex++;
            }
            companion = mathsort.INSTANCE;
            if (kind != companion.attabal()) {
                z = true;
            } else {
                z = false;
            }
            picketboatVar = null;
            if (getInserting()) {
                this.reader.dern();
                currentGroup = this.writer.getCurrentGroup();
                if (z) {
                    this.writer.tailoring(key, taiyuan.INSTANCE.attabal());
                } else if (data != null) {
                    SlotWriter slotWriter = this.writer;
                    if (objectKey == null) {
                        objectKey = taiyuan.INSTANCE.attabal();
                    }
                    slotWriter.linendraper(key, objectKey, data);
                } else {
                    SlotWriter slotWriter2 = this.writer;
                    if (objectKey == null) {
                        objectKey = taiyuan.INSTANCE.attabal();
                    }
                    slotWriter2.libya(key, objectKey);
                }
                picketboatVar3 = this.pending;
                if (picketboatVar3 != null) {
                    permissivist permissivistVar = new permissivist(key, -1, igbo(currentGroup), -1, 0);
                    picketboatVar3.taiyuan(permissivistVar, this.nodeIndex - picketboatVar3.getStartIndex());
                    picketboatVar3.impromptu(permissivistVar);
                }
                dent(z, null);
                return;
            }
            if (kind != companion.saneness() && this.reusing) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (this.pending == null) {
                int iImpassible = this.reader.impassible();
                if (z2 && iImpassible == key && Intrinsics.wireman(objectKey, this.reader.triweekly())) {
                    tarboosh(z, data);
                } else {
                    this.pending = new picketboat(this.reader.impromptu(), this.nodeIndex);
                }
            }
            picketboatVar2 = this.pending;
            if (picketboatVar2 != null) {
                permissivist permissivistVarWireman = picketboatVar2.wireman(key, objectKey);
                if (!z2 || permissivistVarWireman == null) {
                    this.reader.dern();
                    this.inserting = true;
                    this.providerCache = null;
                    clubfoot();
                    this.writer.sealless();
                    int currentGroup2 = this.writer.getCurrentGroup();
                    if (z) {
                        this.writer.tailoring(key, taiyuan.INSTANCE.attabal());
                    } else if (data != null) {
                        SlotWriter slotWriter3 = this.writer;
                        if (objectKey == null) {
                            objectKey = taiyuan.INSTANCE.attabal();
                        }
                        slotWriter3.linendraper(key, objectKey, data);
                    } else {
                        SlotWriter slotWriter4 = this.writer;
                        if (objectKey == null) {
                            objectKey = taiyuan.INSTANCE.attabal();
                        }
                        slotWriter4.libya(key, objectKey);
                    }
                    this.insertAnchor = this.writer.stratoscope(currentGroup2);
                    permissivist permissivistVar2 = new permissivist(key, -1, igbo(currentGroup2), -1, 0);
                    picketboatVar2.taiyuan(permissivistVar2, this.nodeIndex - picketboatVar2.getStartIndex());
                    picketboatVar2.impromptu(permissivistVar2);
                    picketboatVar = new picketboat(new ArrayList(), z ? 0 : this.nodeIndex);
                } else {
                    picketboatVar2.impromptu(permissivistVarWireman);
                    int location = permissivistVarWireman.getLocation();
                    this.nodeIndex = picketboatVar2.competently(permissivistVarWireman) + picketboatVar2.getStartIndex();
                    int iImpassible2 = picketboatVar2.impassible(permissivistVarWireman);
                    int iAttabal = iImpassible2 - picketboatVar2.getGroupIndex();
                    picketboatVar2.apical(iImpassible2, picketboatVar2.getGroupIndex());
                    this.changeListWriter.preprohormone(location);
                    this.reader.starveling(location);
                    if (iAttabal > 0) {
                        this.changeListWriter.dovishness(iAttabal);
                    }
                    tarboosh(z, data);
                }
            }
            dent(z, picketboatVar);
        }
        jRotateLeft = Long.rotateLeft(Long.rotateLeft(getCompositeKeyHashCode(), 3) ^ ((long) (objectKey instanceof Enum ? ((Enum) objectKey).ordinal() : objectKey.hashCode())), 3) ^ ((long) 0);
        this.compositeKeyHashCode = jRotateLeft;
        if (objectKey == null) {
            this.rGroupIndex++;
        }
        companion = mathsort.INSTANCE;
        if (kind != companion.attabal()) {
            z = true;
        } else {
            z = false;
        }
        picketboatVar = null;
        if (getInserting()) {
            this.reader.dern();
            currentGroup = this.writer.getCurrentGroup();
            if (z) {
                this.writer.tailoring(key, taiyuan.INSTANCE.attabal());
            } else if (data != null) {
                SlotWriter slotWriter5 = this.writer;
                if (objectKey == null) {
                    objectKey = taiyuan.INSTANCE.attabal();
                }
                slotWriter5.linendraper(key, objectKey, data);
            } else {
                SlotWriter slotWriter6 = this.writer;
                if (objectKey == null) {
                    objectKey = taiyuan.INSTANCE.attabal();
                }
                slotWriter6.libya(key, objectKey);
            }
            picketboatVar3 = this.pending;
            if (picketboatVar3 != null) {
                permissivist permissivistVar3 = new permissivist(key, -1, igbo(currentGroup), -1, 0);
                picketboatVar3.taiyuan(permissivistVar3, this.nodeIndex - picketboatVar3.getStartIndex());
                picketboatVar3.impromptu(permissivistVar3);
            }
            dent(z, null);
            return;
        }
        if (kind != companion.saneness()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.pending == null) {
            int iImpassible3 = this.reader.impassible();
            if (z2) {
                this.pending = new picketboat(this.reader.impromptu(), this.nodeIndex);
            } else {
                this.pending = new picketboat(this.reader.impromptu(), this.nodeIndex);
            }
        }
        picketboatVar2 = this.pending;
        if (picketboatVar2 != null) {
            permissivist permissivistVarWireman2 = picketboatVar2.wireman(key, objectKey);
            if (z2) {
                this.reader.dern();
                this.inserting = true;
                this.providerCache = null;
                clubfoot();
                this.writer.sealless();
                int currentGroup3 = this.writer.getCurrentGroup();
                if (z) {
                    this.writer.tailoring(key, taiyuan.INSTANCE.attabal());
                } else if (data != null) {
                    SlotWriter slotWriter7 = this.writer;
                    if (objectKey == null) {
                        objectKey = taiyuan.INSTANCE.attabal();
                    }
                    slotWriter7.linendraper(key, objectKey, data);
                } else {
                    SlotWriter slotWriter8 = this.writer;
                    if (objectKey == null) {
                        objectKey = taiyuan.INSTANCE.attabal();
                    }
                    slotWriter8.libya(key, objectKey);
                }
                this.insertAnchor = this.writer.stratoscope(currentGroup3);
                permissivist permissivistVar4 = new permissivist(key, -1, igbo(currentGroup3), -1, 0);
                picketboatVar2.taiyuan(permissivistVar4, this.nodeIndex - picketboatVar2.getStartIndex());
                picketboatVar2.impromptu(permissivistVar4);
                picketboatVar = new picketboat(new ArrayList(), z ? 0 : this.nodeIndex);
            } else {
                this.reader.dern();
                this.inserting = true;
                this.providerCache = null;
                clubfoot();
                this.writer.sealless();
                int currentGroup4 = this.writer.getCurrentGroup();
                if (z) {
                    this.writer.tailoring(key, taiyuan.INSTANCE.attabal());
                } else if (data != null) {
                    SlotWriter slotWriter9 = this.writer;
                    if (objectKey == null) {
                        objectKey = taiyuan.INSTANCE.attabal();
                    }
                    slotWriter9.linendraper(key, objectKey, data);
                } else {
                    SlotWriter slotWriter10 = this.writer;
                    if (objectKey == null) {
                        objectKey = taiyuan.INSTANCE.attabal();
                    }
                    slotWriter10.libya(key, objectKey);
                }
                this.insertAnchor = this.writer.stratoscope(currentGroup4);
                permissivist permissivistVar5 = new permissivist(key, -1, igbo(currentGroup4), -1, 0);
                picketboatVar2.taiyuan(permissivistVar5, this.nodeIndex - picketboatVar2.getStartIndex());
                picketboatVar2.impromptu(permissivistVar5);
                picketboatVar = new picketboat(new ArrayList(), z ? 0 : this.nodeIndex);
            }
        }
        dent(z, picketboatVar);
    }

    public final void miliaria() {
        if (this.nodeExpected) {
            polloi.adultoid("A call to createNode(), emitNode() or useNode() expected");
        }
    }

    public final void milliradian() {
        cosy cosyVar = new cosy();
        if (this.sourceMarkersEnabled) {
            cosyVar.impromptu();
        }
        if (this.parentContext.wireman()) {
            cosyVar.competently();
        }
        this.insertTable = cosyVar;
        SlotWriter slotWriterGintrap = cosyVar.gintrap();
        slotWriterGintrap.restrictive(true);
        this.writer = slotWriterGintrap;
    }

    @Override // androidx.compose.runtime.taiyuan
    public boolean molybdenite(Object value) {
        if (Intrinsics.wireman(lightstruck(), value)) {
            return false;
        }
        vir(value);
        return true;
    }

    @Override // androidx.compose.runtime.taiyuan
    public void monoploid(hardpan scope) {
        technofreak technofreakVar = scope instanceof technofreak ? (technofreak) scope : null;
        if (technofreakVar != null) {
            technofreakVar.grimness(true);
        }
    }

    public final Object monroe() {
        if (getInserting()) {
            miliaria();
            return taiyuan.INSTANCE.attabal();
        }
        Object objPolder = this.reader.polder();
        if (!this.reusing || (objPolder instanceof prefect)) {
            return objPolder instanceof tectonization ? ((tectonization) objPolder).getWrapped() : objPolder;
        }
        return taiyuan.INSTANCE.attabal();
    }

    public final technofreak nosophobia() {
        ArrayList arrayList = this.invalidateStack;
        if (this.childrenComposing == 0 && rajahship.beachfront(arrayList)) {
            return (technofreak) rajahship.competently(arrayList);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    public final void oilcan() {
        technofreak technofreakVar;
        boolean z;
        if (getInserting()) {
            gintrap composition = getComposition();
            Intrinsics.competently(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            technofreak technofreakVar2 = new technofreak(composition);
            rajahship.cutely(this.invalidateStack, technofreakVar2);
            vir(technofreakVar2);
            permissivist(technofreakVar2);
            return;
        }
        clubfoot clubfootVarHydrovane = polloi.hydrovane(this.invalidations, this.reader.getParent());
        Object objPolder = this.reader.polder();
        if (Intrinsics.wireman(objPolder, taiyuan.INSTANCE.attabal())) {
            gintrap composition2 = getComposition();
            Intrinsics.competently(composition2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            technofreakVar = new technofreak(composition2);
            vir(technofreakVar);
        } else {
            Intrinsics.competently(objPolder, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            technofreakVar = (technofreak) objPolder;
        }
        if (clubfootVarHydrovane != null) {
            z = true;
        } else {
            boolean zApical = technofreakVar.apical();
            if (zApical) {
                technofreakVar.yemenite(false);
            }
            if (zApical) {
                z = true;
            } else {
                z = false;
            }
        }
        technofreakVar.kattegat(z);
        rajahship.cutely(this.invalidateStack, technofreakVar);
        permissivist(technofreakVar);
        if (technofreakVar.formularize()) {
            technofreakVar.sealless(false);
            technofreakVar.merc(true);
            this.changeListWriter.splinterproof(technofreakVar);
            if (this.reusing || !technofreakVar.monoploid()) {
                return;
            }
            this.reusing = true;
            technofreakVar.restrictive(true);
        }
    }

    public final void overspeculate() {
        peridotite();
        this.parentContext.dern();
        peridotite();
        this.changeListWriter.apical();
        timberyard();
        this.reader.wireman();
        this.forciblyRecompose = false;
        this.providersInvalid = polloi.monoploid(this.providersInvalidStack.beachfront());
    }

    /* JADX INFO: renamed from: palmyra, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    public final void peridotite() {
        walach(false);
    }

    public final void permissivist(technofreak scope) {
        scope.saran(this.compositionToken);
        this.observerHolder.attabal();
    }

    public final palmyra polder() {
        palmyra palmyraVar = this.providerCache;
        return palmyraVar != null ? palmyraVar : seminary(this.reader.getParent());
    }

    @Override // androidx.compose.runtime.taiyuan
    public void polloi() {
        peridotite();
    }

    public final List<ComposeStackTraceFrame> prefect(int group, Integer dataOffset) {
        if (!this.sourceMarkersEnabled) {
            return p002kotlin.collections.adultoid.formularize();
        }
        SlotReader slotReaderDovishness = this.slotTable.dovishness();
        try {
            return oilcan.saneness.competently(slotReaderDovishness, group, dataOffset);
        } finally {
            slotReaderDovishness.wireman();
        }
    }

    public final Function1<molybdenite, Unit> premeiotic(technofreak scope) {
        this.observerHolder.attabal();
        return scope.beachfront(this.compositionToken);
    }

    public final void privatdozent() {
        Object objAttabal = cuirassed.polloi.f24276attabal.attabal("Compose:Composer.dispose");
        try {
            this.parentContext.molybdenite(this);
            saran();
            treadless().clear();
            this.isDisposed = true;
            Unit unit = Unit.f29295attabal;
        } finally {
            cuirassed.polloi.f24276attabal.saneness(objAttabal);
        }
    }

    public void pruinose(int key, Object dataKey) {
        microchemistry(key, dataKey, mathsort.INSTANCE.attabal(), null);
    }

    public final long restrictive(int group, int recomposeGroup, long recomposeKey) {
        long jRotateLeft;
        long jRotateLeft2 = 0;
        int i = 3;
        int i2 = 0;
        while (group >= 0) {
            if (group == recomposeGroup) {
                jRotateLeft = Long.rotateLeft(recomposeKey, i2);
            } else {
                int iCzestochowa = czestochowa(this.reader, group);
                if (iCzestochowa == 126665345) {
                    jRotateLeft = Long.rotateLeft(iCzestochowa, i2);
                } else {
                    jRotateLeft2 = (jRotateLeft2 ^ Long.rotateLeft(iCzestochowa, i)) ^ Long.rotateLeft(this.reader.kattegat(group) ? 0 : hardpan(group), i2);
                    i = (i + 6) % 64;
                    i2 = (i2 + 6) % 64;
                    group = this.reader.creditor(group);
                }
            }
            return jRotateLeft ^ jRotateLeft2;
        }
        return jRotateLeft2;
    }

    @Override // androidx.compose.runtime.taiyuan
    public boolean saneness() {
        technofreak technofreakVarNosophobia;
        return (getInserting() || this.reusing || this.providersInvalid || (technofreakVarNosophobia = nosophobia()) == null || technofreakVarNosophobia.impassible() || this.forciblyRecompose) ? false : true;
    }

    public final void saran() {
        rajahship.attabal(this.invalidateStack);
        this.invalidations.clear();
        this.changes.attabal();
        this.providerUpdates = null;
    }

    public final oilcan.impromptu sayid() {
        if (this.sourceMarkersEnabled) {
            return this.errorContext;
        }
        return null;
    }

    public final void sealless() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.compositeKeyHashCode = 0L;
        this.nodeExpected = false;
        this.changeListWriter.hydrovane();
        rajahship.attabal(this.invalidateStack);
        kattegat();
    }

    public final palmyra seminary(int group) {
        palmyra palmyraVarDern;
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.lerp(parent) == 202 && Intrinsics.wireman(this.writer.nosophobia(parent), polloi.trm())) {
                    Object objItchy = this.writer.itchy(parent);
                    Intrinsics.competently(objItchy, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    palmyra palmyraVar = (palmyra) objItchy;
                    this.providerCache = palmyraVar;
                    return palmyraVar;
                }
                parent = this.writer.outmarry(parent);
            }
        }
        if (this.reader.getGroupsSize() > 0) {
            while (group > 0) {
                if (this.reader.trm(group) == 202 && Intrinsics.wireman(this.reader.oilcan(group), polloi.trm())) {
                    androidx.collection.yemenite<palmyra> yemeniteVar = this.providerUpdates;
                    if (yemeniteVar == null || (palmyraVarDern = yemeniteVar.dern(group)) == null) {
                        Object objCord = this.reader.cord(group);
                        Intrinsics.competently(objCord, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        palmyraVarDern = (palmyra) objCord;
                    }
                    this.providerCache = palmyraVarDern;
                    return palmyraVarDern;
                }
                group = this.reader.creditor(group);
            }
        }
        palmyra palmyraVar2 = this.rootProvider;
        this.providerCache = palmyraVar2;
        return palmyraVar2;
    }

    public final void sensatory(List<Pair<nosophobia, nosophobia>> references) throws Throwable {
        adultoid.saneness sanenessVar;
        adultoid.attabal attabalVar;
        cosy slotTable;
        androidx.compose.runtime.saneness anchor;
        SlotReader slotReader;
        adultoid.saneness sanenessVar2;
        adultoid.attabal attabalVar2;
        cosy slotTable2;
        List<Pair<nosophobia, nosophobia>> list = references;
        adultoid.saneness sanenessVar3 = this.changeListWriter;
        adultoid.attabal attabalVar3 = this.lateChanges;
        adultoid.attabal attabalVarKowloon = sanenessVar3.getChangeList();
        try {
            sanenessVar3.walach(attabalVar3);
            this.changeListWriter.starveling();
            int size = list.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                try {
                    Pair<nosophobia, nosophobia> pair = list.get(i2);
                    final nosophobia nosophobiaVarComponent1 = pair.component1();
                    nosophobia nosophobiaVarComponent2 = pair.component2();
                    androidx.compose.runtime.saneness anchor2 = nosophobiaVarComponent1.getAnchor();
                    int iWireman = nosophobiaVarComponent1.getSlotTable().wireman(anchor2);
                    IntRef intRef = new IntRef(i, 1, null);
                    this.changeListWriter.wireman(intRef, anchor2);
                    if (nosophobiaVarComponent2 == null) {
                        if (Intrinsics.wireman(nosophobiaVarComponent1.getSlotTable(), this.insertTable)) {
                            merc();
                        }
                        final SlotReader slotReaderDovishness = nosophobiaVarComponent1.getSlotTable().dovishness();
                        try {
                            slotReaderDovishness.starveling(iWireman);
                            this.changeListWriter.cord(iWireman);
                            final adultoid.attabal attabalVar4 = new adultoid.attabal();
                            outmarry(this, null, null, null, null, new Function0() { // from class: androidx.compose.runtime.cutely
                                @Override // p002kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return kowloon.underbelly(this.f5917kowloon, attabalVar4, slotReaderDovishness, nosophobiaVarComponent1);
                                }
                            }, 15, null);
                            this.changeListWriter.molybdenite(attabalVar4, intRef);
                            Unit unit = Unit.f29295attabal;
                            slotReaderDovishness.wireman();
                        } catch (Throwable th) {
                            slotReaderDovishness.wireman();
                            throw th;
                        }
                    } else {
                        lerp lerpVarKowloon = this.parentContext.kowloon(nosophobiaVarComponent2);
                        if (lerpVarKowloon == null || (slotTable = lerpVarKowloon.getSlotTable()) == null) {
                            slotTable = nosophobiaVarComponent2.getSlotTable();
                        }
                        if (lerpVarKowloon == null || (slotTable2 = lerpVarKowloon.getSlotTable()) == null || (anchor = slotTable2.saneness(0)) == null) {
                            anchor = nosophobiaVarComponent2.getAnchor();
                        }
                        List<? extends Object> listMolybdenite = polloi.molybdenite(slotTable, anchor);
                        if (!listMolybdenite.isEmpty()) {
                            this.changeListWriter.saneness(listMolybdenite, intRef);
                            if (Intrinsics.wireman(nosophobiaVarComponent1.getSlotTable(), this.slotTable)) {
                                int iWireman2 = this.slotTable.wireman(anchor2);
                                libya(iWireman2, twybill(iWireman2) + listMolybdenite.size());
                            }
                        }
                        this.changeListWriter.dern(lerpVarKowloon, this.parentContext, nosophobiaVarComponent2, nosophobiaVarComponent1);
                        SlotReader slotReaderDovishness2 = slotTable.dovishness();
                        try {
                            SlotReader slotReader2 = this.reader;
                            int[] iArr = this.nodeCountOverrides;
                            androidx.collection.yemenite<palmyra> yemeniteVar = this.providerUpdates;
                            this.nodeCountOverrides = null;
                            this.providerUpdates = null;
                            try {
                                this.reader = slotReaderDovishness2;
                                int iWireman3 = slotTable.wireman(anchor);
                                slotReaderDovishness2.starveling(iWireman3);
                                this.changeListWriter.cord(iWireman3);
                                adultoid.attabal attabalVar5 = new adultoid.attabal();
                                adultoid.saneness sanenessVar4 = this.changeListWriter;
                                adultoid.attabal attabalVarKowloon2 = sanenessVar4.getChangeList();
                                try {
                                    sanenessVar4.walach(attabalVar5);
                                    slotReader = slotReaderDovishness2;
                                    try {
                                        adultoid.saneness sanenessVar5 = this.changeListWriter;
                                        boolean zArytenoidectomy = sanenessVar5.getImplicitRootStart();
                                        try {
                                            sanenessVar5.peridotite(false);
                                            nosophobiaVarComponent2.cutely();
                                            try {
                                                yemeniteVar = yemeniteVar;
                                                sanenessVar2 = sanenessVar4;
                                                attabalVar2 = attabalVarKowloon2;
                                                try {
                                                    technofreak(nosophobiaVarComponent2.getComposition(), nosophobiaVarComponent1.getComposition(), Integer.valueOf(slotReader.getCurrent()), nosophobiaVarComponent2.wireman(), new Function0() { // from class: androidx.compose.runtime.apical
                                                        @Override // p002kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return kowloon.preterite(this.f5824kowloon, nosophobiaVarComponent1);
                                                        }
                                                    });
                                                    try {
                                                        sanenessVar5.peridotite(zArytenoidectomy);
                                                        try {
                                                            sanenessVar2.walach(attabalVar2);
                                                            this.changeListWriter.molybdenite(attabalVar5, intRef);
                                                            Unit unit2 = Unit.f29295attabal;
                                                            try {
                                                                this.reader = slotReader2;
                                                                this.nodeCountOverrides = iArr;
                                                                this.providerUpdates = yemeniteVar;
                                                                slotReader.wireman();
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                slotReader.wireman();
                                                                throw th;
                                                            }
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            this.reader = slotReader2;
                                                            this.nodeCountOverrides = iArr;
                                                            this.providerUpdates = yemeniteVar;
                                                            throw th;
                                                        }
                                                    } catch (Throwable th4) {
                                                        th = th4;
                                                        sanenessVar2.walach(attabalVar2);
                                                        throw th;
                                                    }
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    sanenessVar5.peridotite(zArytenoidectomy);
                                                    throw th;
                                                }
                                            } catch (Throwable th6) {
                                                th = th6;
                                                yemeniteVar = yemeniteVar;
                                                attabalVar2 = attabalVarKowloon2;
                                                sanenessVar2 = sanenessVar4;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            yemeniteVar = yemeniteVar;
                                            sanenessVar2 = sanenessVar4;
                                            attabalVar2 = attabalVarKowloon2;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        sanenessVar2 = sanenessVar4;
                                        attabalVar2 = attabalVarKowloon2;
                                        sanenessVar2.walach(attabalVar2);
                                        throw th;
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    slotReader = slotReaderDovishness2;
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                yemeniteVar = yemeniteVar;
                                slotReader = slotReaderDovishness2;
                            }
                        } catch (Throwable th11) {
                            th = th11;
                            slotReader = slotReaderDovishness2;
                        }
                    }
                    try {
                        this.changeListWriter.mathsort();
                        i2++;
                        list = references;
                        size = size;
                        sanenessVar3 = sanenessVar3;
                        attabalVarKowloon = attabalVarKowloon;
                        i = 0;
                    } catch (Throwable th12) {
                        th = th12;
                        sanenessVar = sanenessVar3;
                        attabalVar = attabalVarKowloon;
                        sanenessVar.walach(attabalVar);
                        throw th;
                    }
                } catch (Throwable th13) {
                    th = th13;
                    sanenessVar3 = sanenessVar3;
                    attabalVarKowloon = attabalVarKowloon;
                }
            }
            adultoid.saneness sanenessVar6 = sanenessVar3;
            adultoid.attabal attabalVar6 = attabalVarKowloon;
            this.changeListWriter.competently();
            this.changeListWriter.cord(0);
            sanenessVar6.walach(attabalVar6);
        } catch (Throwable th14) {
            th = th14;
            sanenessVar = sanenessVar3;
            attabalVar = attabalVarKowloon;
        }
    }

    public final void setterwort(androidx.compose.runtime.saneness anchor) {
        if (this.insertFixups.wireman()) {
            this.changeListWriter.graveside(anchor, this.insertTable);
        } else {
            this.changeListWriter.adultoid(anchor, this.insertTable, this.insertFixups);
            this.insertFixups = new adultoid.dern();
        }
    }

    public final void splinterproof() {
        if (!(!this.isComposing && this.reusingGroup == 100)) {
            lightstruck.attabal("Cannot disable reuse from root if it was caused by other groups");
        }
        this.reusingGroup = -1;
        this.reusing = false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x009f A[LOOP:1: B:17:0x004b->B:32:0x009f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a2 A[EDGE_INSN: B:40:0x00a2->B:33:0x00a2 BREAK  A[LOOP:1: B:17:0x004b->B:32:0x009f], SYNTHETIC] */
    public final void stupefactive(androidx.collection.grimness<Object, Object> invalidationsRequested) {
        for (int iTriweekly = p002kotlin.collections.adultoid.triweekly(this.invalidations); -1 < iTriweekly; iTriweekly--) {
            clubfoot clubfootVar = this.invalidations.get(iTriweekly);
            androidx.compose.runtime.saneness anchor = clubfootVar.getScope().getAnchor();
            if (anchor == null || !anchor.saneness()) {
                this.invalidations.remove(iTriweekly);
            } else if (clubfootVar.getLocation() != anchor.getLocation()) {
                clubfootVar.beachfront(anchor.getLocation());
            }
        }
        Object[] objArr = invalidationsRequested.keys;
        Object[] objArr2 = invalidationsRequested.values;
        long[] jArr = invalidationsRequested.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            Intrinsics.competently(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            technofreak technofreakVar = (technofreak) obj;
                            androidx.compose.runtime.saneness anchor2 = technofreakVar.getAnchor();
                            if (anchor2 != null) {
                                int location = anchor2.getLocation();
                                List<clubfoot> list = this.invalidations;
                                if (obj2 == osteal.f6102attabal) {
                                    obj2 = null;
                                }
                                list.add(new clubfoot(technofreakVar, location, obj2));
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        p002kotlin.collections.preprohormone.cuirassed(this.invalidations, polloi.f6126impromptu);
    }

    public final boolean sultanate(technofreak scope, Object instance) {
        androidx.compose.runtime.saneness anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int iWireman = anchor.wireman(this.reader.getCom.ironsource.A5.R java.lang.String());
        if (!this.isComposing || iWireman < this.reader.getCurrent()) {
            return false;
        }
        polloi.merc(this.invalidations, iWireman, scope, instance);
        return true;
    }

    public final void supplicat(androidx.collection.grimness<Object, Object> invalidationsRequested, Function2<? super taiyuan, ? super Integer, Unit> content, microchemistry shouldPause) {
        if (!this.changes.dern()) {
            polloi.adultoid("Expected applyChanges() to have been called");
        }
        creditor(invalidationsRequested, content);
    }

    public final palmyra tailoring(palmyra parentScope, palmyra currentProviders) {
        palmyra.attabal attabalVarBuilder = parentScope.builder();
        attabalVarBuilder.putAll(currentProviders);
        palmyra palmyraVarCompetently = attabalVarBuilder.competently();
        cosy(204, polloi.supplicat());
        liable(palmyraVarCompetently);
        liable(currentProviders);
        peridotite();
        return palmyraVarCompetently;
    }

    @Override // androidx.compose.runtime.taiyuan
    public void taiyuan() {
        this.forceRecomposeScopes = true;
        this.sourceMarkersEnabled = true;
        this.slotTable.impromptu();
        this.insertTable.impromptu();
        this.writer.undecorated();
    }

    public final void tarboosh(boolean isNode, Object data) {
        if (isNode) {
            this.reader.overspeculate();
            return;
        }
        if (data != null && this.reader.apical() != data) {
            this.changeListWriter.dent(data);
        }
        this.reader.splinterproof();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0042 A[Catch: all -> 0x0029, TRY_LEAVE, TryCatch #0 {all -> 0x0029, blocks: (B:3:0x0005, B:5:0x0013, B:7:0x0025, B:11:0x002f, B:10:0x002b, B:14:0x0036, B:16:0x003c, B:18:0x0042), top: B:23:0x0005 }] */
    public final <R> R technofreak(supplicat from, supplicat to, Integer index, List<? extends Pair<technofreak, ? extends Object>> invalidations, Function0<? extends R> block) {
        R rInvoke;
        boolean z = this.isComposing;
        int i = this.nodeIndex;
        try {
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = invalidations.size();
            for (int i2 = 0; i2 < size; i2++) {
                Pair<technofreak, ? extends Object> pair = invalidations.get(i2);
                technofreak technofreakVarComponent1 = pair.component1();
                Object objComponent2 = pair.component2();
                if (objComponent2 != null) {
                    sultanate(technofreakVarComponent1, objComponent2);
                } else {
                    sultanate(technofreakVarComponent1, null);
                }
            }
            if (from == null) {
                rInvoke = block.invoke();
            } else {
                rInvoke = (R) from.cutely(to, index != null ? index.intValue() : -1, block);
                if (rInvoke == null) {
                    rInvoke = block.invoke();
                }
            }
            return rInvoke;
        } finally {
            this.isComposing = z;
            this.nodeIndex = i;
        }
    }

    public final void tectonization() {
        this.groupNodeCount = this.reader.adultoid();
        this.reader.peridotite();
    }

    public final void timberyard() {
        this.changeListWriter.triweekly();
        if (!rajahship.marial(this.pendingStack)) {
            polloi.adultoid("Start/end imbalance");
        }
        sealless();
    }

    public androidx.compose.runtime.wireman<?> treadless() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.taiyuan
    public void triweekly(claque<?> value) {
        hydromechanics<?> hydromechanicsVar;
        palmyra palmyraVarPolder = polder();
        cosy(201, polloi.kattegat());
        Object objApical = apical();
        if (Intrinsics.wireman(objApical, taiyuan.INSTANCE.attabal())) {
            hydromechanicsVar = null;
        } else {
            Intrinsics.competently(objApical, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            hydromechanicsVar = (hydromechanics) objApical;
        }
        preprohormone<?> preprohormoneVarSaneness = value.saneness();
        Intrinsics.competently(preprohormoneVarSaneness, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Intrinsics.competently(value, "null cannot be cast to non-null type androidx.compose.runtime.ProvidedValue<kotlin.Any?>");
        hydromechanics<?> hydromechanicsVarSaneness = preprohormoneVarSaneness.saneness(value, hydromechanicsVar);
        boolean zWireman = Intrinsics.wireman(hydromechanicsVarSaneness, hydromechanicsVar);
        if (!zWireman) {
            competently(hydromechanicsVarSaneness);
        }
        boolean z = true;
        boolean z2 = false;
        if (getInserting()) {
            if (value.getCanOverride() || !oilcan.attabal(palmyraVarPolder, preprohormoneVarSaneness)) {
                palmyraVarPolder = palmyraVarPolder.dern(preprohormoneVarSaneness, hydromechanicsVarSaneness);
            }
            this.writerHasAProvider = true;
        } else {
            SlotReader slotReader = this.reader;
            Object objCord = slotReader.cord(slotReader.getCurrent());
            Intrinsics.competently(objCord, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            palmyra palmyraVar = (palmyra) objCord;
            if (!(saneness() && zWireman) && (value.getCanOverride() || !oilcan.attabal(palmyraVarPolder, preprohormoneVarSaneness))) {
                palmyraVarPolder = palmyraVarPolder.dern(preprohormoneVarSaneness, hydromechanicsVarSaneness);
            } else if ((zWireman && !this.providersInvalid) || !this.providersInvalid) {
                palmyraVarPolder = palmyraVar;
            }
            if (!this.reusing && palmyraVar == palmyraVarPolder) {
                z = false;
            }
            z2 = z;
        }
        if (z2 && !getInserting()) {
            mastfed(palmyraVarPolder);
        }
        this.providersInvalidStack.competently(polloi.polloi(this.providersInvalid));
        this.providersInvalid = z2;
        this.providerCache = palmyraVarPolder;
        microchemistry(202, polloi.trm(), mathsort.INSTANCE.attabal(), palmyraVarPolder);
    }

    public final int twybill(int group) {
        int i;
        if (group >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i = iArr[group]) < 0) ? this.reader.saran(group) : i;
        }
        androidx.collection.trm trmVar = this.nodeCountVirtualOverrides;
        if (trmVar == null || !trmVar.attabal(group)) {
            return 0;
        }
        return trmVar.dern(group);
    }

    public final List<ComposeStackTraceFrame> unconsolidated() {
        molybdenite molybdeniteVarImpromptu = this.parentContext.impromptu();
        gintrap gintrapVar = molybdeniteVarImpromptu instanceof gintrap ? (gintrap) molybdeniteVarImpromptu : null;
        if (gintrapVar == null) {
            return p002kotlin.collections.adultoid.formularize();
        }
        Integer numMarial = oilcan.saneness.marial(gintrapVar.getSlotTable(), this.parentContext);
        if (numMarial == null) {
            return p002kotlin.collections.adultoid.formularize();
        }
        SlotReader slotReaderDovishness = gintrapVar.getSlotTable().dovishness();
        try {
            return oilcan.saneness.competently(slotReaderDovishness, numMarial.intValue(), 0);
        } finally {
            slotReaderDovishness.wireman();
        }
    }

    public final void vesuvio() {
        lampshade(this.reader.getCurrent());
        this.changeListWriter.privatdozent();
    }

    public final void vir(Object value) {
        if (getInserting()) {
            this.writer.twybill(value);
            return;
        }
        if (!this.reader.getHadNext()) {
            adultoid.saneness sanenessVar = this.changeListWriter;
            SlotReader slotReader = this.reader;
            sanenessVar.attabal(slotReader.attabal(slotReader.getParent()), value);
            return;
        }
        int iArytenoidectomy = this.reader.arytenoidectomy() - 1;
        if (!this.changeListWriter.monoploid()) {
            this.changeListWriter.permissivist(value, iArytenoidectomy);
            return;
        }
        adultoid.saneness sanenessVar2 = this.changeListWriter;
        SlotReader slotReader2 = this.reader;
        sanenessVar2.clubfoot(value, slotReader2.attabal(slotReader2.getParent()), iArytenoidectomy);
    }

    public final void walach(boolean isNode) {
        long jRotateRight;
        long j;
        int iDovishness;
        List<permissivist> list;
        long jRotateRight2;
        long j2;
        int iWireman = this.parentStateStack.wireman() - 1;
        if (getInserting()) {
            int parent = this.writer.getParent();
            int iLerp = this.writer.lerp(parent);
            Object objNosophobia = this.writer.nosophobia(parent);
            Object objItchy = this.writer.itchy(parent);
            if (objNosophobia != null) {
                int iOrdinal = objNosophobia instanceof Enum ? ((Enum) objNosophobia).ordinal() : objNosophobia.hashCode();
                jRotateRight2 = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3);
                j2 = iOrdinal;
            } else if (objItchy == null || iLerp != 207 || Intrinsics.wireman(objItchy, taiyuan.INSTANCE.attabal())) {
                jRotateRight2 = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iWireman), 3);
                j2 = iLerp;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(((long) objItchy.hashCode()) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iWireman), 3), 3);
            }
            this.compositeKeyHashCode = Long.rotateRight(jRotateRight2 ^ j2, 3);
        } else {
            int parent2 = this.reader.getParent();
            int iTrm = this.reader.trm(parent2);
            Object objOilcan = this.reader.oilcan(parent2);
            Object objCord = this.reader.cord(parent2);
            if (objOilcan != null) {
                int iOrdinal2 = objOilcan instanceof Enum ? ((Enum) objOilcan).ordinal() : objOilcan.hashCode();
                jRotateRight = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) 0), 3);
                j = iOrdinal2;
            } else if (objCord == null || iTrm != 207 || Intrinsics.wireman(objCord, taiyuan.INSTANCE.attabal())) {
                jRotateRight = Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iWireman), 3);
                j = iTrm;
            } else {
                this.compositeKeyHashCode = Long.rotateRight(((long) objCord.hashCode()) ^ Long.rotateRight(getCompositeKeyHashCode() ^ ((long) iWireman), 3), 3);
            }
            this.compositeKeyHashCode = Long.rotateRight(jRotateRight ^ j, 3);
        }
        int i = this.groupNodeCount;
        picketboat picketboatVar = this.pending;
        if (picketboatVar != null && picketboatVar.saneness().size() > 0) {
            List<permissivist> listSaneness = picketboatVar.saneness();
            List<permissivist> listBeachfront = picketboatVar.beachfront();
            Set setMarial = androidx.compose.runtime.snapshots.dern.marial(listBeachfront);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = listBeachfront.size();
            int size2 = listSaneness.size();
            int i2 = 0;
            int i3 = 0;
            int iKowloon = 0;
            while (i2 < size2) {
                permissivist permissivistVar = listSaneness.get(i2);
                if (setMarial.contains(permissivistVar)) {
                    list = listSaneness;
                    if (!linkedHashSet.contains(permissivistVar)) {
                        if (i3 < size) {
                            permissivist permissivistVar2 = listBeachfront.get(i3);
                            if (permissivistVar2 != permissivistVar) {
                                int iCompetently = picketboatVar.competently(permissivistVar2);
                                linkedHashSet.add(permissivistVar2);
                                if (iCompetently != iKowloon) {
                                    int iKowloon2 = picketboatVar.kowloon(permissivistVar2);
                                    this.changeListWriter.rotuma(picketboatVar.getStartIndex() + iCompetently, iKowloon + picketboatVar.getStartIndex(), iKowloon2);
                                    picketboatVar.cutely(iCompetently, iKowloon, iKowloon2);
                                }
                            } else {
                                i2++;
                            }
                            i3++;
                            iKowloon += picketboatVar.kowloon(permissivistVar2);
                            listSaneness = list;
                            listBeachfront = listBeachfront;
                        }
                    }
                    listSaneness = list;
                } else {
                    this.changeListWriter.creditor(picketboatVar.competently(permissivistVar) + picketboatVar.getStartIndex(), permissivistVar.getNodes());
                    picketboatVar.triweekly(permissivistVar.getLocation(), 0);
                    this.changeListWriter.preprohormone(permissivistVar.getLocation());
                    this.reader.starveling(permissivistVar.getLocation());
                    vesuvio();
                    this.reader.walach();
                    list = listSaneness;
                    polloi.walach(this.invalidations, permissivistVar.getLocation(), permissivistVar.getLocation() + this.reader.yemenite(permissivistVar.getLocation()));
                }
                i2++;
                listSaneness = list;
            }
            this.changeListWriter.impromptu();
            if (listSaneness.size() > 0) {
                this.changeListWriter.preprohormone(this.reader.getEnd());
                this.reader.peridotite();
            }
        }
        boolean inserting = getInserting();
        if (!inserting && (iDovishness = this.reader.dovishness()) > 0) {
            this.changeListWriter.overspeculate(iDovishness);
        }
        int i4 = this.nodeIndex;
        while (!this.reader.supplicat()) {
            int current = this.reader.getCurrent();
            vesuvio();
            this.changeListWriter.creditor(i4, this.reader.walach());
            polloi.walach(this.invalidations, current, this.reader.getCurrent());
        }
        if (inserting) {
            if (isNode) {
                this.insertFixups.saneness();
                i = 1;
            }
            this.reader.beachfront();
            int parent3 = this.writer.getParent();
            this.writer.starveling();
            if (!this.reader.molybdenite()) {
                int iIgbo = igbo(parent3);
                this.writer.hydrovane();
                this.writer.restrictive(true);
                setterwort(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    libya(iIgbo, 0);
                    decarock(iIgbo, i);
                }
            }
        } else {
            if (isNode) {
                this.changeListWriter.cuirassed();
            }
            this.changeListWriter.beachfront();
            int parent4 = this.reader.getParent();
            if (i != twybill(parent4)) {
                decarock(parent4, i);
            }
            if (isNode) {
                i = 1;
            }
            this.reader.competently();
            this.changeListWriter.impromptu();
        }
        cultivated(i, inserting);
    }

    @Override // androidx.compose.runtime.taiyuan
    public <T> T wireman(preprohormone<T> key) {
        return (T) oilcan.saneness(polder(), key);
    }

    public void wostteth(List<Pair<nosophobia, nosophobia>> references) {
        try {
            sensatory(references);
            sealless();
        } catch (Throwable th) {
            cuirassed();
            throw th;
        }
    }

    public final void yemenite() {
        this.providerUpdates = null;
    }
}
