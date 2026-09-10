package qk;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public interface c extends b {
    Object call(Object... objArr);

    Object callBy(Map map);

    String getName();

    List getParameters();

    x getReturnType();

    List getTypeParameters();

    c0 getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
