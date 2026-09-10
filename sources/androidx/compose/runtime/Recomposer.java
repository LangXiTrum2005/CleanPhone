package androidx.compose.runtime;

import androidx.collection.ObjectList;
import com.ironsource.A5;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.coroutines.CoroutineContext;
import p002kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Recomposer.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¼\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 Ï\u00012\u00020\u0001:\u0005Ð\u0001hUGB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\"\u0010 J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b#\u0010 J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b%\u0010&J:\u0010-\u001a\u00020\u00072(\u0010,\u001a$\b\u0001\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020)\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070*\u0012\u0006\u0012\u0004\u0018\u00010+0'H\u0082@¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b/\u0010 J)\u00102\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001e\u001a\u00020\u00132\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020+\u0018\u000100H\u0002¢\u0006\u0004\b2\u00103J3\u00106\u001a\b\u0012\u0004\u0012\u00020\u00130\u00182\f\u00105\u001a\b\u0012\u0004\u0012\u0002040\u00182\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020+\u0018\u000100H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0007H\u0002¢\u0006\u0004\b8\u0010\u001dJ#\u0010:\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0007092\u0006\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b:\u0010;J3\u0010<\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0007092\u0006\u0010\u001e\u001a\u00020\u00132\u000e\u00101\u001a\n\u0012\u0004\u0012\u00020+\u0018\u000100H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u00072\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0007H\u0086@¢\u0006\u0004\bB\u0010&J\r\u0010C\u001a\u00020\u0007¢\u0006\u0004\bC\u0010\u001dJ\u0010\u0010D\u001a\u00020\u0007H\u0086@¢\u0006\u0004\bD\u0010&J%\u0010G\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00132\f\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00070EH\u0010¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020\u0007¢\u0006\u0004\bI\u0010\u001dJ\r\u0010J\u001a\u00020\u0007¢\u0006\u0004\bJ\u0010\u001dJ\u001d\u0010N\u001a\u00020\u00072\f\u0010M\u001a\b\u0012\u0004\u0012\u00020L0KH\u0010¢\u0006\u0004\bN\u0010OJ\u0017\u0010P\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0013H\u0010¢\u0006\u0004\bP\u0010 J\u0017\u0010Q\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u0013H\u0010¢\u0006\u0004\bQ\u0010 J\u0017\u0010S\u001a\u00020\u00072\u0006\u0010R\u001a\u000204H\u0010¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u00072\u0006\u0010R\u001a\u000204H\u0010¢\u0006\u0004\bU\u0010TJ+\u0010Z\u001a\u00020\u00072\u0006\u0010R\u001a\u0002042\u0006\u0010W\u001a\u00020V2\n\u0010Y\u001a\u0006\u0012\u0002\b\u00030XH\u0010¢\u0006\u0004\bZ\u0010[J\u0019\u0010\\\u001a\u0004\u0018\u00010V2\u0006\u0010R\u001a\u000204H\u0010¢\u0006\u0004\b\\\u0010]R$\u0010c\u001a\u00020^2\u0006\u0010_\u001a\u00020^8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bG\u0010`\u001a\u0004\ba\u0010bR\u0014\u0010f\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010eR\u0018\u0010j\u001a\u00060+j\u0002`g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010iR\u0018\u0010m\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010p\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00130q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u001e\u0010v\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010sR\u001c\u0010y\u001a\b\u0012\u0004\u0012\u00020+008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010xR\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00130z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u001a\u0010\u007f\u001a\b\u0012\u0004\u0012\u00020\u00130q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010sR\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u0002040q8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010sR,\u0010\u0085\u0001\u001a\u0018\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010+0\u0083\u0001\u0012\u0004\u0012\u0002040\u0082\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bS\u0010\u0084\u0001R\u0017\u0010\u0088\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bQ\u0010\u0087\u0001R#\u0010\u008a\u0001\u001a\u000f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020V0\u0089\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bZ\u0010\u0084\u0001R#\u0010\u008b\u0001\u001a\u000f\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u0002040\u0082\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\\\u0010\u0084\u0001R\u001f\u0010\u008c\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010sR!\u0010\u008f\u0001\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R!\u0010\u0092\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u0096\u0001\u001a\u00030\u0093\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0018\u0010\u0098\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bP\u0010\u0097\u0001R\u001c\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0097\u0001R\u001f\u0010£\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010\u009f\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R'\u0010¨\u0001\u001a\u0012\u0012\r\u0012\u000b\u0012\u0005\u0012\u00030¥\u0001\u0018\u0001000¤\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010¬\u0001\u001a\u00030©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001d\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0005\b~\u0010¯\u0001R*\u0010µ\u0001\u001a\f\u0012\u0005\u0012\u00030±\u0001\u0018\u00010°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u000f\n\u0006\b²\u0001\u0010³\u0001\u0012\u0005\b´\u0001\u0010\u001dR\u001c\u0010¹\u0001\u001a\u00070¶\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010¸\u0001R\u0016\u0010»\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010\fR\u0016\u0010½\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010\fR\u0016\u0010¿\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010\fR\u0016\u0010Á\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010\fR\u0016\u0010Ã\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010\fR\u001c\u0010Ç\u0001\u001a\n\u0012\u0005\u0012\u00030 \u00010Ä\u00018F¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Æ\u0001R\u001a\u0010É\u0001\u001a\u00070^j\u0003`È\u00018PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bu\u0010bR\u0015\u0010Ê\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bk\u0010\fR\u0015\u0010Ë\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bn\u0010\fR\u0015\u0010Ì\u0001\u001a\u00020\n8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\br\u0010\fR\u0018\u0010\u001e\u001a\u0005\u0018\u00010Í\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bw\u0010Î\u0001¨\u0006Ñ\u0001"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/graveside;", "Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Lkotlinx/coroutines/impassible;", "", "lerp", "()Lkotlinx/coroutines/impassible;", "", "dhss", "()Z", "Lkotlinx/coroutines/monroe;", "callingJob", "mastfed", "(Lkotlinx/coroutines/monroe;)V", "", "e", "Landroidx/compose/runtime/supplicat;", "failedInitialComposition", "recoverable", "claque", "(Ljava/lang/Throwable;Landroidx/compose/runtime/supplicat;Z)V", "", "gusty", "()Ljava/util/List;", "picketboat", "itchy", "()V", "composition", "attendance", "(Landroidx/compose/runtime/supplicat;)V", "cultivated", "setterwort", "libyan", "vesuvio", "timberyard", "(Lwretchedly/dern;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lkotlinx/coroutines/saran;", "Landroidx/compose/runtime/milliradian;", "Lwretchedly/dern;", "", "block", "outmarry", "(Ltetrahedral/triweekly;Lwretchedly/dern;)Ljava/lang/Object;", "lightstruck", "Landroidx/collection/saran;", "modifiedValues", "achondroplasia", "(Landroidx/compose/runtime/supplicat;Landroidx/collection/saran;)Landroidx/compose/runtime/supplicat;", "Landroidx/compose/runtime/nosophobia;", "references", "julian", "(Ljava/util/List;Landroidx/collection/saran;)Ljava/util/List;", "nosophobia", "Lkotlin/Function1;", "herdbook", "(Landroidx/compose/runtime/supplicat;)Lkotlin/jvm/functions/Function1;", "deadwork", "(Landroidx/compose/runtime/supplicat;Landroidx/collection/saran;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/snapshots/wireman;", "snapshot", "premeiotic", "(Landroidx/compose/runtime/snapshots/wireman;)V", "lampshade", "treadless", "igbo", "Lkotlin/Function0;", "content", "attabal", "(Landroidx/compose/runtime/supplicat;Lkotlin/jvm/functions/Function2;)V", "palmyra", "homozygous", "", "Loilcan/marial;", A5.R, "arytenoidectomy", "(Ljava/util/Set;)V", "graveside", "impassible", "reference", "formularize", "(Landroidx/compose/runtime/nosophobia;)V", "saneness", "Landroidx/compose/runtime/lerp;", "data", "Landroidx/compose/runtime/wireman;", "applier", "triweekly", "(Landroidx/compose/runtime/nosophobia;Landroidx/compose/runtime/lerp;Landroidx/compose/runtime/wireman;)V", "kowloon", "(Landroidx/compose/runtime/nosophobia;)Landroidx/compose/runtime/lerp;", "", "value", "J", "empress", "()J", "changeCount", "Landroidx/compose/runtime/marial;", "Landroidx/compose/runtime/marial;", "broadcastFrameClock", "Landroidx/compose/runtime/platform/SynchronizedObject;", "dern", "Ljava/lang/Object;", "stateLock", "wireman", "Lkotlinx/coroutines/monroe;", "runnerJob", "marial", "Ljava/lang/Throwable;", "closeCause", "", "beachfront", "Ljava/util/List;", "_knownCompositions", "competently", "_knownCompositionsCache", "impromptu", "Landroidx/collection/saran;", "snapshotInvalidations", "Landroidx/compose/runtime/collection/dern;", "taiyuan", "Landroidx/compose/runtime/collection/dern;", "compositionInvalidations", "cutely", "compositionsAwaitingApply", "apical", "movableContentAwaitingInsert", "Landroidx/compose/runtime/collection/saneness;", "Landroidx/compose/runtime/itchy;", "Landroidx/collection/grimness;", "movableContentRemoved", "Landroidx/compose/runtime/underbelly;", "Landroidx/compose/runtime/underbelly;", "movableContentNestedStatesAvailable", "Landroidx/collection/grimness;", "movableContentStatesAvailable", "movableContentNestedExtractionsPending", "failedCompositions", "monoploid", "Ljava/util/Set;", "compositionsRemoved", "polloi", "Lkotlinx/coroutines/impassible;", "workContinuation", "", "molybdenite", "I", "concurrentCompositionsOutstanding", "Z", "isClosed", "Landroidx/compose/runtime/Recomposer$saneness;", "adultoid", "Landroidx/compose/runtime/Recomposer$saneness;", "errorState", "dovishness", "frameClockPaused", "Lkotlinx/coroutines/flow/formularize;", "Landroidx/compose/runtime/Recomposer$State;", "gintrap", "Lkotlinx/coroutines/flow/formularize;", "_state", "Lcuirassed/formularize;", "Landroidx/compose/runtime/technofreak;", "rotuma", "Lcuirassed/formularize;", "pausedScopes", "Lkotlinx/coroutines/cord;", "preprohormone", "Lkotlinx/coroutines/cord;", "effectJob", "cord", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "Landroidx/collection/seminary;", "Loilcan/impassible;", "cuirassed", "Landroidx/collection/seminary;", "getRegistrationObservers$annotations", "registrationObservers", "Landroidx/compose/runtime/Recomposer$dern;", "stratoscope", "Landroidx/compose/runtime/Recomposer$dern;", "recomposerInfo", "sensatory", "hasBroadcastFrameClockAwaitersLocked", "czestochowa", "hasBroadcastFrameClockAwaiters", "wostteth", "shouldKeepRecomposing", "preterite", "hasSchedulingWork", "underbelly", "hasFrameWorkLocked", "Lkotlinx/coroutines/flow/dovishness;", "coi", "()Lkotlinx/coroutines/flow/dovishness;", "currentState", "Landroidx/compose/runtime/CompositeKeyHashCode;", "compositeKeyHashCode", "collectingCallByInformation", "collectingParameterInformation", "collectingSourceInformation", "Landroidx/compose/runtime/molybdenite;", "()Landroidx/compose/runtime/molybdenite;", "trm", "State", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Recomposer extends graveside {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public saneness errorState;

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public final List<nosophobia> movableContentAwaitingInsert;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public List<supplicat> failedCompositions;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public long changeCount;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public final List<supplicat> _knownCompositions;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public List<? extends supplicat> _knownCompositionsCache;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public final CoroutineContext effectCoroutineContext;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.seminary<oilcan.impassible> registrationObservers;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public final List<supplicat> compositionsAwaitingApply;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final Object stateLock;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public boolean frameClockPaused;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public final androidx.collection.grimness<Object, Object> movableContentRemoved;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public final kotlinx.coroutines.flow.formularize<State> _state;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public boolean isClosed;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public final underbelly movableContentNestedStatesAvailable;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.saran<Object> snapshotInvalidations;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final androidx.collection.grimness<Object, Object> movableContentNestedExtractionsPending;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public Throwable closeCause;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public int concurrentCompositionsOutstanding;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public Set<supplicat> compositionsRemoved;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public kotlinx.coroutines.impassible<? super Unit> workContinuation;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public final kotlinx.coroutines.cord effectJob;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public final cuirassed.formularize<androidx.collection.saran<technofreak>> pausedScopes;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final marial broadcastFrameClock;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public final dern recomposerInfo;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<supplicat> compositionInvalidations;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public final androidx.collection.grimness<nosophobia, lerp> movableContentStatesAvailable;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public kotlinx.coroutines.monroe runnerJob;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name */
    public static final int f5785oilcan = 8;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name */
    public static final kotlinx.coroutines.flow.formularize<dovishness.beachfront<dern>> f5788yemenite = kotlinx.coroutines.flow.gintrap.attabal(dovishness.attabal.saneness());

    /* JADX INFO: renamed from: sealless, reason: collision with root package name */
    public static final AtomicReference<Boolean> f5786sealless = new AtomicReference<>(Boolean.FALSE);

    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "<init>", "(Ljava/lang/String;I)V", "ShutDown", "ShuttingDown", "Inactive", "InactivePendingWork", "Idle", "PendingWork", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork;


        /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name */
        public static final /* synthetic */ pussyfooter.attabal f5817arytenoidectomy = p002kotlin.enums.attabal.attabal(attabal());

        public static pussyfooter.attabal<State> getEntries() {
            return f5817arytenoidectomy;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tR$\u0010\r\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/Recomposer$attabal;", "", "<init>", "()V", "Landroidx/compose/runtime/Recomposer$dern;", "Landroidx/compose/runtime/Recomposer;", "info", "", "dern", "(Landroidx/compose/runtime/Recomposer$dern;)V", "wireman", "Lkotlinx/coroutines/flow/formularize;", "Ldovishness/beachfront;", "_runningRecomposers", "Lkotlinx/coroutines/flow/formularize;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Landroidx/compose/runtime/internal/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void dern(dern info) {
            dovishness.beachfront beachfrontVar;
            dovishness.beachfront beachfrontVarAdd;
            do {
                beachfrontVar = (dovishness.beachfront) Recomposer.f5788yemenite.getValue();
                beachfrontVarAdd = beachfrontVar.add(info);
                if (beachfrontVar == beachfrontVarAdd) {
                    return;
                }
            } while (!Recomposer.f5788yemenite.wireman(beachfrontVar, beachfrontVarAdd));
        }

        public final void wireman(dern info) {
            dovishness.beachfront beachfrontVar;
            dovishness.beachfront beachfrontVarRemove;
            do {
                beachfrontVar = (dovishness.beachfront) Recomposer.f5788yemenite.getValue();
                beachfrontVarRemove = beachfrontVar.remove(info);
                if (beachfrontVar == beachfrontVarRemove) {
                    return;
                }
            } while (!Recomposer.f5788yemenite.wireman(beachfrontVar, beachfrontVarRemove));
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/Recomposer$dern;", "", "<init>", "(Landroidx/compose/runtime/Recomposer;)V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class dern {
        public dern() {
        }
    }

    /* JADX INFO: compiled from: Recomposer.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/compose/runtime/Recomposer$saneness;", "", "", "recoverable", "", "cause", "<init>", "(ZLjava/lang/Throwable;)V", "attabal", "Z", "getRecoverable", "()Z", "saneness", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class saneness {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final boolean recoverable;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final Throwable cause;

        public saneness(boolean z, Throwable th) {
            this.recoverable = z;
            this.cause = th;
        }

        /* JADX INFO: renamed from: attabal, reason: from getter */
        public Throwable getCause() {
            return this.cause;
        }
    }

    public Recomposer(CoroutineContext coroutineContext) {
        marial marialVar = new marial(new Function0() { // from class: androidx.compose.runtime.mastfed
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Recomposer.milliradian(this.f6073kowloon);
            }
        });
        this.broadcastFrameClock = marialVar;
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new androidx.collection.saran<>(0, 1, null);
        this.compositionInvalidations = new androidx.compose.runtime.collection.dern<>(new supplicat[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.movableContentAwaitingInsert = new ArrayList();
        this.movableContentRemoved = androidx.compose.runtime.collection.saneness.marial(null, 1, null);
        this.movableContentNestedStatesAvailable = new underbelly();
        this.movableContentStatesAvailable = androidx.collection.peridotite.dern();
        this.movableContentNestedExtractionsPending = androidx.compose.runtime.collection.saneness.marial(null, 1, null);
        this._state = kotlinx.coroutines.flow.gintrap.attabal(State.Inactive);
        this.pausedScopes = new cuirassed.formularize<>();
        kotlinx.coroutines.cord cordVarAttabal = kotlinx.coroutines.achondroplasia.attabal((kotlinx.coroutines.monroe) coroutineContext.get(kotlinx.coroutines.monroe.INSTANCE));
        cordVarAttabal.restrictive(new Function1() { // from class: androidx.compose.runtime.attendance
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Recomposer.lotta(this.f5828kowloon, (Throwable) obj);
            }
        });
        this.effectJob = cordVarAttabal;
        this.effectCoroutineContext = coroutineContext.plus(marialVar).plus(cordVarAttabal);
        this.recomposerInfo = new dern();
    }

    public static final void coffeecake(Recomposer recomposer, nosophobia nosophobiaVar, nosophobia nosophobiaVar2) {
        List<nosophobia> listBeachfront = nosophobiaVar2.beachfront();
        if (listBeachfront != null) {
            int size = listBeachfront.size();
            for (int i = 0; i < size; i++) {
                nosophobia nosophobiaVar3 = listBeachfront.get(i);
                recomposer.movableContentNestedStatesAvailable.saneness(nosophobiaVar3.dern(), new preterite(nosophobiaVar3, nosophobiaVar));
                coffeecake(recomposer, nosophobiaVar, nosophobiaVar3);
            }
        }
    }

    public static /* synthetic */ void hardpan(Recomposer recomposer, Throwable th, supplicat supplicatVar, boolean z, int i, Object obj) throws Throwable {
        if ((i & 2) != 0) {
            supplicatVar = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        recomposer.claque(th, supplicatVar, z);
    }

    public static final Unit lotta(final Recomposer recomposer, final Throwable th) {
        kotlinx.coroutines.impassible<? super Unit> impassibleVar;
        kotlinx.coroutines.impassible<? super Unit> impassibleVar2;
        CancellationException cancellationExceptionAttabal = kotlinx.coroutines.coi.attabal("Recomposer effect job completed", th);
        synchronized (recomposer.stateLock) {
            try {
                kotlinx.coroutines.monroe monroeVar = recomposer.runnerJob;
                impassibleVar = null;
                if (monroeVar != null) {
                    recomposer._state.setValue(State.ShuttingDown);
                    if (recomposer.isClosed) {
                        impassibleVar2 = recomposer.workContinuation;
                        if (impassibleVar2 != null) {
                        }
                        recomposer.workContinuation = null;
                        monroeVar.restrictive(new Function1() { // from class: androidx.compose.runtime.homozygous
                            @Override // p002kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Recomposer.sayid(this.f5982kowloon, th, (Throwable) obj);
                            }
                        });
                        impassibleVar = impassibleVar2;
                    } else {
                        monroeVar.attabal(cancellationExceptionAttabal);
                    }
                    impassibleVar2 = null;
                    recomposer.workContinuation = null;
                    monroeVar.restrictive(new Function1() { // from class: androidx.compose.runtime.homozygous
                        @Override // p002kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Recomposer.sayid(this.f5982kowloon, th, (Throwable) obj);
                        }
                    });
                    impassibleVar = impassibleVar2;
                } else {
                    recomposer.closeCause = cancellationExceptionAttabal;
                    recomposer._state.setValue(State.ShutDown);
                    Unit unit = Unit.f29295attabal;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (impassibleVar != null) {
            Result.Companion companion = Result.INSTANCE;
            impassibleVar.resumeWith(Result.m3351constructorimpl(Unit.f29295attabal));
        }
        return Unit.f29295attabal;
    }

    public static final Unit milliradian(Recomposer recomposer) {
        kotlinx.coroutines.impassible<Unit> impassibleVarLerp;
        synchronized (recomposer.stateLock) {
            impassibleVarLerp = recomposer.lerp();
            if (recomposer._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                throw kotlinx.coroutines.coi.attabal("Recomposer shutdown; frame clock awaiter will never resume", recomposer.closeCause);
            }
        }
        if (impassibleVarLerp != null) {
            Result.Companion companion = Result.INSTANCE;
            impassibleVarLerp.resumeWith(Result.m3351constructorimpl(Unit.f29295attabal));
        }
        return Unit.f29295attabal;
    }

    public static final Unit molet(supplicat supplicatVar, androidx.collection.saran saranVar, Object obj) {
        supplicatVar.molybdenite(obj);
        if (saranVar != null) {
            saranVar.impromptu(obj);
        }
        return Unit.f29295attabal;
    }

    public static final void monroe(List<nosophobia> list, Recomposer recomposer, supplicat supplicatVar) {
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                Iterator<nosophobia> it = recomposer.movableContentAwaitingInsert.iterator();
                while (it.hasNext()) {
                    nosophobia next = it.next();
                    if (Intrinsics.wireman(next.getComposition(), supplicatVar)) {
                        list.add(next);
                        it.remove();
                    }
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final Unit sayid(Recomposer recomposer, Throwable th, Throwable th2) {
        synchronized (recomposer.stateLock) {
            if (th == null) {
                th = null;
            } else if (th2 != null) {
                try {
                    if (th2 instanceof CancellationException) {
                        th2 = null;
                    }
                    if (th2 != null) {
                        patroclinal.marial.attabal(th, th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            recomposer.closeCause = th;
            recomposer._state.setValue(State.ShutDown);
        }
        return Unit.f29295attabal;
    }

    public static final Unit technofreak(supplicat supplicatVar, Object obj) {
        supplicatVar.saneness(obj);
        return Unit.f29295attabal;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0040 A[LOOP:0: B:5:0x000b->B:15:0x0040, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[EDGE_INSN: B:19:0x0043->B:16:0x0043 BREAK  A[LOOP:0: B:5:0x000b->B:15:0x0040], SYNTHETIC] */
    public static final Unit unconsolidated(androidx.collection.saran saranVar, supplicat supplicatVar) {
        Object[] objArr = saranVar.elements;
        long[] jArr = saranVar.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
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
                            supplicatVar.molybdenite(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return Unit.f29295attabal;
    }

    public final supplicat achondroplasia(final supplicat composition, final androidx.collection.saran<Object> modifiedValues) {
        Set<supplicat> set;
        if (composition.polloi() || composition.beachfront() || ((set = this.compositionsRemoved) != null && set.contains(composition))) {
            return null;
        }
        androidx.compose.runtime.snapshots.wireman wiremanVarKowloon = androidx.compose.runtime.snapshots.formularize.INSTANCE.kowloon(herdbook(composition), deadwork(composition, modifiedValues));
        try {
            androidx.compose.runtime.snapshots.formularize formularizeVarFormularize = wiremanVarKowloon.formularize();
            if (modifiedValues != null) {
                try {
                    if (modifiedValues.marial()) {
                        composition.triweekly(new Function0() { // from class: androidx.compose.runtime.lampshade
                            @Override // p002kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Recomposer.unconsolidated(modifiedValues, composition);
                            }
                        });
                    }
                } catch (Throwable th) {
                    wiremanVarKowloon.molybdenite(formularizeVarFormularize);
                    throw th;
                }
            }
            boolean zApical = composition.apical();
            wiremanVarKowloon.molybdenite(formularizeVarFormularize);
            premeiotic(wiremanVarKowloon);
            if (zApical) {
                return composition;
            }
            return null;
        } catch (Throwable th2) {
            premeiotic(wiremanVarKowloon);
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.graveside
    public void attabal(supplicat composition, Function2<? super taiyuan, ? super Integer, Unit> content) throws Throwable {
        Throwable th;
        boolean z;
        boolean zPolloi = composition.polloi();
        synchronized (this.stateLock) {
            try {
                if (this._state.getValue().compareTo(State.ShuttingDown) > 0) {
                    try {
                        boolean zContains = picketboat().contains(composition);
                        z = !zContains;
                        if (!zContains) {
                            cultivated(composition);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    z = true;
                }
                try {
                    androidx.compose.runtime.snapshots.formularize.Companion companion = androidx.compose.runtime.snapshots.formularize.INSTANCE;
                    androidx.compose.runtime.snapshots.wireman wiremanVarKowloon = companion.kowloon(herdbook(composition), deadwork(composition, null));
                    androidx.compose.runtime.snapshots.formularize formularizeVarFormularize = wiremanVarKowloon.formularize();
                    try {
                        composition.wireman(content);
                        Unit unit = Unit.f29295attabal;
                        wiremanVarKowloon.molybdenite(formularizeVarFormularize);
                        premeiotic(wiremanVarKowloon);
                        if (!zPolloi) {
                            companion.competently();
                        }
                        try {
                            lightstruck(composition);
                            try {
                                composition.arytenoidectomy();
                                composition.marial();
                                if (zPolloi) {
                                    return;
                                }
                                companion.competently();
                            } catch (Throwable th3) {
                                hardpan(this, th3, null, false, 6, null);
                            }
                        } catch (Throwable th4) {
                            claque(th4, composition, true);
                        }
                    } catch (Throwable th5) {
                        try {
                            wiremanVarKowloon.molybdenite(formularizeVarFormularize);
                            throw th5;
                        } catch (Throwable th6) {
                            th = th6;
                            try {
                                premeiotic(wiremanVarKowloon);
                                throw th;
                            } catch (Throwable th7) {
                                th = th7;
                                claque(th, composition, true);
                                if (z) {
                                    synchronized (this.stateLock) {
                                        attendance(composition);
                                        Unit unit2 = Unit.f29295attabal;
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    this = this;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        }
    }

    public final void attendance(supplicat composition) {
        if (this._knownCompositions.remove(composition)) {
            this._knownCompositionsCache = null;
            libyan(composition);
        }
    }

    @Override // androidx.compose.runtime.graveside
    public boolean beachfront() {
        return polloi.stratoscope();
    }

    public final void claque(Throwable e, supplicat failedInitialComposition, boolean recoverable) throws Throwable {
        if (!f5786sealless.get().booleanValue() || (e instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                saneness sanenessVar = this.errorState;
                if (sanenessVar != null) {
                    throw sanenessVar.getCause();
                }
                this.errorState = new saneness(false, e);
                Unit unit = Unit.f29295attabal;
            }
            throw e;
        }
        synchronized (this.stateLock) {
            try {
                cuirassed.molybdenite.attabal("Error was captured in composition while live edit was enabled.", e);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.impromptu();
                this.snapshotInvalidations = new androidx.collection.saran<>(0, 1, null);
                this.movableContentAwaitingInsert.clear();
                androidx.compose.runtime.collection.saneness.dern(this.movableContentRemoved);
                this.movableContentStatesAvailable.taiyuan();
                this.errorState = new saneness(recoverable, e);
                if (failedInitialComposition != null) {
                    vesuvio(failedInitialComposition);
                }
                lerp();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final kotlinx.coroutines.flow.dovishness<State> coi() {
        return this._state;
    }

    @Override // androidx.compose.runtime.graveside
    public long competently() {
        return 1000;
    }

    public final void cultivated(supplicat composition) {
        this._knownCompositions.add(composition);
        this._knownCompositionsCache = null;
        setterwort(composition);
    }

    @Override // androidx.compose.runtime.graveside
    /* JADX INFO: renamed from: cutely, reason: from getter */
    public CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    public final boolean czestochowa() {
        boolean zSensatory;
        synchronized (this.stateLock) {
            zSensatory = sensatory();
        }
        return zSensatory;
    }

    public final Function1<Object, Unit> deadwork(final supplicat composition, final androidx.collection.saran<Object> modifiedValues) {
        return new Function1() { // from class: androidx.compose.runtime.setterwort
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Recomposer.molet(composition, modifiedValues, obj);
            }
        };
    }

    public final boolean dhss() {
        boolean zUnderbelly;
        p002kotlin.collections.adultoid.formularize();
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.wireman()) {
                return underbelly();
            }
            List<supplicat> listPicketboat = picketboat();
            Set<? extends Object> setAttabal = androidx.compose.runtime.collection.marial.attabal(this.snapshotInvalidations);
            this.snapshotInvalidations = new androidx.collection.saran<>(0, 1, null);
            try {
                int size = listPicketboat.size();
                for (int i = 0; i < size; i++) {
                    listPicketboat.get(i).kowloon(setAttabal);
                    if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.stateLock) {
                    if (lerp() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zUnderbelly = underbelly();
                }
                return zUnderbelly;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.cutely(setAttabal);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: empress, reason: from getter */
    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // androidx.compose.runtime.graveside
    public void formularize(nosophobia reference) {
        kotlinx.coroutines.impassible<Unit> impassibleVarLerp;
        synchronized (this.stateLock) {
            this.movableContentAwaitingInsert.add(reference);
            impassibleVarLerp = lerp();
        }
        if (impassibleVarLerp != null) {
            Result.Companion companion = Result.INSTANCE;
            impassibleVarLerp.resumeWith(Result.m3351constructorimpl(Unit.f29295attabal));
        }
    }

    @Override // androidx.compose.runtime.graveside
    public void graveside(supplicat composition) {
        synchronized (this.stateLock) {
            attendance(composition);
            this.compositionInvalidations.monoploid(composition);
            this.compositionsAwaitingApply.remove(composition);
            Unit unit = Unit.f29295attabal;
        }
    }

    public final List<supplicat> gusty() {
        List<supplicat> listPicketboat;
        synchronized (this.stateLock) {
            listPicketboat = picketboat();
        }
        return listPicketboat;
    }

    public final Function1<Object, Unit> herdbook(final supplicat composition) {
        return new Function1() { // from class: androidx.compose.runtime.vesuvio
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Recomposer.technofreak(composition, obj);
            }
        };
    }

    public final void homozygous() {
        kotlinx.coroutines.impassible<Unit> impassibleVarLerp;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                impassibleVarLerp = lerp();
            } else {
                impassibleVarLerp = null;
            }
        }
        if (impassibleVarLerp != null) {
            Result.Companion companion = Result.INSTANCE;
            impassibleVarLerp.resumeWith(Result.m3351constructorimpl(Unit.f29295attabal));
        }
    }

    public final Object igbo(wretchedly.dern<? super Unit> dernVar) {
        Object objPolloi = kotlinx.coroutines.flow.marial.polloi(coi(), new Recomposer$join$2(null), dernVar);
        return objPolloi == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objPolloi : Unit.f29295attabal;
    }

    @Override // androidx.compose.runtime.graveside
    public void impassible(supplicat composition) {
        kotlinx.coroutines.impassible<Unit> impassibleVarLerp;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.taiyuan(composition)) {
                impassibleVarLerp = null;
            } else {
                this.compositionInvalidations.saneness(composition);
                impassibleVarLerp = lerp();
            }
        }
        if (impassibleVarLerp != null) {
            Result.Companion companion = Result.INSTANCE;
            impassibleVarLerp.resumeWith(Result.m3351constructorimpl(Unit.f29295attabal));
        }
    }

    @Override // androidx.compose.runtime.graveside
    public molybdenite impromptu() {
        return null;
    }

    public final void itchy() {
        Iterator<T> it = picketboat().iterator();
        while (it.hasNext()) {
            libyan((supplicat) it.next());
        }
        this._knownCompositions.clear();
        this._knownCompositionsCache = p002kotlin.collections.adultoid.formularize();
    }

    public final List<supplicat> julian(List<nosophobia> references, androidx.collection.saran<Object> modifiedValues) {
        ArrayList<Pair<nosophobia, nosophobia>> arrayList;
        preterite preteriteVarMarial;
        HashMap map = new HashMap(references.size());
        int size = references.size();
        for (int i = 0; i < size; i++) {
            nosophobia nosophobiaVar = references.get(i);
            supplicat composition = nosophobiaVar.getComposition();
            Object arrayList2 = map.get(composition);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(composition, arrayList2);
            }
            ((ArrayList) arrayList2).add(nosophobiaVar);
        }
        for (Map.Entry entry : map.entrySet()) {
            supplicat supplicatVar = (supplicat) entry.getKey();
            List list = (List) entry.getValue();
            if (supplicatVar.polloi()) {
                polloi.adultoid("Check failed");
            }
            androidx.compose.runtime.snapshots.wireman wiremanVarKowloon = androidx.compose.runtime.snapshots.formularize.INSTANCE.kowloon(herdbook(supplicatVar), deadwork(supplicatVar, modifiedValues));
            try {
                androidx.compose.runtime.snapshots.formularize formularizeVarFormularize = wiremanVarKowloon.formularize();
                try {
                    synchronized (this.stateLock) {
                        try {
                            arrayList = new ArrayList(list.size());
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                nosophobia nosophobiaVar2 = (nosophobia) list.get(i2);
                                Object objImpassible = androidx.compose.runtime.collection.saneness.impassible(this.movableContentRemoved, nosophobiaVar2.dern());
                                nosophobia nosophobiaVar3 = (nosophobia) objImpassible;
                                if (nosophobiaVar3 != null) {
                                    this.movableContentNestedStatesAvailable.beachfront(nosophobiaVar3);
                                }
                                arrayList.add(patroclinal.formularize.attabal(nosophobiaVar2, objImpassible));
                            }
                            if (impromptu.isMovingNestedMovableContentEnabled) {
                                int size3 = arrayList.size();
                                for (int i3 = 0; i3 < size3; i3++) {
                                    Pair<nosophobia, nosophobia> pair = arrayList.get(i3);
                                    if (pair.getSecond() == null && this.movableContentNestedStatesAvailable.wireman(pair.getFirst().dern())) {
                                        ArrayList arrayList3 = new ArrayList(p002kotlin.collections.dovishness.gintrap(arrayList, 10));
                                        for (Pair<nosophobia, nosophobia> pairAttabal : arrayList) {
                                            if (pairAttabal.getSecond() == null && (preteriteVarMarial = this.movableContentNestedStatesAvailable.marial(pairAttabal.getFirst().dern())) != null) {
                                                nosophobia content = preteriteVarMarial.getContent();
                                                androidx.compose.runtime.collection.saneness.attabal(this.movableContentNestedExtractionsPending, preteriteVarMarial.getContainer(), content);
                                                pairAttabal = patroclinal.formularize.attabal(pairAttabal.getFirst(), content);
                                            }
                                            arrayList3.add(pairAttabal);
                                        }
                                        arrayList = arrayList3;
                                        break;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size4 = arrayList.size();
                    for (int i4 = 0; i4 < size4; i4++) {
                        if (arrayList.get(i4).getSecond() != null) {
                            int size5 = arrayList.size();
                            for (int i5 = 0; i5 < size5; i5++) {
                                if (arrayList.get(i5).getSecond() == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size6 = arrayList.size();
                                    for (int i6 = 0; i6 < size6; i6++) {
                                        Pair<nosophobia, nosophobia> pair2 = arrayList.get(i6);
                                        nosophobia first = pair2.getSecond() == null ? pair2.getFirst() : null;
                                        if (first != null) {
                                            arrayList4.add(first);
                                        }
                                    }
                                    synchronized (this.stateLock) {
                                        p002kotlin.collections.cord.stratoscope(this.movableContentAwaitingInsert, arrayList4);
                                        Unit unit = Unit.f29295attabal;
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        Pair<nosophobia, nosophobia> pair3 = arrayList.get(i7);
                                        if (pair3.getSecond() != null) {
                                            arrayList5.add(pair3);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    supplicatVar.taiyuan(arrayList);
                    Unit unit2 = Unit.f29295attabal;
                    wiremanVarKowloon.molybdenite(formularizeVarFormularize);
                    premeiotic(wiremanVarKowloon);
                } catch (Throwable th2) {
                    wiremanVarKowloon.molybdenite(formularizeVarFormularize);
                    throw th2;
                }
            } catch (Throwable th3) {
                premeiotic(wiremanVarKowloon);
                throw th3;
            }
        }
        return CollectionsKt.molet(map.keySet());
    }

    @Override // androidx.compose.runtime.graveside
    public lerp kowloon(nosophobia reference) {
        lerp lerpVarMonoploid;
        synchronized (this.stateLock) {
            lerpVarMonoploid = this.movableContentStatesAvailable.monoploid(reference);
        }
        return lerpVarMonoploid;
    }

    public final Object lampshade(wretchedly.dern<? super Unit> dernVar) {
        Object objOutmarry = outmarry(new Recomposer$runRecomposeAndApplyChanges$2(this, null), dernVar);
        return objOutmarry == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objOutmarry : Unit.f29295attabal;
    }

    public final kotlinx.coroutines.impassible<Unit> lerp() {
        State state;
        if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
            itchy();
            this.snapshotInvalidations = new androidx.collection.saran<>(0, 1, null);
            this.compositionInvalidations.impromptu();
            this.compositionsAwaitingApply.clear();
            this.movableContentAwaitingInsert.clear();
            this.failedCompositions = null;
            kotlinx.coroutines.impassible<? super Unit> impassibleVar = this.workContinuation;
            if (impassibleVar != null) {
                kotlinx.coroutines.impassible.attabal.attabal(impassibleVar, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState = null;
            return null;
        }
        if (this.errorState != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new androidx.collection.saran<>(0, 1, null);
            this.compositionInvalidations.impromptu();
            state = sensatory() ? State.InactivePendingWork : State.Inactive;
        } else {
            state = (this.compositionInvalidations.getSize() == 0 && !this.snapshotInvalidations.marial() && this.compositionsAwaitingApply.isEmpty() && this.movableContentAwaitingInsert.isEmpty() && this.concurrentCompositionsOutstanding <= 0 && !sensatory() && !androidx.compose.runtime.collection.saneness.apical(this.movableContentRemoved)) ? State.Idle : State.PendingWork;
        }
        this._state.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        kotlinx.coroutines.impassible impassibleVar2 = this.workContinuation;
        this.workContinuation = null;
        return impassibleVar2;
    }

    public final void libyan(supplicat composition) {
        androidx.collection.seminary<oilcan.impassible> seminaryVar = this.registrationObservers;
        if (seminaryVar != null) {
            Object[] objArr = seminaryVar.content;
            int i = seminaryVar._size;
            for (int i2 = 0; i2 < i; i2++) {
                oilcan.impassible impassibleVar = (oilcan.impassible) objArr[i2];
                if (composition instanceof oilcan.polloi) {
                    impassibleVar.attabal((oilcan.polloi) composition);
                }
            }
        }
    }

    public final void lightstruck(supplicat composition) {
        synchronized (this.stateLock) {
            List<nosophobia> list = this.movableContentAwaitingInsert;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.wireman(list.get(i).getComposition(), composition)) {
                    Unit unit = Unit.f29295attabal;
                    ArrayList arrayList = new ArrayList();
                    monroe(arrayList, this, composition);
                    while (!arrayList.isEmpty()) {
                        julian(arrayList, null);
                        monroe(arrayList, this, composition);
                    }
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.runtime.graveside
    public boolean marial() {
        return false;
    }

    public final void mastfed(kotlinx.coroutines.monroe callingJob) {
        synchronized (this.stateLock) {
            Throwable th = this.closeCause;
            if (th != null) {
                throw th;
            }
            if (this._state.getValue().compareTo(State.ShuttingDown) <= 0) {
                throw new IllegalStateException("Recomposer shut down");
            }
            if (this.runnerJob != null) {
                throw new IllegalStateException("Recomposer already running");
            }
            this.runnerJob = callingJob;
            lerp();
        }
    }

    public final void nosophobia() {
        int i;
        ObjectList objectListBeachfront;
        synchronized (this.stateLock) {
            try {
                if (androidx.compose.runtime.collection.saneness.apical(this.movableContentRemoved)) {
                    ObjectList objectListMonoploid = androidx.compose.runtime.collection.saneness.monoploid(this.movableContentRemoved);
                    androidx.compose.runtime.collection.saneness.dern(this.movableContentRemoved);
                    this.movableContentNestedStatesAvailable.dern();
                    androidx.compose.runtime.collection.saneness.dern(this.movableContentNestedExtractionsPending);
                    androidx.collection.seminary seminaryVar = new androidx.collection.seminary(objectListMonoploid.get_size());
                    Object[] objArr = objectListMonoploid.content;
                    int i2 = objectListMonoploid._size;
                    for (int i3 = 0; i3 < i2; i3++) {
                        nosophobia nosophobiaVar = (nosophobia) objArr[i3];
                        seminaryVar.triweekly(patroclinal.formularize.attabal(nosophobiaVar, this.movableContentStatesAvailable.dern(nosophobiaVar)));
                    }
                    this.movableContentStatesAvailable.taiyuan();
                    objectListBeachfront = seminaryVar;
                } else {
                    objectListBeachfront = androidx.collection.hydrovane.beachfront();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr2 = objectListBeachfront.content;
        int i4 = objectListBeachfront._size;
        for (i = 0; i < i4; i++) {
            Pair pair = (Pair) objArr2[i];
            nosophobia nosophobiaVar2 = (nosophobia) pair.component1();
            lerp lerpVar = (lerp) pair.component2();
            if (lerpVar != null) {
                nosophobiaVar2.getComposition().impromptu(lerpVar);
            }
        }
    }

    public final Object outmarry(tetrahedral.triweekly<? super kotlinx.coroutines.saran, ? super milliradian, ? super wretchedly.dern<? super Unit>, ? extends Object> triweeklyVar, wretchedly.dern<? super Unit> dernVar) {
        Object objCompetently = kotlinx.coroutines.impromptu.competently(this.broadcastFrameClock, new Recomposer$recompositionRunner$2(this, triweeklyVar, treadless.attabal(dernVar.getContext()), null), dernVar);
        return objCompetently == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCompetently : Unit.f29295attabal;
    }

    public final void palmyra() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            Unit unit = Unit.f29295attabal;
        }
    }

    public final List<supplicat> picketboat() {
        List list = this._knownCompositionsCache;
        if (list != null) {
            return list;
        }
        List<supplicat> list2 = this._knownCompositions;
        List<supplicat> listFormularize = list2.isEmpty() ? p002kotlin.collections.adultoid.formularize() : new ArrayList(list2);
        this._knownCompositionsCache = listFormularize;
        return listFormularize;
    }

    public final void premeiotic(androidx.compose.runtime.snapshots.wireman snapshot) {
        try {
            if (snapshot.trm() instanceof androidx.compose.runtime.snapshots.impassible.attabal) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            snapshot.wireman();
        } catch (Throwable th) {
            snapshot.wireman();
            throw th;
        }
    }

    public final boolean preterite() {
        boolean z;
        synchronized (this.stateLock) {
            z = this.snapshotInvalidations.marial() || this.compositionInvalidations.getSize() != 0 || sensatory();
        }
        return z;
    }

    @Override // androidx.compose.runtime.graveside
    public void saneness(nosophobia reference) {
        kotlinx.coroutines.impassible<Unit> impassibleVarLerp;
        synchronized (this.stateLock) {
            try {
                androidx.compose.runtime.collection.saneness.attabal(this.movableContentRemoved, reference.dern(), reference);
                if (reference.beachfront() != null) {
                    coffeecake(this, reference, reference);
                }
                impassibleVarLerp = lerp();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (impassibleVarLerp != null) {
            Result.Companion companion = Result.INSTANCE;
            impassibleVarLerp.resumeWith(Result.m3351constructorimpl(Unit.f29295attabal));
        }
    }

    public final boolean sensatory() {
        return !this.frameClockPaused && this.broadcastFrameClock.impassible();
    }

    public final void setterwort(supplicat composition) {
        androidx.collection.seminary<oilcan.impassible> seminaryVar = this.registrationObservers;
        if (seminaryVar != null) {
            Object[] objArr = seminaryVar.content;
            int i = seminaryVar._size;
            for (int i2 = 0; i2 < i; i2++) {
                oilcan.impassible impassibleVar = (oilcan.impassible) objArr[i2];
                if (composition instanceof oilcan.polloi) {
                    impassibleVar.saneness((oilcan.polloi) composition);
                }
            }
        }
    }

    public final Object timberyard(wretchedly.dern<? super Unit> dernVar) {
        kotlinx.coroutines.kowloon kowloonVar;
        if (preterite()) {
            return Unit.f29295attabal;
        }
        kotlinx.coroutines.kowloon kowloonVar2 = new kotlinx.coroutines.kowloon(IntrinsicsKt__IntrinsicsJvmKt.dern(dernVar), 1);
        kowloonVar2.kattegat();
        synchronized (this.stateLock) {
            if (preterite()) {
                kowloonVar = kowloonVar2;
            } else {
                this.workContinuation = kowloonVar2;
                kowloonVar = null;
            }
        }
        if (kowloonVar != null) {
            Result.Companion companion = Result.INSTANCE;
            kowloonVar.resumeWith(Result.m3351constructorimpl(Unit.f29295attabal));
        }
        Object objCuirassed = kowloonVar2.cuirassed();
        if (objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront()) {
            igo.beachfront.dern(dernVar);
        }
        return objCuirassed == p002kotlin.coroutines.intrinsics.attabal.beachfront() ? objCuirassed : Unit.f29295attabal;
    }

    public final void treadless() {
        synchronized (this.stateLock) {
            try {
                if (this._state.getValue().compareTo(State.Idle) >= 0) {
                    this._state.setValue(State.ShuttingDown);
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
        kotlinx.coroutines.monroe.attabal.attabal(this.effectJob, null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x006d A[Catch: all -> 0x0063, LOOP:0: B:9:0x002d->B:21:0x006d, LOOP_END, TryCatch #0 {all -> 0x0063, blocks: (B:4:0x0009, B:6:0x001a, B:9:0x002d, B:11:0x003d, B:13:0x0049, B:15:0x0052, B:18:0x0065, B:21:0x006d, B:22:0x0070), top: B:27:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0070 A[EDGE_INSN: B:30:0x0070->B:22:0x0070 BREAK  A[LOOP:0: B:9:0x002d->B:21:0x006d], SYNTHETIC] */
    @Override // androidx.compose.runtime.graveside
    public void triweekly(nosophobia reference, lerp data, wireman<?> applier) {
        synchronized (this.stateLock) {
            try {
                this.movableContentStatesAvailable.graveside(reference, data);
                ObjectList<nosophobia> objectListImpromptu = androidx.compose.runtime.collection.saneness.impromptu(this.movableContentNestedExtractionsPending, reference);
                if (objectListImpromptu.impromptu()) {
                    androidx.collection.walach<nosophobia, lerp> walachVarMarial = data.marial(applier, objectListImpromptu);
                    Object[] objArr = walachVarMarial.keys;
                    Object[] objArr2 = walachVarMarial.values;
                    long[] jArr = walachVarMarial.com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.TAG_METADATA java.lang.String;
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
                                        this.movableContentStatesAvailable.graveside((nosophobia) obj, (lerp) objArr2[i4]);
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
                }
                Unit unit = Unit.f29295attabal;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean underbelly() {
        return this.compositionInvalidations.getSize() != 0 || sensatory() || androidx.compose.runtime.collection.saneness.apical(this.movableContentRemoved);
    }

    public final void vesuvio(supplicat composition) {
        List arrayList = this.failedCompositions;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.failedCompositions = arrayList;
        }
        if (!arrayList.contains(composition)) {
            arrayList.add(composition);
        }
        attendance(composition);
    }

    @Override // androidx.compose.runtime.graveside
    public boolean wireman() {
        return f5786sealless.get().booleanValue();
    }

    public final boolean wostteth() {
        boolean z;
        synchronized (this.stateLock) {
            z = this.isClosed;
        }
        if (!z) {
            return true;
        }
        Iterator<kotlinx.coroutines.monroe> it = this.effectJob.arytenoidectomy().iterator();
        while (it.hasNext()) {
            if (it.next().isActive()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.runtime.graveside
    public void arytenoidectomy(Set<oilcan.marial> table) {
    }
}
