package androidx.compose.ui.node;

import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.LayoutDirection;
import com.ironsource.C3414a2;
import com.ironsource.X3;
import com.ironsource.Y3;
import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import p002kotlin.KotlinNothingValueException;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.jvm.internal.Ref$ObjectRef;
import restrictive.lotta;
import restrictive.underbelly;
import supplicat.MutableRect;

/* JADX INFO: compiled from: NodeCoordinator.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b \u0018\u0000 \u009d\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004\u009e\u0002\u009f\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001e\u0010\u0010\u001a\u00020\t2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011JB\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010%J@\u0010.\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b.\u0010/JH\u00101\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u00100\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b1\u00102JH\u00103\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\t2\u0006\u00100\u001a\u00020\u0014H\u0002ø\u0001\u0000¢\u0006\u0004\b3\u00102J\u0013\u00104\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b4\u00105J*\u00109\u001a\u00020(2\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u00020(2\u0006\u00108\u001a\u00020\tH\u0002ø\u0001\u0000¢\u0006\u0004\b9\u0010:J'\u0010>\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010=\u001a\u00020\tH\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020\u00182\u0006\u0010@\u001a\u00020;2\u0006\u0010=\u001a\u00020\tH\u0002¢\u0006\u0004\bA\u0010BJ\u001a\u0010C\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002ø\u0001\u0000¢\u0006\u0004\bC\u0010DJ\u001e\u0010E\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eø\u0001\u0000¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\t¢\u0006\u0004\bG\u0010HJ\u000f\u0010I\u001a\u00020\u0018H\u0010¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0018H&¢\u0006\u0004\bK\u0010JJ\u001f\u0010O\u001a\u00020\u00182\u0006\u0010M\u001a\u00020L2\u0006\u0010N\u001a\u00020LH\u0014¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\u0018H\u0000¢\u0006\u0004\bQ\u0010JJ\r\u0010R\u001a\u00020\u0018¢\u0006\u0004\bR\u0010JJ8\u0010S\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016H\u0014ø\u0001\u0000¢\u0006\u0004\bS\u0010TJ*\u0010V\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010U\u001a\u00020\u001aH\u0014ø\u0001\u0000¢\u0006\u0004\bV\u0010WJ\r\u0010X\u001a\u00020\u0018¢\u0006\u0004\bX\u0010JJ@\u0010Y\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\u0010U\u001a\u0004\u0018\u00010\u001aø\u0001\u0000¢\u0006\u0004\bY\u0010\u001dJ\u001f\u0010Z\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\bZ\u0010\"J!\u0010[\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b[\u0010\"J\r\u0010\\\u001a\u00020\u0018¢\u0006\u0004\b\\\u0010JJ-\u0010^\u001a\u00020\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\b\u0002\u0010]\u001a\u00020\t¢\u0006\u0004\b^\u0010_J8\u0010`\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b`\u0010aJ:\u0010b\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\t2\u0006\u0010-\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bb\u0010aJ\r\u0010d\u001a\u00020c¢\u0006\u0004\bd\u0010eJ\u001a\u0010g\u001a\u00020(2\u0006\u0010f\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\bg\u0010DJ\"\u0010j\u001a\u00020(2\u0006\u0010h\u001a\u00020\u00032\u0006\u0010i\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\bj\u0010kJ*\u0010l\u001a\u00020(2\u0006\u0010h\u001a\u00020\u00032\u0006\u0010i\u001a\u00020(2\u0006\u00108\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bl\u0010mJ\u001f\u0010n\u001a\u00020c2\u0006\u0010h\u001a\u00020\u00032\u0006\u0010=\u001a\u00020\tH\u0016¢\u0006\u0004\bn\u0010oJ\u001a\u0010p\u001a\u00020(2\u0006\u0010f\u001a\u00020(H\u0016ø\u0001\u0000¢\u0006\u0004\bp\u0010DJ$\u0010q\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020(2\b\b\u0002\u00108\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bq\u0010rJ$\u0010s\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020(2\b\b\u0002\u00108\u001a\u00020\tH\u0016ø\u0001\u0000¢\u0006\u0004\bs\u0010rJ\u001f\u0010v\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010u\u001a\u00020tH\u0004¢\u0006\u0004\bv\u0010wJ\r\u0010x\u001a\u00020\u0018¢\u0006\u0004\bx\u0010JJ\r\u0010y\u001a\u00020\u0018¢\u0006\u0004\by\u0010JJ)\u0010{\u001a\u00020\u00182\u0006\u0010@\u001a\u00020;2\u0006\u0010=\u001a\u00020\t2\b\b\u0002\u0010z\u001a\u00020\tH\u0000¢\u0006\u0004\b{\u0010|J\u001a\u0010}\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0004ø\u0001\u0000¢\u0006\u0004\b}\u0010~J\u001a\u0010\u007f\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0004ø\u0001\u0000¢\u0006\u0004\b\u007f\u0010~J\u0011\u0010\u0080\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u0080\u0001\u0010JJ\u0011\u0010\u0081\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u0081\u0001\u0010JJ\u001b\u0010\u0083\u0001\u001a\u00020\u00002\u0007\u0010\u0082\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u000f\u0010\u0085\u0001\u001a\u00020\t¢\u0006\u0005\b\u0085\u0001\u0010HJ\u001f\u0010\u0088\u0001\u001a\u00030\u0086\u00012\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0004ø\u0001\u0000¢\u0006\u0005\b\u0088\u0001\u0010DJ'\u0010\u0089\u0001\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(2\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0004ø\u0001\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001e\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010\u008c\u0001\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R'\u0010\u0093\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010H\"\u0005\b\u0092\u0001\u0010%R'\u0010\u0097\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b\u0094\u0001\u0010\u0090\u0001\u001a\u0005\b\u0095\u0001\u0010H\"\u0005\b\u0096\u0001\u0010%R+\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u0099\u0001\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R+\u0010¢\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009f\u0001\u0010\u0099\u0001\u001a\u0006\b \u0001\u0010\u009b\u0001\"\u0006\b¡\u0001\u0010\u009d\u0001R\u0019\u0010¤\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u0090\u0001R\u0019\u0010¦\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0001\u0010\u0090\u0001RE\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\u0015\u0010§\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00168\u0004@BX\u0084\u000e¢\u0006\u0010\n\u0006\b¨\u0001\u0010©\u0001\u001a\u0006\bª\u0001\u0010«\u0001R\u001a\u0010¯\u0001\u001a\u00030¬\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u001a\u0010³\u0001\u001a\u00030°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0019\u0010¶\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u001c\u0010º\u0001\u001a\u0005\u0018\u00010·\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010¹\u0001R)\u0010¿\u0001\u001a\u0012\u0012\u0005\u0012\u00030¼\u0001\u0012\u0004\u0012\u00020L\u0018\u00010»\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¾\u0001R6\u0010\u0013\u001a\u00020\u00122\u0007\u0010§\u0001\u001a\u00020\u00128\u0016@TX\u0096\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0017\n\u0005\bp\u0010À\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001R1\u0010\u0015\u001a\u00020\u00142\u0007\u0010§\u0001\u001a\u00020\u00148\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\bÅ\u0001\u0010µ\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001\"\u0006\bÈ\u0001\u0010É\u0001R\u001b\u0010Ì\u0001\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010Ë\u0001R\u001c\u0010Ð\u0001\u001a\u0005\u0018\u00010Í\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0001\u0010Ï\u0001R3\u0010Õ\u0001\u001a\u0017\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00180Ñ\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\bÒ\u0001\u0010Ó\u0001\u0012\u0005\bÔ\u0001\u0010JR\u001e\u0010Ù\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180Ö\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b×\u0001\u0010Ø\u0001R)\u0010Ü\u0001\u001a\u00020\t2\u0007\u0010§\u0001\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\bÚ\u0001\u0010\u0090\u0001\u001a\u0005\bÛ\u0001\u0010HR/\u0010U\u001a\u0005\u0018\u00010Ý\u00012\n\u0010§\u0001\u001a\u0005\u0018\u00010Ý\u00018\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bÞ\u0001\u0010ß\u0001\u001a\u0006\bà\u0001\u0010á\u0001R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u0018\u0010ç\u0001\u001a\u00030ä\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bå\u0001\u0010æ\u0001R\u0017\u0010ê\u0001\u001a\u00020\u000b8&X¦\u0004¢\u0006\b\u001a\u0006\bè\u0001\u0010é\u0001R\u0018\u0010í\u0001\u001a\u00030°\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bë\u0001\u0010ì\u0001R\u0017\u0010ï\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\bî\u0001\u0010Ç\u0001R\u0017\u0010ð\u0001\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010Ç\u0001R\u0019\u0010ó\u0001\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bñ\u0001\u0010ò\u0001R\u0017\u0010ö\u0001\u001a\u00020\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bô\u0001\u0010õ\u0001R\u001b\u0010ù\u0001\u001a\u00030÷\u00018Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\bø\u0001\u0010Â\u0001R\u0018\u0010ý\u0001\u001a\u00030ú\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bû\u0001\u0010ü\u0001R\u0019\u0010ÿ\u0001\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bþ\u0001\u0010ò\u0001R\u0016\u0010\u0081\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0080\u0002\u0010HR\u0016\u0010\u0083\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0002\u0010HR,\u0010\u0089\u0002\u001a\u00030·\u00012\b\u0010\u0084\u0002\u001a\u00030·\u00018P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002\"\u0006\b\u0087\u0002\u0010\u0088\u0002R0\u0010\u008f\u0002\u001a\u0005\u0018\u00010\u008a\u00022\n\u0010§\u0001\u001a\u0005\u0018\u00010\u008a\u00028&@dX¦\u000e¢\u0006\u0010\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002\"\u0006\b\u008d\u0002\u0010\u008e\u0002R\u001a\u0010\u0093\u0002\u001a\u0005\u0018\u00010\u0090\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0016\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010õ\u0001R\u0017\u0010\u0097\u0002\u001a\u00020;8DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u0095\u0002\u0010\u0096\u0002R\u001e\u0010\u009a\u0002\u001a\u00030\u0098\u00028@X\u0080\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u0099\u0002\u0010Â\u0001R\u0016\u0010\u009b\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010HR\u001b\u0010\u0087\u0001\u001a\u00030\u0086\u00018Fø\u0001\u0000ø\u0001\u0001¢\u0006\b\u001a\u0006\b\u009c\u0002\u0010Â\u0001\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006 \u0002"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/triweekly;", "Landroidx/compose/ui/layout/competently;", "Landroidx/compose/ui/node/mathsort;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "includeTail", "Landroidx/compose/ui/attabal$dern;", "microanalysis", "(Z)Landroidx/compose/ui/attabal$dern;", "Landroidx/compose/ui/node/saran;", "type", "undecorated", "(I)Z", "Lmilliradian/impassible;", X3.i.L, "", "zIndex", "Lkotlin/Function1;", "Lrestrictive/treadless;", "", "layerBlock", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "explicitLayer", "untruth", "(JFLkotlin/jvm/functions/Function1;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Lrestrictive/creditor;", "canvas", "graphicsLayer", "pruinose", "(Lrestrictive/creditor;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "invokeOnLayoutChange", "mef", "(Z)V", "Landroidx/compose/ui/node/NodeCoordinator$wireman;", "hitTestSource", "Lsupplicat/competently;", "pointerPosition", "Landroidx/compose/ui/node/triweekly;", "hitTestResult", "isTouchEvent", "isInLayer", "hydromechanics", "(Landroidx/compose/ui/attabal$dern;Landroidx/compose/ui/node/NodeCoordinator$wireman;JLandroidx/compose/ui/node/triweekly;ZZ)V", "distanceFromEdge", "polyfoil", "(Landroidx/compose/ui/attabal$dern;Landroidx/compose/ui/node/NodeCoordinator$wireman;JLandroidx/compose/ui/node/triweekly;ZZF)V", "electropaint", "astrogate", "(Landroidx/compose/ui/layout/competently;)Landroidx/compose/ui/node/NodeCoordinator;", "ancestor", "offset", "includeMotionFrameOfReference", "osteal", "(Landroidx/compose/ui/node/NodeCoordinator;JZ)J", "Lsupplicat/marial;", "rect", "clipBounds", "prefect", "(Landroidx/compose/ui/node/NodeCoordinator;Lsupplicat/marial;Z)V", "bounds", "linendraper", "(Lsupplicat/marial;Z)V", "homophylic", "(J)J", "ethene", "(I)Landroidx/compose/ui/attabal$dern;", "likeable", "()Z", "herdbook", "()V", "tarboosh", "", "width", "height", "palewise", "(II)V", "genii", "livable", "treadless", "(JFLkotlin/jvm/functions/Function1;)V", "layer", "milliradian", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "polliwog", "imparkation", "fastrack", "murrine", "nomenclative", "forceUpdateLayerParameters", "estragon", "(Lkotlin/jvm/functions/Function1;Z)V", "bluecoat", "(Landroidx/compose/ui/node/NodeCoordinator$wireman;JLandroidx/compose/ui/node/triweekly;ZZ)V", "harlequinade", "Lsupplicat/taiyuan;", "transformable", "()Lsupplicat/taiyuan;", "relativeToLocal", "adultoid", "sourceCoordinates", "relativeToSource", "cutely", "(Landroidx/compose/ui/layout/competently;J)J", "marial", "(Landroidx/compose/ui/layout/competently;JZ)J", "stratoscope", "(Landroidx/compose/ui/layout/competently;Z)Lsupplicat/taiyuan;", "starveling", "irani", "(JZ)J", "demilitarize", "Lrestrictive/lotta;", "paint", "cosy", "(Lrestrictive/creditor;Lrestrictive/lotta;)V", "alloy", "hypokinesis", "clipToMinimumTouchTargetSize", "brighton", "(Lsupplicat/marial;ZZ)V", "eyepiece", "(J)Z", "collection", "cybernatic", "saccharic", C3414a2.d, "cig", "(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;", "crock", "Lsupplicat/impassible;", "minimumTouchTargetSize", "licking", "microchemistry", "(JJ)F", "oilcan", "Landroidx/compose/ui/node/LayoutNode;", "preterite", "()Landroidx/compose/ui/node/LayoutNode;", "yemenite", "Z", "getForcePlaceWithLookaheadOffset$ui_release", "nattier", "forcePlaceWithLookaheadOffset", "sealless", "libya", "balance", "forceMeasureWithLookaheadConstraints", "kattegat", "Landroidx/compose/ui/node/NodeCoordinator;", "ctenidium", "()Landroidx/compose/ui/node/NodeCoordinator;", "strother", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrapped", "supplicat", "rajahship", "philabeg", "wrappedBy", "restrictive", "released", "merc", "isClipping", "<set-?>", "polder", "Lkotlin/jvm/functions/Function1;", "getLayerBlock", "()Lkotlin/jvm/functions/Function1;", "Lmilliradian/wireman;", "seminary", "Lmilliradian/wireman;", "layerDensity", "Landroidx/compose/ui/unit/LayoutDirection;", "grimness", "Landroidx/compose/ui/unit/LayoutDirection;", "layerLayoutDirection", "saran", "F", "lastLayerAlpha", "Landroidx/compose/ui/layout/arytenoidectomy;", "privatdozent", "Landroidx/compose/ui/layout/arytenoidectomy;", "_measureResult", "", "Landroidx/compose/ui/layout/attabal;", "creditor", "Ljava/util/Map;", "oldAlignmentLines", "J", "picketboat", "()J", "bleacherite", "(J)V", "hydrovane", "tout", "()F", "setZIndex", "(F)V", "walach", "Lsupplicat/marial;", "_rectCache", "Landroidx/compose/ui/node/polloi;", "peridotite", "Landroidx/compose/ui/node/polloi;", "layerPositionalProperties", "Lkotlin/Function2;", "mathsort", "Lkotlin/jvm/functions/Function2;", "getDrawBlock$annotations", "drawBlock", "Lkotlin/Function0;", "splinterproof", "Lkotlin/jvm/functions/Function0;", "invalidateParentLayer", "overspeculate", "decarock", "lastLayerDrawingWasSkipped", "Landroidx/compose/ui/node/walach;", "clubfoot", "Landroidx/compose/ui/node/walach;", "liable", "()Landroidx/compose/ui/node/walach;", "dent", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "hyalinization", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "puffin", "()Landroidx/compose/ui/attabal$dern;", "tail", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "density", "fontScale", "igbo", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "parent", "sensatory", "()Landroidx/compose/ui/layout/competently;", Y3.f, "Lmilliradian/monoploid;", "triweekly", "size", "Landroidx/compose/ui/node/attabal;", "stupefactive", "()Landroidx/compose/ui/node/attabal;", "alignmentLinesOwner", "czestochowa", "child", "underbelly", "hasMeasureResult", "impassible", "isAttached", "value", "wostteth", "()Landroidx/compose/ui/layout/arytenoidectomy;", "bavaria", "(Landroidx/compose/ui/layout/arytenoidectomy;)V", "measureResult", "Landroidx/compose/ui/node/yemenite;", "vir", "()Landroidx/compose/ui/node/yemenite;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/yemenite;)V", "lookaheadDelegate", "", "miliaria", "()Ljava/lang/Object;", "parentData", "parentLayoutCoordinates", "incorrectly", "()Lsupplicat/marial;", "rectCache", "Lmilliradian/saneness;", "tailoring", "lastMeasurementConstraints", "isValidOwnerScope", "twybill", "permissivist", "dern", "wireman", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class NodeCoordinator extends LookaheadCapablePlaceable implements androidx.compose.ui.layout.triweekly, androidx.compose.ui.layout.competently, mathsort {

    /* JADX INFO: renamed from: clubfoot, reason: collision with root package name and from kotlin metadata */
    public walach layer;

    /* JADX INFO: renamed from: creditor, reason: collision with root package name and from kotlin metadata */
    public Map<androidx.compose.ui.layout.attabal, Integer> oldAlignmentLines;

    /* JADX INFO: renamed from: dent, reason: collision with root package name and from kotlin metadata */
    public GraphicsLayer explicitLayer;

    /* JADX INFO: renamed from: hydrovane, reason: collision with root package name and from kotlin metadata */
    public float zIndex;

    /* JADX INFO: renamed from: kattegat, reason: collision with root package name and from kotlin metadata */
    public NodeCoordinator wrapped;

    /* JADX INFO: renamed from: merc, reason: collision with root package name and from kotlin metadata */
    public boolean isClipping;

    /* JADX INFO: renamed from: oilcan, reason: collision with root package name and from kotlin metadata */
    public final LayoutNode layoutNode;

    /* JADX INFO: renamed from: overspeculate, reason: collision with root package name and from kotlin metadata */
    public boolean lastLayerDrawingWasSkipped;

    /* JADX INFO: renamed from: peridotite, reason: collision with root package name and from kotlin metadata */
    public polloi layerPositionalProperties;

    /* JADX INFO: renamed from: polder, reason: collision with root package name and from kotlin metadata */
    public Function1<? super restrictive.treadless, Unit> layerBlock;

    /* JADX INFO: renamed from: privatdozent, reason: collision with root package name and from kotlin metadata */
    public androidx.compose.ui.layout.arytenoidectomy _measureResult;

    /* JADX INFO: renamed from: restrictive, reason: collision with root package name and from kotlin metadata */
    public boolean released;

    /* JADX INFO: renamed from: sealless, reason: collision with root package name and from kotlin metadata */
    public boolean forceMeasureWithLookaheadConstraints;

    /* JADX INFO: renamed from: supplicat, reason: collision with root package name and from kotlin metadata */
    public NodeCoordinator wrappedBy;

    /* JADX INFO: renamed from: walach, reason: collision with root package name and from kotlin metadata */
    public MutableRect _rectCache;

    /* JADX INFO: renamed from: yemenite, reason: collision with root package name and from kotlin metadata */
    public boolean forcePlaceWithLookaheadOffset;

    /* JADX INFO: renamed from: permissivist, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: cultivated, reason: collision with root package name */
    public static final Function1<NodeCoordinator, Unit> f6941cultivated = new Function1<NodeCoordinator, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayerParams$1
        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NodeCoordinator nodeCoordinator) {
            if (nodeCoordinator.oilcan()) {
                polloi polloiVar = nodeCoordinator.layerPositionalProperties;
                if (polloiVar == null) {
                    NodeCoordinator.galluses(nodeCoordinator, false, 1, null);
                    return;
                }
                NodeCoordinator.f6943milliradian.attabal(polloiVar);
                NodeCoordinator.galluses(nodeCoordinator, false, 1, null);
                if (NodeCoordinator.f6943milliradian.dern(polloiVar)) {
                    return;
                }
                LayoutNode layoutNode = nodeCoordinator.getLayoutNode();
                LayoutNodeLayoutDelegate layoutDelegate = layoutNode.getLayoutDelegate();
                if (layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate.getCoordinatesAccessedDuringPlacement()) {
                        LayoutNode.licking(layoutNode, false, 1, null);
                    }
                    layoutDelegate.getMeasurePassDelegate().claque();
                }
                peridotite owner = layoutNode.getOwner();
                if (owner != null) {
                    owner.competently(layoutNode);
                }
            }
        }
    };

    /* JADX INFO: renamed from: premeiotic, reason: collision with root package name */
    public static final Function1<NodeCoordinator, Unit> f6945premeiotic = new Function1<NodeCoordinator, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$Companion$onCommitAffectingLayer$1
        @Override // p002kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(NodeCoordinator nodeCoordinator) {
            invoke2(nodeCoordinator);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(NodeCoordinator nodeCoordinator) {
            walach layer = nodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
    };

    /* JADX INFO: renamed from: timberyard, reason: collision with root package name */
    public static final underbelly f6946timberyard = new underbelly();

    /* JADX INFO: renamed from: milliradian, reason: collision with root package name */
    public static final polloi f6943milliradian = new polloi();

    /* JADX INFO: renamed from: treadless, reason: collision with root package name */
    public static final float[] f6947treadless = restrictive.lerp.dern(null, 1, null);

    /* JADX INFO: renamed from: itchy, reason: collision with root package name */
    public static final wireman f6942itchy = new attabal();

    /* JADX INFO: renamed from: coffeecake, reason: collision with root package name */
    public static final wireman f6940coffeecake = new saneness();

    /* JADX INFO: renamed from: seminary, reason: collision with root package name and from kotlin metadata */
    public milliradian.wireman layerDensity = getLayoutNode().getDensity();

    /* JADX INFO: renamed from: grimness, reason: collision with root package name and from kotlin metadata */
    public LayoutDirection layerLayoutDirection = getLayoutNode().getLayoutDirection();

    /* JADX INFO: renamed from: saran, reason: collision with root package name and from kotlin metadata */
    public float lastLayerAlpha = 0.8f;

    /* JADX INFO: renamed from: starveling, reason: collision with root package name and from kotlin metadata */
    public long position = milliradian.impassible.INSTANCE.attabal();

    /* JADX INFO: renamed from: mathsort, reason: collision with root package name and from kotlin metadata */
    public final Function2<restrictive.creditor, GraphicsLayer, Unit> drawBlock = new Function2<restrictive.creditor, GraphicsLayer, Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1
        {
            super(2);
        }

        @Override // p002kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(restrictive.creditor creditorVar, GraphicsLayer graphicsLayer) {
            invoke2(creditorVar, graphicsLayer);
            return Unit.f29295attabal;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(final restrictive.creditor creditorVar, final GraphicsLayer graphicsLayer) {
            if (!this.this$0.getLayoutNode().attabal()) {
                this.this$0.lastLayerDrawingWasSkipped = true;
                return;
            }
            OwnerSnapshotObserver ownerSnapshotObserverHyalinization = this.this$0.hyalinization();
            NodeCoordinator nodeCoordinator = this.this$0;
            Function1 function1 = NodeCoordinator.f6945premeiotic;
            final NodeCoordinator nodeCoordinator2 = this.this$0;
            ownerSnapshotObserverHyalinization.taiyuan(nodeCoordinator, function1, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$drawBlock$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    nodeCoordinator2.pruinose(creditorVar, graphicsLayer);
                }
            });
            this.this$0.lastLayerDrawingWasSkipped = false;
        }
    };

    /* JADX INFO: renamed from: splinterproof, reason: collision with root package name and from kotlin metadata */
    public final Function0<Unit> invalidateParentLayer = new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$invalidateParentLayer$1
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
            NodeCoordinator wrappedBy = this.this$0.getWrappedBy();
            if (wrappedBy != null) {
                wrappedBy.cybernatic();
            }
        }
    };

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"androidx/compose/ui/node/NodeCoordinator$attabal", "Landroidx/compose/ui/node/NodeCoordinator$wireman;", "Landroidx/compose/ui/node/saran;", "Landroidx/compose/ui/node/dent;", "attabal", "()I", "Landroidx/compose/ui/attabal$dern;", "node", "", "saneness", "(Landroidx/compose/ui/attabal$dern;)Z", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "wireman", "(Landroidx/compose/ui/node/LayoutNode;)Z", "layoutNode", "Lsupplicat/competently;", "pointerPosition", "Landroidx/compose/ui/node/triweekly;", "hitTestResult", "isTouchEvent", "isInLayer", "", "dern", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/triweekly;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class attabal implements wireman {
        @Override // androidx.compose.ui.node.NodeCoordinator.wireman
        public int attabal() {
            return saran.attabal(16);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.wireman
        public void dern(LayoutNode layoutNode, long pointerPosition, triweekly hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            layoutNode.lerp(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v7 */
        /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
            	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
            	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
            */
        @Override // androidx.compose.ui.node.NodeCoordinator.wireman
        public boolean saneness(androidx.compose.ui.attabal.dern r10) {
            /*
                r9 = this;
                r0 = 16
                int r1 = androidx.compose.ui.node.saran.attabal(r0)
                r2 = 0
                r3 = r2
            L8:
                r4 = 0
                if (r10 == 0) goto L5a
                boolean r5 = r10 instanceof androidx.compose.ui.node.dent
                r6 = 1
                if (r5 == 0) goto L19
                androidx.compose.ui.node.dent r10 = (androidx.compose.ui.node.dent) r10
                boolean r10 = r10.kowloon()
                if (r10 == 0) goto L55
                return r6
            L19:
                int r5 = r10.getKindSet()
                r5 = r5 & r1
                if (r5 == 0) goto L55
                boolean r5 = r10 instanceof androidx.compose.ui.node.competently
                if (r5 == 0) goto L55
                r5 = r10
                androidx.compose.ui.node.competently r5 = (androidx.compose.ui.node.competently) r5
                androidx.compose.ui.attabal$dern r5 = r5.getDelegate()
                r7 = r4
            L2c:
                if (r5 == 0) goto L52
                int r8 = r5.getKindSet()
                r8 = r8 & r1
                if (r8 == 0) goto L4d
                int r7 = r7 + 1
                if (r7 != r6) goto L3b
                r10 = r5
                goto L4d
            L3b:
                if (r3 != 0) goto L44
                androidx.compose.runtime.collection.dern r3 = new androidx.compose.runtime.collection.dern
                androidx.compose.ui.attabal$dern[] r8 = new androidx.compose.ui.attabal.dern[r0]
                r3.<init>(r8, r4)
            L44:
                if (r10 == 0) goto L4a
                r3.saneness(r10)
                r10 = r2
            L4a:
                r3.saneness(r5)
            L4d:
                androidx.compose.ui.attabal$dern r5 = r5.getChild()
                goto L2c
            L52:
                if (r7 != r6) goto L55
                goto L8
            L55:
                androidx.compose.ui.attabal$dern r10 = androidx.compose.ui.node.beachfront.saneness(r3)
                goto L8
            L5a:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.attabal.saneness(androidx.compose.ui.attabal$dern):boolean");
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.wireman
        public boolean wireman(LayoutNode parentLayoutNode) {
            return true;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.NodeCoordinator$dern, reason: from kotlin metadata */
    /* JADX INFO: compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$dern;", "", "<init>", "()V", "Landroidx/compose/ui/node/NodeCoordinator$wireman;", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$wireman;", "attabal", "()Landroidx/compose/ui/node/NodeCoordinator$wireman;", "SemanticsSource", "saneness", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Lrestrictive/underbelly;", "graphicsLayerScope", "Lrestrictive/underbelly;", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "", "onCommitAffectingLayer", "Lkotlin/jvm/functions/Function1;", "onCommitAffectingLayerParams", "Landroidx/compose/ui/node/polloi;", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/polloi;", "Lrestrictive/lerp;", "tmpMatrix", "[F", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wireman attabal() {
            return NodeCoordinator.f6942itchy;
        }

        public final wireman saneness() {
            return NodeCoordinator.f6940coffeecake;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000A\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ:\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\bH\u0016ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\u0019"}, d2 = {"androidx/compose/ui/node/NodeCoordinator$saneness", "Landroidx/compose/ui/node/NodeCoordinator$wireman;", "Landroidx/compose/ui/node/saran;", "Landroidx/compose/ui/node/premeiotic;", "attabal", "()I", "Landroidx/compose/ui/attabal$dern;", "node", "", "saneness", "(Landroidx/compose/ui/attabal$dern;)Z", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "wireman", "(Landroidx/compose/ui/node/LayoutNode;)Z", "layoutNode", "Lsupplicat/competently;", "pointerPosition", "Landroidx/compose/ui/node/triweekly;", "hitTestResult", "isTouchEvent", "isInLayer", "", "dern", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/triweekly;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class saneness implements wireman {
        @Override // androidx.compose.ui.node.NodeCoordinator.wireman
        public int attabal() {
            return saran.attabal(8);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.wireman
        public void dern(LayoutNode layoutNode, long pointerPosition, triweekly hitTestResult, boolean isTouchEvent, boolean isInLayer) {
            layoutNode.lotta(pointerPosition, hitTestResult, isTouchEvent, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.wireman
        public boolean saneness(androidx.compose.ui.attabal.dern node) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.wireman
        public boolean wireman(LayoutNode parentLayoutNode) {
            androidx.compose.ui.semantics.apical apicalVarPreprohormone = parentLayoutNode.preprohormone();
            boolean z = false;
            if (apicalVarPreprohormone != null && apicalVarPreprohormone.getIsClearingSemantics()) {
                z = true;
            }
            return !z;
        }
    }

    /* JADX INFO: compiled from: NodeCoordinator.kt */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0019\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ:\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0007H&ø\u0001\u0001¢\u0006\u0004\b\u0016\u0010\u0017ø\u0001\u0002\u0082\u0002\u0011\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\u0018À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$wireman;", "", "Landroidx/compose/ui/node/saran;", "attabal", "()I", "Landroidx/compose/ui/attabal$dern;", "node", "", "saneness", "(Landroidx/compose/ui/attabal$dern;)Z", "Landroidx/compose/ui/node/LayoutNode;", "parentLayoutNode", "wireman", "(Landroidx/compose/ui/node/LayoutNode;)Z", "layoutNode", "Lsupplicat/competently;", "pointerPosition", "Landroidx/compose/ui/node/triweekly;", "hitTestResult", "isTouchEvent", "isInLayer", "", "dern", "(Landroidx/compose/ui/node/LayoutNode;JLandroidx/compose/ui/node/triweekly;ZZ)V", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface wireman {
        int attabal();

        void dern(LayoutNode layoutNode, long pointerPosition, triweekly hitTestResult, boolean isTouchEvent, boolean isInLayer);

        boolean saneness(androidx.compose.ui.attabal.dern node);

        boolean wireman(LayoutNode parentLayoutNode);
    }

    public NodeCoordinator(LayoutNode layoutNode) {
        this.layoutNode = layoutNode;
    }

    public static /* synthetic */ void galluses(NodeCoordinator nodeCoordinator, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        nodeCoordinator.mef(z);
    }

    public static /* synthetic */ void ghoulish(NodeCoordinator nodeCoordinator, Function1 function1, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        nodeCoordinator.estragon(function1, z);
    }

    public static /* synthetic */ void infiltration(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        nodeCoordinator.brighton(mutableRect, z, z2);
    }

    public static /* synthetic */ long rsp(NodeCoordinator nodeCoordinator, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return nodeCoordinator.irani(j, z);
    }

    public static /* synthetic */ long sultanate(NodeCoordinator nodeCoordinator, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return nodeCoordinator.demilitarize(j, z);
    }

    @Override // androidx.compose.ui.layout.competently
    public long adultoid(long relativeToLocal) {
        return cuirassed.saneness(getLayoutNode()).beachfront(starveling(relativeToLocal));
    }

    public final void alloy() {
        estragon(this.layerBlock, true);
        walach walachVar = this.layer;
        if (walachVar != null) {
            walachVar.invalidate();
        }
    }

    public final NodeCoordinator astrogate(androidx.compose.ui.layout.competently competentlyVar) {
        NodeCoordinator nodeCoordinatorAttabal;
        androidx.compose.ui.layout.formularize formularizeVar = competentlyVar instanceof androidx.compose.ui.layout.formularize ? (androidx.compose.ui.layout.formularize) competentlyVar : null;
        if (formularizeVar != null && (nodeCoordinatorAttabal = formularizeVar.attabal()) != null) {
            return nodeCoordinatorAttabal;
        }
        Intrinsics.competently(competentlyVar, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (NodeCoordinator) competentlyVar;
    }

    public final void balance(boolean z) {
        this.forceMeasureWithLookaheadConstraints = z;
    }

    public void bavaria(androidx.compose.ui.layout.arytenoidectomy arytenoidectomyVar) {
        androidx.compose.ui.layout.arytenoidectomy arytenoidectomyVar2 = this._measureResult;
        if (arytenoidectomyVar != arytenoidectomyVar2) {
            this._measureResult = arytenoidectomyVar;
            if (arytenoidectomyVar2 == null || arytenoidectomyVar.getWidth() != arytenoidectomyVar2.getWidth() || arytenoidectomyVar.getHeight() != arytenoidectomyVar2.getHeight()) {
                palewise(arytenoidectomyVar.getWidth(), arytenoidectomyVar.getHeight());
            }
            Map<androidx.compose.ui.layout.attabal, Integer> map = this.oldAlignmentLines;
            if (((map == null || map.isEmpty()) && arytenoidectomyVar.saneness().isEmpty()) || Intrinsics.wireman(arytenoidectomyVar.saneness(), this.oldAlignmentLines)) {
                return;
            }
            stupefactive().getAlignmentLines().impassible();
            Map linkedHashMap = this.oldAlignmentLines;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.oldAlignmentLines = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(arytenoidectomyVar.saneness());
        }
    }

    public void bleacherite(long j) {
        this.position = j;
    }

    public final void bluecoat(wireman hitTestSource, long pointerPosition, triweekly hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        androidx.compose.ui.attabal.dern dernVarEthene = ethene(hitTestSource.attabal());
        if (!eyepiece(pointerPosition)) {
            if (isTouchEvent) {
                float fMicrochemistry = microchemistry(pointerPosition, twybill());
                if (Float.isInfinite(fMicrochemistry) || Float.isNaN(fMicrochemistry) || !hitTestResult.molybdenite(fMicrochemistry, false)) {
                    return;
                }
                polyfoil(dernVarEthene, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, false, fMicrochemistry);
                return;
            }
            return;
        }
        if (dernVarEthene == null) {
            harlequinade(hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        if (collection(pointerPosition)) {
            hydromechanics(dernVarEthene, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer);
            return;
        }
        float fMicrochemistry2 = !isTouchEvent ? Float.POSITIVE_INFINITY : microchemistry(pointerPosition, twybill());
        if (Float.isInfinite(fMicrochemistry2) || Float.isNaN(fMicrochemistry2) || !hitTestResult.molybdenite(fMicrochemistry2, isInLayer)) {
            electropaint(dernVarEthene, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fMicrochemistry2);
        } else {
            polyfoil(dernVarEthene, hitTestSource, pointerPosition, hitTestResult, isTouchEvent, isInLayer, fMicrochemistry2);
        }
    }

    public final void brighton(MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        walach walachVar = this.layer;
        if (walachVar != null) {
            if (this.isClipping) {
                if (clipToMinimumTouchTargetSize) {
                    long jTwybill = twybill();
                    float fCompetently = supplicat.impassible.competently(jTwybill) / 2.0f;
                    float fBeachfront = supplicat.impassible.beachfront(jTwybill) / 2.0f;
                    bounds.marial(-fCompetently, -fBeachfront, milliradian.monoploid.competently(triweekly()) + fCompetently, milliradian.monoploid.beachfront(triweekly()) + fBeachfront);
                } else if (clipBounds) {
                    bounds.marial(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, milliradian.monoploid.competently(triweekly()), milliradian.monoploid.beachfront(triweekly()));
                }
                if (bounds.beachfront()) {
                    return;
                }
            }
            walachVar.competently(bounds, false);
        }
        float fWireman = milliradian.impassible.wireman(getPosition());
        bounds.taiyuan(bounds.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String() + fWireman);
        bounds.cutely(bounds.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String() + fWireman);
        float fMarial = milliradian.impassible.marial(getPosition());
        bounds.apical(bounds.getTop() + fMarial);
        bounds.impromptu(bounds.getBottom() + fMarial);
    }

    public final NodeCoordinator cig(NodeCoordinator other) {
        LayoutNode layoutNode = other.getLayoutNode();
        LayoutNode layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            androidx.compose.ui.attabal.dern dernVarPuffin = other.puffin();
            androidx.compose.ui.attabal.dern dernVarPuffin2 = puffin();
            int iAttabal = saran.attabal(2);
            if (!dernVarPuffin2.getNode().getIsAttached()) {
                peridotite.attabal.saneness("visitLocalAncestors called on an unattached node");
            }
            for (androidx.compose.ui.attabal.dern parent = dernVarPuffin2.getNode().getParent(); parent != null; parent = parent.getParent()) {
                if ((parent.getKindSet() & iAttabal) != 0 && parent == dernVarPuffin) {
                    return other;
                }
            }
            return this;
        }
        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
            layoutNode = layoutNode.permissivist();
            Intrinsics.beachfront(layoutNode);
        }
        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
            layoutNode2 = layoutNode2.permissivist();
            Intrinsics.beachfront(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.permissivist();
            layoutNode2 = layoutNode2.permissivist();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode2 != getLayoutNode()) {
            if (layoutNode != other.getLayoutNode()) {
                return layoutNode.yemenite();
            }
            return other;
        }
        return this;
    }

    public final boolean collection(long pointerPosition) {
        float fApical = supplicat.competently.apical(pointerPosition);
        float fFormularize = supplicat.competently.formularize(pointerPosition);
        return fApical >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fFormularize >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && fApical < ((float) permissivist()) && fFormularize < ((float) clubfoot());
    }

    public final void cosy(restrictive.creditor canvas, lotta paint) {
        canvas.taiyuan(new supplicat.taiyuan(0.5f, 0.5f, milliradian.monoploid.competently(getMeasuredSize()) - 0.5f, milliradian.monoploid.beachfront(getMeasuredSize()) - 0.5f), paint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public final boolean crock() {
        /*
            r11 = this;
            r0 = 16
            int r1 = androidx.compose.ui.node.saran.attabal(r0)
            boolean r1 = androidx.compose.ui.node.privatdozent.taiyuan(r1)
            androidx.compose.ui.attabal$dern r1 = r11.microanalysis(r1)
            r2 = 0
            if (r1 != 0) goto L12
            return r2
        L12:
            boolean r3 = r1.getIsAttached()
            if (r3 == 0) goto L98
            int r3 = androidx.compose.ui.node.saran.attabal(r0)
            androidx.compose.ui.attabal$dern r4 = r1.getNode()
            boolean r4 = r4.getIsAttached()
            if (r4 != 0) goto L2b
            java.lang.String r4 = "visitLocalDescendants called on an unattached node"
            peridotite.attabal.saneness(r4)
        L2b:
            androidx.compose.ui.attabal$dern r1 = r1.getNode()
            int r4 = r1.getAggregateChildKindSet()
            r4 = r4 & r3
            if (r4 == 0) goto L98
        L36:
            if (r1 == 0) goto L98
            int r4 = r1.getKindSet()
            r4 = r4 & r3
            if (r4 == 0) goto L93
            r4 = 0
            r5 = r1
            r6 = r4
        L42:
            if (r5 == 0) goto L93
            boolean r7 = r5 instanceof androidx.compose.ui.node.dent
            r8 = 1
            if (r7 == 0) goto L52
            androidx.compose.ui.node.dent r5 = (androidx.compose.ui.node.dent) r5
            boolean r5 = r5.merc()
            if (r5 == 0) goto L8e
            return r8
        L52:
            int r7 = r5.getKindSet()
            r7 = r7 & r3
            if (r7 == 0) goto L8e
            boolean r7 = r5 instanceof androidx.compose.ui.node.competently
            if (r7 == 0) goto L8e
            r7 = r5
            androidx.compose.ui.node.competently r7 = (androidx.compose.ui.node.competently) r7
            androidx.compose.ui.attabal$dern r7 = r7.getDelegate()
            r9 = r2
        L65:
            if (r7 == 0) goto L8b
            int r10 = r7.getKindSet()
            r10 = r10 & r3
            if (r10 == 0) goto L86
            int r9 = r9 + 1
            if (r9 != r8) goto L74
            r5 = r7
            goto L86
        L74:
            if (r6 != 0) goto L7d
            androidx.compose.runtime.collection.dern r6 = new androidx.compose.runtime.collection.dern
            androidx.compose.ui.attabal$dern[] r10 = new androidx.compose.ui.attabal.dern[r0]
            r6.<init>(r10, r2)
        L7d:
            if (r5 == 0) goto L83
            r6.saneness(r5)
            r5 = r4
        L83:
            r6.saneness(r7)
        L86:
            androidx.compose.ui.attabal$dern r7 = r7.getChild()
            goto L65
        L8b:
            if (r9 != r8) goto L8e
            goto L42
        L8e:
            androidx.compose.ui.attabal$dern r5 = androidx.compose.ui.node.beachfront.saneness(r6)
            goto L42
        L93:
            androidx.compose.ui.attabal$dern r1 = r1.getChild()
            goto L36
        L98:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.crock():boolean");
    }

    /* JADX INFO: renamed from: ctenidium, reason: from getter */
    public final NodeCoordinator getWrapped() {
        return this.wrapped;
    }

    @Override // androidx.compose.ui.layout.competently
    public long cutely(androidx.compose.ui.layout.competently sourceCoordinates, long relativeToSource) {
        return marial(sourceCoordinates, relativeToSource, true);
    }

    public void cybernatic() {
        walach walachVar = this.layer;
        if (walachVar != null) {
            walachVar.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.cybernatic();
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable czestochowa() {
        return this.wrapped;
    }

    /* JADX INFO: renamed from: decarock, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    public long demilitarize(long position, boolean includeMotionFrameOfReference) {
        if (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) {
            position = milliradian.triweekly.saneness(position, getPosition());
        }
        walach walachVar = this.layer;
        return walachVar != null ? walachVar.saneness(position, true) : position;
    }

    public final void electropaint(final androidx.compose.ui.attabal.dern dernVar, final wireman wiremanVar, final long j, final triweekly triweeklyVar, final boolean z, final boolean z2, final float f) {
        if (dernVar == null) {
            harlequinade(wiremanVar, j, triweeklyVar, z, z2);
        } else if (wiremanVar.saneness(dernVar)) {
            triweeklyVar.dovishness(dernVar, f, z2, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$speculativeHit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    this.this$0.electropaint(grimness.saneness(dernVar, wiremanVar.attabal(), saran.attabal(2)), wiremanVar, j, triweeklyVar, z, z2, f);
                }
            });
        } else {
            electropaint(grimness.saneness(dernVar, wiremanVar.attabal(), saran.attabal(2)), wiremanVar, j, triweeklyVar, z, z2, f);
        }
    }

    public final void estragon(Function1<? super restrictive.treadless, Unit> layerBlock, boolean forceUpdateLayerParameters) {
        peridotite owner;
        if (!(layerBlock == null || this.explicitLayer == null)) {
            peridotite.attabal.attabal("layerBlock can't be provided when explicitLayer is provided");
        }
        LayoutNode layoutNode = getLayoutNode();
        boolean z = (!forceUpdateLayerParameters && this.layerBlock == layerBlock && Intrinsics.wireman(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (!layoutNode.picketboat() || layerBlock == null) {
            this.layerBlock = null;
            walach walachVar = this.layer;
            if (walachVar != null) {
                walachVar.destroy();
                layoutNode.sultanate(true);
                this.invalidateParentLayer.invoke();
                if (impassible() && (owner = layoutNode.getOwner()) != null) {
                    owner.impromptu(layoutNode);
                }
            }
            this.layer = null;
            this.lastLayerDrawingWasSkipped = false;
            return;
        }
        this.layerBlock = layerBlock;
        if (this.layer != null) {
            if (z) {
                galluses(this, false, 1, null);
                return;
            }
            return;
        }
        walach walachVarFormularize = peridotite.formularize(cuirassed.saneness(layoutNode), this.drawBlock, this.invalidateParentLayer, null, 4, null);
        walachVarFormularize.wireman(getMeasuredSize());
        walachVarFormularize.impromptu(getPosition());
        this.layer = walachVarFormularize;
        galluses(this, false, 1, null);
        layoutNode.sultanate(true);
        this.invalidateParentLayer.invoke();
    }

    public final androidx.compose.ui.attabal.dern ethene(int type) {
        boolean zTaiyuan = privatdozent.taiyuan(type);
        androidx.compose.ui.attabal.dern dernVarPuffin = puffin();
        if (!zTaiyuan && (dernVarPuffin = dernVarPuffin.getParent()) == null) {
            return null;
        }
        for (androidx.compose.ui.attabal.dern dernVarMicroanalysis = microanalysis(zTaiyuan); dernVarMicroanalysis != null && (dernVarMicroanalysis.getAggregateChildKindSet() & type) != 0; dernVarMicroanalysis = dernVarMicroanalysis.getChild()) {
            if ((dernVarMicroanalysis.getKindSet() & type) != 0) {
                return dernVarMicroanalysis;
            }
            if (dernVarMicroanalysis == dernVarPuffin) {
                return null;
            }
        }
        return null;
    }

    public final boolean eyepiece(long pointerPosition) {
        if (!supplicat.impromptu.saneness(pointerPosition)) {
            return false;
        }
        walach walachVar = this.layer;
        return walachVar == null || !this.isClipping || walachVar.marial(pointerPosition);
    }

    public final void fastrack(restrictive.creditor canvas, GraphicsLayer graphicsLayer) {
        walach walachVar = this.layer;
        if (walachVar != null) {
            walachVar.attabal(canvas, graphicsLayer);
            return;
        }
        float fWireman = milliradian.impassible.wireman(getPosition());
        float fMarial = milliradian.impassible.marial(getPosition());
        canvas.competently(fWireman, fMarial);
        pruinose(canvas, graphicsLayer);
        canvas.competently(-fWireman, -fMarial);
    }

    public final void genii() {
        getLayoutNode().getLayoutDelegate().walach();
    }

    @Override // milliradian.wireman
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // androidx.compose.ui.layout.beachfront
    public LayoutDirection getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    public void harlequinade(wireman hitTestSource, long pointerPosition, triweekly hitTestResult, boolean isTouchEvent, boolean isInLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.bluecoat(hitTestSource, sultanate(nodeCoordinator, pointerPosition, false, 2, null), hitTestResult, isTouchEvent, isInLayer);
        }
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public void herdbook() {
        GraphicsLayer graphicsLayer = this.explicitLayer;
        if (graphicsLayer != null) {
            milliradian(getPosition(), this.zIndex, graphicsLayer);
        } else {
            treadless(getPosition(), this.zIndex, this.layerBlock);
        }
    }

    public final long homophylic(long pointerPosition) {
        float fApical = supplicat.competently.apical(pointerPosition);
        float fMax = Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fApical < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -fApical : fApical - permissivist());
        float fFormularize = supplicat.competently.formularize(pointerPosition);
        return supplicat.impromptu.attabal(fMax, Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fFormularize < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? -fFormularize : fFormularize - clubfoot()));
    }

    public final OwnerSnapshotObserver hyalinization() {
        return cuirassed.saneness(getLayoutNode()).getSnapshotObserver();
    }

    public final void hydromechanics(final androidx.compose.ui.attabal.dern dernVar, final wireman wiremanVar, final long j, final triweekly triweeklyVar, final boolean z, final boolean z2) {
        if (dernVar == null) {
            harlequinade(wiremanVar, j, triweeklyVar, z, z2);
        } else {
            triweeklyVar.arytenoidectomy(dernVar, z2, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$hit$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    this.this$0.hydromechanics(grimness.saneness(dernVar, wiremanVar.attabal(), saran.attabal(2)), wiremanVar, j, triweeklyVar, z, z2);
                }
            });
        }
    }

    public final void hypokinesis() {
        this.released = true;
        this.invalidateParentLayer.invoke();
        polliwog();
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public LookaheadCapablePlaceable igbo() {
        return this.wrappedBy;
    }

    public final void imparkation(long position, float zIndex, Function1<? super restrictive.treadless, Unit> layerBlock, GraphicsLayer layer) {
        untruth(milliradian.impassible.competently(position, getApparentToRealOffset()), zIndex, layerBlock, layer);
    }

    @Override // androidx.compose.ui.layout.competently
    public boolean impassible() {
        return puffin().getIsAttached();
    }

    public final MutableRect incorrectly() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    public long irani(long position, boolean includeMotionFrameOfReference) {
        walach walachVar = this.layer;
        if (walachVar != null) {
            position = walachVar.saneness(position, false);
        }
        return (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) ? milliradian.triweekly.dern(position, getPosition()) : position;
    }

    @Override // milliradian.apical
    /* JADX INFO: renamed from: kattegat */
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    /* JADX INFO: renamed from: liable, reason: from getter */
    public final walach getLayer() {
        return this.layer;
    }

    /* JADX INFO: renamed from: libya, reason: from getter */
    public final boolean getForceMeasureWithLookaheadConstraints() {
        return this.forceMeasureWithLookaheadConstraints;
    }

    public final long licking(long minimumTouchTargetSize) {
        return supplicat.triweekly.attabal(Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (supplicat.impassible.competently(minimumTouchTargetSize) - permissivist()) / 2.0f), Math.max(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (supplicat.impassible.beachfront(minimumTouchTargetSize) - clubfoot()) / 2.0f));
    }

    public final boolean likeable() {
        if (this.layer != null && this.lastLayerAlpha <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.likeable();
        }
        return false;
    }

    public final void linendraper(MutableRect bounds, boolean clipBounds) {
        float fWireman = milliradian.impassible.wireman(getPosition());
        bounds.taiyuan(bounds.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.LEFT java.lang.String() - fWireman);
        bounds.cutely(bounds.getCom.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode.RIGHT java.lang.String() - fWireman);
        float fMarial = milliradian.impassible.marial(getPosition());
        bounds.apical(bounds.getTop() - fMarial);
        bounds.impromptu(bounds.getBottom() - fMarial);
        walach walachVar = this.layer;
        if (walachVar != null) {
            walachVar.competently(bounds, true);
            if (this.isClipping && clipBounds) {
                bounds.marial(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, milliradian.monoploid.competently(triweekly()), milliradian.monoploid.beachfront(triweekly()));
                bounds.beachfront();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    public final void livable() {
        androidx.compose.ui.attabal.dern parent;
        if (undecorated(saran.attabal(128))) {
            androidx.compose.runtime.snapshots.formularize.Companion companion = androidx.compose.runtime.snapshots.formularize.INSTANCE;
            androidx.compose.runtime.snapshots.formularize formularizeVarWireman = companion.wireman();
            Function1<Object, Unit> function1Competently = formularizeVarWireman != null ? formularizeVarWireman.competently() : null;
            androidx.compose.runtime.snapshots.formularize formularizeVarBeachfront = companion.beachfront(formularizeVarWireman);
            try {
                int iAttabal = saran.attabal(128);
                boolean zTaiyuan = privatdozent.taiyuan(iAttabal);
                if (!zTaiyuan) {
                    parent = puffin().getParent();
                    if (parent == null) {
                    }
                    Unit unit = Unit.f29295attabal;
                }
                parent = puffin();
                for (androidx.compose.ui.attabal.dern dernVarMicroanalysis = microanalysis(zTaiyuan); dernVarMicroanalysis != null && (dernVarMicroanalysis.getAggregateChildKindSet() & iAttabal) != 0; dernVarMicroanalysis = dernVarMicroanalysis.getChild()) {
                    if ((dernVarMicroanalysis.getKindSet() & iAttabal) != 0) {
                        androidx.compose.runtime.collection.dern dernVar = null;
                        androidx.compose.ui.attabal.dern dernVarBeachfront = dernVarMicroanalysis;
                        while (dernVarBeachfront != 0) {
                            if (dernVarBeachfront instanceof molybdenite) {
                                ((molybdenite) dernVarBeachfront).saneness(getMeasuredSize());
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
                    if (dernVarMicroanalysis == parent) {
                        break;
                    }
                }
                Unit unit2 = Unit.f29295attabal;
            } finally {
                companion.impassible(formularizeVarWireman, formularizeVarBeachfront, function1Competently);
            }
        }
    }

    @Override // androidx.compose.ui.layout.competently
    public long marial(androidx.compose.ui.layout.competently sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if (sourceCoordinates instanceof androidx.compose.ui.layout.formularize) {
            ((androidx.compose.ui.layout.formularize) sourceCoordinates).attabal().genii();
            return supplicat.competently.polloi(sourceCoordinates.marial(this, supplicat.competently.polloi(relativeToSource), includeMotionFrameOfReference));
        }
        NodeCoordinator nodeCoordinatorAstrogate = astrogate(sourceCoordinates);
        nodeCoordinatorAstrogate.genii();
        NodeCoordinator nodeCoordinatorCig = cig(nodeCoordinatorAstrogate);
        while (nodeCoordinatorAstrogate != nodeCoordinatorCig) {
            relativeToSource = nodeCoordinatorAstrogate.irani(relativeToSource, includeMotionFrameOfReference);
            nodeCoordinatorAstrogate = nodeCoordinatorAstrogate.wrappedBy;
            Intrinsics.beachfront(nodeCoordinatorAstrogate);
        }
        return osteal(nodeCoordinatorCig, relativeToSource, includeMotionFrameOfReference);
    }

    public final void mef(boolean invokeOnLayoutChange) {
        peridotite owner;
        if (this.explicitLayer != null) {
            return;
        }
        walach walachVar = this.layer;
        if (walachVar == null) {
            if (this.layerBlock == null) {
                return;
            }
            peridotite.attabal.saneness("null layer with a non-null layerBlock");
            return;
        }
        final Function1<? super restrictive.treadless, Unit> function1 = this.layerBlock;
        if (function1 == null) {
            peridotite.attabal.dern("updateLayerParameters requires a non-null layerBlock");
            throw new KotlinNothingValueException();
        }
        underbelly underbellyVar = f6946timberyard;
        underbellyVar.stratoscope();
        underbellyVar.starveling(getLayoutNode().getDensity());
        underbellyVar.hydrovane(getLayoutNode().getLayoutDirection());
        underbellyVar.cultivated(milliradian.polloi.saneness(triweekly()));
        hyalinization().taiyuan(this, f6941cultivated, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$updateLayerParameters$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
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
                function1.invoke(NodeCoordinator.f6946timberyard);
                NodeCoordinator.f6946timberyard.itchy();
            }
        });
        polloi polloiVar = this.layerPositionalProperties;
        if (polloiVar == null) {
            polloiVar = new polloi();
            this.layerPositionalProperties = polloiVar;
        }
        polloiVar.saneness(underbellyVar);
        walachVar.beachfront(underbellyVar);
        this.isClipping = underbellyVar.getClip();
        this.lastLayerAlpha = underbellyVar.getAlpha();
        if (!invokeOnLayoutChange || (owner = getLayoutNode().getOwner()) == null) {
            return;
        }
        owner.impromptu(getLayoutNode());
    }

    public final androidx.compose.ui.attabal.dern microanalysis(boolean includeTail) {
        androidx.compose.ui.attabal.dern dernVarPuffin;
        if (getLayoutNode().clubfoot() == this) {
            return getLayoutNode().getNodes().getHead();
        }
        if (!includeTail) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                return nodeCoordinator.puffin();
            }
            return null;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 == null || (dernVarPuffin = nodeCoordinator2.puffin()) == null) {
            return null;
        }
        return dernVarPuffin.getChild();
    }

    public final float microchemistry(long pointerPosition, long minimumTouchTargetSize) {
        if (permissivist() >= supplicat.impassible.competently(minimumTouchTargetSize) && clubfoot() >= supplicat.impassible.beachfront(minimumTouchTargetSize)) {
            return Float.POSITIVE_INFINITY;
        }
        long jLicking = licking(minimumTouchTargetSize);
        float fCompetently = supplicat.impassible.competently(jLicking);
        float fBeachfront = supplicat.impassible.beachfront(jLicking);
        long jHomophylic = homophylic(pointerPosition);
        if ((fCompetently > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || fBeachfront > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) && supplicat.competently.apical(jHomophylic) <= fCompetently && supplicat.competently.formularize(jHomophylic) <= fBeachfront) {
            return supplicat.competently.cutely(jHomophylic);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    public Object miliaria() {
        if (!getLayoutNode().getNodes().monoploid(saran.attabal(64))) {
            return null;
        }
        puffin();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        for (androidx.compose.ui.attabal.dern dernVarKowloon = getLayoutNode().getNodes().getTail(); dernVarKowloon != null; dernVarKowloon = dernVarKowloon.getParent()) {
            if ((saran.attabal(64) & dernVarKowloon.getKindSet()) != 0) {
                int iAttabal = saran.attabal(64);
                androidx.compose.runtime.collection.dern dernVar = null;
                androidx.compose.ui.attabal.dern dernVarBeachfront = dernVarKowloon;
                while (dernVarBeachfront != 0) {
                    if (dernVarBeachfront instanceof splinterproof) {
                        ref$ObjectRef.element = ((splinterproof) dernVarBeachfront).competently(getLayoutNode().getDensity(), ref$ObjectRef.element);
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
        }
        return ref$ObjectRef.element;
    }

    @Override // androidx.compose.ui.layout.gintrap
    public void milliradian(long position, float zIndex, GraphicsLayer layer) {
        if (!this.forcePlaceWithLookaheadOffset) {
            untruth(position, zIndex, null, layer);
            return;
        }
        yemenite yemeniteVarVir = getLookaheadDelegate();
        Intrinsics.beachfront(yemeniteVarVir);
        untruth(yemeniteVarVir.getPosition(), zIndex, null, layer);
    }

    public void murrine(restrictive.creditor canvas, GraphicsLayer graphicsLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.fastrack(canvas, graphicsLayer);
        }
    }

    public final void nattier(boolean z) {
        this.forcePlaceWithLookaheadOffset = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void nomenclative() {
        int iAttabal = saran.attabal(128);
        boolean zTaiyuan = privatdozent.taiyuan(iAttabal);
        androidx.compose.ui.attabal.dern dernVarPuffin = puffin();
        if (!zTaiyuan && (dernVarPuffin = dernVarPuffin.getParent()) == null) {
            return;
        }
        for (androidx.compose.ui.attabal.dern dernVarMicroanalysis = microanalysis(zTaiyuan); dernVarMicroanalysis != null && (dernVarMicroanalysis.getAggregateChildKindSet() & iAttabal) != 0; dernVarMicroanalysis = dernVarMicroanalysis.getChild()) {
            if ((dernVarMicroanalysis.getKindSet() & iAttabal) != 0) {
                androidx.compose.ui.attabal.dern dernVarBeachfront = dernVarMicroanalysis;
                androidx.compose.runtime.collection.dern dernVar = null;
                while (dernVarBeachfront != 0) {
                    if (dernVarBeachfront instanceof molybdenite) {
                        ((molybdenite) dernVarBeachfront).dern(this);
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

    @Override // androidx.compose.ui.node.mathsort
    public boolean oilcan() {
        return (this.layer == null || this.released || !getLayoutNode().picketboat()) ? false : true;
    }

    public final long osteal(NodeCoordinator ancestor, long offset, boolean includeMotionFrameOfReference) {
        if (ancestor == this) {
            return offset;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        return (nodeCoordinator == null || Intrinsics.wireman(ancestor, nodeCoordinator)) ? demilitarize(offset, includeMotionFrameOfReference) : demilitarize(nodeCoordinator.osteal(ancestor, offset, includeMotionFrameOfReference), includeMotionFrameOfReference);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    public void palewise(int width, int height) {
        NodeCoordinator nodeCoordinator;
        walach walachVar = this.layer;
        if (walachVar != null) {
            walachVar.wireman(milliradian.polloi.attabal(width, height));
        } else if (getLayoutNode().attabal() && (nodeCoordinator = this.wrappedBy) != null) {
            nodeCoordinator.cybernatic();
        }
        itchy(milliradian.polloi.attabal(width, height));
        if (this.layerBlock != null) {
            mef(false);
        }
        int iAttabal = saran.attabal(4);
        boolean zTaiyuan = privatdozent.taiyuan(iAttabal);
        androidx.compose.ui.attabal.dern dernVarPuffin = puffin();
        if (zTaiyuan || (dernVarPuffin = dernVarPuffin.getParent()) != null) {
            for (androidx.compose.ui.attabal.dern dernVarMicroanalysis = microanalysis(zTaiyuan); dernVarMicroanalysis != null && (dernVarMicroanalysis.getAggregateChildKindSet() & iAttabal) != 0; dernVarMicroanalysis = dernVarMicroanalysis.getChild()) {
                if ((dernVarMicroanalysis.getKindSet() & iAttabal) != 0) {
                    androidx.compose.ui.attabal.dern dernVarBeachfront = dernVarMicroanalysis;
                    androidx.compose.runtime.collection.dern dernVar = null;
                    while (dernVarBeachfront != 0) {
                        if (dernVarBeachfront instanceof apical) {
                            ((apical) dernVarBeachfront).supplicat();
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
                    break;
                }
            }
        }
        peridotite owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.impromptu(getLayoutNode());
        }
    }

    public final void philabeg(NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: picketboat, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    public final void polliwog() {
        if (this.layer != null) {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
            }
            ghoulish(this, null, false, 2, null);
            LayoutNode.licking(getLayoutNode(), false, 1, null);
        }
    }

    public final void polyfoil(final androidx.compose.ui.attabal.dern dernVar, final wireman wiremanVar, final long j, final triweekly triweeklyVar, final boolean z, final boolean z2, final float f) {
        if (dernVar == null) {
            harlequinade(wiremanVar, j, triweeklyVar, z, z2);
        } else {
            triweeklyVar.monoploid(dernVar, f, z2, new Function0<Unit>() { // from class: androidx.compose.ui.node.NodeCoordinator$hitNear$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    this.this$0.polyfoil(grimness.saneness(dernVar, wiremanVar.attabal(), saran.attabal(2)), wiremanVar, j, triweeklyVar, z, z2, f);
                }
            });
        }
    }

    public final void prefect(NodeCoordinator ancestor, MutableRect rect, boolean clipBounds) {
        if (ancestor == this) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.prefect(ancestor, rect, clipBounds);
        }
        linendraper(rect, clipBounds);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    /* JADX INFO: renamed from: preterite, reason: from getter */
    public LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    public final void pruinose(restrictive.creditor canvas, GraphicsLayer graphicsLayer) {
        androidx.compose.ui.attabal.dern dernVarEthene = ethene(saran.attabal(4));
        if (dernVarEthene == null) {
            murrine(canvas, graphicsLayer);
        } else {
            getLayoutNode().privatdozent().attabal(canvas, milliradian.polloi.saneness(triweekly()), this, dernVarEthene, graphicsLayer);
        }
    }

    public abstract androidx.compose.ui.attabal.dern puffin();

    /* JADX INFO: renamed from: rajahship, reason: from getter */
    public final NodeCoordinator getWrappedBy() {
        return this.wrappedBy;
    }

    public void saccharic() {
        walach walachVar = this.layer;
        if (walachVar != null) {
            walachVar.invalidate();
        }
    }

    @Override // androidx.compose.ui.layout.competently
    public long starveling(long relativeToLocal) {
        if (!impassible()) {
            peridotite.attabal.saneness("LayoutCoordinate operations are only valid when isAttached is true");
        }
        genii();
        long jRsp = relativeToLocal;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            jRsp = rsp(nodeCoordinator, jRsp, false, 2, null);
        }
        return jRsp;
    }

    @Override // androidx.compose.ui.layout.competently
    public supplicat.taiyuan stratoscope(androidx.compose.ui.layout.competently sourceCoordinates, boolean clipBounds) {
        if (!impassible()) {
            peridotite.attabal.saneness("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!sourceCoordinates.impassible()) {
            peridotite.attabal.saneness("LayoutCoordinates " + sourceCoordinates + " is not attached!");
        }
        NodeCoordinator nodeCoordinatorAstrogate = astrogate(sourceCoordinates);
        nodeCoordinatorAstrogate.genii();
        NodeCoordinator nodeCoordinatorCig = cig(nodeCoordinatorAstrogate);
        MutableRect mutableRectIncorrectly = incorrectly();
        mutableRectIncorrectly.taiyuan(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        mutableRectIncorrectly.apical(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        mutableRectIncorrectly.cutely(milliradian.monoploid.competently(sourceCoordinates.triweekly()));
        mutableRectIncorrectly.impromptu(milliradian.monoploid.beachfront(sourceCoordinates.triweekly()));
        NodeCoordinator nodeCoordinator = nodeCoordinatorAstrogate;
        while (nodeCoordinator != nodeCoordinatorCig) {
            boolean z = clipBounds;
            infiltration(nodeCoordinator, mutableRectIncorrectly, z, false, 4, null);
            if (mutableRectIncorrectly.beachfront()) {
                return supplicat.taiyuan.INSTANCE.attabal();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.beachfront(nodeCoordinator);
            clipBounds = z;
        }
        prefect(nodeCoordinatorCig, mutableRectIncorrectly, clipBounds);
        return supplicat.beachfront.attabal(mutableRectIncorrectly);
    }

    public final void strother(NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    public androidx.compose.ui.node.attabal stupefactive() {
        return getLayoutNode().getLayoutDelegate().polloi();
    }

    @Override // androidx.compose.ui.layout.competently
    public final androidx.compose.ui.layout.competently supplicat() {
        if (!impassible()) {
            peridotite.attabal.saneness("LayoutCoordinate operations are only valid when isAttached is true");
        }
        genii();
        return getLayoutNode().clubfoot().wrappedBy;
    }

    public final long tailoring() {
        return getMeasurementConstraints();
    }

    public abstract void tarboosh();

    /* JADX INFO: renamed from: tout, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    public final supplicat.taiyuan transformable() {
        if (!impassible()) {
            return supplicat.taiyuan.INSTANCE.attabal();
        }
        androidx.compose.ui.layout.competently competentlyVarWireman = androidx.compose.ui.layout.impromptu.wireman(this);
        MutableRect mutableRectIncorrectly = incorrectly();
        long jLicking = licking(twybill());
        mutableRectIncorrectly.taiyuan(-supplicat.impassible.competently(jLicking));
        mutableRectIncorrectly.apical(-supplicat.impassible.beachfront(jLicking));
        mutableRectIncorrectly.cutely(permissivist() + supplicat.impassible.competently(jLicking));
        mutableRectIncorrectly.impromptu(clubfoot() + supplicat.impassible.beachfront(jLicking));
        NodeCoordinator nodeCoordinator = this;
        while (nodeCoordinator != competentlyVarWireman) {
            nodeCoordinator.brighton(mutableRectIncorrectly, false, true);
            if (mutableRectIncorrectly.beachfront()) {
                return supplicat.taiyuan.INSTANCE.attabal();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            Intrinsics.beachfront(nodeCoordinator);
        }
        return supplicat.beachfront.attabal(mutableRectIncorrectly);
    }

    @Override // androidx.compose.ui.layout.gintrap
    public void treadless(long position, float zIndex, Function1<? super restrictive.treadless, Unit> layerBlock) {
        if (!this.forcePlaceWithLookaheadOffset) {
            untruth(position, zIndex, layerBlock, null);
            return;
        }
        yemenite yemeniteVarVir = getLookaheadDelegate();
        Intrinsics.beachfront(yemeniteVarVir);
        untruth(yemeniteVarVir.getPosition(), zIndex, layerBlock, null);
    }

    @Override // androidx.compose.ui.layout.competently
    public final long triweekly() {
        return getMeasuredSize();
    }

    public final long twybill() {
        return this.layerDensity.saran(getLayoutNode().getViewConfiguration().attabal());
    }

    public final boolean undecorated(int type) {
        androidx.compose.ui.attabal.dern dernVarMicroanalysis = microanalysis(privatdozent.taiyuan(type));
        return dernVarMicroanalysis != null && beachfront.marial(dernVarMicroanalysis, type);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public boolean underbelly() {
        return this._measureResult != null;
    }

    public final void untruth(long position, float zIndex, Function1<? super restrictive.treadless, Unit> layerBlock, GraphicsLayer explicitLayer) {
        if (explicitLayer != null) {
            if (!(layerBlock == null)) {
                peridotite.attabal.attabal("both ways to create layers shouldn't be used together");
            }
            if (this.explicitLayer != explicitLayer) {
                this.explicitLayer = null;
                ghoulish(this, null, false, 2, null);
                this.explicitLayer = explicitLayer;
            }
            if (this.layer == null) {
                walach walachVarKowloon = cuirassed.saneness(getLayoutNode()).kowloon(this.drawBlock, this.invalidateParentLayer, explicitLayer);
                walachVarKowloon.wireman(getMeasuredSize());
                walachVarKowloon.impromptu(position);
                this.layer = walachVarKowloon;
                getLayoutNode().sultanate(true);
                this.invalidateParentLayer.invoke();
            }
        } else {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
                ghoulish(this, null, false, 2, null);
            }
            ghoulish(this, layerBlock, false, 2, null);
        }
        if (!milliradian.impassible.dern(getPosition(), position)) {
            bleacherite(position);
            getLayoutNode().getLayoutDelegate().getMeasurePassDelegate().claque();
            walach walachVar = this.layer;
            if (walachVar != null) {
                walachVar.impromptu(position);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.cybernatic();
                }
            }
            lightstruck(this);
            peridotite owner = getLayoutNode().getOwner();
            if (owner != null) {
                owner.impromptu(getLayoutNode());
            }
        }
        this.zIndex = zIndex;
        if (getIsPlacingForAlignment()) {
            return;
        }
        sayid(wostteth());
    }

    /* JADX INFO: renamed from: vir */
    public abstract yemenite getLookaheadDelegate();

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public androidx.compose.ui.layout.arytenoidectomy wostteth() {
        androidx.compose.ui.layout.arytenoidectomy arytenoidectomyVar = this._measureResult;
        if (arytenoidectomyVar != null) {
            return arytenoidectomyVar;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public androidx.compose.ui.layout.competently sensatory() {
        return this;
    }
}
