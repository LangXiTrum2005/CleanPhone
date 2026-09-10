package gintrap;

import androidx.compose.runtime.lightstruck;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p002kotlin.Metadata;
import p002kotlin.collections.arytenoidectomy;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PersistentVectorBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010*\n\u0002\b\u0012\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B?\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b \u0010!JA\u0010&\u001a\u00020%2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b&\u0010'JA\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b*\u0010+J?\u0010/\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010,\u001a\u00020\n2\u000e\u0010.\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070-H\u0002¢\u0006\u0004\b/\u00100JG\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0014\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060\u0006H\u0002¢\u0006\u0004\b3\u00104JO\u00106\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0014\u00105\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060-H\u0002¢\u0006\u0004\b6\u00107J1\u00109\u001a\u00020%2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00108\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0002¢\u0006\u0004\b9\u0010:JI\u0010=\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\b=\u0010>J]\u0010D\u001a\u00020%2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?2\u0006\u00108\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n2\u0016\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010B\u001a\u00020\n2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bD\u0010EJW\u0010G\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010F\u001a\u00020\n2\u0006\u0010A\u001a\u00020\n2\u0016\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010B\u001a\u00020\n2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bG\u0010HJm\u0010K\u001a\u00020%2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?2\u0006\u00108\u001a\u00020\n2\u000e\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010J\u001a\u00020\n2\u0016\u00102\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00060\u00062\u0006\u0010B\u001a\u00020\n2\u000e\u0010C\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\bK\u0010LJ\u001f\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\bM\u0010NJ;\u0010O\u001a\u0004\u0018\u00010\u00072\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\bO\u0010PJ?\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u0010Q\u001a\u00020;H\u0002¢\u0006\u0004\bR\u0010SJ1\u0010T\u001a\u00020%2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0006\u00101\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\bT\u0010UJA\u0010V\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00101\u001a\u00020\n2\u0006\u0010Q\u001a\u00020;H\u0002¢\u0006\u0004\bV\u0010SJ#\u0010Y\u001a\u00020\u00152\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150WH\u0002¢\u0006\u0004\bY\u0010ZJ1\u0010[\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b[\u0010\u001cJ7\u0010\\\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u00108\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0002¢\u0006\u0004\b\\\u0010]J3\u0010`\u001a\u00020\n2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W2\u0006\u0010^\u001a\u00020\n2\u0006\u0010_\u001a\u00020;H\u0002¢\u0006\u0004\b`\u0010aJC\u0010c\u001a\u00020\n2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010b\u001a\u00020\n2\u0006\u0010_\u001a\u00020;H\u0002¢\u0006\u0004\bc\u0010dJw\u0010h\u001a\u00020\n2\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W2\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010b\u001a\u00020\n2\u0006\u0010e\u001a\u00020\n2\u0006\u0010_\u001a\u00020;2\u0014\u0010g\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060f2\u0014\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060fH\u0002¢\u0006\u0004\bh\u0010iJG\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000e\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010)\u001a\u00020\n2\u0006\u00108\u001a\u00020\n2\u0006\u0010j\u001a\u00028\u00002\u0006\u0010k\u001a\u00020;H\u0002¢\u0006\u0004\bl\u0010>J%\u0010n\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00060m2\u0006\u00108\u001a\u00020\nH\u0002¢\u0006\u0004\bn\u0010oJ\u000f\u0010p\u001a\u00020\nH\u0000¢\u0006\u0004\bp\u0010\u000fJ\u0015\u0010q\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\bq\u0010rJ\u0017\u0010s\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0004\bs\u0010tJ\u001d\u0010u\u001a\u00020\u00152\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0016¢\u0006\u0004\bu\u0010vJ\u001f\u0010s\u001a\u00020%2\u0006\u00108\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0004\bs\u0010wJ%\u0010u\u001a\u00020\u00152\u0006\u00108\u001a\u00020\n2\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0016¢\u0006\u0004\bu\u0010xJ\u0018\u0010y\u001a\u00028\u00002\u0006\u00108\u001a\u00020\nH\u0096\u0002¢\u0006\u0004\by\u0010zJ\u0017\u0010{\u001a\u00028\u00002\u0006\u00108\u001a\u00020\nH\u0016¢\u0006\u0004\b{\u0010zJ\u001d\u0010|\u001a\u00020\u00152\f\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0016¢\u0006\u0004\b|\u0010vJ!\u0010}\u001a\u00020\u00152\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00150W¢\u0006\u0004\b}\u0010ZJ \u0010~\u001a\u00028\u00002\u0006\u00108\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b~\u0010\u007fJ\u001a\u0010\u0081\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0080\u0001H\u0096\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0019\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0083\u0001H\u0016¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J \u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0083\u00012\u0006\u00108\u001a\u00020\nH\u0016¢\u0006\u0005\b\u0084\u0001\u0010oR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0016\u0010\u0086\u0001R!\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bn\u0010\u0087\u0001R\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0018\u0010\u0087\u0001R&\u0010\u000b\u001a\u00020\n8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u001b\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010\u000f\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0019\u0010\u008e\u0001\u001a\u00030\u008c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b \u0010\u008d\u0001R;\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\u0011\u0010\u008f\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00068\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u001e\u0010\u0087\u0001\u001a\u0005\b\u0090\u0001\u0010!R7\u0010(\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u000f\u0010\u008f\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\\\u0010\u0087\u0001\u001a\u0005\b\u0091\u0001\u0010!R'\u0010\u0010\u001a\u00020\n2\u0007\u0010\u008f\u0001\u001a\u00020\n8\u0016@RX\u0096\u000e¢\u0006\u000e\n\u0005\bV\u0010\u0088\u0001\u001a\u0005\b\u0092\u0001\u0010\u000f¨\u0006\u0093\u0001"}, d2 = {"Lgintrap/impromptu;", "E", "Lkotlin/collections/impromptu;", "Ldovishness/marial$attabal;", "Ldovishness/marial;", "vector", "", "", "vectorRoot", "vectorTail", "", "rootShift", "<init>", "(Ldovishness/marial;[Ljava/lang/Object;[Ljava/lang/Object;I)V", "grimness", "()I", "size", "walach", "(I)I", "hydrovane", "buffer", "", "kowloon", "([Ljava/lang/Object;)Z", "monoploid", "([Ljava/lang/Object;)[Ljava/lang/Object;", "distance", "polloi", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "element", "graveside", "(Ljava/lang/Object;)[Ljava/lang/Object;", "molybdenite", "()[Ljava/lang/Object;", "root", "filledTail", "newTail", "", "cord", "([Ljava/lang/Object;[Ljava/lang/Object;[Ljava/lang/Object;)V", "tail", "shift", "cuirassed", "([Ljava/lang/Object;[Ljava/lang/Object;I)[Ljava/lang/Object;", "bufferIndex", "", "sourceIterator", "marial", "([Ljava/lang/Object;ILjava/util/Iterator;)[Ljava/lang/Object;", "rootSize", "buffers", "preprohormone", "([Ljava/lang/Object;I[[Ljava/lang/Object;)[Ljava/lang/Object;", "buffersIterator", "rotuma", "([Ljava/lang/Object;IILjava/util/Iterator;)[Ljava/lang/Object;", "index", "triweekly", "([Ljava/lang/Object;ILjava/lang/Object;)V", "Lgintrap/marial;", "elementCarry", "impassible", "([Ljava/lang/Object;IILjava/lang/Object;Lgintrap/marial;)[Ljava/lang/Object;", "", "elements", "rightShift", "nullBuffers", "nextBuffer", "cutely", "(Ljava/util/Collection;II[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "startLeafIndex", "privatdozent", "(II[[Ljava/lang/Object;I[Ljava/lang/Object;)[Ljava/lang/Object;", "startBuffer", "startBufferSize", "creditor", "(Ljava/util/Collection;I[Ljava/lang/Object;I[[Ljava/lang/Object;I[Ljava/lang/Object;)V", "wireman", "(I)[Ljava/lang/Object;", "merc", "([Ljava/lang/Object;III)Ljava/lang/Object;", "tailCarry", "supplicat", "([Ljava/lang/Object;IILgintrap/marial;)[Ljava/lang/Object;", "gintrap", "([Ljava/lang/Object;II)V", "dovishness", "Lkotlin/Function1;", "predicate", "oilcan", "(Lkotlin/jvm/functions/Function1;)Z", "seminary", "adultoid", "([Ljava/lang/Object;II)[Ljava/lang/Object;", "tailSize", "bufferRef", "sealless", "(Lkotlin/jvm/functions/Function1;ILgintrap/marial;)I", "bufferSize", "trm", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;ILgintrap/marial;)I", "toBufferSize", "", "recyclableBuffers", "stratoscope", "(Lkotlin/jvm/functions/Function1;[Ljava/lang/Object;IILgintrap/marial;Ljava/util/List;Ljava/util/List;)I", "e", "oldElementCarry", "saran", "", "arytenoidectomy", "(I)Ljava/util/ListIterator;", "beachfront", "build", "()Ldovishness/marial;", "add", "(Ljava/lang/Object;)Z", "addAll", "(Ljava/util/Collection;)Z", "(ILjava/lang/Object;)V", "(ILjava/util/Collection;)Z", "get", "(I)Ljava/lang/Object;", "removeAt", "removeAll", "kattegat", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "", "listIterator", "()Ljava/util/ListIterator;", "Ldovishness/marial;", "[Ljava/lang/Object;", "I", "impromptu", "setRootShift$runtime", "(I)V", "Lcord/marial;", "Lcord/marial;", "ownership", "value", "competently", "taiyuan", "getSize", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class impromptu<E> extends p002kotlin.collections.impromptu<E> implements dovishness.marial.attabal<E> {

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name and from kotlin metadata */
    public Object[] tail;

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public Object[] vectorRoot;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public Object[] root;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public dovishness.marial<? extends E> vector;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public cord.marial ownership = new cord.marial();

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public Object[] vectorTail;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public int rootShift;

    public impromptu(dovishness.marial<? extends E> marialVar, Object[] objArr, Object[] objArr2, int i) {
        this.vector = marialVar;
        this.vectorRoot = objArr;
        this.vectorTail = objArr2;
        this.rootShift = i;
        this.root = this.vectorRoot;
        this.tail = this.vectorTail;
        this.size = this.vector.size();
    }

    private final Object[] dovishness(Object[] root, int shift, int rootSize, marial tailCarry) {
        Object[] objArrDovishness;
        int iAttabal = triweekly.attabal(rootSize - 1, shift);
        if (shift == 5) {
            tailCarry.saneness(root[iAttabal]);
            objArrDovishness = null;
        } else {
            Object obj = root[iAttabal];
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrDovishness = dovishness((Object[]) obj, shift - 5, rootSize, tailCarry);
        }
        if (objArrDovishness == null && iAttabal == 0) {
            return null;
        }
        Object[] objArrMonoploid = monoploid(root);
        objArrMonoploid[iAttabal] = objArrDovishness;
        return objArrMonoploid;
    }

    private final int grimness() {
        if (size() <= 32) {
            return 0;
        }
        return triweekly.wireman(size());
    }

    private final Object[] impassible(Object[] root, int shift, int index, Object element, marial elementCarry) {
        Object obj;
        int iAttabal = triweekly.attabal(index, shift);
        if (shift == 0) {
            elementCarry.saneness(root[31]);
            Object[] objArrTaiyuan = arytenoidectomy.taiyuan(root, monoploid(root), iAttabal + 1, iAttabal, 31);
            objArrTaiyuan[iAttabal] = element;
            return objArrTaiyuan;
        }
        Object[] objArrMonoploid = monoploid(root);
        int i = shift - 5;
        Object obj2 = objArrMonoploid[iAttabal];
        Intrinsics.competently(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrMonoploid[iAttabal] = impassible((Object[]) obj2, i, index, element, elementCarry);
        while (true) {
            iAttabal++;
            if (iAttabal >= 32 || (obj = objArrMonoploid[iAttabal]) == null) {
                break;
            }
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrMonoploid[iAttabal] = impassible((Object[]) obj, i, 0, elementCarry.getValue(), elementCarry);
        }
        return objArrMonoploid;
    }

    private final Object[] supplicat(Object[] root, int shift, int index, marial tailCarry) {
        int iAttabal = triweekly.attabal(index, shift);
        if (shift == 0) {
            Object obj = root[iAttabal];
            Object[] objArrTaiyuan = arytenoidectomy.taiyuan(root, monoploid(root), iAttabal, iAttabal + 1, 32);
            objArrTaiyuan[31] = tailCarry.getValue();
            tailCarry.saneness(obj);
            return objArrTaiyuan;
        }
        int iAttabal2 = root[31] == null ? triweekly.attabal(grimness() - 1, shift) : 31;
        Object[] objArrMonoploid = monoploid(root);
        int i = shift - 5;
        int i2 = iAttabal + 1;
        if (i2 <= iAttabal2) {
            while (true) {
                Object obj2 = objArrMonoploid[iAttabal2];
                Intrinsics.competently(obj2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArrMonoploid[iAttabal2] = supplicat((Object[]) obj2, i, 0, tailCarry);
                if (iAttabal2 == i2) {
                    break;
                }
                iAttabal2--;
            }
        }
        Object obj3 = objArrMonoploid[iAttabal];
        Intrinsics.competently(obj3, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        objArrMonoploid[iAttabal] = supplicat((Object[]) obj3, i, index, tailCarry);
        return objArrMonoploid;
    }

    private final Object[] wireman(int index) {
        if (grimness() <= index) {
            return this.tail;
        }
        Object[] objArr = this.root;
        Intrinsics.beachfront(objArr);
        for (int i = this.rootShift; i > 0; i -= 5) {
            Object[] objArr2 = objArr[triweekly.attabal(index, i)];
            Intrinsics.competently(objArr2, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr = objArr2;
        }
        return objArr;
    }

    public static final boolean yemenite(Collection collection2, Object obj) {
        return collection2.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E element) {
        ((AbstractList) this).modCount++;
        int iHydrovane = hydrovane();
        if (iHydrovane < 32) {
            Object[] objArrMonoploid = monoploid(this.tail);
            objArrMonoploid[iHydrovane] = element;
            this.tail = objArrMonoploid;
            this.size = size() + 1;
        } else {
            cord(this.root, this.tail, graveside(element));
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends E> elements) {
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int iHydrovane = hydrovane();
        Iterator<? extends E> it = elements.iterator();
        if (32 - iHydrovane >= elements.size()) {
            this.tail = marial(monoploid(this.tail), iHydrovane, it);
            this.size = size() + elements.size();
        } else {
            int size = ((elements.size() + iHydrovane) - 1) / 32;
            Object[][] objArr = new Object[size][];
            objArr[0] = marial(monoploid(this.tail), iHydrovane, it);
            for (int i = 1; i < size; i++) {
                objArr[i] = marial(molybdenite(), 0, it);
            }
            this.root = preprohormone(this.root, grimness(), objArr);
            this.tail = marial(molybdenite(), 0, it);
            this.size = size() + elements.size();
        }
        return true;
    }

    public final Object[] adultoid(Object[] root, int index, int shift) {
        if (!(shift >= 0)) {
            lightstruck.attabal("shift should be positive");
        }
        if (shift == 0) {
            return root;
        }
        int iAttabal = triweekly.attabal(index, shift);
        Object obj = root[iAttabal];
        Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object objAdultoid = adultoid((Object[]) obj, index, shift - 5);
        if (iAttabal < 31) {
            int i = iAttabal + 1;
            if (root[i] != null) {
                if (kowloon(root)) {
                    arytenoidectomy.molybdenite(root, null, i, 32);
                }
                root = arytenoidectomy.taiyuan(root, molybdenite(), 0, 0, i);
            }
        }
        if (objAdultoid == root[iAttabal]) {
            return root;
        }
        Object[] objArrMonoploid = monoploid(root);
        objArrMonoploid[iAttabal] = objAdultoid;
        return objArrMonoploid;
    }

    public final ListIterator<Object[]> arytenoidectomy(int index) {
        Object[] objArr = this.root;
        if (objArr == null) {
            throw new IllegalStateException("Invalid root");
        }
        int iGrimness = grimness() >> 5;
        cord.wireman.saneness(index, iGrimness);
        int i = this.rootShift;
        return i == 0 ? new apical(objArr, index) : new impassible(objArr, index, iGrimness, i / 5);
    }

    public final int beachfront() {
        return ((AbstractList) this).modCount;
    }

    @Override // dovishness.marial.attabal
    public dovishness.marial<E> build() {
        beachfront beachfrontVar;
        if (this.root == this.vectorRoot && this.tail == this.vectorTail) {
            beachfrontVar = this.vector;
        } else {
            this.ownership = new cord.marial();
            Object[] objArr = this.root;
            this.vectorRoot = objArr;
            Object[] objArr2 = this.tail;
            this.vectorTail = objArr2;
            if (objArr != null) {
                Object[] objArr3 = this.root;
                Intrinsics.beachfront(objArr3);
                beachfrontVar = new beachfront(objArr3, this.tail, size(), this.rootShift);
            } else if (objArr2.length == 0) {
                beachfrontVar = triweekly.saneness();
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(this.tail, size());
                Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
                beachfrontVar = new formularize(objArrCopyOf);
            }
        }
        this.vector = beachfrontVar;
        return (dovishness.marial<E>) beachfrontVar;
    }

    /* JADX INFO: renamed from: competently, reason: from getter */
    public final Object[] getRoot() {
        return this.root;
    }

    public final void cord(Object[] root, Object[] filledTail, Object[] newTail) {
        int size = size() >> 5;
        int i = this.rootShift;
        if (size > (1 << i)) {
            this.root = cuirassed(graveside(root), filledTail, this.rootShift + 5);
            this.tail = newTail;
            this.rootShift += 5;
            this.size = size() + 1;
            return;
        }
        if (root == null) {
            this.root = filledTail;
            this.tail = newTail;
            this.size = size() + 1;
        } else {
            this.root = cuirassed(root, filledTail, i);
            this.tail = newTail;
            this.size = size() + 1;
        }
    }

    public final void creditor(Collection<? extends E> elements, int index, Object[] startBuffer, int startBufferSize, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        Object[] objArrMolybdenite;
        if (!(nullBuffers >= 1)) {
            lightstruck.attabal("requires at least one nullBuffer");
        }
        Object[] objArrMonoploid = monoploid(startBuffer);
        buffers[0] = objArrMonoploid;
        int i = index & 31;
        int size = ((index + elements.size()) - 1) & 31;
        int i2 = (startBufferSize - i) + size;
        if (i2 < 32) {
            arytenoidectomy.taiyuan(objArrMonoploid, nextBuffer, size + 1, i, startBufferSize);
        } else {
            int i3 = i2 - 31;
            if (nullBuffers == 1) {
                objArrMolybdenite = objArrMonoploid;
            } else {
                objArrMolybdenite = molybdenite();
                nullBuffers--;
                buffers[nullBuffers] = objArrMolybdenite;
            }
            int i4 = startBufferSize - i3;
            arytenoidectomy.taiyuan(objArrMonoploid, nextBuffer, 0, i4, startBufferSize);
            arytenoidectomy.taiyuan(objArrMonoploid, objArrMolybdenite, size + 1, i, i4);
            nextBuffer = objArrMolybdenite;
        }
        Iterator<? extends E> it = elements.iterator();
        marial(objArrMonoploid, i, it);
        for (int i5 = 1; i5 < nullBuffers; i5++) {
            buffers[i5] = marial(molybdenite(), 0, it);
        }
        marial(nextBuffer, 0, it);
    }

    public final Object[] cuirassed(Object[] root, Object[] tail, int shift) {
        int iAttabal = triweekly.attabal(size() - 1, shift);
        Object[] objArrMonoploid = monoploid(root);
        if (shift == 5) {
            objArrMonoploid[iAttabal] = tail;
            return objArrMonoploid;
        }
        objArrMonoploid[iAttabal] = cuirassed((Object[]) objArrMonoploid[iAttabal], tail, shift - 5);
        return objArrMonoploid;
    }

    public final void cutely(Collection<? extends E> elements, int index, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        Object[] objArr;
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        int i = index >> 5;
        Object[] objArrPrivatdozent = privatdozent(i, rightShift, buffers, nullBuffers, nextBuffer);
        int iGrimness = nullBuffers - (((grimness() >> 5) - 1) - i);
        if (iGrimness < nullBuffers) {
            Object[] objArr2 = buffers[iGrimness];
            Intrinsics.beachfront(objArr2);
            objArr = objArr2;
        } else {
            objArr = nextBuffer;
        }
        creditor(elements, index, objArrPrivatdozent, 32, buffers, iGrimness, objArr);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int index) {
        cord.wireman.attabal(index, size());
        return (E) wireman(index)[index & 31];
    }

    @Override // p002kotlin.collections.impromptu
    public int getSize() {
        return this.size;
    }

    public final void gintrap(Object[] root, int rootSize, int shift) {
        if (shift == 0) {
            this.root = null;
            if (root == null) {
                root = new Object[0];
            }
            this.tail = root;
            this.size = rootSize;
            this.rootShift = shift;
            return;
        }
        marial marialVar = new marial(null);
        Intrinsics.beachfront(root);
        Object[] objArrDovishness = dovishness(root, shift, rootSize, marialVar);
        Intrinsics.beachfront(objArrDovishness);
        Object value = marialVar.getValue();
        Intrinsics.competently(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        this.tail = (Object[]) value;
        this.size = rootSize;
        if (objArrDovishness[1] == null) {
            this.root = (Object[]) objArrDovishness[0];
            this.rootShift = shift - 5;
        } else {
            this.root = objArrDovishness;
            this.rootShift = shift;
        }
    }

    public final Object[] graveside(Object element) {
        Object[] objArr = new Object[33];
        objArr[0] = element;
        objArr[32] = this.ownership;
        return objArr;
    }

    public final int hydrovane() {
        return walach(size());
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final int getRootShift() {
        return this.rootShift;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<E> iterator() {
        return listIterator();
    }

    public final boolean kattegat(Function1<? super E, Boolean> predicate) {
        boolean zOilcan = oilcan(predicate);
        if (zOilcan) {
            ((AbstractList) this).modCount++;
        }
        return zOilcan;
    }

    public final boolean kowloon(Object[] buffer) {
        return buffer.length == 33 && buffer[32] == this.ownership;
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }

    public final Object[] marial(Object[] buffer, int bufferIndex, Iterator<? extends Object> sourceIterator) {
        while (bufferIndex < 32 && sourceIterator.hasNext()) {
            buffer[bufferIndex] = sourceIterator.next();
            bufferIndex++;
        }
        return buffer;
    }

    public final Object merc(Object[] root, int rootSize, int shift, int index) {
        int size = size() - rootSize;
        cord.attabal.attabal(index < size);
        if (size == 1) {
            Object obj = this.tail[0];
            gintrap(root, rootSize, shift);
            return obj;
        }
        Object[] objArr = this.tail;
        Object obj2 = objArr[index];
        Object[] objArrTaiyuan = arytenoidectomy.taiyuan(objArr, monoploid(objArr), index, index + 1, size);
        objArrTaiyuan[size - 1] = null;
        this.root = root;
        this.tail = objArrTaiyuan;
        this.size = (rootSize + size) - 1;
        this.rootShift = shift;
        return obj2;
    }

    public final Object[] molybdenite() {
        Object[] objArr = new Object[33];
        objArr[32] = this.ownership;
        return objArr;
    }

    public final Object[] monoploid(Object[] buffer) {
        if (buffer == null) {
            return molybdenite();
        }
        return kowloon(buffer) ? buffer : arytenoidectomy.triweekly(buffer, molybdenite(), 0, 0, p002kotlin.ranges.wireman.competently(buffer.length, 32), 6, null);
    }

    public final boolean oilcan(Function1<? super E, Boolean> predicate) {
        Object[] objArrRotuma;
        int iHydrovane = hydrovane();
        marial marialVar = new marial(null);
        if (this.root == null) {
            return sealless(predicate, iHydrovane, marialVar) != iHydrovane;
        }
        ListIterator<Object[]> listIteratorArytenoidectomy = arytenoidectomy(0);
        int iTrm = 32;
        while (iTrm == 32 && listIteratorArytenoidectomy.hasNext()) {
            iTrm = trm(predicate, listIteratorArytenoidectomy.next(), 32, marialVar);
        }
        if (iTrm == 32) {
            cord.attabal.attabal(!listIteratorArytenoidectomy.hasNext());
            int iSealless = sealless(predicate, iHydrovane, marialVar);
            if (iSealless == 0) {
                gintrap(this.root, size(), this.rootShift);
            }
            return iSealless != iHydrovane;
        }
        int iPreviousIndex = listIteratorArytenoidectomy.previousIndex() << 5;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int iStratoscope = iTrm;
        while (listIteratorArytenoidectomy.hasNext()) {
            iStratoscope = stratoscope(predicate, listIteratorArytenoidectomy.next(), 32, iStratoscope, marialVar, arrayList2, arrayList);
        }
        int iStratoscope2 = stratoscope(predicate, this.tail, iHydrovane, iStratoscope, marialVar, arrayList2, arrayList);
        Object value = marialVar.getValue();
        Intrinsics.competently(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        arytenoidectomy.molybdenite(objArr, null, iStratoscope2, 32);
        if (arrayList.isEmpty()) {
            objArrRotuma = this.root;
            Intrinsics.beachfront(objArrRotuma);
        } else {
            objArrRotuma = rotuma(this.root, iPreviousIndex, this.rootShift, arrayList.iterator());
        }
        int size = iPreviousIndex + (arrayList.size() << 5);
        this.root = seminary(objArrRotuma, size);
        this.tail = objArr;
        this.size = size + iStratoscope2;
        return true;
    }

    public final Object[] polloi(Object[] buffer, int distance) {
        return kowloon(buffer) ? arytenoidectomy.taiyuan(buffer, buffer, distance, 0, 32 - distance) : arytenoidectomy.taiyuan(buffer, molybdenite(), distance, 0, 32 - distance);
    }

    public final Object[] preprohormone(Object[] root, int rootSize, Object[][] buffers) {
        Iterator<Object[]> itAttabal = p002kotlin.jvm.internal.saneness.attabal(buffers);
        int i = rootSize >> 5;
        int i2 = this.rootShift;
        Object[] objArrRotuma = i < (1 << i2) ? rotuma(root, rootSize, i2, itAttabal) : monoploid(root);
        while (itAttabal.hasNext()) {
            this.rootShift += 5;
            objArrRotuma = graveside(objArrRotuma);
            int i3 = this.rootShift;
            rotuma(objArrRotuma, 1 << i3, i3, itAttabal);
        }
        return objArrRotuma;
    }

    public final Object[] privatdozent(int startLeafIndex, int rightShift, Object[][] buffers, int nullBuffers, Object[] nextBuffer) {
        if (this.root == null) {
            throw new IllegalStateException("root is null");
        }
        ListIterator<Object[]> listIteratorArytenoidectomy = arytenoidectomy(grimness() >> 5);
        while (listIteratorArytenoidectomy.previousIndex() != startLeafIndex) {
            Object[] objArrPrevious = listIteratorArytenoidectomy.previous();
            arytenoidectomy.taiyuan(objArrPrevious, nextBuffer, 0, 32 - rightShift, 32);
            nextBuffer = polloi(objArrPrevious, rightShift);
            nullBuffers--;
            buffers[nullBuffers] = nextBuffer;
        }
        return listIteratorArytenoidectomy.previous();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(final Collection<?> elements) {
        return kattegat(new Function1() { // from class: gintrap.competently
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(impromptu.yemenite(elements, obj));
            }
        });
    }

    @Override // p002kotlin.collections.impromptu
    public E removeAt(int index) {
        cord.wireman.attabal(index, size());
        ((AbstractList) this).modCount++;
        int iGrimness = grimness();
        if (index >= iGrimness) {
            return (E) merc(this.root, iGrimness, this.rootShift, index - iGrimness);
        }
        marial marialVar = new marial(this.tail[0]);
        Object[] objArr = this.root;
        Intrinsics.beachfront(objArr);
        merc(supplicat(objArr, this.rootShift, index, marialVar), iGrimness, this.rootShift, 0);
        return (E) marialVar.getValue();
    }

    public final Object[] rotuma(Object[] root, int rootSize, int shift, Iterator<Object[]> buffersIterator) {
        if (!buffersIterator.hasNext()) {
            lightstruck.attabal("invalid buffersIterator");
        }
        if (!(shift >= 0)) {
            lightstruck.attabal("negative shift");
        }
        if (shift == 0) {
            return buffersIterator.next();
        }
        Object[] objArrMonoploid = monoploid(root);
        int iAttabal = triweekly.attabal(rootSize, shift);
        int i = shift - 5;
        objArrMonoploid[iAttabal] = rotuma((Object[]) objArrMonoploid[iAttabal], rootSize, i, buffersIterator);
        while (true) {
            iAttabal++;
            if (iAttabal >= 32 || !buffersIterator.hasNext()) {
                break;
            }
            objArrMonoploid[iAttabal] = rotuma((Object[]) objArrMonoploid[iAttabal], 0, i, buffersIterator);
        }
        return objArrMonoploid;
    }

    public final Object[] saran(Object[] root, int shift, int index, E e, marial oldElementCarry) {
        int iAttabal = triweekly.attabal(index, shift);
        Object[] objArrMonoploid = monoploid(root);
        if (shift != 0) {
            Object obj = objArrMonoploid[iAttabal];
            Intrinsics.competently(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArrMonoploid[iAttabal] = saran((Object[]) obj, shift - 5, index, e, oldElementCarry);
            return objArrMonoploid;
        }
        if (objArrMonoploid != root) {
            ((AbstractList) this).modCount++;
        }
        oldElementCarry.saneness(objArrMonoploid[iAttabal]);
        objArrMonoploid[iAttabal] = e;
        return objArrMonoploid;
    }

    public final int sealless(Function1<? super E, Boolean> predicate, int tailSize, marial bufferRef) {
        int iTrm = trm(predicate, this.tail, tailSize, bufferRef);
        if (iTrm == tailSize) {
            cord.attabal.attabal(bufferRef.getValue() == this.tail);
            return tailSize;
        }
        Object value = bufferRef.getValue();
        Intrinsics.competently(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        arytenoidectomy.molybdenite(objArr, null, iTrm, tailSize);
        this.tail = objArr;
        this.size = size() - (tailSize - iTrm);
        return iTrm;
    }

    public final Object[] seminary(Object[] root, int size) {
        if (!((size & 31) == 0)) {
            lightstruck.attabal("invalid size");
        }
        if (size == 0) {
            this.rootShift = 0;
            return null;
        }
        int i = size - 1;
        while (true) {
            int i2 = this.rootShift;
            if ((i >> i2) != 0) {
                return adultoid(root, i, i2);
            }
            this.rootShift = i2 - 5;
            Object[] objArr = root[0];
            Intrinsics.competently(objArr, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            root = objArr;
        }
    }

    @Override // p002kotlin.collections.impromptu, java.util.AbstractList, java.util.List
    public E set(int index, E element) {
        cord.wireman.attabal(index, size());
        if (grimness() > index) {
            marial marialVar = new marial(null);
            Object[] objArr = this.root;
            Intrinsics.beachfront(objArr);
            this.root = saran(objArr, this.rootShift, index, element, marialVar);
            return (E) marialVar.getValue();
        }
        Object[] objArrMonoploid = monoploid(this.tail);
        if (objArrMonoploid != this.tail) {
            ((AbstractList) this).modCount++;
        }
        int i = index & 31;
        E e = (E) objArrMonoploid[i];
        objArrMonoploid[i] = element;
        this.tail = objArrMonoploid;
        return e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int stratoscope(Function1<? super E, Boolean> predicate, Object[] buffer, int bufferSize, int toBufferSize, marial bufferRef, List<Object[]> recyclableBuffers, List<Object[]> buffers) {
        if (kowloon(buffer)) {
            recyclableBuffers.add(buffer);
        }
        Object value = bufferRef.getValue();
        Intrinsics.competently(value, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
        Object[] objArr = (Object[]) value;
        Object[] objArrRemove = objArr;
        for (int i = 0; i < bufferSize; i++) {
            Object obj = buffer[i];
            if (!predicate.invoke(obj).booleanValue()) {
                if (toBufferSize == 32) {
                    objArrRemove = !recyclableBuffers.isEmpty() ? recyclableBuffers.remove(recyclableBuffers.size() - 1) : molybdenite();
                    toBufferSize = 0;
                }
                objArrRemove[toBufferSize] = obj;
                toBufferSize++;
            }
        }
        bufferRef.saneness(objArrRemove);
        if (objArr != bufferRef.getValue()) {
            buffers.add(objArr);
        }
        return toBufferSize;
    }

    /* JADX INFO: renamed from: taiyuan, reason: from getter */
    public final Object[] getTail() {
        return this.tail;
    }

    public final void triweekly(Object[] root, int index, E element) {
        int iHydrovane = hydrovane();
        Object[] objArrMonoploid = monoploid(this.tail);
        if (iHydrovane < 32) {
            arytenoidectomy.taiyuan(this.tail, objArrMonoploid, index + 1, index, iHydrovane);
            objArrMonoploid[index] = element;
            this.root = root;
            this.tail = objArrMonoploid;
            this.size = size() + 1;
            return;
        }
        Object[] objArr = this.tail;
        Object obj = objArr[31];
        arytenoidectomy.taiyuan(objArr, objArrMonoploid, index + 1, index, 31);
        objArrMonoploid[index] = element;
        cord(root, objArrMonoploid, graveside(obj));
    }

    public final int trm(Function1<? super E, Boolean> predicate, Object[] buffer, int bufferSize, marial bufferRef) {
        Object[] objArrMonoploid = buffer;
        int i = bufferSize;
        boolean z = false;
        for (int i2 = 0; i2 < bufferSize; i2++) {
            Object obj = buffer[i2];
            if (predicate.invoke(obj).booleanValue()) {
                if (!z) {
                    objArrMonoploid = monoploid(buffer);
                    z = true;
                    i = i2;
                }
            } else if (z) {
                objArrMonoploid[i] = obj;
                i++;
            }
        }
        bufferRef.saneness(objArrMonoploid);
        return i;
    }

    public final int walach(int size) {
        return size <= 32 ? size : size - triweekly.wireman(size);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator<E> listIterator(int index) {
        cord.wireman.saneness(index, size());
        return new cutely(this, index);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p002kotlin.collections.impromptu, java.util.AbstractList, java.util.List
    public void add(int index, E element) {
        cord.wireman.saneness(index, size());
        if (index == size()) {
            add(element);
            return;
        }
        ((AbstractList) this).modCount++;
        int iGrimness = grimness();
        if (index >= iGrimness) {
            triweekly(this.root, index - iGrimness, element);
            return;
        }
        marial marialVar = new marial(null);
        Object[] objArr = this.root;
        Intrinsics.beachfront(objArr);
        triweekly(impassible(objArr, this.rootShift, index, element, marialVar), 0, marialVar.getValue());
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int index, Collection<? extends E> elements) {
        impromptu<E> impromptuVar;
        Collection<? extends E> collection2;
        Object[] objArrTaiyuan;
        Object[][] objArr;
        cord.wireman.saneness(index, size());
        if (index == size()) {
            return addAll(elements);
        }
        if (elements.isEmpty()) {
            return false;
        }
        ((AbstractList) this).modCount++;
        int i = (index >> 5) << 5;
        int size = (((size() - i) + elements.size()) - 1) / 32;
        if (size == 0) {
            cord.attabal.attabal(index >= grimness());
            int i2 = index & 31;
            int size2 = ((index + elements.size()) - 1) & 31;
            Object[] objArr2 = this.tail;
            Object[] objArrTaiyuan2 = arytenoidectomy.taiyuan(objArr2, monoploid(objArr2), size2 + 1, i2, hydrovane());
            marial(objArrTaiyuan2, i2, elements.iterator());
            this.tail = objArrTaiyuan2;
            this.size = size() + elements.size();
            return true;
        }
        Object[][] objArr3 = new Object[size][];
        int iHydrovane = hydrovane();
        int iWalach = walach(size() + elements.size());
        if (index >= grimness()) {
            objArrTaiyuan = molybdenite();
            objArr = objArr3;
            impromptuVar = this;
            collection2 = elements;
            impromptuVar.creditor(collection2, index, this.tail, iHydrovane, objArr, size, objArrTaiyuan);
        } else {
            impromptuVar = this;
            collection2 = elements;
            if (iWalach > iHydrovane) {
                int i3 = iWalach - iHydrovane;
                Object[] objArrPolloi = polloi(impromptuVar.tail, i3);
                impromptuVar.cutely(collection2, index, i3, objArr3, size, objArrPolloi);
                objArr = objArr3;
                objArrTaiyuan = objArrPolloi;
            } else {
                int i4 = iHydrovane - iWalach;
                objArrTaiyuan = arytenoidectomy.taiyuan(impromptuVar.tail, molybdenite(), 0, i4, iHydrovane);
                int i5 = 32 - i4;
                Object[] objArrPolloi2 = polloi(impromptuVar.tail, i5);
                int i6 = size - 1;
                objArr3[i6] = objArrPolloi2;
                impromptuVar.cutely(collection2, index, i5, objArr3, i6, objArrPolloi2);
                collection2 = collection2;
                objArr = objArr3;
                impromptuVar = impromptuVar;
            }
        }
        impromptuVar.root = preprohormone(impromptuVar.root, i, objArr);
        impromptuVar.tail = objArrTaiyuan;
        impromptuVar.size = size() + collection2.size();
        return true;
    }
}
