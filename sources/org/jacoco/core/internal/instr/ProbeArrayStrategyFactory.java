package org.jacoco.core.internal.instr;

import org.jacoco.core.internal.flow.ClassProbesAdapter;
import org.jacoco.core.runtime.IExecutionDataAccessorGenerator;
import org.objectweb.asm.ClassReader;

/* JADX INFO: loaded from: classes5.dex */
public final class ProbeArrayStrategyFactory {
    private ProbeArrayStrategyFactory() {
    }

    public static IProbeArrayStrategy createFor(long j, ClassReader classReader, IExecutionDataAccessorGenerator iExecutionDataAccessorGenerator) {
        String className = classReader.getClassName();
        int majorVersion = InstrSupport.getMajorVersion(classReader);
        if (!isInterfaceOrModule(classReader)) {
            return majorVersion >= 55 ? new CondyProbeArrayStrategy(className, false, j, iExecutionDataAccessorGenerator) : new ClassFieldProbeArrayStrategy(className, j, InstrSupport.needsFrames(majorVersion), iExecutionDataAccessorGenerator);
        }
        ProbeCounter probeCounter = getProbeCounter(classReader);
        if (probeCounter.getCount() == 0) {
            return new NoneProbeArrayStrategy();
        }
        if (majorVersion < 55 || !probeCounter.hasMethods()) {
            return (majorVersion < 52 || !probeCounter.hasMethods()) ? new LocalProbeArrayStrategy(className, j, probeCounter.getCount(), iExecutionDataAccessorGenerator) : new InterfaceFieldProbeArrayStrategy(className, j, probeCounter.getCount(), iExecutionDataAccessorGenerator);
        }
        return new CondyProbeArrayStrategy(className, true, j, iExecutionDataAccessorGenerator);
    }

    private static ProbeCounter getProbeCounter(ClassReader classReader) {
        ProbeCounter probeCounter = new ProbeCounter();
        classReader.accept(new ClassProbesAdapter(probeCounter, false), 0);
        return probeCounter;
    }

    private static boolean isInterfaceOrModule(ClassReader classReader) {
        return (classReader.getAccess() & 33280) != 0;
    }
}
