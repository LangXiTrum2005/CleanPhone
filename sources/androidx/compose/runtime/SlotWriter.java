package androidx.compose.runtime;

import com.ironsource.A5;
import com.ironsource.X3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.jacoco.core.runtime.AgentOptions;
import org.objectweb.asm.signature.SignatureVisitor;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function2;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.runtime.cig, reason: from toString */
/* JADX INFO: compiled from: SlotTable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\bN\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0001\u0018\u0000 þ\u00012\u00020\u0001:\u0002±\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u0014J\u000f\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001f\u0010\u0017J\u000f\u0010 \u001a\u00020\tH\u0002¢\u0006\u0004\b \u0010!J'\u0010%\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b(\u0010\u0019J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u000fH\u0002¢\u0006\u0004\b+\u0010\u0017J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\b-\u0010\u0019J\u001f\u0010.\u001a\u00020\u000f2\u0006\u0010,\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b.\u0010*J\u001f\u00101\u001a\u00020\f2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\tH\u0002¢\u0006\u0004\b1\u00102J'\u00103\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b3\u0010&J!\u00104\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u00020\u000f2\u0006\u00106\u001a\u00020\t2\u0006\u00107\u001a\u00020\tH\u0002¢\u0006\u0004\b8\u0010*JG\u0010?\u001a\u00020\f2\u0006\u00109\u001a\u00020\t2\u0006\u0010,\u001a\u00020\t2&\u0010>\u001a\"\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<\u0018\u00010:j\u0010\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<\u0018\u0001`=H\u0002¢\u0006\u0004\b?\u0010@J'\u0010C\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\t2\u0006\u0010B\u001a\u00020\t2\u0006\u0010,\u001a\u00020\tH\u0002¢\u0006\u0004\bC\u0010&J\u0017\u0010D\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\bD\u0010EJ\u0017\u0010G\u001a\u00020\t2\u0006\u0010F\u001a\u00020\tH\u0002¢\u0006\u0004\bG\u0010EJ\u001b\u0010I\u001a\u00020\t*\u00020H2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\bK\u0010EJ\u001b\u0010M\u001a\u00020\t*\u00020H2\u0006\u0010L\u001a\u00020\tH\u0002¢\u0006\u0004\bM\u0010JJ\u001b\u0010N\u001a\u00020\t*\u00020H2\u0006\u0010L\u001a\u00020\tH\u0002¢\u0006\u0004\bN\u0010JJ#\u0010O\u001a\u00020\u000f*\u00020H2\u0006\u0010L\u001a\u00020\t2\u0006\u0010F\u001a\u00020\tH\u0002¢\u0006\u0004\bO\u0010PJ\u001b\u0010Q\u001a\u00020\t*\u00020H2\u0006\u0010L\u001a\u00020\tH\u0002¢\u0006\u0004\bQ\u0010JJ\u001b\u0010R\u001a\u00020\t*\u00020H2\u0006\u0010L\u001a\u00020\tH\u0002¢\u0006\u0004\bR\u0010JJ/\u0010U\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u00109\u001a\u00020\t2\u0006\u0010S\u001a\u00020\t2\u0006\u0010T\u001a\u00020\tH\u0002¢\u0006\u0004\bU\u0010VJ'\u0010X\u001a\u00020\t2\u0006\u0010W\u001a\u00020\t2\u0006\u0010S\u001a\u00020\t2\u0006\u0010T\u001a\u00020\tH\u0002¢\u0006\u0004\bX\u0010YJ\u001f\u0010Z\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u00109\u001a\u00020\tH\u0002¢\u0006\u0004\bZ\u0010[J\u0017\u0010\\\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b\\\u0010EJ\u0015\u0010]\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b]\u0010\u0014J\u0015\u0010^\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b^\u0010EJ\u0015\u0010_\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b_\u0010EJ\u0017\u0010`\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b`\u0010aJ\u0015\u0010b\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bb\u0010EJ\u0017\u0010c\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bc\u0010aJ\u0015\u0010d\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bd\u0010\u0014J\u0015\u0010e\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\be\u0010\u0014J\u001d\u0010f\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0004\bf\u00102J\u0017\u0010g\u001a\u0004\u0018\u00010\u00012\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bg\u0010aJ\u0015\u0010h\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bh\u0010EJ\u0015\u0010j\u001a\u00020\u000f2\u0006\u0010i\u001a\u00020\f¢\u0006\u0004\bj\u0010kJ\r\u0010l\u001a\u00020\u000f¢\u0006\u0004\bl\u0010\u0017J\u0019\u0010m\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bm\u0010\bJ\u001f\u0010n\u001a\u00020\u000f2\u0006\u0010W\u001a\u00020;2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bn\u0010oJ\u0015\u0010q\u001a\u00020\u000f2\u0006\u0010p\u001a\u00020\t¢\u0006\u0004\bq\u0010\u0019J\u0017\u0010r\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\br\u0010sJ\r\u0010t\u001a\u00020\u000f¢\u0006\u0004\bt\u0010\u0017J\u0017\u0010u\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bu\u0010sJ\u0017\u0010v\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bv\u0010sJ\u001d\u0010w\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\bw\u0010[J)\u0010x\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bx\u0010yJ\u000f\u0010z\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bz\u0010{J\u001f\u0010|\u001a\u0004\u0018\u00010\u00012\u0006\u0010W\u001a\u00020;2\u0006\u0010'\u001a\u00020\t¢\u0006\u0004\b|\u0010}J \u0010\u007f\u001a\u0004\u0018\u00010\u00012\u0006\u0010~\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0019\u0010\u0081\u0001\u001a\u00020\t2\u0006\u0010~\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0081\u0001\u0010EJ\u0019\u0010\u0082\u0001\u001a\u00020\t2\u0006\u0010~\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0082\u0001\u0010EJ\u0017\u0010\u0083\u0001\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t¢\u0006\u0005\b\u0083\u0001\u0010EJ\u0018\u0010\u0085\u0001\u001a\u00020\u000f2\u0007\u0010\u0084\u0001\u001a\u00020\t¢\u0006\u0005\b\u0085\u0001\u0010\u0019J\u0018\u0010\u0086\u0001\u001a\u00020\u000f2\u0006\u0010W\u001a\u00020;¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u000f\u0010\u0088\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0088\u0001\u0010\u0017J\u000f\u0010\u0089\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0089\u0001\u0010\u0017J\u000f\u0010\u008a\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u008a\u0001\u0010\u0017J\u000f\u0010\u008b\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u008b\u0001\u0010\u0017J\"\u0010\u008d\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\t\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u008d\u0001\u00105J!\u0010\u008e\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u008e\u0001\u00105J,\u0010\u008f\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u000f\u0010\u0091\u0001\u001a\u00020\t¢\u0006\u0005\b\u0091\u0001\u0010!J\u0017\u0010\u0092\u0001\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020\t¢\u0006\u0005\b\u0092\u0001\u0010\u0019J\u0018\u0010\u0093\u0001\u001a\u00020\u000f2\u0006\u0010W\u001a\u00020;¢\u0006\u0006\b\u0093\u0001\u0010\u0087\u0001J\u000f\u0010\u0094\u0001\u001a\u00020\t¢\u0006\u0005\b\u0094\u0001\u0010!J\u0010\u0010\u0095\u0001\u001a\u00020\f¢\u0006\u0006\b\u0095\u0001\u0010\u0096\u0001J6\u0010\u0099\u0001\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u001c\u0010\u0098\u0001\u001a\u0017\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u000f0\u0097\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0018\u0010\u009c\u0001\u001a\u00020\u000f2\u0007\u0010\u009b\u0001\u001a\u00020\t¢\u0006\u0005\b\u009c\u0001\u0010\u0019J1\u0010\u009f\u0001\u001a\t\u0012\u0004\u0012\u00020;0\u009e\u00012\u0006\u0010W\u001a\u00020;2\u0007\u0010\u009b\u0001\u001a\u00020\t2\u0007\u0010\u009d\u0001\u001a\u00020\u0000¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J2\u0010¢\u0001\u001a\t\u0012\u0004\u0012\u00020;0\u009e\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\t2\t\b\u0002\u0010¡\u0001\u001a\u00020\f¢\u0006\u0006\b¢\u0001\u0010£\u0001J0\u0010¤\u0001\u001a\t\u0012\u0004\u0012\u00020;0\u009e\u00012\u0007\u0010\u009b\u0001\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010'\u001a\u00020\t¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u001a\u0010¦\u0001\u001a\u00020;2\b\b\u0002\u0010'\u001a\u00020\t¢\u0006\u0006\b¦\u0001\u0010§\u0001J\u0019\u0010¨\u0001\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\t¢\u0006\u0005\b¨\u0001\u0010\u0019J\u0018\u0010©\u0001\u001a\u00020\t2\u0006\u0010W\u001a\u00020;¢\u0006\u0006\b©\u0001\u0010ª\u0001J\u0013\u0010¬\u0001\u001a\u00030«\u0001H\u0016¢\u0006\u0006\b¬\u0001\u0010\u00ad\u0001J\u001c\u0010®\u0001\u001a\u0004\u0018\u00010<2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u001c\u0010°\u0001\u001a\u0004\u0018\u00010;2\u0006\u0010\u0012\u001a\u00020\tH\u0000¢\u0006\u0006\b°\u0001\u0010§\u0001R\u001e\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010´\u0001R\u0019\u0010·\u0001\u001a\u00020H8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bµ\u0001\u0010¶\u0001R\"\u0010»\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010¸\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¹\u0001\u0010º\u0001R+\u0010À\u0001\u001a\u0014\u0012\u0004\u0012\u00020;0¼\u0001j\t\u0012\u0004\u0012\u00020;`½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R8\u0010>\u001a\"\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<\u0018\u00010:j\u0010\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020<\u0018\u0001`=8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010Â\u0001R#\u0010Ç\u0001\u001a\f\u0012\u0005\u0012\u00030Ä\u0001\u0018\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0019\u0010Ê\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R\u0019\u0010Ì\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010É\u0001R\u0019\u0010Î\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010É\u0001R\u0019\u0010Ð\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0001\u0010É\u0001R\u0019\u0010Ò\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÑ\u0001\u0010É\u0001R\u0019\u0010Ô\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010É\u0001R\u0019\u0010Ö\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010É\u0001R\u0019\u0010Ø\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0001\u0010É\u0001R\u0019\u0010Ú\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010É\u0001R\u0018\u0010Þ\u0001\u001a\u00030Û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÜ\u0001\u0010Ý\u0001R\u0018\u0010à\u0001\u001a\u00030Û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bß\u0001\u0010Ý\u0001R\u0018\u0010â\u0001\u001a\u00030Û\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0001\u0010Ý\u0001R+\u0010å\u0001\u001a\u0014\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010ã\u0001\u0018\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bä\u0001\u0010Æ\u0001R(\u0010è\u0001\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bæ\u0001\u0010É\u0001\u001a\u0005\bç\u0001\u0010!R(\u0010ë\u0001\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bé\u0001\u0010É\u0001\u001a\u0005\bê\u0001\u0010!R'\u0010\"\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bì\u0001\u0010É\u0001\u001a\u0005\bí\u0001\u0010!R)\u0010ñ\u0001\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bî\u0001\u0010ï\u0001\u001a\u0006\bð\u0001\u0010\u0096\u0001R\u001b\u0010ô\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bò\u0001\u0010ó\u0001R\u0015\u0010T\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bõ\u0001\u0010!R\u0014\u0010÷\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bö\u0001\u0010\u0096\u0001R\u0013\u0010\r\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bø\u0001\u0010\u0096\u0001R\u0014\u0010ú\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bù\u0001\u0010\u0096\u0001R\u0014\u0010ü\u0001\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bû\u0001\u0010\u0096\u0001R\u0015\u0010,\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bý\u0001\u0010!¨\u0006ÿ\u0001"}, d2 = {"Landroidx/compose/runtime/cig;", "", "Landroidx/compose/runtime/cosy;", A5.R, "<init>", "(Landroidx/compose/runtime/cosy;)V", "value", "mastfed", "(Ljava/lang/Object;)Ljava/lang/Object;", "", X3.i.W, "objectKey", "", "isNode", "aux", "", "decarock", "(ILjava/lang/Object;ZLjava/lang/Object;)V", "group", "polder", "(I)Z", "merc", "attendance", "()V", "hyalinization", "(I)V", "Landroidx/compose/runtime/achondroplasia;", "set", "puffin", "(ILandroidx/collection/oilcan;)V", "kattegat", "immediately", "sakeen", "()I", "parent", "endGroup", "firstChild", "mathsort", "(III)V", "index", "julian", "unconsolidated", "(II)V", "supplicat", "size", "sensatory", "underbelly", "start", "len", "libyan", "(II)Z", "deadwork", "tout", "(ILjava/lang/Object;)V", "previousGapStart", "newGapStart", "miliaria", "gapStart", "Ljava/util/HashMap;", "Landroidx/compose/runtime/saneness;", "Landroidx/compose/runtime/splinterproof;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "homozygous", "(IILjava/util/HashMap;)Z", "originalLocation", "newLocation", "palmyra", "coffeecake", "(I)I", "dataIndex", "privatdozent", "", "dhss", "([II)I", "grimness", AgentOptions.ADDRESS, "saran", "pruinose", "ctenidium", "([III)V", "technofreak", "yemenite", "gapLen", "capacity", "creditor", "(IIII)I", "anchor", "seminary", "(III)I", "setterwort", "(II)I", "vesuvio", "igbo", "herdbook", "lerp", "nosophobia", "(I)Ljava/lang/Object;", "lotta", "itchy", "czestochowa", "empress", "coi", "hardpan", "outmarry", "normalClose", "restrictive", "(Z)V", "molet", "twybill", "oilcan", "(Landroidx/compose/runtime/saneness;Ljava/lang/Object;)V", "count", "liable", "incorrectly", "(Ljava/lang/Object;)V", "undecorated", "rajahship", "prefect", "tarboosh", "tectonization", "(IILjava/lang/Object;)Ljava/lang/Object;", "osteal", "()Ljava/lang/Object;", "cosy", "(Landroidx/compose/runtime/saneness;I)Ljava/lang/Object;", "groupIndex", "fastrack", "(II)Ljava/lang/Object;", "demilitarize", "cig", "sayid", "amount", "cuirassed", "basify", "(Landroidx/compose/runtime/saneness;)V", "microchemistry", "sealless", "hydrovane", "stupefactive", "dataKey", "libya", "tailoring", "linendraper", "(ILjava/lang/Object;Ljava/lang/Object;)V", "starveling", "walach", "peridotite", "licking", "lampshade", "()Z", "Lkotlin/Function2;", "block", "splinterproof", "(ILkotlin/jvm/functions/Function2;)V", "offset", "monroe", "writer", "", "claque", "(Landroidx/compose/runtime/saneness;ILandroidx/compose/runtime/cig;)Ljava/util/List;", "removeSourceGroup", "lightstruck", "(Landroidx/compose/runtime/cosy;IZ)Ljava/util/List;", "achondroplasia", "(ILandroidx/compose/runtime/cosy;I)Ljava/util/List;", "stratoscope", "(I)Landroidx/compose/runtime/saneness;", "gusty", "trm", "(Landroidx/compose/runtime/saneness;)I", "", "toString", "()Ljava/lang/String;", "sultanate", "(I)Landroidx/compose/runtime/splinterproof;", "vir", "attabal", "Landroidx/compose/runtime/cosy;", "treadless", "()Landroidx/compose/runtime/cosy;", "saneness", "[I", "groups", "", "dern", "[Ljava/lang/Object;", "slots", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "wireman", "Ljava/util/ArrayList;", "anchors", "marial", "Ljava/util/HashMap;", "Landroidx/collection/yemenite;", "Landroidx/collection/sealless;", "beachfront", "Landroidx/collection/yemenite;", "calledByMap", "competently", "I", "groupGapStart", "impromptu", "groupGapLen", "taiyuan", "currentSlot", "cutely", "currentSlotEnd", "apical", "slotsGapStart", "formularize", "slotsGapLen", "impassible", "slotsGapOwner", "triweekly", "insertCount", "kowloon", "nodeCount", "Landroidx/compose/runtime/overspeculate;", "arytenoidectomy", "Landroidx/compose/runtime/overspeculate;", "startStack", "monoploid", "endStack", "polloi", "nodeCountStack", "Landroidx/collection/seminary;", "molybdenite", "deferredSlotWrites", "graveside", "cultivated", "currentGroup", "adultoid", "premeiotic", "currentGroupEnd", "dovishness", "timberyard", "gintrap", "Z", "clubfoot", "closed", "rotuma", "Landroidx/collection/oilcan;", "pendingRecalculateMarks", "overspeculate", "preterite", "isGroupEnd", "wostteth", "permissivist", "collectingSourceInformation", "dent", "collectingCalledInformation", "milliradian", "preprohormone", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SlotWriter {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public int currentGroupEnd;

    /* JADX INFO: renamed from: apical, reason: collision with root package name and from kotlin metadata */
    public int slotsGapStart;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final cosy table;

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.yemenite<androidx.collection.sealless> calledByMap;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public int groupGapStart;

    /* JADX INFO: renamed from: cutely, reason: collision with root package name and from kotlin metadata */
    public int currentSlotEnd;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public Object[] slots;

    /* JADX INFO: renamed from: formularize, reason: collision with root package name and from kotlin metadata */
    public int slotsGapLen;

    /* JADX INFO: renamed from: gintrap, reason: collision with root package name and from kotlin metadata */
    public boolean closed;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public int currentGroup;

    /* JADX INFO: renamed from: impassible, reason: collision with root package name and from kotlin metadata */
    public int slotsGapOwner;

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public int groupGapLen;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public int nodeCount;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public HashMap<saneness, splinterproof> sourceInformationMap;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.yemenite<androidx.collection.seminary<Object>> deferredSlotWrites;

    /* JADX INFO: renamed from: rotuma, reason: collision with root package name and from kotlin metadata */
    public androidx.collection.oilcan pendingRecalculateMarks;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int[] groups;

    /* JADX INFO: renamed from: taiyuan, reason: collision with root package name and from kotlin metadata */
    public int currentSlot;

    /* JADX INFO: renamed from: triweekly, reason: collision with root package name and from kotlin metadata */
    public int insertCount;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public ArrayList<saneness> anchors;

    /* JADX INFO: renamed from: preprohormone, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: cord, reason: collision with root package name */
    public static final int f5834cord = 8;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final overspeculate startStack = new overspeculate();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public final overspeculate endStack = new overspeculate();

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final overspeculate nodeCountStack = new overspeculate();

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public int parent = -1;

    /* JADX INFO: renamed from: androidx.compose.runtime.cig$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: SlotTable.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/runtime/cig$attabal;", "", "<init>", "()V", "Landroidx/compose/runtime/cig;", "fromWriter", "", "fromIndex", "toWriter", "", "updateFromCursor", "updateToCursor", "removeSourceGroup", "", "Landroidx/compose/runtime/saneness;", "saneness", "(Landroidx/compose/runtime/cig;ILandroidx/compose/runtime/cig;ZZZ)Ljava/util/List;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ List dern(Companion companion, SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 32) != 0) {
                z3 = true;
            }
            return companion.saneness(slotWriter, i, slotWriter2, z, z2, z3);
        }

        public final List<saneness> saneness(SlotWriter fromWriter, int fromIndex, SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor, boolean removeSourceGroup) {
            boolean zLibyan;
            List<saneness> listFormularize;
            int iLotta = fromWriter.lotta(fromIndex);
            int i = fromIndex + iLotta;
            int iGrimness = fromWriter.grimness(fromIndex);
            int iGrimness2 = fromWriter.grimness(i);
            int i2 = iGrimness2 - iGrimness;
            boolean zMerc = fromWriter.merc(fromIndex);
            toWriter.sensatory(iLotta);
            toWriter.underbelly(i2, toWriter.getCurrentGroup());
            if (fromWriter.groupGapStart < i) {
                fromWriter.julian(i);
            }
            if (fromWriter.slotsGapStart < iGrimness2) {
                fromWriter.unconsolidated(iGrimness2, i);
            }
            int[] iArr = toWriter.groups;
            int currentGroup = toWriter.getCurrentGroup();
            int i3 = currentGroup * 5;
            p002kotlin.collections.arytenoidectomy.competently(fromWriter.groups, iArr, i3, fromIndex * 5, i * 5);
            Object[] objArr = toWriter.slots;
            int i4 = toWriter.currentSlot;
            System.arraycopy(fromWriter.slots, iGrimness, objArr, i4, i2);
            int parent = toWriter.getParent();
            iArr[i3 + 2] = parent;
            int i5 = currentGroup - fromIndex;
            int i6 = currentGroup + iLotta;
            int iSaran = i4 - toWriter.saran(iArr, currentGroup);
            int i7 = toWriter.slotsGapOwner;
            int i8 = toWriter.slotsGapLen;
            int length = objArr.length;
            int i9 = i7;
            int i10 = currentGroup;
            while (true) {
                zLibyan = false;
                if (i10 >= i6) {
                    break;
                }
                if (i10 != currentGroup) {
                    int i11 = (i10 * 5) + 2;
                    iArr[i11] = iArr[i11] + i5;
                }
                int[] iArr2 = iArr;
                int i12 = currentGroup;
                iArr2[(i10 * 5) + 4] = toWriter.creditor(toWriter.saran(iArr, i10) + iSaran, i9 >= i10 ? toWriter.slotsGapStart : 0, i8, length);
                if (i10 == i9) {
                    i9++;
                }
                i10++;
                currentGroup = i12;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            toWriter.slotsGapOwner = i9;
            int iMonoploid = tarboosh.monoploid(fromWriter.anchors, fromIndex, fromWriter.milliradian());
            int iMonoploid2 = tarboosh.monoploid(fromWriter.anchors, i, fromWriter.milliradian());
            if (iMonoploid < iMonoploid2) {
                ArrayList arrayList = fromWriter.anchors;
                ArrayList arrayList2 = new ArrayList(iMonoploid2 - iMonoploid);
                for (int i13 = iMonoploid; i13 < iMonoploid2; i13++) {
                    saneness sanenessVar = (saneness) arrayList.get(i13);
                    sanenessVar.dern(sanenessVar.getLocation() + i5);
                    arrayList2.add(sanenessVar);
                }
                toWriter.anchors.addAll(tarboosh.monoploid(toWriter.anchors, toWriter.getCurrentGroup(), toWriter.milliradian()), arrayList2);
                arrayList.subList(iMonoploid, iMonoploid2).clear();
                listFormularize = arrayList2;
            } else {
                listFormularize = p002kotlin.collections.adultoid.formularize();
            }
            List<saneness> list = listFormularize;
            if (!list.isEmpty()) {
                HashMap map = fromWriter.sourceInformationMap;
                HashMap map2 = toWriter.sourceInformationMap;
                if (map != null && map2 != null) {
                    int size = list.size();
                    for (int i14 = 0; i14 < size; i14++) {
                        saneness sanenessVar2 = listFormularize.get(i14);
                        splinterproof splinterproofVar = (splinterproof) map.get(sanenessVar2);
                        if (splinterproofVar != null) {
                            map.remove(sanenessVar2);
                            map2.put(sanenessVar2, splinterproofVar);
                        }
                    }
                }
            }
            int parent2 = toWriter.getParent();
            splinterproof splinterproofVarSultanate = toWriter.sultanate(parent);
            if (splinterproofVarSultanate != null) {
                int iKowloon = parent2 + 1;
                int currentGroup2 = toWriter.getCurrentGroup();
                int i15 = -1;
                while (iKowloon < currentGroup2) {
                    i15 = iKowloon;
                    iKowloon = tarboosh.kowloon(toWriter.groups, iKowloon) + iKowloon;
                }
                splinterproofVarSultanate.saneness(toWriter, i15, currentGroup2);
            }
            int iOutmarry = fromWriter.outmarry(fromIndex);
            if (removeSourceGroup) {
                if (updateFromCursor) {
                    boolean z = iOutmarry >= 0;
                    if (z) {
                        fromWriter.stupefactive();
                        fromWriter.cuirassed(iOutmarry - fromWriter.getCurrentGroup());
                        fromWriter.stupefactive();
                    }
                    fromWriter.cuirassed(fromIndex - fromWriter.getCurrentGroup());
                    boolean zLampshade = fromWriter.lampshade();
                    if (z) {
                        fromWriter.microchemistry();
                        fromWriter.starveling();
                        fromWriter.microchemistry();
                        fromWriter.starveling();
                    }
                    zLibyan = zLampshade;
                } else {
                    zLibyan = fromWriter.libyan(fromIndex, iLotta);
                    fromWriter.deadwork(iGrimness, i2, fromIndex - 1);
                }
            }
            if (zLibyan) {
                polloi.adultoid("Unexpectedly removed anchors");
            }
            int i16 = toWriter.nodeCount;
            int i17 = iArr3[i3 + 1];
            toWriter.nodeCount = i16 + ((1073741824 & i17) == 0 ? i17 & 67108863 : 1);
            if (updateToCursor) {
                toWriter.currentGroup = i6;
                toWriter.currentSlot = i4 + i2;
            }
            if (zMerc) {
                toWriter.hyalinization(parent);
            }
            return listFormularize;
        }

        public Companion() {
        }
    }

    public SlotWriter(cosy cosyVar) {
        this.table = cosyVar;
        this.groups = cosyVar.getGroups();
        this.slots = cosyVar.getSlots();
        this.anchors = cosyVar.taiyuan();
        this.sourceInformationMap = cosyVar.monoploid();
        this.calledByMap = cosyVar.cutely();
        this.groupGapStart = cosyVar.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - cosyVar.getGroupsSize();
        this.slotsGapStart = cosyVar.getSlotsSize();
        this.slotsGapLen = this.slots.length - cosyVar.getSlotsSize();
        this.slotsGapOwner = cosyVar.getGroupsSize();
        this.currentGroupEnd = cosyVar.getGroupsSize();
    }

    public static /* synthetic */ void picketboat(SlotWriter slotWriter, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = slotWriter.parent;
        }
        slotWriter.gusty(i);
    }

    public final List<saneness> achondroplasia(int offset, cosy table, int index) {
        if (!(this.insertCount <= 0 && lotta(this.currentGroup + offset) == 1)) {
            polloi.adultoid("Check failed");
        }
        int i = this.currentGroup;
        int i2 = this.currentSlot;
        int i3 = this.currentSlotEnd;
        cuirassed(offset);
        stupefactive();
        sealless();
        SlotWriter slotWriterGintrap = table.gintrap();
        try {
            List<saneness> listDern = Companion.dern(INSTANCE, slotWriterGintrap, index, this, false, true, false, 32, null);
            slotWriterGintrap.restrictive(true);
            hydrovane();
            starveling();
            this.currentGroup = i;
            this.currentSlot = i2;
            this.currentSlotEnd = i3;
            return listDern;
        } catch (Throwable th) {
            slotWriterGintrap.restrictive(false);
            throw th;
        }
    }

    public final void attendance() {
        androidx.collection.oilcan oilcanVar = this.pendingRecalculateMarks;
        if (oilcanVar != null) {
            while (achondroplasia.wireman(oilcanVar)) {
                puffin(achondroplasia.beachfront(oilcanVar), oilcanVar);
            }
        }
    }

    public final void basify(saneness anchor) {
        cuirassed(anchor.marial(this) - this.currentGroup);
    }

    public final int cig(int groupIndex) {
        return saran(this.groups, coffeecake(groupIndex + 1));
    }

    public final List<saneness> claque(saneness anchor, int offset, SlotWriter writer) {
        if (!(writer.insertCount > 0)) {
            polloi.adultoid("Check failed");
        }
        if (!(this.insertCount == 0)) {
            polloi.adultoid("Check failed");
        }
        if (!anchor.saneness()) {
            polloi.adultoid("Check failed");
        }
        int iTrm = trm(anchor) + offset;
        int i = this.currentGroup;
        if (!(i <= iTrm && iTrm < this.currentGroupEnd)) {
            polloi.adultoid("Check failed");
        }
        int iOutmarry = outmarry(iTrm);
        int iLotta = lotta(iTrm);
        int iHerdbook = igbo(iTrm) ? 1 : herdbook(iTrm);
        List<saneness> listDern = Companion.dern(INSTANCE, this, iTrm, writer, false, false, false, 32, null);
        hyalinization(iOutmarry);
        boolean z = iHerdbook > 0;
        while (iOutmarry >= i) {
            int iCoffeecake = coffeecake(iOutmarry);
            int[] iArr = this.groups;
            tarboosh.gintrap(iArr, iCoffeecake, tarboosh.kowloon(iArr, iCoffeecake) - iLotta);
            if (z) {
                int[] iArr2 = this.groups;
                int i2 = iArr2[(iCoffeecake * 5) + 1];
                if ((1073741824 & i2) != 0) {
                    z = false;
                } else {
                    tarboosh.preprohormone(iArr2, iCoffeecake, (i2 & 67108863) - iHerdbook);
                }
            }
            iOutmarry = outmarry(iOutmarry);
        }
        if (z) {
            if (!(this.nodeCount >= iHerdbook)) {
                polloi.adultoid("Check failed");
            }
            this.nodeCount -= iHerdbook;
        }
        return listDern;
    }

    /* JADX INFO: renamed from: clubfoot, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    public final int coffeecake(int index) {
        return index + (this.groupGapLen * (index < this.groupGapStart ? 0 : 1));
    }

    public final boolean coi(int index, int group) {
        int iSaneness;
        int iOverspeculate;
        if (group == this.parent) {
            iOverspeculate = this.currentGroupEnd;
        } else if (group <= this.startStack.marial(0) && (iSaneness = this.startStack.saneness(group)) >= 0) {
            iOverspeculate = (overspeculate() - this.groupGapLen) - this.endStack.dern(iSaneness);
        } else {
            int iLotta = lotta(group);
            iOverspeculate = iLotta + group;
        }
        return index > group && index < iOverspeculate;
    }

    public final Object cosy(saneness anchor, int index) {
        return fastrack(trm(anchor), index);
    }

    public final int creditor(int index, int gapStart, int gapLen, int capacity) {
        return index > gapStart ? -(((capacity - gapLen) - index) + 1) : index;
    }

    public final void ctenidium(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = creditor(i2, this.slotsGapStart, this.slotsGapLen, this.slots.length);
    }

    public final void cuirassed(int amount2) {
        boolean z = false;
        if (!(amount2 >= 0)) {
            polloi.adultoid("Cannot seek backwards");
        }
        if (!(this.insertCount <= 0)) {
            lightstruck.saneness("Cannot call seek() while inserting");
        }
        if (amount2 == 0) {
            return;
        }
        int i = this.currentGroup + amount2;
        if (i >= this.parent && i <= this.currentGroupEnd) {
            z = true;
        }
        if (!z) {
            polloi.adultoid("Cannot seek outside the current group (" + this.parent + SignatureVisitor.SUPER + this.currentGroupEnd + ')');
        }
        this.currentGroup = i;
        int iSaran = saran(this.groups, coffeecake(i));
        this.currentSlot = iSaran;
        this.currentSlotEnd = iSaran;
    }

    /* JADX INFO: renamed from: cultivated, reason: from getter */
    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final boolean czestochowa(int index) {
        int i = this.parent;
        if (index <= i || index >= this.currentGroupEnd) {
            return i == 0 && index == 0;
        }
        return true;
    }

    public final void deadwork(int start, int len, int group) {
        if (len > 0) {
            int i = this.slotsGapLen;
            int i2 = start + len;
            unconsolidated(i2, group);
            this.slotsGapStart = start;
            this.slotsGapLen = i + len;
            p002kotlin.collections.arytenoidectomy.molybdenite(this.slots, null, start, i2);
            int i3 = this.currentSlotEnd;
            if (i3 >= start) {
                this.currentSlotEnd = i3 - len;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    public final void decarock(int key, Object objectKey, boolean isNode, Object aux) {
        int iKowloon;
        splinterproof splinterproofVarSultanate;
        int i = this.parent;
        byte b = this.insertCount > 0;
        this.nodeCountStack.competently(this.nodeCount);
        if (b == true) {
            int i2 = this.currentGroup;
            int iSaran = saran(this.groups, coffeecake(i2));
            sensatory(1);
            this.currentSlot = iSaran;
            this.currentSlotEnd = iSaran;
            int iCoffeecake = coffeecake(i2);
            taiyuan.Companion attabalVar = taiyuan.INSTANCE;
            ?? r12 = objectKey != attabalVar.attabal() ? 1 : 0;
            ?? r13 = (isNode || aux == attabalVar.attabal()) ? 0 : 1;
            int iCreditor = creditor(iSaran, this.slotsGapStart, this.slotsGapLen, this.slots.length);
            if (iCreditor >= 0 && this.slotsGapOwner < i2) {
                iCreditor = -(((this.slots.length - this.slotsGapLen) - iCreditor) + 1);
            }
            tarboosh.arytenoidectomy(this.groups, iCoffeecake, key, isNode, r12, r13, this.parent, iCreditor);
            int i3 = (isNode ? 1 : 0) + r12 + r13;
            if (i3 > 0) {
                underbelly(i3, i2);
                Object[] objArr = this.slots;
                int i4 = this.currentSlot;
                if (isNode) {
                    objArr[i4] = aux;
                    i4++;
                }
                if (r12 != 0) {
                    objArr[i4] = objectKey;
                    i4++;
                }
                if (r13 != 0) {
                    objArr[i4] = aux;
                    i4++;
                }
                this.currentSlot = i4;
            }
            this.nodeCount = 0;
            iKowloon = i2 + 1;
            this.parent = i2;
            this.currentGroup = iKowloon;
            if (i >= 0 && (splinterproofVarSultanate = sultanate(i)) != null) {
                splinterproofVarSultanate.impassible(this, i2);
            }
        } else {
            this.startStack.competently(i);
            immediately();
            int i5 = this.currentGroup;
            int iCoffeecake2 = coffeecake(i5);
            if (!Intrinsics.wireman(aux, taiyuan.INSTANCE.attabal())) {
                if (isNode) {
                    rajahship(aux);
                } else {
                    incorrectly(aux);
                }
            }
            this.currentSlot = pruinose(this.groups, iCoffeecake2);
            this.currentSlotEnd = saran(this.groups, coffeecake(this.currentGroup + 1));
            int[] iArr = this.groups;
            this.nodeCount = iArr[(iCoffeecake2 * 5) + 1] & 67108863;
            this.parent = i5;
            this.currentGroup = i5 + 1;
            iKowloon = i5 + tarboosh.kowloon(iArr, iCoffeecake2);
        }
        this.currentGroupEnd = iKowloon;
    }

    public final int demilitarize(int groupIndex) {
        return pruinose(this.groups, coffeecake(groupIndex));
    }

    public final boolean dent() {
        return this.calledByMap != null;
    }

    public final int dhss(int[] iArr, int i) {
        return vesuvio(iArr[(coffeecake(i) * 5) + 2]);
    }

    public final boolean empress(int index) {
        return coi(index, this.currentGroup);
    }

    public final Object fastrack(int groupIndex, int index) {
        int iPruinose = pruinose(this.groups, coffeecake(groupIndex));
        int iSaran = saran(this.groups, coffeecake(groupIndex + 1));
        int i = index + iPruinose;
        if (iPruinose > i || i >= iSaran) {
            return taiyuan.INSTANCE.attabal();
        }
        return this.slots[privatdozent(i)];
    }

    public final int grimness(int index) {
        return saran(this.groups, coffeecake(index));
    }

    public final void gusty(int group) {
        int iCoffeecake = coffeecake(group);
        int[] iArr = this.groups;
        int i = (iCoffeecake * 5) + 1;
        if ((iArr[i] & 134217728) != 0) {
            return;
        }
        tarboosh.rotuma(iArr, iCoffeecake, true);
        if ((this.groups[i] & 67108864) != 0) {
            return;
        }
        hyalinization(outmarry(group));
    }

    public final Object hardpan(int index) {
        int iCoffeecake = coffeecake(index);
        int[] iArr = this.groups;
        if ((iArr[(iCoffeecake * 5) + 1] & 1073741824) != 0) {
            return this.slots[privatdozent(technofreak(iArr, iCoffeecake))];
        }
        return null;
    }

    public final int herdbook(int index) {
        return this.groups[(coffeecake(index) * 5) + 1] & 67108863;
    }

    public final boolean homozygous(int gapStart, int size, HashMap<saneness, splinterproof> sourceInformationMap) {
        int i = size + gapStart;
        int iMonoploid = tarboosh.monoploid(this.anchors, i, overspeculate() - this.groupGapLen);
        if (iMonoploid >= this.anchors.size()) {
            iMonoploid--;
        }
        int i2 = iMonoploid + 1;
        int i3 = 0;
        while (iMonoploid >= 0) {
            saneness sanenessVar = this.anchors.get(iMonoploid);
            int iTrm = trm(sanenessVar);
            if (iTrm < gapStart) {
                break;
            }
            if (iTrm < i) {
                sanenessVar.dern(Integer.MIN_VALUE);
                if (sourceInformationMap != null) {
                    sourceInformationMap.remove(sanenessVar);
                }
                if (i3 == 0) {
                    i3 = iMonoploid + 1;
                }
                i2 = iMonoploid;
            }
            iMonoploid--;
        }
        boolean z = i2 < i3;
        if (z) {
            this.anchors.subList(i2, i3).clear();
        }
        return z;
    }

    public final void hyalinization(int group) {
        if (group >= 0) {
            androidx.collection.oilcan oilcanVarDern = this.pendingRecalculateMarks;
            if (oilcanVarDern == null) {
                oilcanVarDern = achondroplasia.dern(null, 1, null);
                this.pendingRecalculateMarks = oilcanVarDern;
            }
            achondroplasia.attabal(oilcanVarDern, group);
        }
    }

    public final void hydrovane() {
        if (!(this.insertCount > 0)) {
            lightstruck.saneness("Unbalanced begin/end insert");
        }
        int i = this.insertCount - 1;
        this.insertCount = i;
        if (i == 0) {
            if (!(this.nodeCountStack.tos == this.startStack.tos)) {
                polloi.adultoid("startGroup/endGroup mismatch while inserting");
            }
            sakeen();
        }
    }

    public final boolean igbo(int index) {
        return (this.groups[(coffeecake(index) * 5) + 1] & 1073741824) != 0;
    }

    public final void immediately() {
        this.endStack.competently((overspeculate() - this.groupGapLen) - this.currentGroupEnd);
    }

    public final void incorrectly(Object value) {
        int iCoffeecake = coffeecake(this.currentGroup);
        if (!((this.groups[(iCoffeecake * 5) + 1] & 268435456) != 0)) {
            polloi.adultoid("Updating the data of a group that was not created with a data slot");
        }
        this.slots[privatdozent(yemenite(this.groups, iCoffeecake))] = value;
    }

    public final Object itchy(int index) {
        int iCoffeecake = coffeecake(index);
        int[] iArr = this.groups;
        return (iArr[(iCoffeecake * 5) + 1] & 268435456) != 0 ? this.slots[yemenite(iArr, iCoffeecake)] : taiyuan.INSTANCE.attabal();
    }

    public final void julian(int index) {
        int i = this.groupGapLen;
        int i2 = this.groupGapStart;
        if (i2 != index) {
            if (!this.anchors.isEmpty()) {
                miliaria(i2, index);
            }
            if (i > 0) {
                int[] iArr = this.groups;
                int i3 = index * 5;
                int i4 = i * 5;
                int i5 = i2 * 5;
                if (index < i2) {
                    p002kotlin.collections.arytenoidectomy.competently(iArr, iArr, i4 + i3, i3, i5);
                } else {
                    p002kotlin.collections.arytenoidectomy.competently(iArr, iArr, i5, i5 + i4, i3 + i4);
                }
            }
            if (index < i2) {
                i2 = index + i;
            }
            int iOverspeculate = overspeculate();
            if (!(i2 < iOverspeculate)) {
                polloi.adultoid("Check failed");
            }
            while (i2 < iOverspeculate) {
                int i6 = (i2 * 5) + 2;
                int i7 = this.groups[i6];
                int i8 = setterwort(vesuvio(i7), index);
                if (i8 != i7) {
                    this.groups[i6] = i8;
                }
                i2++;
                if (i2 == index) {
                    i2 += i;
                }
            }
        }
        this.groupGapStart = index;
    }

    public final boolean kattegat(int group) {
        int iLotta = group + 1;
        int iLotta2 = group + lotta(group);
        while (iLotta < iLotta2) {
            if ((this.groups[(coffeecake(iLotta) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            iLotta += lotta(iLotta);
        }
        return false;
    }

    public final boolean lampshade() {
        saneness sanenessVarVir;
        if (!(this.insertCount == 0)) {
            polloi.adultoid("Cannot remove group while inserting");
        }
        int i = this.currentGroup;
        int i2 = this.currentSlot;
        int iSaran = saran(this.groups, coffeecake(i));
        int iLicking = licking();
        splinterproof splinterproofVarSultanate = sultanate(this.parent);
        if (splinterproofVarSultanate != null && (sanenessVarVir = vir(i)) != null) {
            splinterproofVarSultanate.apical(sanenessVarVir);
        }
        androidx.collection.oilcan oilcanVar = this.pendingRecalculateMarks;
        if (oilcanVar != null) {
            while (achondroplasia.wireman(oilcanVar) && achondroplasia.marial(oilcanVar) >= i) {
                achondroplasia.beachfront(oilcanVar);
            }
        }
        boolean zLibyan = libyan(i, this.currentGroup - i);
        deadwork(iSaran, this.currentSlot - iSaran, i - 1);
        this.currentGroup = i;
        this.currentSlot = i2;
        this.nodeCount -= iLicking;
        return zLibyan;
    }

    public final int lerp(int index) {
        return this.groups[coffeecake(index) * 5];
    }

    public final void liable(int count) {
        if (!(count > 0)) {
            polloi.adultoid("Check failed");
        }
        int i = this.parent;
        int iPruinose = pruinose(this.groups, coffeecake(i));
        int iSaran = saran(this.groups, coffeecake(i + 1)) - count;
        if (!(iSaran >= iPruinose)) {
            polloi.adultoid("Check failed");
        }
        deadwork(iSaran, count, i);
        int i2 = this.currentSlot;
        if (i2 >= iPruinose) {
            this.currentSlot = i2 - count;
        }
    }

    public final void libya(int key, Object dataKey) {
        decarock(key, dataKey, false, taiyuan.INSTANCE.attabal());
    }

    public final boolean libyan(int start, int len) {
        boolean zHomozygous = false;
        if (len > 0) {
            ArrayList<saneness> arrayList = this.anchors;
            julian(start);
            zHomozygous = arrayList.isEmpty() ? false : homozygous(start, len, this.sourceInformationMap);
            this.groupGapStart = start;
            this.groupGapLen += len;
            int i = this.slotsGapOwner;
            if (i > start) {
                this.slotsGapOwner = Math.max(start, i - len);
            }
            int i2 = this.currentGroupEnd;
            if (i2 >= this.groupGapStart) {
                this.currentGroupEnd = i2 - len;
            }
            int i3 = this.parent;
            if (polder(i3)) {
                hyalinization(i3);
            }
        }
        return zHomozygous;
    }

    public final int licking() {
        int iCoffeecake = coffeecake(this.currentGroup);
        int iKowloon = this.currentGroup + tarboosh.kowloon(this.groups, iCoffeecake);
        this.currentGroup = iKowloon;
        this.currentSlot = saran(this.groups, coffeecake(iKowloon));
        int i = this.groups[(iCoffeecake * 5) + 1];
        if ((1073741824 & i) != 0) {
            return 1;
        }
        return i & 67108863;
    }

    public final List<saneness> lightstruck(cosy table, int index, boolean removeSourceGroup) {
        boolean z = false;
        if (!(this.insertCount > 0 ? true : z)) {
            polloi.adultoid("Check failed");
        }
        if (index != 0 || this.currentGroup != 0 || this.table.getGroupsSize() != 0 || tarboosh.kowloon(table.getGroups(), index) != table.getGroupsSize()) {
            SlotWriter slotWriterGintrap = table.gintrap();
            try {
                return INSTANCE.saneness(slotWriterGintrap, index, this, true, true, removeSourceGroup);
            } finally {
                slotWriterGintrap.restrictive(z);
            }
        }
        int[] iArr = this.groups;
        Object[] objArr = this.slots;
        ArrayList<saneness> arrayList = this.anchors;
        HashMap<saneness, splinterproof> map = this.sourceInformationMap;
        androidx.collection.yemenite<androidx.collection.sealless> yemeniteVar = this.calledByMap;
        int[] iArrImpassible = table.getGroups();
        int iTriweekly = table.getGroupsSize();
        Object[] objArrKowloon = table.getSlots();
        int iArytenoidectomy = table.getSlotsSize();
        HashMap<saneness, splinterproof> mapMonoploid = table.monoploid();
        androidx.collection.yemenite<androidx.collection.sealless> yemeniteVarCutely = table.cutely();
        this.groups = iArrImpassible;
        this.slots = objArrKowloon;
        this.anchors = table.taiyuan();
        this.groupGapStart = iTriweekly;
        this.groupGapLen = (iArrImpassible.length / 5) - iTriweekly;
        this.slotsGapStart = iArytenoidectomy;
        this.slotsGapLen = objArrKowloon.length - iArytenoidectomy;
        this.slotsGapOwner = iTriweekly;
        this.sourceInformationMap = mapMonoploid;
        this.calledByMap = yemeniteVarCutely;
        table.preprohormone(iArr, 0, objArr, 0, arrayList, map, yemeniteVar);
        return this.anchors;
    }

    public final void linendraper(int key, Object objectKey, Object aux) {
        decarock(key, objectKey, false, aux);
    }

    public final int lotta(int index) {
        return tarboosh.kowloon(this.groups, coffeecake(index));
    }

    public final Object mastfed(Object value) {
        Object objOsteal = osteal();
        prefect(value);
        return objOsteal;
    }

    public final void mathsort(int parent, int endGroup, int firstChild) {
        int i = setterwort(parent, this.groupGapStart);
        while (firstChild < endGroup) {
            this.groups[(coffeecake(firstChild) * 5) + 2] = i;
            int iKowloon = tarboosh.kowloon(this.groups, coffeecake(firstChild)) + firstChild;
            mathsort(firstChild, iKowloon, firstChild + 1);
            firstChild = iKowloon;
        }
    }

    public final boolean merc(int group) {
        return group >= 0 && (this.groups[(coffeecake(group) * 5) + 1] & 201326592) != 0;
    }

    public final void microchemistry() {
        int i = this.currentGroupEnd;
        this.currentGroup = i;
        this.currentSlot = saran(this.groups, coffeecake(i));
    }

    public final void miliaria(int previousGapStart, int newGapStart) {
        saneness sanenessVar;
        int iAttabal;
        saneness sanenessVar2;
        int iAttabal2;
        int i;
        int iOverspeculate = overspeculate() - this.groupGapLen;
        if (previousGapStart >= newGapStart) {
            for (int iMonoploid = tarboosh.monoploid(this.anchors, newGapStart, iOverspeculate); iMonoploid < this.anchors.size() && (iAttabal = (sanenessVar = this.anchors.get(iMonoploid)).getLocation()) >= 0; iMonoploid++) {
                sanenessVar.dern(-(iOverspeculate - iAttabal));
            }
            return;
        }
        for (int iMonoploid2 = tarboosh.monoploid(this.anchors, previousGapStart, iOverspeculate); iMonoploid2 < this.anchors.size() && (iAttabal2 = (sanenessVar2 = this.anchors.get(iMonoploid2)).getLocation()) < 0 && (i = iAttabal2 + iOverspeculate) < newGapStart; iMonoploid2++) {
            sanenessVar2.dern(i);
        }
    }

    public final int milliradian() {
        return overspeculate() - this.groupGapLen;
    }

    public final void molet() {
        if (!(this.insertCount == 0)) {
            polloi.adultoid("Cannot reset when inserting");
        }
        attendance();
        this.currentGroup = 0;
        this.currentGroupEnd = overspeculate() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final void monroe(int offset) {
        boolean z = true;
        if (!(this.insertCount == 0)) {
            polloi.adultoid("Cannot move a group while inserting");
        }
        if (!(offset >= 0)) {
            polloi.adultoid("Parameter offset is out of bounds");
        }
        if (offset == 0) {
            return;
        }
        int i = this.currentGroup;
        int i2 = this.parent;
        int i3 = this.currentGroupEnd;
        int iKowloon = i;
        for (int i4 = offset; i4 > 0; i4--) {
            iKowloon += tarboosh.kowloon(this.groups, coffeecake(iKowloon));
            if (!(iKowloon <= i3)) {
                polloi.adultoid("Parameter offset is out of bounds");
            }
        }
        int iKowloon2 = tarboosh.kowloon(this.groups, coffeecake(iKowloon));
        int iSaran = saran(this.groups, coffeecake(this.currentGroup));
        int iSaran2 = saran(this.groups, coffeecake(iKowloon));
        int i5 = iKowloon + iKowloon2;
        int iSaran3 = saran(this.groups, coffeecake(i5));
        int i6 = iSaran3 - iSaran2;
        underbelly(i6, Math.max(this.currentGroup - 1, 0));
        sensatory(iKowloon2);
        int[] iArr = this.groups;
        int iCoffeecake = coffeecake(i5) * 5;
        p002kotlin.collections.arytenoidectomy.competently(iArr, iArr, coffeecake(i) * 5, iCoffeecake, (iKowloon2 * 5) + iCoffeecake);
        if (i6 > 0) {
            Object[] objArr = this.slots;
            int iPrivatdozent = privatdozent(iSaran2 + i6);
            System.arraycopy(objArr, iPrivatdozent, objArr, iSaran, privatdozent(iSaran3 + i6) - iPrivatdozent);
        }
        int i7 = iSaran2 + i6;
        int i8 = i7 - iSaran;
        int i9 = this.slotsGapStart;
        int i10 = this.slotsGapLen;
        int length = this.slots.length;
        int i11 = this.slotsGapOwner;
        int i12 = i + iKowloon2;
        int i13 = i;
        while (i13 < i12) {
            boolean z2 = z;
            int iCoffeecake2 = coffeecake(i13);
            int i14 = i13;
            int i15 = i8;
            ctenidium(iArr, iCoffeecake2, creditor(saran(iArr, iCoffeecake2) - i8, i11 < iCoffeecake2 ? 0 : i9, i10, length));
            i13 = i14 + 1;
            z = z2;
            i8 = i15;
        }
        palmyra(i5, i, iKowloon2);
        if (libyan(i5, iKowloon2)) {
            polloi.adultoid("Unexpectedly removed anchors");
        }
        mathsort(i2, this.currentGroupEnd, i);
        if (i6 > 0) {
            deadwork(i7, i6, i5 - 1);
        }
    }

    public final Object nosophobia(int index) {
        int iCoffeecake = coffeecake(index);
        int[] iArr = this.groups;
        if ((iArr[(iCoffeecake * 5) + 1] & 536870912) != 0) {
            return this.slots[tarboosh.polloi(iArr, iCoffeecake)];
        }
        return null;
    }

    public final void oilcan(saneness anchor, Object value) {
        if (!(this.insertCount == 0)) {
            polloi.adultoid("Can only append a slot if not current inserting");
        }
        int i = this.currentSlot;
        int i2 = this.currentSlotEnd;
        int iTrm = trm(anchor);
        int iSaran = saran(this.groups, coffeecake(iTrm + 1));
        this.currentSlot = iSaran;
        this.currentSlotEnd = iSaran;
        underbelly(1, iTrm);
        if (i >= iSaran) {
            i++;
            i2++;
        }
        this.slots[iSaran] = value;
        this.currentSlot = i;
        this.currentSlotEnd = i2;
    }

    public final Object osteal() {
        if (this.insertCount > 0) {
            underbelly(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i = this.currentSlot;
        this.currentSlot = i + 1;
        return objArr[privatdozent(i)];
    }

    public final int outmarry(int index) {
        return dhss(this.groups, index);
    }

    public final int overspeculate() {
        return this.groups.length / 5;
    }

    public final void palmyra(int originalLocation, int newLocation, int size) {
        saneness sanenessVar;
        int iTrm;
        int i = size + originalLocation;
        int iMilliradian = milliradian();
        int iMonoploid = tarboosh.monoploid(this.anchors, originalLocation, iMilliradian);
        ArrayList arrayList = new ArrayList();
        if (iMonoploid >= 0) {
            while (iMonoploid < this.anchors.size() && (iTrm = trm((sanenessVar = this.anchors.get(iMonoploid)))) >= originalLocation && iTrm < i) {
                arrayList.add(sanenessVar);
                this.anchors.remove(iMonoploid);
            }
        }
        int i2 = newLocation - originalLocation;
        int size2 = arrayList.size();
        for (int i3 = 0; i3 < size2; i3++) {
            saneness sanenessVar2 = (saneness) arrayList.get(i3);
            int iTrm2 = trm(sanenessVar2) + i2;
            if (iTrm2 >= this.groupGapStart) {
                sanenessVar2.dern(-(iMilliradian - iTrm2));
            } else {
                sanenessVar2.dern(iTrm2);
            }
            this.anchors.add(tarboosh.monoploid(this.anchors, iTrm2, iMilliradian), sanenessVar2);
        }
    }

    public final void peridotite(saneness anchor) {
        walach(anchor.marial(this));
    }

    public final boolean permissivist() {
        return this.sourceInformationMap != null;
    }

    public final boolean polder(int group) {
        return group >= 0 && (this.groups[(coffeecake(group) * 5) + 1] & 67108864) != 0;
    }

    public final void prefect(Object value) {
        if (!(this.currentSlot <= this.currentSlotEnd)) {
            polloi.adultoid("Writing to an invalid slot");
        }
        this.slots[privatdozent(this.currentSlot - 1)] = value;
    }

    /* JADX INFO: renamed from: premeiotic, reason: from getter */
    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final boolean preterite() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final int privatdozent(int dataIndex) {
        return dataIndex + (this.slotsGapLen * (dataIndex < this.slotsGapStart ? 0 : 1));
    }

    public final int pruinose(int[] iArr, int i) {
        return i >= overspeculate() ? this.slots.length - this.slotsGapLen : seminary(tarboosh.graveside(iArr, i), this.slotsGapLen, this.slots.length);
    }

    public final void puffin(int group, androidx.collection.oilcan set) {
        int iCoffeecake = coffeecake(group);
        boolean zKattegat = kattegat(group);
        int[] iArr = this.groups;
        if (((iArr[(iCoffeecake * 5) + 1] & 67108864) != 0) != zKattegat) {
            tarboosh.dovishness(iArr, iCoffeecake, zKattegat);
            int iOutmarry = outmarry(group);
            if (iOutmarry >= 0) {
                achondroplasia.attabal(set, iOutmarry);
            }
        }
    }

    public final void rajahship(Object value) {
        tout(this.currentGroup, value);
    }

    public final void restrictive(boolean normalClose) {
        this.closed = true;
        if (normalClose && this.startStack.tos == 0) {
            julian(milliradian());
            unconsolidated(this.slots.length - this.slotsGapLen, this.groupGapStart);
            supplicat();
            attendance();
        }
        this.table.beachfront(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap, this.calledByMap);
    }

    public final int sakeen() {
        int iOverspeculate = (overspeculate() - this.groupGapLen) - this.endStack.beachfront();
        this.currentGroupEnd = iOverspeculate;
        return iOverspeculate;
    }

    public final int saran(int[] iArr, int i) {
        return i >= overspeculate() ? this.slots.length - this.slotsGapLen : seminary(iArr[(i * 5) + 4], this.slotsGapLen, this.slots.length);
    }

    public final int sayid(int group) {
        androidx.collection.seminary<Object> seminaryVarDern;
        int iDemilitarize = this.currentSlot - demilitarize(group);
        androidx.collection.yemenite<androidx.collection.seminary<Object>> yemeniteVar = this.deferredSlotWrites;
        return iDemilitarize + ((yemeniteVar == null || (seminaryVarDern = yemeniteVar.dern(group)) == null) ? 0 : seminaryVarDern.get_size());
    }

    public final void sealless() {
        int i = this.insertCount;
        this.insertCount = i + 1;
        if (i == 0) {
            immediately();
        }
    }

    public final int seminary(int anchor, int gapLen, int capacity) {
        return anchor < 0 ? (capacity - gapLen) + anchor + 1 : anchor;
    }

    public final void sensatory(int size) {
        if (size > 0) {
            int i = this.currentGroup;
            julian(i);
            int i2 = this.groupGapStart;
            int i3 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i4 = length - i3;
            if (i3 < size) {
                int iMax = Math.max(Math.max(length * 2, i4 + size), 32);
                int[] iArr2 = new int[iMax * 5];
                int i5 = iMax - i4;
                p002kotlin.collections.arytenoidectomy.competently(iArr, iArr2, 0, 0, i2 * 5);
                p002kotlin.collections.arytenoidectomy.competently(iArr, iArr2, (i2 + i5) * 5, (i3 + i2) * 5, length * 5);
                this.groups = iArr2;
                i3 = i5;
            }
            int i6 = this.currentGroupEnd;
            if (i6 >= i2) {
                this.currentGroupEnd = i6 + size;
            }
            int i7 = i2 + size;
            this.groupGapStart = i7;
            this.groupGapLen = i3 - size;
            int iCreditor = creditor(i4 > 0 ? grimness(i + size) : 0, this.slotsGapOwner >= i2 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i8 = i2; i8 < i7; i8++) {
                this.groups[(i8 * 5) + 4] = iCreditor;
            }
            int i9 = this.slotsGapOwner;
            if (i9 >= i2) {
                this.slotsGapOwner = i9 + size;
            }
        }
    }

    public final int setterwort(int index, int gapStart) {
        return index < gapStart ? index : -((milliradian() - index) + 2);
    }

    public final void splinterproof(int group, Function2<? super Integer, Object, Unit> block) {
        int i;
        int i2;
        saneness sanenessVarAttabal;
        int iOutmarry = outmarry(group);
        int iMilliradian = milliradian();
        int iLotta = lotta(group) + group;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i3 = group;
        androidx.collection.sealless seallessVarSaneness = null;
        androidx.collection.oilcan oilcanVar = null;
        while (i3 < iLotta) {
            int iGrimness = grimness(i3);
            int i4 = i3 + 1;
            int iGrimness2 = grimness(i4);
            while (true) {
                i = 0;
                if (iGrimness >= iGrimness2) {
                    break;
                }
                Object obj = this.slots[privatdozent(iGrimness)];
                if ((obj instanceof tectonization) && (sanenessVarAttabal = ((tectonization) obj).getAfter()) != null && sanenessVarAttabal.saneness()) {
                    int iTrm = trm(sanenessVarAttabal);
                    if (seallessVarSaneness == null) {
                        seallessVarSaneness = androidx.collection.polloi.saneness();
                    }
                    if (oilcanVar == null) {
                        oilcanVar = new androidx.collection.oilcan(i, 1, defaultConstructorMarker);
                    }
                    seallessVarSaneness.beachfront(iTrm);
                    oilcanVar.impromptu(iTrm);
                    oilcanVar.impromptu(iGrimness);
                } else {
                    block.invoke(Integer.valueOf(iGrimness), obj);
                }
                iGrimness++;
            }
            int iOutmarry2 = i4 < iMilliradian ? outmarry(i4) : -1;
            if (iOutmarry2 != i3) {
                while (true) {
                    if (oilcanVar == null || seallessVarSaneness == null || !seallessVarSaneness.monoploid(i3)) {
                        i2 = iMilliradian;
                    } else {
                        int i5 = oilcanVar._size;
                        int i6 = i5 / 2;
                        int i7 = i;
                        int i8 = i7;
                        while (i8 < i6) {
                            int i9 = i8 * 2;
                            int i10 = iMilliradian;
                            int iSaneness = oilcanVar.saneness(i9);
                            if (iSaneness == i3) {
                                int iSaneness2 = oilcanVar.saneness(i9 + 1);
                                block.invoke(Integer.valueOf(iSaneness2), this.slots[privatdozent(iSaneness2)]);
                            } else if (i9 != i7) {
                                int i11 = i7 + 1;
                                oilcanVar.triweekly(i7, iSaneness);
                                i7 += 2;
                                oilcanVar.triweekly(i11, oilcanVar.saneness(i9 + 1));
                            } else {
                                i7 += 2;
                            }
                            i8++;
                            block = block;
                            iMilliradian = i10;
                        }
                        i2 = iMilliradian;
                        if (i7 != i5) {
                            oilcanVar.impassible(i7, i5);
                        }
                    }
                    if (i3 == group || iOutmarry == iOutmarry2) {
                        break;
                    }
                    i3 = iOutmarry;
                    iMilliradian = i2;
                    i = 0;
                    iOutmarry = outmarry(iOutmarry);
                    block = block;
                }
            } else {
                i2 = iMilliradian;
            }
            iOutmarry = iOutmarry2;
            i3 = i4;
            iMilliradian = i2;
            defaultConstructorMarker = null;
        }
    }

    public final int starveling() {
        androidx.collection.seminary<Object> seminaryVarDern;
        boolean z = this.insertCount > 0;
        int i = this.currentGroup;
        int i2 = this.currentGroupEnd;
        int i3 = this.parent;
        int iCoffeecake = coffeecake(i3);
        int i4 = this.nodeCount;
        int i5 = i - i3;
        int i6 = (iCoffeecake * 5) + 1;
        boolean z2 = (this.groups[i6] & 1073741824) != 0;
        if (z) {
            androidx.collection.yemenite<androidx.collection.seminary<Object>> yemeniteVar = this.deferredSlotWrites;
            if (yemeniteVar != null && (seminaryVarDern = yemeniteVar.dern(i3)) != null) {
                Object[] objArr = seminaryVarDern.content;
                int i7 = seminaryVarDern._size;
                for (int i8 = 0; i8 < i7; i8++) {
                    mastfed(objArr[i8]);
                }
                yemeniteVar.arytenoidectomy(i3);
            }
            tarboosh.gintrap(this.groups, iCoffeecake, i5);
            tarboosh.preprohormone(this.groups, iCoffeecake, i4);
            this.nodeCount = this.nodeCountStack.beachfront() + (z2 ? 1 : i4);
            int iDhss = dhss(this.groups, i3);
            this.parent = iDhss;
            int iMilliradian = iDhss < 0 ? milliradian() : coffeecake(iDhss + 1);
            int iSaran = iMilliradian >= 0 ? saran(this.groups, iMilliradian) : 0;
            this.currentSlot = iSaran;
            this.currentSlotEnd = iSaran;
            return i4;
        }
        if (!(i == i2)) {
            polloi.adultoid("Expected to be at the end of a group");
        }
        int iKowloon = tarboosh.kowloon(this.groups, iCoffeecake);
        int[] iArr = this.groups;
        int i9 = iArr[i6] & 67108863;
        tarboosh.gintrap(iArr, iCoffeecake, i5);
        tarboosh.preprohormone(this.groups, iCoffeecake, i4);
        int iBeachfront = this.startStack.beachfront();
        sakeen();
        this.parent = iBeachfront;
        int iDhss2 = dhss(this.groups, i3);
        int iBeachfront2 = this.nodeCountStack.beachfront();
        this.nodeCount = iBeachfront2;
        if (iDhss2 == iBeachfront) {
            this.nodeCount = iBeachfront2 + (z2 ? 0 : i4 - i9);
            return i4;
        }
        int i10 = i5 - iKowloon;
        int i11 = z2 ? 0 : i4 - i9;
        if (i10 != 0 || i11 != 0) {
            while (iDhss2 != 0 && iDhss2 != iBeachfront && (i11 != 0 || i10 != 0)) {
                int iCoffeecake2 = coffeecake(iDhss2);
                if (i10 != 0) {
                    tarboosh.gintrap(this.groups, iCoffeecake2, tarboosh.kowloon(this.groups, iCoffeecake2) + i10);
                }
                if (i11 != 0) {
                    int[] iArr2 = this.groups;
                    tarboosh.preprohormone(iArr2, iCoffeecake2, (iArr2[(iCoffeecake2 * 5) + 1] & 67108863) + i11);
                }
                int[] iArr3 = this.groups;
                if ((iArr3[(iCoffeecake2 * 5) + 1] & 1073741824) != 0) {
                    i11 = 0;
                }
                iDhss2 = dhss(iArr3, iDhss2);
            }
        }
        this.nodeCount += i11;
        return i4;
    }

    public final saneness stratoscope(int index) {
        ArrayList<saneness> arrayList = this.anchors;
        int iMolybdenite = tarboosh.molybdenite(arrayList, index, milliradian());
        if (iMolybdenite >= 0) {
            return arrayList.get(iMolybdenite);
        }
        if (index > this.groupGapStart) {
            index = -(milliradian() - index);
        }
        saneness sanenessVar = new saneness(index);
        arrayList.add(-(iMolybdenite + 1), sanenessVar);
        return sanenessVar;
    }

    public final void stupefactive() {
        if (!(this.insertCount == 0)) {
            polloi.adultoid("Key must be supplied when inserting");
        }
        taiyuan.Companion attabalVar = taiyuan.INSTANCE;
        decarock(0, attabalVar.attabal(), false, attabalVar.attabal());
    }

    public final splinterproof sultanate(int group) {
        saneness sanenessVarVir;
        HashMap<saneness, splinterproof> map = this.sourceInformationMap;
        if (map == null || (sanenessVarVir = vir(group)) == null) {
            return null;
        }
        return map.get(sanenessVarVir);
    }

    public final void supplicat() {
        int i = this.slotsGapStart;
        p002kotlin.collections.arytenoidectomy.molybdenite(this.slots, null, i, this.slotsGapLen + i);
    }

    public final void tailoring(int key, Object objectKey) {
        decarock(key, objectKey, true, taiyuan.INSTANCE.attabal());
    }

    public final int tarboosh(int group, int index) {
        int iPruinose = pruinose(this.groups, coffeecake(group));
        int i = iPruinose + index;
        if (!(i >= iPruinose && i < saran(this.groups, coffeecake(group + 1)))) {
            polloi.adultoid("Write to an invalid slot index " + index + " for group " + group);
        }
        return i;
    }

    public final int technofreak(int[] iArr, int i) {
        return saran(iArr, i);
    }

    public final Object tectonization(int group, int index, Object value) {
        int iPrivatdozent = privatdozent(tarboosh(group, index));
        Object[] objArr = this.slots;
        Object obj = objArr[iPrivatdozent];
        objArr[iPrivatdozent] = value;
        return obj;
    }

    /* JADX INFO: renamed from: timberyard, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + milliradian() + " gap=" + this.groupGapStart + SignatureVisitor.SUPER + (this.groupGapStart + this.groupGapLen) + ')';
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final void tout(int index, Object value) {
        boolean z;
        int iCoffeecake = coffeecake(index);
        int[] iArr = this.groups;
        if (iCoffeecake < iArr.length) {
            z = (iArr[(iCoffeecake * 5) + 1] & 1073741824) != 0;
        }
        if (!z) {
            polloi.adultoid("Updating the node of a group at " + index + " that was not created with as a node group");
        }
        this.slots[privatdozent(technofreak(this.groups, iCoffeecake))] = value;
    }

    /* JADX INFO: renamed from: treadless, reason: from getter */
    public final cosy getTable() {
        return this.table;
    }

    public final int trm(saneness anchor) {
        int iAttabal = anchor.getLocation();
        return iAttabal < 0 ? milliradian() + iAttabal : iAttabal;
    }

    public final Object twybill(Object value) {
        if (this.insertCount <= 0 || this.currentSlot == this.slotsGapStart) {
            return mastfed(value);
        }
        androidx.collection.yemenite<androidx.collection.seminary<Object>> yemeniteVar = this.deferredSlotWrites;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 1;
        int i2 = 0;
        if (yemeniteVar == null) {
            yemeniteVar = new androidx.collection.yemenite<>(i2, i, defaultConstructorMarker);
        }
        this.deferredSlotWrites = yemeniteVar;
        int i3 = this.parent;
        androidx.collection.seminary<Object> seminaryVarDern = yemeniteVar.dern(i3);
        if (seminaryVarDern == null) {
            seminaryVarDern = new androidx.collection.seminary<>(i2, i, defaultConstructorMarker);
            yemeniteVar.molybdenite(i3, seminaryVarDern);
        }
        seminaryVarDern.triweekly(value);
        return taiyuan.INSTANCE.attabal();
    }

    public final void unconsolidated(int index, int group) {
        int i = this.slotsGapLen;
        int i2 = this.slotsGapStart;
        int i3 = this.slotsGapOwner;
        if (i2 != index) {
            Object[] objArr = this.slots;
            if (index < i2) {
                System.arraycopy(objArr, index, objArr, index + i, i2 - index);
            } else {
                int i4 = i2 + i;
                System.arraycopy(objArr, i4, objArr, i2, (index + i) - i4);
            }
        }
        int iMin = Math.min(group + 1, milliradian());
        if (i3 != iMin) {
            int length = this.slots.length - i;
            if (iMin < i3) {
                int iCoffeecake = coffeecake(iMin);
                int iCoffeecake2 = coffeecake(i3);
                int i5 = this.groupGapStart;
                while (iCoffeecake < iCoffeecake2) {
                    int i6 = (iCoffeecake * 5) + 4;
                    int i7 = this.groups[i6];
                    if (!(i7 >= 0)) {
                        polloi.adultoid("Unexpected anchor value, expected a positive anchor");
                    }
                    this.groups[i6] = -((length - i7) + 1);
                    iCoffeecake++;
                    if (iCoffeecake == i5) {
                        iCoffeecake += this.groupGapLen;
                    }
                }
            } else {
                int iCoffeecake3 = coffeecake(i3);
                int iCoffeecake4 = coffeecake(iMin);
                while (iCoffeecake3 < iCoffeecake4) {
                    int i8 = (iCoffeecake3 * 5) + 4;
                    int i9 = this.groups[i8];
                    if (!(i9 < 0)) {
                        polloi.adultoid("Unexpected anchor value, expected a negative anchor");
                    }
                    this.groups[i8] = i9 + length + 1;
                    iCoffeecake3++;
                    if (iCoffeecake3 == this.groupGapStart) {
                        iCoffeecake3 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = iMin;
        }
        this.slotsGapStart = index;
    }

    public final void undecorated() {
        this.sourceInformationMap = this.table.monoploid();
        this.calledByMap = this.table.cutely();
    }

    public final void underbelly(int size, int group) {
        if (size > 0) {
            unconsolidated(this.currentSlot, group);
            int i = this.slotsGapStart;
            int i2 = this.slotsGapLen;
            if (i2 < size) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i3 = length - i2;
                int iMax = Math.max(Math.max(length * 2, i3 + size), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i4 = 0; i4 < iMax; i4++) {
                    objArr2[i4] = null;
                }
                int i5 = iMax - i3;
                int i6 = i2 + i;
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(objArr, i6, objArr2, i + i5, length - i6);
                this.slots = objArr2;
                i2 = i5;
            }
            int i7 = this.currentSlotEnd;
            if (i7 >= i) {
                this.currentSlotEnd = i7 + size;
            }
            this.slotsGapStart = i + size;
            this.slotsGapLen = i2 - size;
        }
    }

    public final int vesuvio(int index) {
        return index > -2 ? index : (milliradian() + index) - (-2);
    }

    public final saneness vir(int group) {
        if (group < 0 || group >= milliradian()) {
            return null;
        }
        return tarboosh.triweekly(this.anchors, group, milliradian());
    }

    public final void walach(int index) {
        boolean z = false;
        if (!(this.insertCount <= 0)) {
            polloi.adultoid("Cannot call ensureStarted() while inserting");
        }
        int i = this.parent;
        if (i != index) {
            if (index >= i && index < this.currentGroupEnd) {
                z = true;
            }
            if (!z) {
                polloi.adultoid("Started group at " + index + " must be a subgroup of the group at " + i);
            }
            int i2 = this.currentGroup;
            int i3 = this.currentSlot;
            int i4 = this.currentSlotEnd;
            this.currentGroup = index;
            stupefactive();
            this.currentGroup = i2;
            this.currentSlot = i3;
            this.currentSlotEnd = i4;
        }
    }

    public final boolean wostteth() {
        int i = this.currentGroup;
        return i < this.currentGroupEnd && (this.groups[(coffeecake(i) * 5) + 1] & 1073741824) != 0;
    }

    public final int yemenite(int[] iArr, int i) {
        return saran(iArr, i) + Integer.bitCount(iArr[(i * 5) + 1] >> 29);
    }
}
