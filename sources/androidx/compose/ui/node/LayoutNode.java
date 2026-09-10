package androidx.compose.ui.node;

import android.os.Trace;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.platform.outmarry;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.ironsource.C3700q2;
import com.ironsource.Y3;
import com.unity3d.services.UnityAdsConstants;
import java.util.Comparator;
import java.util.List;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: compiled from: LayoutNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 Û\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00052\u00020\u0006:\u0006hÃ\u0002eÄ\u0002B\u001b\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0014\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0018\u0010\u000fJ\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001d\u0010\u000fJ\u000f\u0010\u001e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001e\u0010\u000fJ\u000f\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u001f\u0010\u000fJ\u000f\u0010 \u001a\u00020\rH\u0000¢\u0006\u0004\b \u0010\u000fJ\u001f\u0010#\u001a\u00020\r2\u0006\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u0000H\u0000¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\rH\u0000¢\u0006\u0004\b%\u0010\u000fJ\u001f\u0010'\u001a\u00020\r2\u0006\u0010!\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0000¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\rH\u0000¢\u0006\u0004\b)\u0010\u000fJ'\u0010,\u001a\u00020\r2\u0006\u0010*\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t2\u0006\u0010&\u001a\u00020\tH\u0000¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\rH\u0000¢\u0006\u0004\b.\u0010\u000fJ\u0017\u00101\u001a\u00020\r2\u0006\u00100\u001a\u00020/H\u0000¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\rH\u0000¢\u0006\u0004\b3\u0010\u000fJ\u000f\u00104\u001a\u00020\u0015H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\rH\u0000¢\u0006\u0004\b6\u0010\u000fJ\u000f\u00107\u001a\u00020\rH\u0000¢\u0006\u0004\b7\u0010\u000fJ\u001f\u0010:\u001a\u00020\r2\u0006\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\tH\u0000¢\u0006\u0004\b:\u0010(J\u000f\u0010;\u001a\u00020\rH\u0000¢\u0006\u0004\b;\u0010\u000fJ\u000f\u0010<\u001a\u00020\rH\u0000¢\u0006\u0004\b<\u0010\u000fJ!\u0010A\u001a\u00020\r2\u0006\u0010>\u001a\u00020=2\b\u0010@\u001a\u0004\u0018\u00010?H\u0000¢\u0006\u0004\bA\u0010BJ6\u0010I\u001a\u00020\r2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\b\b\u0002\u0010G\u001a\u00020\u00072\b\b\u0002\u0010H\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\bI\u0010JJ6\u0010L\u001a\u00020\r2\u0006\u0010D\u001a\u00020C2\u0006\u0010K\u001a\u00020E2\b\b\u0002\u0010G\u001a\u00020\u00072\b\b\u0002\u0010H\u001a\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\bL\u0010JJ\u0017\u0010N\u001a\u00020\r2\u0006\u0010M\u001a\u00020\u0000H\u0000¢\u0006\u0004\bN\u0010\u0013J-\u0010R\u001a\u00020\r2\b\b\u0002\u0010O\u001a\u00020\u00072\b\b\u0002\u0010P\u001a\u00020\u00072\b\b\u0002\u0010Q\u001a\u00020\u0007H\u0000¢\u0006\u0004\bR\u0010SJ-\u0010T\u001a\u00020\r2\b\b\u0002\u0010O\u001a\u00020\u00072\b\b\u0002\u0010P\u001a\u00020\u00072\b\b\u0002\u0010Q\u001a\u00020\u0007H\u0000¢\u0006\u0004\bT\u0010SJ\u000f\u0010U\u001a\u00020\rH\u0000¢\u0006\u0004\bU\u0010\u000fJ\u000f\u0010V\u001a\u00020\rH\u0000¢\u0006\u0004\bV\u0010\u000fJ\u0019\u0010W\u001a\u00020\r2\b\b\u0002\u0010O\u001a\u00020\u0007H\u0000¢\u0006\u0004\bW\u0010XJ\u0019\u0010Y\u001a\u00020\r2\b\b\u0002\u0010O\u001a\u00020\u0007H\u0000¢\u0006\u0004\bY\u0010XJ\u000f\u0010Z\u001a\u00020\rH\u0000¢\u0006\u0004\bZ\u0010\u000fJ\u000f\u0010[\u001a\u00020\rH\u0000¢\u0006\u0004\b[\u0010\u000fJ\u001e\u0010^\u001a\u00020\u00072\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\\H\u0000ø\u0001\u0000¢\u0006\u0004\b^\u0010_J\u001e\u0010`\u001a\u00020\u00072\n\b\u0002\u0010]\u001a\u0004\u0018\u00010\\H\u0000ø\u0001\u0000¢\u0006\u0004\b`\u0010_J\u000f\u0010a\u001a\u00020\rH\u0000¢\u0006\u0004\ba\u0010\u000fJ\u000f\u0010b\u001a\u00020\rH\u0000¢\u0006\u0004\bb\u0010\u000fJ\u000f\u0010c\u001a\u00020\rH\u0000¢\u0006\u0004\bc\u0010\u000fJ\u000f\u0010d\u001a\u00020\rH\u0000¢\u0006\u0004\bd\u0010\u000fJ\u000f\u0010e\u001a\u00020\rH\u0016¢\u0006\u0004\be\u0010\u000fJ\u000f\u0010f\u001a\u00020\rH\u0000¢\u0006\u0004\bf\u0010\u000fJ\u000f\u0010g\u001a\u00020\rH\u0000¢\u0006\u0004\bg\u0010\u000fJ\u000f\u0010h\u001a\u00020\rH\u0016¢\u0006\u0004\bh\u0010\u000fJ\u000f\u0010i\u001a\u00020\rH\u0016¢\u0006\u0004\bi\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b3\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010t\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bZ\u0010k\u001a\u0004\bq\u0010r\"\u0004\bs\u0010XR.\u0010z\u001a\u0004\u0018\u00010\u00002\b\u0010u\u001a\u0004\u0018\u00010\u00008\u0000@BX\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010\u0013R\u0016\u0010|\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010lR\u001b\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR\"\u0010\u0084\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0018\u0010\u0086\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010kR\u001a\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010vR-\u00100\u001a\u0004\u0018\u00010/2\t\u0010\u0089\u0001\u001a\u0004\u0018\u00010/8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001R3\u0010\u0096\u0001\u001a\f\u0018\u00010\u008e\u0001j\u0005\u0018\u0001`\u008f\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R%\u0010\u0014\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0097\u0001\u0010l\u001a\u0005\b\u0098\u0001\u0010n\"\u0005\b\u0099\u0001\u0010pR\u0018\u0010\u009a\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010kR\u001c\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u009d\u0001R\u001e\u0010 \u0001\u001a\t\u0012\u0004\u0012\u00020\u00000\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u0083\u0001R\u0018\u0010¢\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¡\u0001\u0010kR4\u0010«\u0001\u001a\u00030£\u00012\b\u0010¤\u0001\u001a\u00030£\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b¥\u0001\u0010¦\u0001\u001a\u0006\b§\u0001\u0010¨\u0001\"\u0006\b©\u0001\u0010ª\u0001R4\u0010²\u0001\u001a\u00030¬\u00012\b\u0010¤\u0001\u001a\u00030¬\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u00ad\u0001\u0010®\u0001\u001a\u0006\b\u0097\u0001\u0010¯\u0001\"\u0006\b°\u0001\u0010±\u0001R4\u0010º\u0001\u001a\u00030³\u00012\b\u0010¤\u0001\u001a\u00030³\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b´\u0001\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R4\u0010Â\u0001\u001a\u00030»\u00012\b\u0010¤\u0001\u001a\u00030»\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0006\bÀ\u0001\u0010Á\u0001R4\u0010Ê\u0001\u001a\u00030Ã\u00012\b\u0010¤\u0001\u001a\u00030Ã\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R*\u0010Ñ\u0001\u001a\u00030Ë\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÌ\u0001\u0010Í\u0001\u001a\u0006\b´\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001R\u001a\u0010Ó\u0001\u001a\u00030Ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0001\u0010Í\u0001R-\u0010×\u0001\u001a\u00020\u00078\u0000@\u0000X\u0081\u000e¢\u0006\u001c\n\u0005\bÔ\u0001\u0010k\u0012\u0005\bÖ\u0001\u0010\u000f\u001a\u0005\b\u0082\u0001\u0010r\"\u0005\bÕ\u0001\u0010XR \u0010Ý\u0001\u001a\u00030Ø\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÙ\u0001\u0010Ú\u0001\u001a\u0006\bÛ\u0001\u0010Ü\u0001R\u001f\u0010á\u0001\u001a\u00030Þ\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bw\u0010ß\u0001\u001a\u0006\b¼\u0001\u0010à\u0001R\u001c\u0010å\u0001\u001a\u0005\u0018\u00010â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R&\u0010é\u0001\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\bæ\u0001\u0010k\u001a\u0005\bç\u0001\u0010r\"\u0005\bè\u0001\u0010XR\u0019\u0010ì\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R\u001b\u0010í\u0001\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010ë\u0001R8\u0010õ\u0001\u001a\u0011\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\r\u0018\u00010î\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bï\u0001\u0010ð\u0001\u001a\u0006\bñ\u0001\u0010ò\u0001\"\u0006\bó\u0001\u0010ô\u0001R8\u0010ù\u0001\u001a\u0011\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\r\u0018\u00010î\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bö\u0001\u0010ð\u0001\u001a\u0006\b÷\u0001\u0010ò\u0001\"\u0006\bø\u0001\u0010ô\u0001R&\u0010ý\u0001\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\bú\u0001\u0010k\u001a\u0005\bû\u0001\u0010r\"\u0005\bü\u0001\u0010XR(\u0010ÿ\u0001\u001a\u00020\u00072\u0007\u0010\u0089\u0001\u001a\u00020\u00078\u0016@RX\u0096\u000e¢\u0006\u000e\n\u0005\bû\u0001\u0010k\u001a\u0005\bþ\u0001\u0010rR\u0018\u0010\u0083\u0002\u001a\u00030\u0080\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0081\u0002\u0010\u0082\u0002R\u001a\u0010\u0085\u0002\u001a\u0005\u0018\u00010â\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010\u0084\u0002R\u0016\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u00078F¢\u0006\b\u001a\u0006\b\u0086\u0002\u0010\u0087\u0002R\u001f\u0010\u008c\u0002\u001a\n\u0012\u0005\u0012\u00030\u008a\u00020\u0089\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u008b\u0002R\u001f\u0010\u008d\u0002\u001a\n\u0012\u0005\u0012\u00030\u008a\u00020\u0089\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u008b\u0002R\u001e\u0010\u0090\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u0081\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R\u001e\u0010\u0091\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u0089\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0002R\u0018\u0010\u0093\u0002\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0002\u0010xR\u0016\u0010\u0095\u0002\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0094\u0002\u0010rR\u0018\u0010\u0098\u0002\u001a\u00030\u0096\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010\u0097\u0002R\u001f\u0010\u009b\u0002\u001a\n\u0018\u00010\u0099\u0002R\u00030Þ\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÙ\u0001\u0010\u009a\u0002R\u001d\u0010\u009e\u0002\u001a\b0\u009c\u0002R\u00030Þ\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bæ\u0001\u0010\u009d\u0002R\u001a\u0010 \u0002\u001a\u0005\u0018\u00010\u009b\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u009f\u0002R%\u0010£\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u0081\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\b¢\u0002\u0010\u000f\u001a\u0006\b¡\u0002\u0010\u008f\u0002R\u0016\u0010¤\u0002\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¡\u0001\u0010rR\u0016\u0010¥\u0002\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010rR\u0016\u0010§\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¦\u0002\u0010nR\u0016\u0010¨\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009f\u0001\u0010nR\u0015\u0010©\u0002\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b{\u0010rR\u0018\u0010¬\u0002\u001a\u00030ª\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bã\u0001\u0010«\u0002R\u0016\u0010®\u0002\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u00ad\u0002\u0010rR\u0013\u0010°\u0002\u001a\u00020\u00078F¢\u0006\u0007\u001a\u0005\b¯\u0002\u0010rR\u0016\u0010²\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b±\u0002\u0010nR\u0018\u0010³\u0002\u001a\u00030Ë\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bï\u0001\u0010Î\u0001R\u0018\u0010´\u0002\u001a\u00030Ë\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bö\u0001\u0010Î\u0001R\u0018\u0010µ\u0002\u001a\u00030â\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010\u0084\u0002R\u0018\u0010·\u0002\u001a\u00030â\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¶\u0002\u0010\u0084\u0002R\u0015\u0010¸\u0002\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b~\u0010rR(\u0010\u001a\u001a\u00020\u00192\u0007\u0010¤\u0001\u001a\u00020\u00198V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\bú\u0001\u0010¹\u0002\"\u0005\bº\u0002\u0010\u001cR\u0018\u0010¾\u0002\u001a\u00030»\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¼\u0002\u0010½\u0002R\u0016\u0010¿\u0002\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bê\u0001\u0010rR\u0016\u0010À\u0002\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÄ\u0001\u0010rR\u0016\u0010Á\u0002\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÔ\u0001\u0010rR\u0016\u0010Â\u0002\u001a\u00020\u00078@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÒ\u0001\u0010r\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006Å\u0002"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/competently;", "Landroidx/compose/ui/layout/rotuma;", "Landroidx/compose/ui/node/mathsort;", "Landroidx/compose/ui/layout/taiyuan;", "", "Landroidx/compose/ui/node/peridotite$saneness;", "", "isVirtual", "", "semanticsId", "<init>", "(ZI)V", "", "homozygous", "()V", "gusty", "child", "vesuvio", "(Landroidx/compose/ui/node/LayoutNode;)V", "depth", "", "triweekly", "(I)Ljava/lang/String;", "setterwort", "Landroidx/compose/ui/attabal;", "modifier", "cutely", "(Landroidx/compose/ui/attabal;)V", "pruinose", "coi", "impassible", "tailoring", "index", C3700q2.p, "empress", "(ILandroidx/compose/ui/node/LayoutNode;)V", "mastfed", "count", "molet", "(II)V", "deadwork", "from", "to", "dhss", "(III)V", "igbo", "Landroidx/compose/ui/node/peridotite;", "owner", "apical", "(Landroidx/compose/ui/node/peridotite;)V", "arytenoidectomy", "toString", "()Ljava/lang/String;", "czestochowa", "wostteth", "x", "y", "attendance", "sakeen", "claque", "Lrestrictive/creditor;", "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "polloi", "(Lrestrictive/creditor;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Lsupplicat/competently;", "pointerPosition", "Landroidx/compose/ui/node/triweekly;", "hitTestResult", "isTouchEvent", "isInLayer", "lerp", "(JLandroidx/compose/ui/node/triweekly;ZZ)V", "hitSemanticsEntities", "lotta", "it", "cosy", "forceRequest", "scheduleMeasureAndLayout", "invalidateIntrinsics", "microchemistry", "(ZZZ)V", "tectonization", "underbelly", "preterite", "osteal", "(Z)V", "immediately", "monoploid", "sensatory", "Lmilliradian/saneness;", "constraints", "achondroplasia", "(Lmilliradian/saneness;)Z", "lampshade", "hardpan", "outmarry", "herdbook", "technofreak", "wireman", "formularize", "tarboosh", "dern", "saneness", "kowloon", "Z", "I", "premeiotic", "()I", "setSemanticsId", "(I)V", "julian", "()Z", "setVirtualLookaheadRoot$ui_release", "isVirtualLookaheadRoot", "newRoot", "Landroidx/compose/ui/node/LayoutNode;", "saran", "()Landroidx/compose/ui/node/LayoutNode;", "linendraper", "lookaheadRoot", "molybdenite", "virtualChildrenCount", "Landroidx/compose/ui/node/restrictive;", "graveside", "Landroidx/compose/ui/node/restrictive;", "_foldedChildren", "Landroidx/compose/runtime/collection/dern;", "adultoid", "Landroidx/compose/runtime/collection/dern;", "_unfoldedChildren", "dovishness", "unfoldedVirtualChildrenListDirty", "gintrap", "_foldedParent", "<set-?>", "rotuma", "Landroidx/compose/ui/node/peridotite;", "dent", "()Landroidx/compose/ui/node/peridotite;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "preprohormone", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "getInteropViewFactoryHolder$ui_release", "()Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "setInteropViewFactoryHolder$ui_release", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "interopViewFactoryHolder", "cord", "cuirassed", "setDepth$ui_release", "ignoreRemeasureRequests", "Landroidx/compose/ui/semantics/apical;", "stratoscope", "Landroidx/compose/ui/semantics/apical;", "_collapsedSemantics", "trm", "_zSortedChildren", "oilcan", "zSortedChildrenInvalidated", "Landroidx/compose/ui/layout/kowloon;", "value", "yemenite", "Landroidx/compose/ui/layout/kowloon;", "hydrovane", "()Landroidx/compose/ui/layout/kowloon;", "stupefactive", "(Landroidx/compose/ui/layout/kowloon;)V", "measurePolicy", "Lmilliradian/wireman;", "sealless", "Lmilliradian/wireman;", "()Lmilliradian/wireman;", "demilitarize", "(Lmilliradian/wireman;)V", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "kattegat", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Landroidx/compose/ui/platform/outmarry;", "supplicat", "Landroidx/compose/ui/platform/outmarry;", "timberyard", "()Landroidx/compose/ui/platform/outmarry;", "setViewConfiguration", "(Landroidx/compose/ui/platform/outmarry;)V", "viewConfiguration", "Landroidx/compose/runtime/trm;", "restrictive", "Landroidx/compose/runtime/trm;", "getCompositionLocalMap", "()Landroidx/compose/runtime/trm;", "setCompositionLocalMap", "(Landroidx/compose/runtime/trm;)V", "compositionLocalMap", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "merc", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "setIntrinsicsUsageByParent$ui_release", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "intrinsicsUsageByParent", "polder", "previousIntrinsicsUsageByParent", "seminary", "cig", "getCanMultiMeasure$ui_release$annotations", "canMultiMeasure", "Landroidx/compose/ui/node/seminary;", "grimness", "Landroidx/compose/ui/node/seminary;", "overspeculate", "()Landroidx/compose/ui/node/seminary;", "nodes", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate;", "layoutDelegate", "Landroidx/compose/ui/node/NodeCoordinator;", "privatdozent", "Landroidx/compose/ui/node/NodeCoordinator;", "_innerLayerCoordinator", "creditor", "getInnerLayerCoordinatorIsDirty$ui_release", "sultanate", "innerLayerCoordinatorIsDirty", "starveling", "Landroidx/compose/ui/attabal;", "_modifier", "pendingModifier", "Lkotlin/Function1;", "walach", "Lkotlin/jvm/functions/Function1;", "getOnAttach$ui_release", "()Lkotlin/jvm/functions/Function1;", "setOnAttach$ui_release", "(Lkotlin/jvm/functions/Function1;)V", "onAttach", "peridotite", "getOnDetach$ui_release", "setOnDetach$ui_release", "onDetach", "mathsort", "splinterproof", "decarock", "needsOnPositionedDispatch", "palmyra", "isDeactivated", "", "treadless", "()F", "zIndex", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerLayerCoordinator", "monroe", "()Ljava/lang/Boolean;", "isPlacedInLookahead", "", "Landroidx/compose/ui/layout/triweekly;", "()Ljava/util/List;", "childMeasurables", "childLookaheadMeasurables", "coffeecake", "()Landroidx/compose/runtime/collection/dern;", "_children", "children", "permissivist", "parent", "picketboat", "isAttached", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$LookaheadPassDelegate;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "()Landroidx/compose/ui/node/LayoutNodeLayoutDelegate$MeasurePassDelegate;", "measurePassDelegate", "()Landroidx/compose/ui/semantics/apical;", "collapsedSemantics", "itchy", "getZSortedChildren$annotations", "zSortedChildren", "isValidOwnerScope", "hasFixedInnerContentConstraints", "milliradian", "width", "height", "alignmentLinesRequired", "Landroidx/compose/ui/node/cord;", "()Landroidx/compose/ui/node/cord;", "mDrawScope", "attabal", "isPlaced", "lightstruck", "isPlacedByParent", "cultivated", "placeOrder", "measuredByParent", "measuredByParentInLookahead", "innerCoordinator", "clubfoot", "outerCoordinator", "applyingModifierOnAttach", "()Landroidx/compose/ui/attabal;", "libya", "Landroidx/compose/ui/layout/competently;", "marial", "()Landroidx/compose/ui/layout/competently;", Y3.f, "measurePending", "layoutPending", "lookaheadMeasurePending", "lookaheadLayoutPending", "LayoutState", "UsageByParent", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LayoutNode implements androidx.compose.runtime.competently, androidx.compose.ui.layout.rotuma, mathsort, androidx.compose.ui.layout.taiyuan, peridotite.saneness {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.runtime.collection.dern<LayoutNode> _unfoldedChildren;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public int semanticsId;

    /* JADX INFO: renamed from: cord, reason: collision with root package name and from kotlin metadata */
    public int depth;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name and from kotlin metadata */
    public boolean innerLayerCoordinatorIsDirty;

    /* JADX INFO: renamed from: cuirassed, reason: collision with root package name and from kotlin metadata */
    public boolean ignoreRemeasureRequests;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public boolean unfoldedVirtualChildrenListDirty;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public LayoutNode _foldedParent;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public final restrictive<LayoutNode> _foldedChildren;

    /* JADX INFO: renamed from: grimness, reason: collision with root package name and from kotlin metadata */
    public final seminary nodes;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.attabal pendingModifier;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    public LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final boolean isVirtual;

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name and from kotlin metadata */
    public boolean needsOnPositionedDispatch;

    /* JADX INFO: renamed from: merc, reason: collision with root package name and from kotlin metadata */
    public UsageByParent intrinsicsUsageByParent;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public int virtualChildrenCount;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public boolean isVirtualLookaheadRoot;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public boolean zSortedChildrenInvalidated;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name and from kotlin metadata */
    public Function1<? super peridotite, Unit> onDetach;

    /* JADX INFO: renamed from: polder, reason: collision with root package name and from kotlin metadata */
    public UsageByParent previousIntrinsicsUsageByParent;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public LayoutNode lookaheadRoot;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public AndroidViewHolder interopViewFactoryHolder;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name and from kotlin metadata */
    public NodeCoordinator _innerLayerCoordinator;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.runtime.trm compositionLocalMap;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public peridotite owner;

    /* JADX INFO: renamed from: saran, reason: collision with root package name and from kotlin metadata */
    public final LayoutNodeLayoutDelegate layoutDelegate;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public milliradian.wireman density;

    /* JADX INFO: renamed from: seminary, reason: collision with root package name and from kotlin metadata */
    public boolean canMultiMeasure;

    /* JADX INFO: renamed from: splinterproof, reason: collision with root package name and from kotlin metadata */
    public boolean isDeactivated;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.attabal _modifier;

    /* JADX INFO: renamed from: stratoscope, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.semantics.apical _collapsedSemantics;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
    public outmarry viewConfiguration;

    /* JADX INFO: renamed from: trm, reason: collision with root package name and from kotlin metadata */
    public final androidx.compose.runtime.collection.dern<LayoutNode> _zSortedChildren;

    /* JADX INFO: renamed from: walach, reason: collision with root package name and from kotlin metadata */
    public Function1<? super peridotite, Unit> onAttach;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.layout.kowloon measurePolicy;

    /* JADX INFO: renamed from: overspeculate, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: clubfoot, reason: collision with root package name */
    public static final int f6801clubfoot = 8;

    /* JADX INFO: renamed from: dent, reason: collision with root package name */
    public static final wireman f6803dent = new saneness();

    /* JADX INFO: renamed from: permissivist, reason: collision with root package name */
    public static final Function0<LayoutNode> f6805permissivist = new Function0<LayoutNode>() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p002kotlin.jvm.functions.Function0
        public final LayoutNode invoke() {
            return new LayoutNode(false, 0 == true ? 1 : 0, 3, null);
        }
    };

    /* JADX INFO: renamed from: cultivated, reason: collision with root package name */
    public static final outmarry f6802cultivated = new attabal();

    /* JADX INFO: renamed from: premeiotic, reason: collision with root package name */
    public static final Comparator<LayoutNode> f6806premeiotic = new Comparator() { // from class: androidx.compose.ui.node.rotuma
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LayoutNode.competently((LayoutNode) obj, (LayoutNode) obj2);
        }
    };

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "(Ljava/lang/String;I)V", "Measuring", "LookaheadMeasuring", "LayingOut", "LookaheadLayingOut", "Idle", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "(Ljava/lang/String;I)V", "InMeasureBlock", "InLayoutBlock", "NotUsed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0006"}, d2 = {"androidx/compose/ui/node/LayoutNode$attabal", "Landroidx/compose/ui/platform/outmarry;", "Lmilliradian/cutely;", "attabal", "()J", "minimumTouchTargetSize", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal implements outmarry {
        @Override // androidx.compose.ui.platform.outmarry
        public long attabal() {
            return milliradian.cutely.INSTANCE.attabal();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.LayoutNode$dern, reason: from kotlin metadata */
    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$dern;", "", "<init>", "()V", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode;", "ZComparator", "Ljava/util/Comparator;", "attabal", "()Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode$wireman;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$wireman;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Comparator<LayoutNode> attabal() {
            return LayoutNode.f6806premeiotic;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class marial {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public static final /* synthetic */ int[] f6843attabal;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6843attabal = iArr;
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"androidx/compose/ui/node/LayoutNode$saneness", "Landroidx/compose/ui/node/LayoutNode$wireman;", "Landroidx/compose/ui/layout/monoploid;", "", "Landroidx/compose/ui/layout/triweekly;", "measurables", "Lmilliradian/saneness;", "constraints", "", "saneness", "(Landroidx/compose/ui/layout/monoploid;Ljava/util/List;J)Ljava/lang/Void;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness extends wireman {
        public saneness() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // androidx.compose.ui.layout.kowloon
        public /* bridge */ /* synthetic */ androidx.compose.ui.layout.arytenoidectomy attabal(androidx.compose.ui.layout.monoploid monoploidVar, List list, long j) {
            return (androidx.compose.ui.layout.arytenoidectomy) saneness(monoploidVar, list, j);
        }

        public Void saneness(androidx.compose.ui.layout.monoploid monoploidVar, List<? extends androidx.compose.ui.layout.triweekly> list, long j) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    /* JADX INFO: compiled from: LayoutNode.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b \u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$wireman;", "Landroidx/compose/ui/layout/kowloon;", "", "error", "<init>", "(Ljava/lang/String;)V", "attabal", "Ljava/lang/String;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static abstract class wireman implements androidx.compose.ui.layout.kowloon {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public final String error;

        public wireman(String str) {
            this.error = str;
        }
    }

    public LayoutNode() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public static /* synthetic */ void basify(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.immediately(z);
    }

    public static final int competently(LayoutNode layoutNode, LayoutNode layoutNode2) {
        return layoutNode.treadless() == layoutNode2.treadless() ? Intrinsics.taiyuan(layoutNode.cultivated(), layoutNode2.cultivated()) : Float.compare(layoutNode.treadless(), layoutNode2.treadless());
    }

    public static /* synthetic */ void fastrack(LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        layoutNode.microchemistry(z, z2, z3);
    }

    public static /* synthetic */ String kowloon(LayoutNode layoutNode, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return layoutNode.triweekly(i);
    }

    public static /* synthetic */ boolean libyan(LayoutNode layoutNode, milliradian.saneness sanenessVar, int i, Object obj) {
        if ((i & 1) != 0) {
            sanenessVar = layoutNode.layoutDelegate.preprohormone();
        }
        return layoutNode.lampshade(sanenessVar);
    }

    public static /* synthetic */ void licking(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.osteal(z);
    }

    public static /* synthetic */ void nosophobia(LayoutNode layoutNode, long j, triweekly triweeklyVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        layoutNode.lerp(j, triweeklyVar, z3, z2);
    }

    public static /* synthetic */ void prefect(LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        layoutNode.tectonization(z, z2, z3);
    }

    public static /* synthetic */ void sayid(LayoutNode layoutNode, long j, triweekly triweeklyVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = true;
        }
        if ((i & 8) != 0) {
            z2 = true;
        }
        layoutNode.lotta(j, triweeklyVar, z, z2);
    }

    private final float treadless() {
        return creditor().palmyra();
    }

    public static /* synthetic */ boolean unconsolidated(LayoutNode layoutNode, milliradian.saneness sanenessVar, int i, Object obj) {
        if ((i & 1) != 0) {
            sanenessVar = layoutNode.layoutDelegate.cord();
        }
        return layoutNode.achondroplasia(sanenessVar);
    }

    public final boolean achondroplasia(milliradian.saneness constraints) {
        if (constraints == null || this.lookaheadRoot == null) {
            return false;
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegateGrimness = grimness();
        Intrinsics.beachfront(lookaheadPassDelegateGrimness);
        return lookaheadPassDelegateGrimness.claque(constraints.getValue());
    }

    /* JADX INFO: renamed from: adultoid, reason: from getter */
    public final boolean getCanMultiMeasure() {
        return this.canMultiMeasure;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    public final void apical(peridotite owner) {
        boolean z;
        LayoutNode layoutNode;
        int i = 0;
        if (!(this.owner == null)) {
            peridotite.attabal.saneness("Cannot attach " + this + " as it already is attached.  Tree: " + kowloon(this, 0, 1, null));
        }
        LayoutNode layoutNode2 = this._foldedParent;
        if (layoutNode2 == null) {
            z = true;
        } else if (Intrinsics.wireman(layoutNode2 != null ? layoutNode2.owner : null, owner)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Attaching to a different owner(");
            sb.append(owner);
            sb.append(") than the parent's owner(");
            LayoutNode layoutNodePermissivist = permissivist();
            sb.append(layoutNodePermissivist != null ? layoutNodePermissivist.owner : null);
            sb.append("). This tree: ");
            sb.append(kowloon(this, 0, 1, null));
            sb.append(" Parent tree: ");
            LayoutNode layoutNode3 = this._foldedParent;
            sb.append(layoutNode3 != null ? kowloon(layoutNode3, 0, 1, null) : null);
            peridotite.attabal.saneness(sb.toString());
        }
        LayoutNode layoutNodePermissivist2 = permissivist();
        if (layoutNodePermissivist2 == null) {
            creditor().homozygous(true);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegateGrimness = grimness();
            if (lookaheadPassDelegateGrimness != null) {
                lookaheadPassDelegateGrimness.dhss(true);
            }
        }
        clubfoot().philabeg(layoutNodePermissivist2 != null ? layoutNodePermissivist2.yemenite() : null);
        this.owner = owner;
        this.depth = (layoutNodePermissivist2 != null ? layoutNodePermissivist2.depth : -1) + 1;
        androidx.compose.ui.attabal attabalVar = this.pendingModifier;
        if (attabalVar != null) {
            cutely(attabalVar);
        }
        this.pendingModifier = null;
        if (this.nodes.monoploid(saran.attabal(8))) {
            igbo();
        }
        owner.arytenoidectomy(this);
        if (this.isVirtualLookaheadRoot) {
            linendraper(this);
        } else {
            LayoutNode layoutNode4 = this._foldedParent;
            if (layoutNode4 == null || (layoutNode = layoutNode4.lookaheadRoot) == null) {
                layoutNode = this.lookaheadRoot;
            }
            linendraper(layoutNode);
            if (this.lookaheadRoot == null && this.nodes.monoploid(saran.attabal(512))) {
                linendraper(this);
            }
        }
        if (!getIsDeactivated()) {
            this.nodes.molybdenite();
        }
        androidx.compose.runtime.collection.dern<LayoutNode> dernVarMarial = this._foldedChildren.marial();
        int size = dernVarMarial.getSize();
        if (size > 0) {
            LayoutNode[] layoutNodeArrApical = dernVarMarial.apical();
            do {
                layoutNodeArrApical[i].apical(owner);
                i++;
            } while (i < size);
        }
        if (!getIsDeactivated()) {
            this.nodes.preprohormone();
        }
        underbelly();
        if (layoutNodePermissivist2 != null) {
            layoutNodePermissivist2.underbelly();
        }
        NodeCoordinator wrapped = yemenite().getWrapped();
        for (NodeCoordinator nodeCoordinatorClubfoot = clubfoot(); !Intrinsics.wireman(nodeCoordinatorClubfoot, wrapped) && nodeCoordinatorClubfoot != null; nodeCoordinatorClubfoot = nodeCoordinatorClubfoot.getWrapped()) {
            nodeCoordinatorClubfoot.alloy();
        }
        Function1<? super peridotite, Unit> function1 = this.onAttach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        this.layoutDelegate.timberyard();
        if (getIsDeactivated()) {
            return;
        }
        coi();
    }

    public final void arytenoidectomy() {
        peridotite peridotiteVar = this.owner;
        if (peridotiteVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode layoutNodePermissivist = permissivist();
            sb.append(layoutNodePermissivist != null ? kowloon(layoutNodePermissivist, 0, 1, null) : null);
            peridotite.attabal.dern(sb.toString());
            throw new KotlinNothingValueException();
        }
        LayoutNode layoutNodePermissivist2 = permissivist();
        if (layoutNodePermissivist2 != null) {
            layoutNodePermissivist2.czestochowa();
            layoutNodePermissivist2.underbelly();
            LayoutNodeLayoutDelegate.MeasurePassDelegate measurePassDelegateCreditor = creditor();
            UsageByParent usageByParent = UsageByParent.NotUsed;
            measurePassDelegateCreditor.attendance(usageByParent);
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegateGrimness = grimness();
            if (lookaheadPassDelegateGrimness != null) {
                lookaheadPassDelegateGrimness.technofreak(usageByParent);
            }
        }
        this.layoutDelegate.splinterproof();
        Function1<? super peridotite, Unit> function1 = this.onDetach;
        if (function1 != null) {
            function1.invoke(peridotiteVar);
        }
        if (this.nodes.monoploid(saran.attabal(8))) {
            igbo();
        }
        this.nodes.cord();
        this.ignoreRemeasureRequests = true;
        androidx.compose.runtime.collection.dern<LayoutNode> dernVarMarial = this._foldedChildren.marial();
        int size = dernVarMarial.getSize();
        if (size > 0) {
            LayoutNode[] layoutNodeArrApical = dernVarMarial.apical();
            int i = 0;
            do {
                layoutNodeArrApical[i].arytenoidectomy();
                i++;
            } while (i < size);
        }
        this.ignoreRemeasureRequests = false;
        this.nodes.graveside();
        peridotiteVar.molybdenite(this);
        this.owner = null;
        linendraper(null);
        this.depth = 0;
        creditor().herdbook();
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegateGrimness2 = grimness();
        if (lookaheadPassDelegateGrimness2 != null) {
            lookaheadPassDelegateGrimness2.julian();
        }
    }

    @Override // androidx.compose.ui.layout.taiyuan
    public boolean attabal() {
        return creditor().attabal();
    }

    public final void attendance(int x, int y) {
        androidx.compose.ui.layout.gintrap.attabal placementScope;
        NodeCoordinator nodeCoordinatorYemenite;
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            impassible();
        }
        LayoutNode layoutNodePermissivist = permissivist();
        if (layoutNodePermissivist == null || (nodeCoordinatorYemenite = layoutNodePermissivist.yemenite()) == null || (placementScope = nodeCoordinatorYemenite.getPlacementScope()) == null) {
            placementScope = cuirassed.saneness(this).getPlacementScope();
        }
        androidx.compose.ui.layout.gintrap.attabal.formularize(placementScope, creditor(), x, y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, null);
    }

    public final void cig(boolean z) {
        this.canMultiMeasure = z;
    }

    public final void claque() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            impassible();
        }
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegateGrimness = grimness();
        Intrinsics.beachfront(lookaheadPassDelegateGrimness);
        lookaheadPassDelegateGrimness.hardpan();
    }

    public final NodeCoordinator clubfoot() {
        return this.nodes.getOuterCoordinator();
    }

    public final androidx.compose.runtime.collection.dern<LayoutNode> coffeecake() {
        tailoring();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.marial();
        }
        androidx.compose.runtime.collection.dern<LayoutNode> dernVar = this._unfoldedChildren;
        Intrinsics.beachfront(dernVar);
        return dernVar;
    }

    public final void coi() {
        if (this.nodes.arytenoidectomy(saran.attabal(1024) | saran.attabal(2048) | saran.attabal(4096))) {
            for (androidx.compose.ui.attabal.dern head = this.nodes.getHead(); head != null; head = head.getChild()) {
                if (((saran.attabal(1024) & head.getKindSet()) != 0) | ((saran.attabal(2048) & head.getKindSet()) != 0) | ((saran.attabal(4096) & head.getKindSet()) != 0)) {
                    privatdozent.attabal(head);
                }
            }
        }
    }

    /* JADX INFO: renamed from: cord, reason: from getter */
    public milliradian.wireman getDensity() {
        return this.density;
    }

    public final void cosy(LayoutNode it) {
        if (marial.f6843attabal[it.merc().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + it.merc());
        }
        if (it.seminary()) {
            prefect(it, true, false, false, 6, null);
            return;
        }
        if (it.polder()) {
            it.immediately(true);
        }
        if (it.starveling()) {
            fastrack(it, true, false, false, 6, null);
        } else if (it.restrictive()) {
            it.osteal(true);
        }
    }

    public final LayoutNodeLayoutDelegate.MeasurePassDelegate creditor() {
        return this.layoutDelegate.restrictive();
    }

    /* JADX INFO: renamed from: cuirassed, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    public final int cultivated() {
        return creditor().picketboat();
    }

    public final void cutely(androidx.compose.ui.attabal modifier) {
        this._modifier = modifier;
        this.nodes.yemenite(modifier);
        this.layoutDelegate.timberyard();
        if (this.lookaheadRoot == null && this.nodes.monoploid(saran.attabal(512))) {
            linendraper(this);
        }
    }

    public final void czestochowa() {
        NodeCoordinator nodeCoordinatorSealless = sealless();
        if (nodeCoordinatorSealless != null) {
            nodeCoordinatorSealless.cybernatic();
            return;
        }
        LayoutNode layoutNodePermissivist = permissivist();
        if (layoutNodePermissivist != null) {
            layoutNodePermissivist.czestochowa();
        }
    }

    public final void deadwork() {
        int iWireman = this._foldedChildren.wireman();
        while (true) {
            iWireman--;
            if (-1 >= iWireman) {
                this._foldedChildren.saneness();
                return;
            }
            vesuvio(this._foldedChildren.dern(iWireman));
        }
    }

    public final void decarock(boolean z) {
        this.needsOnPositionedDispatch = z;
    }

    public void demilitarize(milliradian.wireman wiremanVar) {
        if (Intrinsics.wireman(this.density, wiremanVar)) {
            return;
        }
        this.density = wiremanVar;
        setterwort();
        for (androidx.compose.ui.attabal.dern head = this.nodes.getHead(); head != null; head = head.getChild()) {
            if ((saran.attabal(16) & head.getKindSet()) != 0) {
                ((dent) head).restrictive();
            } else if (head instanceof kattegat.saneness) {
                ((kattegat.saneness) head).trm();
            }
        }
    }

    /* JADX INFO: renamed from: dent, reason: from getter */
    public final peridotite getOwner() {
        return this.owner;
    }

    @Override // androidx.compose.runtime.competently
    public void dern() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.dern();
        }
        this.isDeactivated = true;
        pruinose();
        if (picketboat()) {
            igbo();
        }
    }

    public final void dhss(int from, int to, int count) {
        if (from == to) {
            return;
        }
        for (int i = 0; i < count; i++) {
            this._foldedChildren.attabal(from > to ? to + i : (to + count) - 2, this._foldedChildren.beachfront(from > to ? from + i : from));
        }
        mastfed();
        gusty();
        underbelly();
    }

    public final List<androidx.compose.ui.layout.triweekly> dovishness() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegateGrimness = grimness();
        Intrinsics.beachfront(lookaheadPassDelegateGrimness);
        return lookaheadPassDelegateGrimness.empress();
    }

    public final void empress(int index, LayoutNode instance) {
        if (!(instance._foldedParent == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot insert ");
            sb.append(instance);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(kowloon(this, 0, 1, null));
            sb.append(" Other tree: ");
            LayoutNode layoutNode = instance._foldedParent;
            sb.append(layoutNode != null ? kowloon(layoutNode, 0, 1, null) : null);
            peridotite.attabal.saneness(sb.toString());
        }
        if (!(instance.owner == null)) {
            peridotite.attabal.saneness("Cannot insert " + instance + " because it already has an owner. This tree: " + kowloon(this, 0, 1, null) + " Other tree: " + kowloon(instance, 0, 1, null));
        }
        instance._foldedParent = this;
        this._foldedChildren.attabal(index, instance);
        mastfed();
        if (instance.isVirtual) {
            this.virtualChildrenCount++;
        }
        gusty();
        peridotite peridotiteVar = this.owner;
        if (peridotiteVar != null) {
            instance.apical(peridotiteVar);
        }
        if (instance.layoutDelegate.molybdenite() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.overspeculate(layoutNodeLayoutDelegate.molybdenite() + 1);
        }
    }

    public final void formularize() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = coffeecake();
        int size = dernVarCoffeecake.getSize();
        if (size > 0) {
            LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
            int i = 0;
            do {
                LayoutNode layoutNode = layoutNodeArrApical[i];
                if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                    layoutNode.formularize();
                }
                i++;
            } while (i < size);
        }
    }

    @Override // androidx.compose.ui.layout.taiyuan
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    public final List<androidx.compose.ui.layout.triweekly> gintrap() {
        return creditor().underbelly();
    }

    public final boolean graveside() {
        return this.pendingModifier != null;
    }

    public final LayoutNodeLayoutDelegate.LookaheadPassDelegate grimness() {
        return this.layoutDelegate.supplicat();
    }

    public final void gusty() {
        LayoutNode layoutNode;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (layoutNode = this._foldedParent) == null) {
            return;
        }
        layoutNode.gusty();
    }

    public final void hardpan() {
        this.layoutDelegate.privatdozent();
    }

    public final void herdbook() {
        this.layoutDelegate.creditor();
    }

    public final void homozygous() {
        if (this.unfoldedVirtualChildrenListDirty) {
            int i = 0;
            this.unfoldedVirtualChildrenListDirty = false;
            androidx.compose.runtime.collection.dern<LayoutNode> dernVar = this._unfoldedChildren;
            if (dernVar == null) {
                dernVar = new androidx.compose.runtime.collection.dern<>(new LayoutNode[16], 0);
                this._unfoldedChildren = dernVar;
            }
            dernVar.impromptu();
            androidx.compose.runtime.collection.dern<LayoutNode> dernVarMarial = this._foldedChildren.marial();
            int size = dernVarMarial.getSize();
            if (size > 0) {
                LayoutNode[] layoutNodeArrApical = dernVarMarial.apical();
                do {
                    LayoutNode layoutNode = layoutNodeArrApical[i];
                    if (layoutNode.isVirtual) {
                        dernVar.dern(dernVar.getSize(), layoutNode.coffeecake());
                    } else {
                        dernVar.saneness(layoutNode);
                    }
                    i++;
                } while (i < size);
            }
            this.layoutDelegate.saran();
        }
    }

    /* JADX INFO: renamed from: hydrovane, reason: from getter */
    public androidx.compose.ui.layout.kowloon getMeasurePolicy() {
        return this.measurePolicy;
    }

    public final void igbo() {
        this._collapsedSemantics = null;
        cuirassed.saneness(this).rotuma();
    }

    public final void immediately(boolean forceRequest) {
        peridotite peridotiteVar;
        if (this.isVirtual || (peridotiteVar = this.owner) == null) {
            return;
        }
        peridotiteVar.wireman(this, true, forceRequest);
    }

    public final void impassible() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = coffeecake();
        int size = dernVarCoffeecake.getSize();
        if (size > 0) {
            LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
            int i = 0;
            do {
                LayoutNode layoutNode = layoutNodeArrApical[i];
                if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                    layoutNode.impassible();
                }
                i++;
            } while (i < size);
        }
    }

    public final androidx.compose.runtime.collection.dern<LayoutNode> itchy() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.impromptu();
            androidx.compose.runtime.collection.dern<LayoutNode> dernVar = this._zSortedChildren;
            dernVar.dern(dernVar.getSize(), coffeecake());
            this._zSortedChildren.preprohormone(f6806premeiotic);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    /* JADX INFO: renamed from: julian, reason: from getter */
    public final boolean getIsVirtualLookaheadRoot() {
        return this.isVirtualLookaheadRoot;
    }

    /* JADX INFO: renamed from: kattegat, reason: from getter */
    public final UsageByParent getIntrinsicsUsageByParent() {
        return this.intrinsicsUsageByParent;
    }

    public final boolean lampshade(milliradian.saneness constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            formularize();
        }
        return creditor().vesuvio(constraints.getValue());
    }

    public final void lerp(long pointerPosition, triweekly hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        clubfoot().bluecoat(NodeCoordinator.INSTANCE.attabal(), NodeCoordinator.sultanate(clubfoot(), pointerPosition, false, 2, null), hitTestResult, isTouchEvent, isInLayer);
    }

    public void libya(androidx.compose.ui.attabal attabalVar) {
        if (!(!this.isVirtual || get_modifier() == androidx.compose.ui.attabal.INSTANCE)) {
            peridotite.attabal.attabal("Modifiers are not supported on virtual LayoutNodes");
        }
        if (getIsDeactivated()) {
            peridotite.attabal.attabal("modifier is updated when deactivated");
        }
        if (picketboat()) {
            cutely(attabalVar);
        } else {
            this.pendingModifier = attabalVar;
        }
    }

    public final boolean lightstruck() {
        return creditor().julian();
    }

    public final void linendraper(LayoutNode layoutNode) {
        if (Intrinsics.wireman(layoutNode, this.lookaheadRoot)) {
            return;
        }
        this.lookaheadRoot = layoutNode;
        if (layoutNode != null) {
            this.layoutDelegate.monoploid();
            NodeCoordinator wrapped = yemenite().getWrapped();
            for (NodeCoordinator nodeCoordinatorClubfoot = clubfoot(); !Intrinsics.wireman(nodeCoordinatorClubfoot, wrapped) && nodeCoordinatorClubfoot != null; nodeCoordinatorClubfoot = nodeCoordinatorClubfoot.getWrapped()) {
                nodeCoordinatorClubfoot.tarboosh();
            }
        }
        underbelly();
    }

    public final void lotta(long pointerPosition, triweekly hitSemanticsEntities, boolean isTouchEvent, boolean isInLayer) {
        clubfoot().bluecoat(NodeCoordinator.INSTANCE.saneness(), NodeCoordinator.sultanate(clubfoot(), pointerPosition, false, 2, null), hitSemanticsEntities, true, isInLayer);
    }

    @Override // androidx.compose.ui.layout.taiyuan
    public androidx.compose.ui.layout.competently marial() {
        return yemenite();
    }

    public final void mastfed() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        LayoutNode layoutNodePermissivist = permissivist();
        if (layoutNodePermissivist != null) {
            layoutNodePermissivist.mastfed();
        }
    }

    /* JADX INFO: renamed from: mathsort, reason: from getter */
    public androidx.compose.ui.attabal get_modifier() {
        return this._modifier;
    }

    public final LayoutState merc() {
        return this.layoutDelegate.stratoscope();
    }

    public final void microchemistry(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        peridotite peridotiteVar;
        if (this.ignoreRemeasureRequests || this.isVirtual || (peridotiteVar = this.owner) == null) {
            return;
        }
        peridotite.preprohormone(peridotiteVar, this, false, forceRequest, scheduleMeasureAndLayout, 2, null);
        if (invalidateIntrinsics) {
            creditor().lightstruck(forceRequest);
        }
    }

    public int milliradian() {
        return this.layoutDelegate.seminary();
    }

    public final void molet(int index, int count) {
        if (!(count >= 0)) {
            peridotite.attabal.attabal("count (" + count + ") must be greater than 0");
        }
        int i = (count + index) - 1;
        if (index > i) {
            return;
        }
        while (true) {
            vesuvio(this._foldedChildren.dern(i));
            this._foldedChildren.beachfront(i);
            if (i == index) {
                return;
            } else {
                i--;
            }
        }
    }

    public final boolean molybdenite() {
        androidx.compose.ui.node.attabal attabalVarTrm;
        AlignmentLines alignmentLinesSaneness;
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
        return layoutNodeLayoutDelegate.polloi().saneness().apical() || !((attabalVarTrm = layoutNodeLayoutDelegate.trm()) == null || (alignmentLinesSaneness = attabalVarTrm.saneness()) == null || !alignmentLinesSaneness.apical());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void monoploid() {
        if (merc() != LayoutState.Idle || restrictive() || starveling() || getIsDeactivated() || !attabal()) {
            return;
        }
        seminary seminaryVar = this.nodes;
        int iAttabal = saran.attabal(256);
        if ((seminaryVar.taiyuan() & iAttabal) != 0) {
            for (androidx.compose.ui.attabal.dern head = seminaryVar.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iAttabal) != 0) {
                    androidx.compose.ui.attabal.dern dernVarBeachfront = head;
                    androidx.compose.runtime.collection.dern dernVar = null;
                    while (dernVarBeachfront != 0) {
                        if (dernVarBeachfront instanceof impassible) {
                            impassible impassibleVar = (impassible) dernVarBeachfront;
                            impassibleVar.impromptu(beachfront.competently(impassibleVar, saran.attabal(256)));
                        } else if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof competently)) {
                            androidx.compose.ui.attabal.dern dernVarUnderbelly = ((competently) dernVarBeachfront).getDelegate();
                            int i = 0;
                            dernVarBeachfront = dernVarBeachfront;
                            while (dernVarUnderbelly != null) {
                                if ((dernVarUnderbelly.getKindSet() & iAttabal) != 0) {
                                    i++;
                                    if (i == 1) {
                                        dernVarBeachfront = dernVarUnderbelly;
                                    } else {
                                        if (dernVar == null) {
                                            dernVar = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                        }
                                        if (dernVarBeachfront != 0) {
                                            dernVar.saneness(dernVarBeachfront);
                                            dernVarBeachfront = 0;
                                        }
                                        dernVar.saneness(dernVarUnderbelly);
                                    }
                                }
                                dernVarUnderbelly = dernVarUnderbelly.getChild();
                                dernVarBeachfront = dernVarBeachfront;
                            }
                            if (i == 1) {
                            }
                        }
                        dernVarBeachfront = beachfront.beachfront(dernVar);
                    }
                }
                if ((head.getAggregateChildKindSet() & iAttabal) == 0) {
                    return;
                }
            }
        }
    }

    public final Boolean monroe() {
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegateGrimness = grimness();
        if (lookaheadPassDelegateGrimness != null) {
            return Boolean.valueOf(lookaheadPassDelegateGrimness.attabal());
        }
        return null;
    }

    @Override // androidx.compose.ui.node.mathsort
    public boolean oilcan() {
        return picketboat();
    }

    public final void osteal(boolean forceRequest) {
        peridotite peridotiteVar;
        if (this.isVirtual || (peridotiteVar = this.owner) == null) {
            return;
        }
        peridotite.marial(peridotiteVar, this, false, forceRequest, 2, null);
    }

    public final void outmarry() {
        this.layoutDelegate.hydrovane();
    }

    /* JADX INFO: renamed from: overspeculate, reason: from getter */
    public final seminary getNodes() {
        return this.nodes;
    }

    /* JADX INFO: renamed from: palmyra, reason: from getter */
    public boolean getIsDeactivated() {
        return this.isDeactivated;
    }

    public final UsageByParent peridotite() {
        UsageByParent usageByParentUnderbelly;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegateGrimness = grimness();
        return (lookaheadPassDelegateGrimness == null || (usageByParentUnderbelly = lookaheadPassDelegateGrimness.underbelly()) == null) ? UsageByParent.NotUsed : usageByParentUnderbelly;
    }

    public final LayoutNode permissivist() {
        LayoutNode layoutNode = this._foldedParent;
        while (layoutNode != null && layoutNode.isVirtual) {
            layoutNode = layoutNode._foldedParent;
        }
        return layoutNode;
    }

    public boolean picketboat() {
        return this.owner != null;
    }

    public final boolean polder() {
        return this.layoutDelegate.sealless();
    }

    public final void polloi(restrictive.creditor canvas, GraphicsLayer graphicsLayer) {
        clubfoot().fastrack(canvas, graphicsLayer);
    }

    /* JADX INFO: renamed from: premeiotic, reason: from getter */
    public int getSemanticsId() {
        return this.semanticsId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.compose.ui.semantics.apical] */
    public final androidx.compose.ui.semantics.apical preprohormone() {
        Trace.beginSection("collapseSemantics");
        try {
            if (this.nodes.monoploid(saran.attabal(8)) && this._collapsedSemantics == null) {
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = new androidx.compose.ui.semantics.apical();
                cuirassed.saneness(this).getSnapshotObserver().cutely(this, new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNode$collapsedSemantics$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // p002kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.f29295attabal;
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r4v6 */
                    /* JADX WARN: Type inference failed for: r6v7, types: [T, androidx.compose.ui.semantics.apical] */
                    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
                        java.lang.NullPointerException
                        */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        /*
                            r11 = this;
                            androidx.compose.ui.node.LayoutNode r0 = r11.this$0
                            androidx.compose.ui.node.seminary r0 = r0.getNodes()
                            r1 = 8
                            int r1 = androidx.compose.ui.node.saran.attabal(r1)
                            kotlin.jvm.internal.Ref$ObjectRef<androidx.compose.ui.semantics.apical> r2 = r2
                            int r3 = androidx.compose.ui.node.seminary.dern(r0)
                            r3 = r3 & r1
                            if (r3 == 0) goto L9d
                            androidx.compose.ui.attabal$dern r0 = r0.getTail()
                        L19:
                            if (r0 == 0) goto L9d
                            int r3 = r0.getKindSet()
                            r3 = r3 & r1
                            if (r3 == 0) goto L97
                            r3 = 0
                            r4 = r0
                            r5 = r3
                        L25:
                            if (r4 == 0) goto L97
                            boolean r6 = r4 instanceof androidx.compose.ui.node.premeiotic
                            r7 = 1
                            if (r6 == 0) goto L53
                            androidx.compose.ui.node.premeiotic r4 = (androidx.compose.ui.node.premeiotic) r4
                            boolean r6 = r4.impassible()
                            if (r6 == 0) goto L3e
                            androidx.compose.ui.semantics.apical r6 = new androidx.compose.ui.semantics.apical
                            r6.<init>()
                            r2.element = r6
                            r6.arytenoidectomy(r7)
                        L3e:
                            boolean r6 = r4.seminary()
                            if (r6 == 0) goto L4b
                            T r6 = r2.element
                            androidx.compose.ui.semantics.apical r6 = (androidx.compose.ui.semantics.apical) r6
                            r6.monoploid(r7)
                        L4b:
                            T r6 = r2.element
                            androidx.compose.ui.semantics.apical r6 = (androidx.compose.ui.semantics.apical) r6
                            r4.polder(r6)
                            goto L92
                        L53:
                            int r6 = r4.getKindSet()
                            r6 = r6 & r1
                            if (r6 == 0) goto L92
                            boolean r6 = r4 instanceof androidx.compose.ui.node.competently
                            if (r6 == 0) goto L92
                            r6 = r4
                            androidx.compose.ui.node.competently r6 = (androidx.compose.ui.node.competently) r6
                            androidx.compose.ui.attabal$dern r6 = r6.getDelegate()
                            r8 = 0
                            r9 = r8
                        L67:
                            if (r6 == 0) goto L8f
                            int r10 = r6.getKindSet()
                            r10 = r10 & r1
                            if (r10 == 0) goto L8a
                            int r9 = r9 + 1
                            if (r9 != r7) goto L76
                            r4 = r6
                            goto L8a
                        L76:
                            if (r5 != 0) goto L81
                            androidx.compose.runtime.collection.dern r5 = new androidx.compose.runtime.collection.dern
                            r10 = 16
                            androidx.compose.ui.attabal$dern[] r10 = new androidx.compose.ui.attabal.dern[r10]
                            r5.<init>(r10, r8)
                        L81:
                            if (r4 == 0) goto L87
                            r5.saneness(r4)
                            r4 = r3
                        L87:
                            r5.saneness(r6)
                        L8a:
                            androidx.compose.ui.attabal$dern r6 = r6.getChild()
                            goto L67
                        L8f:
                            if (r9 != r7) goto L92
                            goto L25
                        L92:
                            androidx.compose.ui.attabal$dern r4 = androidx.compose.ui.node.beachfront.saneness(r5)
                            goto L25
                        L97:
                            androidx.compose.ui.attabal$dern r0 = r0.getParent()
                            goto L19
                        L9d:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode$collapsedSemantics$1$1.invoke2():void");
                    }
                });
                T t = ref$ObjectRef.element;
                this._collapsedSemantics = (androidx.compose.ui.semantics.apical) t;
                return (androidx.compose.ui.semantics.apical) t;
            }
            return this._collapsedSemantics;
        } finally {
            Trace.endSection();
        }
    }

    public final void preterite() {
        if (restrictive() || starveling() || this.needsOnPositionedDispatch) {
            return;
        }
        cuirassed.saneness(this).competently(this);
    }

    public final cord privatdozent() {
        return cuirassed.saneness(this).getSharedDrawScope();
    }

    public final void pruinose() {
        this.nodes.rotuma();
    }

    public final boolean restrictive() {
        return this.layoutDelegate.cuirassed();
    }

    public final List<LayoutNode> rotuma() {
        return coffeecake().competently();
    }

    public final void sakeen() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            impassible();
        }
        creditor().setterwort();
    }

    @Override // androidx.compose.runtime.competently
    public void saneness() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.saneness();
        }
        NodeCoordinator wrapped = yemenite().getWrapped();
        for (NodeCoordinator nodeCoordinatorClubfoot = clubfoot(); !Intrinsics.wireman(nodeCoordinatorClubfoot, wrapped) && nodeCoordinatorClubfoot != null; nodeCoordinatorClubfoot = nodeCoordinatorClubfoot.getWrapped()) {
            nodeCoordinatorClubfoot.hypokinesis();
        }
    }

    /* JADX INFO: renamed from: saran, reason: from getter */
    public final LayoutNode getLookaheadRoot() {
        return this.lookaheadRoot;
    }

    public final NodeCoordinator sealless() {
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator nodeCoordinatorYemenite = yemenite();
            NodeCoordinator wrappedBy = clubfoot().getWrappedBy();
            this._innerLayerCoordinator = null;
            while (!Intrinsics.wireman(nodeCoordinatorYemenite, wrappedBy)) {
                if ((nodeCoordinatorYemenite != null ? nodeCoordinatorYemenite.getLayer() : null) != null) {
                    this._innerLayerCoordinator = nodeCoordinatorYemenite;
                    break;
                }
                nodeCoordinatorYemenite = nodeCoordinatorYemenite != null ? nodeCoordinatorYemenite.getWrappedBy() : null;
            }
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator == null || nodeCoordinator.getLayer() != null) {
            return nodeCoordinator;
        }
        peridotite.attabal.dern("layer was not set");
        throw new KotlinNothingValueException();
    }

    public final boolean seminary() {
        return this.layoutDelegate.kattegat();
    }

    public final void sensatory() {
        NodeCoordinator nodeCoordinatorClubfoot = clubfoot();
        NodeCoordinator nodeCoordinatorYemenite = yemenite();
        while (nodeCoordinatorClubfoot != nodeCoordinatorYemenite) {
            Intrinsics.competently(nodeCoordinatorClubfoot, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            adultoid adultoidVar = (adultoid) nodeCoordinatorClubfoot;
            walach layer = adultoidVar.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            nodeCoordinatorClubfoot = adultoidVar.getWrapped();
        }
        walach layer2 = yemenite().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void setterwort() {
        underbelly();
        LayoutNode layoutNodePermissivist = permissivist();
        if (layoutNodePermissivist != null) {
            layoutNodePermissivist.czestochowa();
        }
        sensatory();
    }

    /* JADX INFO: renamed from: splinterproof, reason: from getter */
    public final boolean getNeedsOnPositionedDispatch() {
        return this.needsOnPositionedDispatch;
    }

    public final boolean starveling() {
        return this.layoutDelegate.merc();
    }

    public final boolean stratoscope() {
        long jTailoring = yemenite().tailoring();
        return milliradian.saneness.beachfront(jTailoring) && milliradian.saneness.marial(jTailoring);
    }

    public void stupefactive(androidx.compose.ui.layout.kowloon kowloonVar) {
        if (Intrinsics.wireman(this.measurePolicy, kowloonVar)) {
            return;
        }
        this.measurePolicy = kowloonVar;
        underbelly();
    }

    public final void sultanate(boolean z) {
        this.innerLayerCoordinatorIsDirty = z;
    }

    /* JADX INFO: renamed from: supplicat, reason: from getter */
    public final LayoutNodeLayoutDelegate getLayoutDelegate() {
        return this.layoutDelegate;
    }

    public final void tailoring() {
        if (this.virtualChildrenCount > 0) {
            homozygous();
        }
    }

    public final void tarboosh() {
        androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = coffeecake();
        int size = dernVarCoffeecake.getSize();
        if (size > 0) {
            LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
            int i = 0;
            do {
                LayoutNode layoutNode = layoutNodeArrApical[i];
                UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
                layoutNode.intrinsicsUsageByParent = usageByParent;
                if (usageByParent != UsageByParent.NotUsed) {
                    layoutNode.tarboosh();
                }
                i++;
            } while (i < size);
        }
    }

    public final void technofreak() {
        this.layoutDelegate.starveling();
    }

    public final void tectonization(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        if (!(this.lookaheadRoot != null)) {
            peridotite.attabal.saneness("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        peridotite peridotiteVar = this.owner;
        if (peridotiteVar == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        peridotiteVar.polloi(this, true, forceRequest, scheduleMeasureAndLayout);
        if (invalidateIntrinsics) {
            LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegateGrimness = grimness();
            Intrinsics.beachfront(lookaheadPassDelegateGrimness);
            lookaheadPassDelegateGrimness.igbo(forceRequest);
        }
    }

    /* JADX INFO: renamed from: timberyard, reason: from getter */
    public outmarry getViewConfiguration() {
        return this.viewConfiguration;
    }

    public String toString() {
        return androidx.compose.ui.platform.permissivist.attabal(this, null) + " children: " + rotuma().size() + " measurePolicy: " + getMeasurePolicy();
    }

    public final String triweekly(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        androidx.compose.runtime.collection.dern<LayoutNode> dernVarCoffeecake = coffeecake();
        int size = dernVarCoffeecake.getSize();
        if (size > 0) {
            LayoutNode[] layoutNodeArrApical = dernVarCoffeecake.apical();
            int i2 = 0;
            do {
                sb.append(layoutNodeArrApical[i2].triweekly(depth + 1));
                i2++;
            } while (i2 < size);
        }
        String string = sb.toString();
        if (depth != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public int trm() {
        return this.layoutDelegate.rotuma();
    }

    public final void underbelly() {
        if (this.lookaheadRoot != null) {
            prefect(this, false, false, false, 7, null);
        } else {
            fastrack(this, false, false, false, 7, null);
        }
    }

    public final void vesuvio(LayoutNode child) {
        if (child.layoutDelegate.molybdenite() > 0) {
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = this.layoutDelegate;
            layoutNodeLayoutDelegate.overspeculate(layoutNodeLayoutDelegate.molybdenite() - 1);
        }
        if (this.owner != null) {
            child.arytenoidectomy();
        }
        child._foldedParent = null;
        child.clubfoot().philabeg(null);
        if (child.isVirtual) {
            this.virtualChildrenCount--;
            androidx.compose.runtime.collection.dern<LayoutNode> dernVarMarial = child._foldedChildren.marial();
            int size = dernVarMarial.getSize();
            if (size > 0) {
                LayoutNode[] layoutNodeArrApical = dernVarMarial.apical();
                int i = 0;
                do {
                    layoutNodeArrApical[i].clubfoot().philabeg(null);
                    i++;
                } while (i < size);
            }
        }
        gusty();
        mastfed();
    }

    public final UsageByParent walach() {
        return creditor().igbo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // androidx.compose.ui.node.peridotite.saneness
    public void wireman() {
        NodeCoordinator nodeCoordinatorYemenite = yemenite();
        int iAttabal = saran.attabal(128);
        boolean zTaiyuan = privatdozent.taiyuan(iAttabal);
        androidx.compose.ui.attabal.dern dernVarPuffin = nodeCoordinatorYemenite.puffin();
        if (!zTaiyuan && (dernVarPuffin = dernVarPuffin.getParent()) == null) {
            return;
        }
        for (androidx.compose.ui.attabal.dern dernVarMicroanalysis = nodeCoordinatorYemenite.microanalysis(zTaiyuan); dernVarMicroanalysis != null && (dernVarMicroanalysis.getAggregateChildKindSet() & iAttabal) != 0; dernVarMicroanalysis = dernVarMicroanalysis.getChild()) {
            if ((dernVarMicroanalysis.getKindSet() & iAttabal) != 0) {
                androidx.compose.ui.attabal.dern dernVarBeachfront = dernVarMicroanalysis;
                androidx.compose.runtime.collection.dern dernVar = null;
                while (dernVarBeachfront != 0) {
                    if (dernVarBeachfront instanceof molybdenite) {
                        ((molybdenite) dernVarBeachfront).dern(yemenite());
                    } else if ((dernVarBeachfront.getKindSet() & iAttabal) != 0 && (dernVarBeachfront instanceof competently)) {
                        androidx.compose.ui.attabal.dern dernVarUnderbelly = ((competently) dernVarBeachfront).getDelegate();
                        int i = 0;
                        dernVarBeachfront = dernVarBeachfront;
                        while (dernVarUnderbelly != null) {
                            if ((dernVarUnderbelly.getKindSet() & iAttabal) != 0) {
                                i++;
                                if (i == 1) {
                                    dernVarBeachfront = dernVarUnderbelly;
                                } else {
                                    if (dernVar == null) {
                                        dernVar = new androidx.compose.runtime.collection.dern(new androidx.compose.ui.attabal.dern[16], 0);
                                    }
                                    if (dernVarBeachfront != 0) {
                                        dernVar.saneness(dernVarBeachfront);
                                        dernVarBeachfront = 0;
                                    }
                                    dernVar.saneness(dernVarUnderbelly);
                                }
                            }
                            dernVarUnderbelly = dernVarUnderbelly.getChild();
                            dernVarBeachfront = dernVarBeachfront;
                        }
                        if (i == 1) {
                        }
                    }
                    dernVarBeachfront = beachfront.beachfront(dernVar);
                }
            }
            if (dernVarMicroanalysis == dernVarPuffin) {
                return;
            }
        }
    }

    public final void wostteth() {
        this.layoutDelegate.grimness();
    }

    public final NodeCoordinator yemenite() {
        return this.nodes.getInnerCoordinator();
    }

    public LayoutNode(boolean z, int i) {
        this.isVirtual = z;
        this.semanticsId = i;
        this._foldedChildren = new restrictive<>(new androidx.compose.runtime.collection.dern(new LayoutNode[16], 0), new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNode$_foldedChildren$1
            {
                super(0);
            }

            @Override // p002kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.f29295attabal;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.this$0.getLayoutDelegate().saran();
            }
        });
        this._zSortedChildren = new androidx.compose.runtime.collection.dern<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = f6803dent;
        this.density = cuirassed.f7005attabal;
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = f6802cultivated;
        this.compositionLocalMap = androidx.compose.runtime.trm.INSTANCE.attabal();
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.intrinsicsUsageByParent = usageByParent;
        this.previousIntrinsicsUsageByParent = usageByParent;
        this.nodes = new seminary(this);
        this.layoutDelegate = new LayoutNodeLayoutDelegate(this);
        this.innerLayerCoordinatorIsDirty = true;
        this._modifier = androidx.compose.ui.attabal.INSTANCE;
    }

    public /* synthetic */ LayoutNode(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? androidx.compose.ui.semantics.impassible.attabal() : i);
    }
}
