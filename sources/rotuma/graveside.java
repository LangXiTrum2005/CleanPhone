package rotuma;

import androidx.compose.runtime.lightstruck;
import com.ironsource.X3;
import cord.DeltaCounter;
import java.util.Arrays;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TrieNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b+\b\u0001\u0018\u0000 _*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0002\u000f~B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J3\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ;\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b!\u0010\"J?\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\b%\u0010&J?\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b)\u0010*J?\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010,J-\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010.J5\u0010/\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u00100JQ\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b5\u00106JK\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u00108JS\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b9\u0010:J]\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00028\u00002\u0006\u0010=\u001a\u00028\u00012\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00028\u00002\u0006\u0010@\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bA\u0010BJ-\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\bC\u0010.JA\u0010D\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bD\u0010EJ%\u0010G\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010F\u001a\u00020\u0004H\u0002¢\u0006\u0004\bG\u0010HJ9\u0010I\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010F\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bK\u0010LJ\u0019\u0010M\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bM\u0010NJ-\u0010O\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\bO\u0010PJ?\u0010Q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bQ\u0010RJ%\u0010S\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bS\u0010TJ9\u0010U\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bU\u0010VJA\u0010W\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bW\u0010RJ?\u0010[\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b[\u0010\\J[\u0010]\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020Y2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0004H\u0002¢\u0006\u0004\b_\u0010`J#\u0010a\u001a\u00020\u00132\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\ba\u0010bJW\u0010d\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\bd\u0010eJ_\u0010f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\u0004H\u0000¢\u0006\u0004\bh\u0010`J\u0017\u0010i\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bi\u0010\u0015J\u0017\u0010j\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bj\u0010kJ\u0017\u0010l\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bl\u0010kJ#\u0010m\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020\u0004H\u0000¢\u0006\u0004\bm\u0010HJ%\u0010o\u001a\u00020\u00132\u0006\u0010n\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\bo\u0010pJ'\u0010q\u001a\u0004\u0018\u00018\u00012\u0006\u0010n\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\bq\u0010rJQ\u0010s\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00104\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020Y2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\bs\u0010tJ;\u0010u\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010n\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\bu\u0010vJM\u0010w\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010n\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\bw\u0010xJ3\u0010y\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010n\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\by\u0010zJG\u0010{\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010n\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\b{\u0010|JO\u0010}\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010n\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\b}\u0010xR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010\u007fR\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u007fR\u0017\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0011\u0010\u0080\u0001R7\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u000e\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00078\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b5\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0084\u0001"}, d2 = {"Lrotuma/graveside;", "K", "V", "", "", "dataMap", "nodeMap", "", "buffer", "Lcord/marial;", "ownedBy", "<init>", "(II[Ljava/lang/Object;Lcord/marial;)V", "(II[Ljava/lang/Object;)V", "Lrotuma/graveside$saneness;", "saneness", "()Lrotuma/graveside$saneness;", "dern", "positionMask", "", "polloi", "(I)Z", "keyIndex", "graveside", "(I)Ljava/lang/Object;", "overspeculate", X3.i.W, "value", "molybdenite", "(ILjava/lang/Object;Ljava/lang/Object;)Lrotuma/graveside;", "owner", "stratoscope", "(ILjava/lang/Object;Ljava/lang/Object;Lcord/marial;)Lrotuma/graveside;", "splinterproof", "(ILjava/lang/Object;)Lrotuma/graveside;", "Lrotuma/beachfront;", "mutator", "grimness", "(ILjava/lang/Object;Lrotuma/beachfront;)Lrotuma/graveside;", "nodeIndex", "newNode", "mathsort", "(IILrotuma/graveside;)Lrotuma/graveside;", "seminary", "(ILrotuma/graveside;Lcord/marial;)Lrotuma/graveside;", "walach", "(II)Lrotuma/graveside;", "merc", "(IILcord/marial;)Lrotuma/graveside;", "newKeyHash", "newKey", "newValue", "shift", "wireman", "(IIILjava/lang/Object;Ljava/lang/Object;ILcord/marial;)[Ljava/lang/Object;", "dovishness", "(IIILjava/lang/Object;Ljava/lang/Object;I)Lrotuma/graveside;", "trm", "(IIILjava/lang/Object;Ljava/lang/Object;ILcord/marial;)Lrotuma/graveside;", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "adultoid", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILcord/marial;)Lrotuma/graveside;", "hydrovane", "restrictive", "(IILrotuma/beachfront;)Lrotuma/graveside;", "i", "cutely", "(I)Lrotuma/graveside;", "cuirassed", "(ILrotuma/beachfront;)Lrotuma/graveside;", "beachfront", "(Ljava/lang/Object;)Z", "competently", "(Ljava/lang/Object;)Ljava/lang/Object;", "impromptu", "(Ljava/lang/Object;Ljava/lang/Object;)Lrotuma/graveside$saneness;", "gintrap", "(Ljava/lang/Object;Ljava/lang/Object;Lrotuma/beachfront;)Lrotuma/graveside;", "taiyuan", "(Ljava/lang/Object;)Lrotuma/graveside;", "cord", "(Ljava/lang/Object;Lrotuma/beachfront;)Lrotuma/graveside;", "preprohormone", "otherNode", "Lcord/saneness;", "intersectionCounter", "rotuma", "(Lrotuma/graveside;Lcord/saneness;Lcord/marial;)Lrotuma/graveside;", "sealless", "(Lrotuma/graveside;IILcord/saneness;Lrotuma/beachfront;)Lrotuma/graveside;", "marial", "()I", "formularize", "(Lrotuma/graveside;)Z", "targetNode", "peridotite", "(Lrotuma/graveside;Lrotuma/graveside;II)Lrotuma/graveside;", "polder", "(Lrotuma/graveside;Lrotuma/graveside;IILcord/marial;)Lrotuma/graveside;", "impassible", "monoploid", "triweekly", "(I)I", "privatdozent", "saran", "keyHash", "apical", "(ILjava/lang/Object;I)Z", "kowloon", "(ILjava/lang/Object;I)Ljava/lang/Object;", "yemenite", "(Lrotuma/graveside;ILcord/saneness;Lrotuma/beachfront;)Lrotuma/graveside;", "creditor", "(ILjava/lang/Object;Ljava/lang/Object;I)Lrotuma/graveside$saneness;", "oilcan", "(ILjava/lang/Object;Ljava/lang/Object;ILrotuma/beachfront;)Lrotuma/graveside;", "starveling", "(ILjava/lang/Object;I)Lrotuma/graveside;", "kattegat", "(ILjava/lang/Object;ILrotuma/beachfront;)Lrotuma/graveside;", "supplicat", "attabal", "I", "Lcord/marial;", "[Ljava/lang/Object;", "arytenoidectomy", "()[Ljava/lang/Object;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class graveside<K, V> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public int dataMap;

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final cord.marial ownedBy;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public int nodeMap;

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public Object[] buffer;

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name */
    public static final int f36912beachfront = 8;

    /* JADX INFO: renamed from: competently, reason: collision with root package name */
    public static final graveside f36913competently = new graveside(0, 0, new Object[0]);

    /* JADX INFO: renamed from: rotuma.graveside$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lrotuma/graveside$attabal;", "", "<init>", "()V", "Lrotuma/graveside;", "", "EMPTY", "Lrotuma/graveside;", "attabal", "()Lrotuma/graveside;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final graveside attabal() {
            return graveside.f36913competently;
        }

        public Companion() {
        }
    }

    /* JADX INFO: compiled from: TrieNode.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0001\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR.\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lrotuma/graveside$saneness;", "K", "V", "", "Lrotuma/graveside;", "node", "", "sizeDelta", "<init>", "(Lrotuma/graveside;I)V", "attabal", "Lrotuma/graveside;", "()Lrotuma/graveside;", "dern", "(Lrotuma/graveside;)V", "saneness", "I", "()I", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class saneness<K, V> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
        public graveside<K, V> node;

        /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
        public final int sizeDelta;

        public saneness(graveside<K, V> gravesideVar, int i) {
            this.node = gravesideVar;
            this.sizeDelta = i;
        }

        public final graveside<K, V> attabal() {
            return this.node;
        }

        public final void dern(graveside<K, V> gravesideVar) {
            this.node = gravesideVar;
        }

        /* JADX INFO: renamed from: saneness, reason: from getter */
        public final int getSizeDelta() {
            return this.sizeDelta;
        }
    }

    public graveside(int i, int i2, Object[] objArr, cord.marial marialVar) {
        this.dataMap = i;
        this.nodeMap = i2;
        this.ownedBy = marialVar;
        this.buffer = objArr;
    }

    public final graveside<K, V> adultoid(int keyHash1, K key1, V value1, int keyHash2, K key2, V value2, int shift, cord.marial owner) {
        if (shift > 30) {
            return new graveside<>(0, 0, new Object[]{key1, value1, key2, value2}, owner);
        }
        int iBeachfront = rotuma.beachfront(keyHash1, shift);
        int iBeachfront2 = rotuma.beachfront(keyHash2, shift);
        if (iBeachfront != iBeachfront2) {
            return new graveside<>((1 << iBeachfront) | (1 << iBeachfront2), 0, iBeachfront < iBeachfront2 ? new Object[]{key1, value1, key2, value2} : new Object[]{key2, value2, key1, value1}, owner);
        }
        return new graveside<>(0, 1 << iBeachfront, new Object[]{adultoid(keyHash1, key1, value1, keyHash2, key2, value2, shift + 5, owner)}, owner);
    }

    public final boolean apical(int keyHash, K key, int shift) {
        int iBeachfront = 1 << rotuma.beachfront(keyHash, shift);
        if (monoploid(iBeachfront)) {
            return Intrinsics.wireman(key, graveside(triweekly(iBeachfront)));
        }
        if (!polloi(iBeachfront)) {
            return false;
        }
        graveside<K, V> gravesideVarSaran = saran(privatdozent(iBeachfront));
        return shift == 30 ? gravesideVarSaran.beachfront(key) : gravesideVarSaran.apical(keyHash, key, shift + 5);
    }

    /* JADX INFO: renamed from: arytenoidectomy, reason: from getter */
    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final boolean beachfront(K key) {
        p002kotlin.ranges.attabal attabalVarArytenoidectomy = p002kotlin.ranges.wireman.arytenoidectomy(p002kotlin.ranges.wireman.monoploid(0, this.buffer.length), 2);
        int first = attabalVarArytenoidectomy.getFirst();
        int last = attabalVarArytenoidectomy.getLast();
        int step = attabalVarArytenoidectomy.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.wireman(key, this.buffer[first])) {
                if (first != last) {
                    first += step;
                }
            }
            return true;
        }
        return false;
    }

    public final V competently(K key) {
        p002kotlin.ranges.attabal attabalVarArytenoidectomy = p002kotlin.ranges.wireman.arytenoidectomy(p002kotlin.ranges.wireman.monoploid(0, this.buffer.length), 2);
        int first = attabalVarArytenoidectomy.getFirst();
        int last = attabalVarArytenoidectomy.getLast();
        int step = attabalVarArytenoidectomy.getStep();
        if ((step <= 0 || first > last) && (step >= 0 || last > first)) {
            return null;
        }
        while (!Intrinsics.wireman(key, graveside(first))) {
            if (first == last) {
                return null;
            }
            first += step;
        }
        return overspeculate(first);
    }

    public final graveside<K, V> cord(K key, beachfront<K, V> mutator) {
        p002kotlin.ranges.attabal attabalVarArytenoidectomy = p002kotlin.ranges.wireman.arytenoidectomy(p002kotlin.ranges.wireman.monoploid(0, this.buffer.length), 2);
        int first = attabalVarArytenoidectomy.getFirst();
        int last = attabalVarArytenoidectomy.getLast();
        int step = attabalVarArytenoidectomy.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.wireman(key, graveside(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return cuirassed(first, mutator);
        }
        return this;
    }

    public final saneness<K, V> creditor(int keyHash, K key, V value, int shift) {
        saneness<K, V> sanenessVarCreditor;
        int iBeachfront = 1 << rotuma.beachfront(keyHash, shift);
        if (monoploid(iBeachfront)) {
            int iTriweekly = triweekly(iBeachfront);
            if (!Intrinsics.wireman(key, graveside(iTriweekly))) {
                return dovishness(iTriweekly, iBeachfront, keyHash, key, value, shift).saneness();
            }
            if (overspeculate(iTriweekly) == value) {
                return null;
            }
            return splinterproof(iTriweekly, value).dern();
        }
        if (!polloi(iBeachfront)) {
            return molybdenite(iBeachfront, key, value).saneness();
        }
        int iPrivatdozent = privatdozent(iBeachfront);
        graveside<K, V> gravesideVarSaran = saran(iPrivatdozent);
        if (shift == 30) {
            sanenessVarCreditor = gravesideVarSaran.impromptu(key, value);
            if (sanenessVarCreditor == null) {
                return null;
            }
        } else {
            sanenessVarCreditor = gravesideVarSaran.creditor(keyHash, key, value, shift + 5);
            if (sanenessVarCreditor == null) {
                return null;
            }
        }
        sanenessVarCreditor.dern(mathsort(iPrivatdozent, iBeachfront, sanenessVarCreditor.attabal()));
        return sanenessVarCreditor;
    }

    public final graveside<K, V> cuirassed(int i, beachfront<K, V> mutator) {
        mutator.arytenoidectomy(mutator.size() - 1);
        mutator.triweekly(overspeculate(i));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy != mutator.getOwnership()) {
            return new graveside<>(0, 0, rotuma.impromptu(this.buffer, i), mutator.getOwnership());
        }
        this.buffer = rotuma.impromptu(this.buffer, i);
        return this;
    }

    public final graveside<K, V> cutely(int i) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new graveside<>(0, 0, rotuma.impromptu(objArr, i));
    }

    public final saneness<K, V> dern() {
        return new saneness<>(this, 0);
    }

    public final graveside<K, V> dovishness(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift) {
        return new graveside<>(this.dataMap ^ positionMask, this.nodeMap | positionMask, wireman(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, null));
    }

    public final boolean formularize(graveside<K, V> otherNode) {
        if (this == otherNode) {
            return true;
        }
        if (this.nodeMap != otherNode.nodeMap || this.dataMap != otherNode.dataMap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i = 0; i < length; i++) {
            if (this.buffer[i] != otherNode.buffer[i]) {
                return false;
            }
        }
        return true;
    }

    public final graveside<K, V> gintrap(K key, V value, beachfront<K, V> mutator) {
        p002kotlin.ranges.attabal attabalVarArytenoidectomy = p002kotlin.ranges.wireman.arytenoidectomy(p002kotlin.ranges.wireman.monoploid(0, this.buffer.length), 2);
        int first = attabalVarArytenoidectomy.getFirst();
        int last = attabalVarArytenoidectomy.getLast();
        int step = attabalVarArytenoidectomy.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.wireman(key, graveside(first))) {
                if (first != last) {
                    first += step;
                }
            }
            mutator.triweekly(overspeculate(first));
            if (this.ownedBy == mutator.getOwnership()) {
                this.buffer[first + 1] = value;
                return this;
            }
            mutator.impassible(mutator.getModCount() + 1);
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[first + 1] = value;
            return new graveside<>(0, 0, objArrCopyOf, mutator.getOwnership());
        }
        mutator.arytenoidectomy(mutator.size() + 1);
        return new graveside<>(0, 0, rotuma.competently(this.buffer, 0, key, value), mutator.getOwnership());
    }

    public final K graveside(int keyIndex) {
        return (K) this.buffer[keyIndex];
    }

    public final graveside<K, V> grimness(int keyIndex, V value, beachfront<K, V> mutator) {
        if (this.ownedBy == mutator.getOwnership()) {
            this.buffer[keyIndex + 1] = value;
            return this;
        }
        mutator.impassible(mutator.getModCount() + 1);
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[keyIndex + 1] = value;
        return new graveside<>(this.dataMap, this.nodeMap, objArrCopyOf, mutator.getOwnership());
    }

    public final graveside<K, V> hydrovane(int keyIndex, int positionMask) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new graveside<>(positionMask ^ this.dataMap, this.nodeMap, rotuma.impromptu(objArr, keyIndex));
    }

    public final int impassible() {
        return Integer.bitCount(this.dataMap);
    }

    public final saneness<K, V> impromptu(K key, V value) {
        p002kotlin.ranges.attabal attabalVarArytenoidectomy = p002kotlin.ranges.wireman.arytenoidectomy(p002kotlin.ranges.wireman.monoploid(0, this.buffer.length), 2);
        int first = attabalVarArytenoidectomy.getFirst();
        int last = attabalVarArytenoidectomy.getLast();
        int step = attabalVarArytenoidectomy.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.wireman(key, graveside(first))) {
                if (first != last) {
                    first += step;
                }
            }
            if (value == overspeculate(first)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[first + 1] = value;
            return new graveside(0, 0, objArrCopyOf).dern();
        }
        return new graveside(0, 0, rotuma.competently(this.buffer, 0, key, value)).saneness();
    }

    public final graveside<K, V> kattegat(int keyHash, K key, int shift, beachfront<K, V> mutator) {
        int iBeachfront = 1 << rotuma.beachfront(keyHash, shift);
        if (monoploid(iBeachfront)) {
            int iTriweekly = triweekly(iBeachfront);
            if (Intrinsics.wireman(key, graveside(iTriweekly))) {
                return restrictive(iTriweekly, iBeachfront, mutator);
            }
        } else if (polloi(iBeachfront)) {
            int iPrivatdozent = privatdozent(iBeachfront);
            graveside<K, V> gravesideVarSaran = saran(iPrivatdozent);
            return polder(gravesideVarSaran, shift == 30 ? gravesideVarSaran.cord(key, mutator) : gravesideVarSaran.kattegat(keyHash, key, shift + 5, mutator), iPrivatdozent, iBeachfront, mutator.getOwnership());
        }
        return this;
    }

    public final V kowloon(int keyHash, K key, int shift) {
        int iBeachfront = 1 << rotuma.beachfront(keyHash, shift);
        if (monoploid(iBeachfront)) {
            int iTriweekly = triweekly(iBeachfront);
            if (Intrinsics.wireman(key, graveside(iTriweekly))) {
                return overspeculate(iTriweekly);
            }
            return null;
        }
        if (!polloi(iBeachfront)) {
            return null;
        }
        graveside<K, V> gravesideVarSaran = saran(privatdozent(iBeachfront));
        return shift == 30 ? gravesideVarSaran.competently(key) : gravesideVarSaran.kowloon(keyHash, key, shift + 5);
    }

    public final int marial() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int iBitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i = iBitCount * 2; i < length; i++) {
            iBitCount += saran(i).marial();
        }
        return iBitCount;
    }

    public final graveside<K, V> mathsort(int nodeIndex, int positionMask, graveside<K, V> newNode) {
        Object[] objArr = newNode.buffer;
        if (objArr.length != 2 || newNode.nodeMap != 0) {
            Object[] objArr2 = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            objArrCopyOf[nodeIndex] = newNode;
            return new graveside<>(this.dataMap, this.nodeMap, objArrCopyOf);
        }
        if (this.buffer.length == 1) {
            newNode.dataMap = this.nodeMap;
            return newNode;
        }
        return new graveside<>(this.dataMap ^ positionMask, positionMask ^ this.nodeMap, rotuma.apical(this.buffer, nodeIndex, triweekly(positionMask), objArr[0], objArr[1]));
    }

    public final graveside<K, V> merc(int nodeIndex, int positionMask, cord.marial owner) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy != owner) {
            return new graveside<>(this.dataMap, positionMask ^ this.nodeMap, rotuma.taiyuan(objArr, nodeIndex), owner);
        }
        this.buffer = rotuma.taiyuan(objArr, nodeIndex);
        this.nodeMap ^= positionMask;
        return this;
    }

    public final graveside<K, V> molybdenite(int positionMask, K key, V value) {
        return new graveside<>(positionMask | this.dataMap, this.nodeMap, rotuma.competently(this.buffer, triweekly(positionMask), key, value));
    }

    public final boolean monoploid(int positionMask) {
        return (positionMask & this.dataMap) != 0;
    }

    public final graveside<K, V> oilcan(int keyHash, K key, V value, int shift, beachfront<K, V> mutator) {
        beachfront<K, V> beachfrontVar;
        graveside<K, V> gravesideVarOilcan;
        int iBeachfront = 1 << rotuma.beachfront(keyHash, shift);
        if (monoploid(iBeachfront)) {
            int iTriweekly = triweekly(iBeachfront);
            if (Intrinsics.wireman(key, graveside(iTriweekly))) {
                mutator.triweekly(overspeculate(iTriweekly));
                return overspeculate(iTriweekly) == value ? this : grimness(iTriweekly, value, mutator);
            }
            mutator.arytenoidectomy(mutator.size() + 1);
            return trm(iTriweekly, iBeachfront, keyHash, key, value, shift, mutator.getOwnership());
        }
        if (!polloi(iBeachfront)) {
            mutator.arytenoidectomy(mutator.size() + 1);
            return stratoscope(iBeachfront, key, value, mutator.getOwnership());
        }
        int iPrivatdozent = privatdozent(iBeachfront);
        graveside<K, V> gravesideVarSaran = saran(iPrivatdozent);
        if (shift == 30) {
            gravesideVarOilcan = gravesideVarSaran.gintrap(key, value, mutator);
            beachfrontVar = mutator;
        } else {
            beachfrontVar = mutator;
            gravesideVarOilcan = gravesideVarSaran.oilcan(keyHash, key, value, shift + 5, beachfrontVar);
        }
        return gravesideVarSaran == gravesideVarOilcan ? this : seminary(iPrivatdozent, gravesideVarOilcan, beachfrontVar.getOwnership());
    }

    public final V overspeculate(int keyIndex) {
        return (V) this.buffer[keyIndex + 1];
    }

    public final graveside<K, V> peridotite(graveside<K, V> targetNode, graveside<K, V> newNode, int nodeIndex, int positionMask) {
        if (newNode == null) {
            return walach(nodeIndex, positionMask);
        }
        return targetNode != newNode ? mathsort(nodeIndex, positionMask, newNode) : this;
    }

    public final graveside<K, V> polder(graveside<K, V> targetNode, graveside<K, V> newNode, int nodeIndex, int positionMask, cord.marial owner) {
        if (newNode == null) {
            return merc(nodeIndex, positionMask, owner);
        }
        return (this.ownedBy == owner || targetNode != newNode) ? seminary(nodeIndex, newNode, owner) : this;
    }

    public final boolean polloi(int positionMask) {
        return (positionMask & this.nodeMap) != 0;
    }

    public final graveside<K, V> preprohormone(K key, V value, beachfront<K, V> mutator) {
        p002kotlin.ranges.attabal attabalVarArytenoidectomy = p002kotlin.ranges.wireman.arytenoidectomy(p002kotlin.ranges.wireman.monoploid(0, this.buffer.length), 2);
        int first = attabalVarArytenoidectomy.getFirst();
        int last = attabalVarArytenoidectomy.getLast();
        int step = attabalVarArytenoidectomy.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (Intrinsics.wireman(key, graveside(first)) && Intrinsics.wireman(value, overspeculate(first))) {
                    return cuirassed(first, mutator);
                }
                if (first != last) {
                    first += step;
                }
            }
        }
        return this;
    }

    public final int privatdozent(int positionMask) {
        return (this.buffer.length - 1) - Integer.bitCount((positionMask - 1) & this.nodeMap);
    }

    public final graveside<K, V> restrictive(int keyIndex, int positionMask, beachfront<K, V> mutator) {
        mutator.arytenoidectomy(mutator.size() - 1);
        mutator.triweekly(overspeculate(keyIndex));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy != mutator.getOwnership()) {
            return new graveside<>(positionMask ^ this.dataMap, this.nodeMap, rotuma.impromptu(this.buffer, keyIndex), mutator.getOwnership());
        }
        this.buffer = rotuma.impromptu(this.buffer, keyIndex);
        this.dataMap ^= positionMask;
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final graveside<K, V> rotuma(graveside<K, V> otherNode, DeltaCounter intersectionCounter, cord.marial owner) {
        cord.attabal.attabal(this.nodeMap == 0);
        cord.attabal.attabal(this.dataMap == 0);
        cord.attabal.attabal(otherNode.nodeMap == 0);
        cord.attabal.attabal(otherNode.dataMap == 0);
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + otherNode.buffer.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        int length = this.buffer.length;
        p002kotlin.ranges.attabal attabalVarArytenoidectomy = p002kotlin.ranges.wireman.arytenoidectomy(p002kotlin.ranges.wireman.monoploid(0, otherNode.buffer.length), 2);
        int first = attabalVarArytenoidectomy.getFirst();
        int last = attabalVarArytenoidectomy.getLast();
        int step = attabalVarArytenoidectomy.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (true) {
                if (beachfront(otherNode.buffer[first])) {
                    intersectionCounter.dern(intersectionCounter.getCount() + 1);
                } else {
                    Object[] objArr2 = otherNode.buffer;
                    objArrCopyOf[length] = objArr2[first];
                    objArrCopyOf[length + 1] = objArr2[first + 1];
                    length += 2;
                }
                if (first == last) {
                    break;
                }
                first += step;
            }
        }
        if (length == this.buffer.length) {
            return this;
        }
        if (length == otherNode.buffer.length) {
            return otherNode;
        }
        if (length == objArrCopyOf.length) {
            return new graveside<>(0, 0, objArrCopyOf, owner);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(...)");
        return new graveside<>(0, 0, objArrCopyOf2, owner);
    }

    public final saneness<K, V> saneness() {
        return new saneness<>(this, 1);
    }

    public final graveside<K, V> saran(int nodeIndex) {
        Object obj = this.buffer[nodeIndex];
        Intrinsics.competently(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (graveside) obj;
    }

    public final graveside<K, V> sealless(graveside<K, V> otherNode, int positionMask, int shift, DeltaCounter intersectionCounter, beachfront<K, V> mutator) {
        if (polloi(positionMask)) {
            graveside<K, V> gravesideVarSaran = saran(privatdozent(positionMask));
            if (otherNode.polloi(positionMask)) {
                return gravesideVarSaran.yemenite(otherNode.saran(otherNode.privatdozent(positionMask)), shift + 5, intersectionCounter, mutator);
            }
            if (!otherNode.monoploid(positionMask)) {
                return gravesideVarSaran;
            }
            int iTriweekly = otherNode.triweekly(positionMask);
            K kGraveside = otherNode.graveside(iTriweekly);
            V vOverspeculate = otherNode.overspeculate(iTriweekly);
            int size = mutator.size();
            graveside<K, V> gravesideVarOilcan = gravesideVarSaran.oilcan(kGraveside != null ? kGraveside.hashCode() : 0, kGraveside, vOverspeculate, shift + 5, mutator);
            if (mutator.size() == size) {
                intersectionCounter.dern(intersectionCounter.getCount() + 1);
            }
            return gravesideVarOilcan;
        }
        if (!otherNode.polloi(positionMask)) {
            int iTriweekly2 = triweekly(positionMask);
            K kGraveside2 = graveside(iTriweekly2);
            V vOverspeculate2 = overspeculate(iTriweekly2);
            int iTriweekly3 = otherNode.triweekly(positionMask);
            K kGraveside3 = otherNode.graveside(iTriweekly3);
            return adultoid(kGraveside2 != null ? kGraveside2.hashCode() : 0, kGraveside2, vOverspeculate2, kGraveside3 != null ? kGraveside3.hashCode() : 0, kGraveside3, otherNode.overspeculate(iTriweekly3), shift + 5, mutator.getOwnership());
        }
        graveside<K, V> gravesideVarSaran2 = otherNode.saran(otherNode.privatdozent(positionMask));
        if (!monoploid(positionMask)) {
            return gravesideVarSaran2;
        }
        int iTriweekly4 = triweekly(positionMask);
        K kGraveside4 = graveside(iTriweekly4);
        int i = shift + 5;
        if (!gravesideVarSaran2.apical(kGraveside4 != null ? kGraveside4.hashCode() : 0, kGraveside4, i)) {
            return gravesideVarSaran2.oilcan(kGraveside4 != null ? kGraveside4.hashCode() : 0, kGraveside4, overspeculate(iTriweekly4), i, mutator);
        }
        intersectionCounter.dern(intersectionCounter.getCount() + 1);
        return gravesideVarSaran2;
    }

    public final graveside<K, V> seminary(int nodeIndex, graveside<K, V> newNode, cord.marial owner) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && newNode.buffer.length == 2 && newNode.nodeMap == 0) {
            newNode.dataMap = this.nodeMap;
            return newNode;
        }
        if (this.ownedBy == owner) {
            objArr[nodeIndex] = newNode;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[nodeIndex] = newNode;
        return new graveside<>(this.dataMap, this.nodeMap, objArrCopyOf, owner);
    }

    public final graveside<K, V> splinterproof(int keyIndex, V value) {
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[keyIndex + 1] = value;
        return new graveside<>(this.dataMap, this.nodeMap, objArrCopyOf);
    }

    public final graveside<K, V> starveling(int keyHash, K key, int shift) {
        int iBeachfront = 1 << rotuma.beachfront(keyHash, shift);
        if (monoploid(iBeachfront)) {
            int iTriweekly = triweekly(iBeachfront);
            if (Intrinsics.wireman(key, graveside(iTriweekly))) {
                return hydrovane(iTriweekly, iBeachfront);
            }
        } else if (polloi(iBeachfront)) {
            int iPrivatdozent = privatdozent(iBeachfront);
            graveside<K, V> gravesideVarSaran = saran(iPrivatdozent);
            return peridotite(gravesideVarSaran, shift == 30 ? gravesideVarSaran.taiyuan(key) : gravesideVarSaran.starveling(keyHash, key, shift + 5), iPrivatdozent, iBeachfront);
        }
        return this;
    }

    public final graveside<K, V> stratoscope(int positionMask, K key, V value, cord.marial owner) {
        int iTriweekly = triweekly(positionMask);
        if (this.ownedBy != owner) {
            return new graveside<>(positionMask | this.dataMap, this.nodeMap, rotuma.competently(this.buffer, iTriweekly, key, value), owner);
        }
        this.buffer = rotuma.competently(this.buffer, iTriweekly, key, value);
        this.dataMap = positionMask | this.dataMap;
        return this;
    }

    public final graveside<K, V> supplicat(int keyHash, K key, V value, int shift, beachfront<K, V> mutator) {
        int iBeachfront = 1 << rotuma.beachfront(keyHash, shift);
        if (monoploid(iBeachfront)) {
            int iTriweekly = triweekly(iBeachfront);
            if (Intrinsics.wireman(key, graveside(iTriweekly)) && Intrinsics.wireman(value, overspeculate(iTriweekly))) {
                return restrictive(iTriweekly, iBeachfront, mutator);
            }
        } else if (polloi(iBeachfront)) {
            int iPrivatdozent = privatdozent(iBeachfront);
            graveside<K, V> gravesideVarSaran = saran(iPrivatdozent);
            return polder(gravesideVarSaran, shift == 30 ? gravesideVarSaran.preprohormone(key, value, mutator) : gravesideVarSaran.supplicat(keyHash, key, value, shift + 5, mutator), iPrivatdozent, iBeachfront, mutator.getOwnership());
        }
        return this;
    }

    public final graveside<K, V> taiyuan(K key) {
        p002kotlin.ranges.attabal attabalVarArytenoidectomy = p002kotlin.ranges.wireman.arytenoidectomy(p002kotlin.ranges.wireman.monoploid(0, this.buffer.length), 2);
        int first = attabalVarArytenoidectomy.getFirst();
        int last = attabalVarArytenoidectomy.getLast();
        int step = attabalVarArytenoidectomy.getStep();
        if ((step > 0 && first <= last) || (step < 0 && last <= first)) {
            while (!Intrinsics.wireman(key, graveside(first))) {
                if (first != last) {
                    first += step;
                }
            }
            return cutely(first);
        }
        return this;
    }

    public final int triweekly(int positionMask) {
        return Integer.bitCount((positionMask - 1) & this.dataMap) * 2;
    }

    public final graveside<K, V> trm(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift, cord.marial owner) {
        if (this.ownedBy != owner) {
            return new graveside<>(this.dataMap ^ positionMask, positionMask | this.nodeMap, wireman(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, owner), owner);
        }
        this.buffer = wireman(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, owner);
        this.dataMap ^= positionMask;
        this.nodeMap |= positionMask;
        return this;
    }

    public final graveside<K, V> walach(int nodeIndex, int positionMask) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        return new graveside<>(this.dataMap, positionMask ^ this.nodeMap, rotuma.taiyuan(objArr, nodeIndex));
    }

    public final Object[] wireman(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift, cord.marial owner) {
        K kGraveside = graveside(keyIndex);
        return rotuma.cutely(this.buffer, keyIndex, privatdozent(positionMask) + 1, adultoid(kGraveside != null ? kGraveside.hashCode() : 0, kGraveside, overspeculate(keyIndex), newKeyHash, newKey, newValue, shift + 5, owner));
    }

    public final graveside<K, V> yemenite(graveside<K, V> otherNode, int shift, DeltaCounter intersectionCounter, beachfront<K, V> mutator) {
        if (this == otherNode) {
            intersectionCounter.saneness(marial());
            return this;
        }
        int i = shift;
        if (i > 30) {
            return rotuma(otherNode, intersectionCounter, mutator.getOwnership());
        }
        int i2 = this.nodeMap | otherNode.nodeMap;
        int i3 = this.dataMap;
        int i4 = otherNode.dataMap;
        int i5 = (i3 ^ i4) & (~i2);
        int i6 = i3 & i4;
        while (i6 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i6);
            if (Intrinsics.wireman(graveside(triweekly(iLowestOneBit)), otherNode.graveside(otherNode.triweekly(iLowestOneBit)))) {
                i5 |= iLowestOneBit;
            } else {
                i2 |= iLowestOneBit;
            }
            i6 ^= iLowestOneBit;
        }
        int i7 = 0;
        if (!((i2 & i5) == 0)) {
            lightstruck.saneness("Check failed.");
        }
        graveside<K, V> gravesideVar = (Intrinsics.wireman(this.ownedBy, mutator.getOwnership()) && this.dataMap == i5 && this.nodeMap == i2) ? this : new graveside<>(i5, i2, new Object[(Integer.bitCount(i5) * 2) + Integer.bitCount(i2)]);
        int i8 = i2;
        int i9 = 0;
        while (i8 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i8);
            Object[] objArr = gravesideVar.buffer;
            objArr[(objArr.length - 1) - i9] = sealless(otherNode, iLowestOneBit2, i, intersectionCounter, mutator);
            i9++;
            i8 ^= iLowestOneBit2;
            i = shift;
        }
        while (i5 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i5);
            int i10 = i7 * 2;
            if (otherNode.monoploid(iLowestOneBit3)) {
                int iTriweekly = otherNode.triweekly(iLowestOneBit3);
                gravesideVar.buffer[i10] = otherNode.graveside(iTriweekly);
                gravesideVar.buffer[i10 + 1] = otherNode.overspeculate(iTriweekly);
                if (monoploid(iLowestOneBit3)) {
                    intersectionCounter.dern(intersectionCounter.getCount() + 1);
                }
            } else {
                int iTriweekly2 = triweekly(iLowestOneBit3);
                gravesideVar.buffer[i10] = graveside(iTriweekly2);
                gravesideVar.buffer[i10 + 1] = overspeculate(iTriweekly2);
            }
            i7++;
            i5 ^= iLowestOneBit3;
        }
        if (formularize(gravesideVar)) {
            return this;
        }
        return otherNode.formularize(gravesideVar) ? otherNode : gravesideVar;
    }

    public graveside(int i, int i2, Object[] objArr) {
        this(i, i2, objArr, null);
    }
}
