package org.jacoco.core.internal.flow;

import org.jacoco.core.internal.analysis.Instruction;
import org.objectweb.asm.Label;

/* JADX INFO: loaded from: classes5.dex */
public final class LabelInfo {
    public static final int NO_PROBE = -1;
    private boolean target = false;
    private boolean multiTarget = false;
    private boolean successor = false;
    private boolean methodInvocationLine = false;
    private boolean done = false;
    private int probeid = -1;
    private Label intermediate = null;
    private Instruction instruction = null;

    private LabelInfo() {
    }

    private static LabelInfo create(Label label) {
        LabelInfo labelInfo = get(label);
        if (labelInfo != null) {
            return labelInfo;
        }
        LabelInfo labelInfo2 = new LabelInfo();
        label.info = labelInfo2;
        return labelInfo2;
    }

    private static LabelInfo get(Label label) {
        Object obj = label.info;
        if (obj instanceof LabelInfo) {
            return (LabelInfo) obj;
        }
        return null;
    }

    public static Instruction getInstruction(Label label) {
        LabelInfo labelInfo = get(label);
        if (labelInfo == null) {
            return null;
        }
        return labelInfo.instruction;
    }

    public static Label getIntermediateLabel(Label label) {
        LabelInfo labelInfo = get(label);
        if (labelInfo == null) {
            return null;
        }
        return labelInfo.intermediate;
    }

    public static int getProbeId(Label label) {
        LabelInfo labelInfo = get(label);
        if (labelInfo == null) {
            return -1;
        }
        return labelInfo.probeid;
    }

    public static boolean isDone(Label label) {
        LabelInfo labelInfo = get(label);
        if (labelInfo == null) {
            return false;
        }
        return labelInfo.done;
    }

    public static boolean isMethodInvocationLine(Label label) {
        LabelInfo labelInfo = get(label);
        if (labelInfo == null) {
            return false;
        }
        return labelInfo.methodInvocationLine;
    }

    public static boolean isMultiTarget(Label label) {
        LabelInfo labelInfo = get(label);
        if (labelInfo == null) {
            return false;
        }
        return labelInfo.multiTarget;
    }

    public static boolean isSuccessor(Label label) {
        LabelInfo labelInfo = get(label);
        if (labelInfo == null) {
            return false;
        }
        return labelInfo.successor;
    }

    public static boolean needsProbe(Label label) {
        LabelInfo labelInfo = get(label);
        if (labelInfo == null || !labelInfo.successor) {
            return false;
        }
        return labelInfo.multiTarget || labelInfo.methodInvocationLine;
    }

    public static void resetDone(Label label) {
        LabelInfo labelInfo = get(label);
        if (labelInfo != null) {
            labelInfo.done = false;
        }
    }

    public static void setDone(Label label) {
        create(label).done = true;
    }

    public static void setInstruction(Label label, Instruction instruction) {
        create(label).instruction = instruction;
    }

    public static void setIntermediateLabel(Label label, Label label2) {
        create(label).intermediate = label2;
    }

    public static void setMethodInvocationLine(Label label) {
        create(label).methodInvocationLine = true;
    }

    public static void setProbeId(Label label, int i) {
        create(label).probeid = i;
    }

    public static void setSuccessor(Label label) {
        LabelInfo labelInfoCreate = create(label);
        labelInfoCreate.successor = true;
        if (labelInfoCreate.target) {
            labelInfoCreate.multiTarget = true;
        }
    }

    public static void setTarget(Label label) {
        LabelInfo labelInfoCreate = create(label);
        if (labelInfoCreate.target || labelInfoCreate.successor) {
            labelInfoCreate.multiTarget = true;
        } else {
            labelInfoCreate.target = true;
        }
    }

    public static void resetDone(Label[] labelArr) {
        for (Label label : labelArr) {
            resetDone(label);
        }
    }
}
