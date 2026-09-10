package p002kotlin.collections;

import com.google.android.gms.ads.RequestConfiguration;
import com.ironsource.A5;
import com.ironsource.C3414a2;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.jvm.functions.Function0;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.ranges.wireman;
import p002kotlin.sequences.Sequence;
import p002kotlin.sequences.arytenoidectomy;
import p002kotlin.text.impassible;
import patroclinal.formularize;

/* JADX INFO: compiled from: _Arrays.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u001e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u001a*\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\f\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u0010\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0014\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0018\u001a\u00020\u0003*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0017H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a!\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001c\u0010\u001b\u001a)\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001b\u0010 \u001a\u0004\u0018\u00010\u000f*\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b \u0010!\u001a'\u0010\"\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\"\u0010#\u001a\u0019\u0010$\u001a\u00020\u000f*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007¢\u0006\u0004\b$\u0010%\u001a\u0019\u0010&\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000b¢\u0006\u0004\b&\u0010'\u001a\u0019\u0010(\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f¢\u0006\u0004\b(\u0010)\u001a\u0019\u0010*\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0013¢\u0006\u0004\b*\u0010+\u001a\u0019\u0010,\u001a\u00020\u000f*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0017¢\u0006\u0004\b,\u0010-\u001a\u001f\u0010.\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b.\u0010\u001b\u001a'\u0010/\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b/\u0010#\u001a\u0019\u00100\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f¢\u0006\u0004\b0\u0010)\u001a\u001f\u00101\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b1\u0010\u001b\u001a\u0011\u00102\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b2\u00103\u001a!\u00104\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b4\u0010\u001b\u001a-\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u00105\u001a\u00020\u000f¢\u0006\u0004\b7\u00108\u001a+\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000006\"\b\b\u0000\u0010\u0000*\u000209*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b:\u0010;\u001a?\u0010?\u001a\u00028\u0000\"\u0010\b\u0000\u0010=*\n\u0012\u0006\b\u0000\u0012\u00028\u00010<\"\b\b\u0001\u0010\u0000*\u000209*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010>\u001a\u00028\u0000¢\u0006\u0004\b?\u0010@\u001a-\u0010A\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u00105\u001a\u00020\u000f¢\u0006\u0004\bA\u00108\u001aC\u0010E\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010D\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Bj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`C¢\u0006\u0004\bE\u0010F\u001aA\u0010G\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010D\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Bj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`C¢\u0006\u0004\bG\u0010H\u001a\u0019\u0010I\u001a\u00020\u000e*\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u0001¢\u0006\u0004\bI\u0010J\u001a9\u0010K\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010=*\n\u0012\u0006\b\u0000\u0012\u00028\u00000<*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010>\u001a\u00028\u0001¢\u0006\u0004\bK\u0010@\u001a%\u0010L\u001a\b\u0012\u0004\u0012\u00028\u000006\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bL\u0010;\u001a\u0017\u0010M\u001a\b\u0012\u0004\u0012\u00020\u000706*\u00020\u0006¢\u0006\u0004\bM\u0010N\u001a\u0017\u0010O\u001a\b\u0012\u0004\u0012\u00020\u000b06*\u00020\n¢\u0006\u0004\bO\u0010P\u001a\u0017\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u000f06*\u00020\u000e¢\u0006\u0004\bQ\u0010R\u001a\u0017\u0010S\u001a\b\u0012\u0004\u0012\u00020\u001306*\u00020\u0012¢\u0006\u0004\bS\u0010T\u001a\u0017\u0010W\u001a\b\u0012\u0004\u0012\u00020V06*\u00020U¢\u0006\u0004\bW\u0010X\u001a\u0017\u0010[\u001a\b\u0012\u0004\u0012\u00020Z06*\u00020Y¢\u0006\u0004\b[\u0010\\\u001a\u0017\u0010^\u001a\b\u0012\u0004\u0012\u00020\u000306*\u00020]¢\u0006\u0004\b^\u0010_\u001a\u0017\u0010`\u001a\b\u0012\u0004\u0012\u00020\u001706*\u00020\u0016¢\u0006\u0004\b`\u0010a\u001a%\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00000b\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bc\u0010;\u001a\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00070b*\u00020\u0006¢\u0006\u0004\bd\u0010N\u001a\u0017\u0010e\u001a\b\u0012\u0004\u0012\u00020\u000b0b*\u00020\n¢\u0006\u0004\be\u0010P\u001a\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020\u000f0b*\u00020\u000e¢\u0006\u0004\bf\u0010R\u001a\u0017\u0010g\u001a\b\u0012\u0004\u0012\u00020\u00130b*\u00020\u0012¢\u0006\u0004\bg\u0010T\u001a\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020V0b*\u00020U¢\u0006\u0004\bh\u0010X\u001a\u0017\u0010i\u001a\b\u0012\u0004\u0012\u00020Z0b*\u00020Y¢\u0006\u0004\bi\u0010\\\u001a\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00030b*\u00020]¢\u0006\u0004\bj\u0010_\u001a\u0017\u0010k\u001a\b\u0012\u0004\u0012\u00020\u00170b*\u00020\u0016¢\u0006\u0004\bk\u0010a\u001a%\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000l\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bm\u0010n\u001aE\u0010r\u001a\b\u0012\u0004\u0012\u00028\u000106\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010o*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0012\u0010q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010pH\u0086\bø\u0001\u0000¢\u0006\u0004\br\u0010s\u001a+\u0010v\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000u0t\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bv\u0010w\u001aJ\u0010z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010y06\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010o*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u000e\u0010x\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0001H\u0086\u0004¢\u0006\u0004\bz\u0010{\u001aH\u0010|\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010y06\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010o*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\f\u0010x\u001a\b\u0012\u0004\u0012\u00028\u00010tH\u0086\u0004¢\u0006\u0004\b|\u0010}\u001a\u008e\u0001\u0010\u0088\u0001\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\r\b\u0001\u0010\u0080\u0001*\u00060~j\u0002`\u007f*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0007\u0010\u0081\u0001\u001a\u00028\u00012\n\b\u0002\u0010\u0083\u0001\u001a\u00030\u0082\u00012\n\b\u0002\u0010\u0084\u0001\u001a\u00030\u0082\u00012\n\b\u0002\u0010\u0085\u0001\u001a\u00030\u0082\u00012\t\b\u0002\u0010\u0086\u0001\u001a\u00020\u000f2\n\b\u0002\u0010\u0087\u0001\u001a\u00030\u0082\u00012\u0017\b\u0002\u0010q\u001a\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010p¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0080\u0001\u0010\u008a\u0001\u001a\u00028\u0000\"\r\b\u0000\u0010\u0080\u0001*\u00060~j\u0002`\u007f*\u00020\u00062\u0007\u0010\u0081\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u0083\u0001\u001a\u00030\u0082\u00012\n\b\u0002\u0010\u0084\u0001\u001a\u00030\u0082\u00012\n\b\u0002\u0010\u0085\u0001\u001a\u00030\u0082\u00012\t\b\u0002\u0010\u0086\u0001\u001a\u00020\u000f2\n\b\u0002\u0010\u0087\u0001\u001a\u00030\u0082\u00012\u0017\b\u0002\u0010q\u001a\u0011\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010p¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001\u001aw\u0010\u008d\u0001\u001a\u00030\u008c\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0083\u0001\u001a\u00030\u0082\u00012\n\b\u0002\u0010\u0084\u0001\u001a\u00030\u0082\u00012\n\b\u0002\u0010\u0085\u0001\u001a\u00030\u0082\u00012\t\b\u0002\u0010\u0086\u0001\u001a\u00020\u000f2\n\b\u0002\u0010\u0087\u0001\u001a\u00030\u0082\u00012\u0017\b\u0002\u0010q\u001a\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010p¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001\u001ai\u0010\u008f\u0001\u001a\u00030\u008c\u0001*\u00020\u00062\n\b\u0002\u0010\u0083\u0001\u001a\u00030\u0082\u00012\n\b\u0002\u0010\u0084\u0001\u001a\u00030\u0082\u00012\n\b\u0002\u0010\u0085\u0001\u001a\u00030\u0082\u00012\t\b\u0002\u0010\u0086\u0001\u001a\u00020\u000f2\n\b\u0002\u0010\u0087\u0001\u001a\u00030\u0082\u00012\u0017\b\u0002\u0010q\u001a\u0011\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010p¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001a'\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000t\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0005\b\u0091\u0001\u0010w\u001a)\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0092\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001\"&\u0010\u0097\u0001\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00018F¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0018\u0010\u0097\u0001\u001a\u00020\u000f*\u00020\u00128F¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u009a\u0001"}, d2 = {RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "element", "", "polder", "([Ljava/lang/Object;Ljava/lang/Object;)Z", "", "", "kattegat", "([BB)Z", "", "", "seminary", "([SS)Z", "", "", "restrictive", "([II)Z", "", "", "merc", "([JJ)Z", "", "", "supplicat", "([CC)Z", "creditor", "([Ljava/lang/Object;)Ljava/lang/Object;", "starveling", "index", "mathsort", "([Ljava/lang/Object;I)Ljava/lang/Object;", "peridotite", "([II)Ljava/lang/Integer;", "permissivist", "([Ljava/lang/Object;Ljava/lang/Object;)I", "splinterproof", "([BB)I", "cultivated", "([SS)I", "clubfoot", "([II)I", "dent", "([JJ)I", "overspeculate", "([CC)I", "nosophobia", "sayid", "lotta", "czestochowa", "coi", "([C)C", "sensatory", A5.q, "", "grimness", "([Ljava/lang/Object;I)Ljava/util/List;", "", "saran", "([Ljava/lang/Object;)Ljava/util/List;", "", "C", "destination", "privatdozent", "([Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;", "wostteth", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "underbelly", "([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;", "preterite", "([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;", "gusty", "([Ljava/lang/Integer;)[I", "igbo", "unconsolidated", "picketboat", "([B)Ljava/util/List;", "claque", "([S)Ljava/util/List;", "julian", "([I)Ljava/util/List;", "achondroplasia", "([J)Ljava/util/List;", "", "", "monroe", "([F)Ljava/util/List;", "", "", "lightstruck", "([D)Ljava/util/List;", "", "hardpan", "([Z)Ljava/util/List;", "palmyra", "([C)Ljava/util/List;", "", "mastfed", "herdbook", "attendance", "vesuvio", "setterwort", "dhss", "outmarry", "homozygous", "technofreak", "", "lampshade", "([Ljava/lang/Object;)Ljava/util/Set;", "R", "Lkotlin/Function1;", "transform", "empress", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "Lkotlin/collections/IndexedValue;", "libyan", "([Ljava/lang/Object;)Ljava/lang/Iterable;", C3414a2.d, "Lkotlin/Pair;", "sakeen", "([Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;", "molet", "([Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/List;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "timberyard", "([Ljava/lang/Object;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "premeiotic", "([BLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "", "itchy", "([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "treadless", "([BLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "yemenite", "Lkotlin/sequences/Sequence;", "sealless", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "walach", "([Ljava/lang/Object;)I", "lastIndex", "hydrovane", "([J)I", "kotlin-stdlib"}, k = 5, mv = {2, 2, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
public class polloi extends arytenoidectomy {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Iterables.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/collections/polloi$attabal", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class attabal<T> implements Iterable<T>, unready.attabal {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
        public final /* synthetic */ Object[] f29348kowloon;

        public attabal(Object[] objArr) {
            this.f29348kowloon = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return p002kotlin.jvm.internal.saneness.attabal(this.f29348kowloon);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Sequences.kt */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"kotlin/collections/polloi$saneness", "Lkotlin/sequences/Sequence;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class saneness<T> implements Sequence<T> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final /* synthetic */ Object[] f29349attabal;

        public saneness(Object[] objArr) {
            this.f29349attabal = objArr;
        }

        @Override // p002kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return p002kotlin.jvm.internal.saneness.attabal(this.f29349attabal);
        }
    }

    public static List<Long> achondroplasia(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            return length != 1 ? setterwort(jArr) : graveside.marial(Long.valueOf(jArr[0]));
        }
        return adultoid.formularize();
    }

    public static final List<Short> attendance(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    public static List<Short> claque(short[] sArr) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        if (length != 0) {
            return length != 1 ? attendance(sArr) : graveside.marial(Short.valueOf(sArr[0]));
        }
        return adultoid.formularize();
    }

    public static final int clubfoot(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    public static /* synthetic */ String coffeecake(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return treadless(bArr, charSequence, charSequence2, charSequence3, i, charSequence5, function2);
    }

    public static char coi(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T> T creditor(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int cultivated(short[] sArr, short s) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (s == sArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static <T> T czestochowa(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static final Iterator deadwork(Object[] objArr) {
        return p002kotlin.jvm.internal.saneness.attabal(objArr);
    }

    public static final int dent(long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static final List<Float> dhss(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    public static <T, R> List<R> empress(T[] tArr, Function1<? super T, ? extends R> transform) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t : tArr) {
            arrayList.add(transform.invoke(t));
        }
        return arrayList;
    }

    public static <T> List<T> grimness(T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i >= 0) {
            return wostteth(tArr, wireman.wireman(tArr.length - i, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    public static int[] gusty(Integer[] numArr) {
        Intrinsics.checkNotNullParameter(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    public static List<Boolean> hardpan(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        int length = zArr.length;
        if (length != 0) {
            return length != 1 ? homozygous(zArr) : graveside.marial(Boolean.valueOf(zArr[0]));
        }
        return adultoid.formularize();
    }

    public static final List<Byte> herdbook(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    public static final List<Boolean> homozygous(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    public static int hydrovane(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return jArr.length - 1;
    }

    public static final <T, C extends Collection<? super T>> C igbo(T[] tArr, C destination) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t : tArr) {
            destination.add(t);
        }
        return destination;
    }

    public static final <T> String itchy(T[] tArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) timberyard(tArr, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
    }

    public static List<Integer> julian(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            return length != 1 ? vesuvio(iArr) : graveside.marial(Integer.valueOf(iArr[0]));
        }
        return adultoid.formularize();
    }

    public static boolean kattegat(byte[] bArr, byte b) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return splinterproof(bArr, b) >= 0;
    }

    public static <T> Set<T> lampshade(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? (Set) igbo(tArr, new LinkedHashSet(polder.marial(tArr.length))) : privatdozent.wireman(tArr[0]);
        }
        return creditor.marial();
    }

    public static /* synthetic */ String lerp(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        CharSequence charSequence5 = charSequence4;
        Function1 function2 = function1;
        return itchy(objArr, charSequence, charSequence2, charSequence3, i, charSequence5, function2);
    }

    public static <T> Iterable<IndexedValue<T>> libyan(final T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new yemenite(new Function0() { // from class: kotlin.collections.monoploid
            @Override // p002kotlin.jvm.functions.Function0
            public final Object invoke() {
                return polloi.deadwork(tArr);
            }
        });
    }

    public static List<Double> lightstruck(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        int length = dArr.length;
        if (length != 0) {
            return length != 1 ? outmarry(dArr) : graveside.marial(Double.valueOf(dArr[0]));
        }
        return adultoid.formularize();
    }

    public static final int lotta(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (i == iArr[length]) {
                    return length;
                }
                if (i2 >= 0) {
                    length = i2;
                }
            }
        }
        return -1;
    }

    public static <T> List<T> mastfed(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return new ArrayList(adultoid.taiyuan(tArr, false, 1, null));
    }

    public static <T> T mathsort(T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i < 0 || i >= tArr.length) {
            return null;
        }
        return tArr[i];
    }

    public static boolean merc(long[] jArr, long j) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        return dent(jArr, j) >= 0;
    }

    public static <T, R> List<Pair<T, R>> molet(T[] tArr, Iterable<? extends R> other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(dovishness.gintrap(other, 10), length));
        int i = 0;
        for (R r : other) {
            if (i >= length) {
                break;
            }
            arrayList.add(formularize.attabal(tArr[i], r));
            i++;
        }
        return arrayList;
    }

    public static List<Float> monroe(float[] fArr) {
        Intrinsics.checkNotNullParameter(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            return length != 1 ? dhss(fArr) : graveside.marial(Float.valueOf(fArr[0]));
        }
        return adultoid.formularize();
    }

    public static <T> T nosophobia(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length != 0) {
            return tArr[walach(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final List<Double> outmarry(double[] dArr) {
        Intrinsics.checkNotNullParameter(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }

    public static final int overspeculate(char[] cArr, char c) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            if (c == cArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static List<Character> palmyra(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            return length != 1 ? technofreak(cArr) : graveside.marial(Character.valueOf(cArr[0]));
        }
        return adultoid.formularize();
    }

    public static Integer peridotite(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        if (i < 0 || i >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i]);
    }

    public static <T> int permissivist(T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (Intrinsics.wireman(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static List<Byte> picketboat(byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        if (length != 0) {
            return length != 1 ? herdbook(bArr) : graveside.marial(Byte.valueOf(bArr[0]));
        }
        return adultoid.formularize();
    }

    public static <T> boolean polder(T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return permissivist(tArr, t) >= 0;
    }

    public static final <A extends Appendable> A premeiotic(byte[] bArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Byte, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Byte.valueOf(b)));
            } else {
                buffer.append(String.valueOf((int) b));
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static <T> List<T> preterite(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return arytenoidectomy.wireman(underbelly(tArr, comparator));
    }

    public static final <C extends Collection<? super T>, T> C privatdozent(T[] tArr, C destination) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (T t : tArr) {
            if (t != null) {
                destination.add(t);
            }
        }
        return destination;
    }

    public static boolean restrictive(int[] iArr, int i) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        return clubfoot(iArr, i) >= 0;
    }

    public static <T, R> List<Pair<T, R>> sakeen(T[] tArr, R[] other) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int iMin = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i = 0; i < iMin; i++) {
            arrayList.add(formularize.attabal(tArr[i], other[i]));
        }
        return arrayList;
    }

    public static <T> List<T> saran(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return (List) privatdozent(tArr, new ArrayList());
    }

    public static <T> int sayid(T[] tArr, T t) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (t == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i >= 0) {
                        length = i;
                    }
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i2 = length2 - 1;
                    if (Intrinsics.wireman(t, tArr[length2])) {
                        return length2;
                    }
                    if (i2 < 0) {
                        break;
                    }
                    length2 = i2;
                }
            }
        }
        return -1;
    }

    public static <T> Sequence<T> sealless(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? arytenoidectomy.taiyuan() : new saneness(tArr);
    }

    public static boolean seminary(short[] sArr, short s) {
        Intrinsics.checkNotNullParameter(sArr, "<this>");
        return cultivated(sArr, s) >= 0;
    }

    public static <T> T sensatory(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static final List<Long> setterwort(long[] jArr) {
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static final int splinterproof(byte[] bArr, byte b) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (b == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static <T> T starveling(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static boolean supplicat(char[] cArr, char c) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        return overspeculate(cArr, c) >= 0;
    }

    public static final List<Character> technofreak(char[] cArr) {
        Intrinsics.checkNotNullParameter(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c : cArr) {
            arrayList.add(Character.valueOf(c));
        }
        return arrayList;
    }

    public static final <T, A extends Appendable> A timberyard(T[] tArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) throws IOException {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            impassible.attabal(buffer, t, function1);
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    public static final String treadless(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Byte, ? extends CharSequence> function1) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        Intrinsics.checkNotNullParameter(truncated, "truncated");
        return ((StringBuilder) premeiotic(bArr, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
    }

    public static <T> List<T> unconsolidated(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? mastfed(tArr) : graveside.marial(tArr[0]);
        }
        return adultoid.formularize();
    }

    public static final <T> T[] underbelly(T[] tArr, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        Intrinsics.checkNotNullExpressionValue(tArr2, "copyOf(...)");
        arytenoidectomy.stratoscope(tArr2, comparator);
        return tArr2;
    }

    public static final List<Integer> vesuvio(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    public static <T> int walach(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length - 1;
    }

    public static final <T> List<T> wostteth(T[] tArr, int i) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
        }
        if (i == 0) {
            return adultoid.formularize();
        }
        int length = tArr.length;
        if (i >= length) {
            return unconsolidated(tArr);
        }
        if (i == 1) {
            return graveside.marial(tArr[length - 1]);
        }
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = length - i; i2 < length; i2++) {
            arrayList.add(tArr[i2]);
        }
        return arrayList;
    }

    public static <T> Iterable<T> yemenite(T[] tArr) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        return tArr.length == 0 ? adultoid.formularize() : new attabal(tArr);
    }
}
