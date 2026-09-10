package com.badlogic.gdx.graphics.g3d.particles;

import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.reflect.ArrayReflection;

/* JADX INFO: loaded from: classes.dex */
public class ParallelArray {
    public int capacity;
    Array<Channel> arrays = new Array<>(false, 2, Channel.class);
    public int size = 0;

    public abstract class Channel {
        public Object data;
        public int id;
        public int strideSize;

        public Channel(int i, Object obj, int i2) {
            this.id = i;
            this.strideSize = i2;
            this.data = obj;
        }

        public abstract void add(int i, Object... objArr);

        public abstract void setCapacity(int i);

        public abstract void swap(int i, int i2);
    }

    public static class ChannelDescriptor {
        public int count;
        public int id;
        public Class<?> type;

        public ChannelDescriptor(int i, Class<?> cls, int i2) {
            this.id = i;
            this.type = cls;
            this.count = i2;
        }
    }

    public interface ChannelInitializer<T extends Channel> {
        void init(T t);
    }

    public class FloatChannel extends Channel {
        public float[] data;

        public FloatChannel(int i, int i2, int i3) {
            super(i, new float[i3 * i2], i2);
            this.data = (float[]) super.data;
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParallelArray.Channel
        public void add(int i, Object... objArr) {
            int i2 = this.strideSize;
            int i3 = ParallelArray.this.size * i2;
            int i4 = i2 + i3;
            int i5 = 0;
            while (i3 < i4) {
                this.data[i3] = ((Float) objArr[i5]).floatValue();
                i3++;
                i5++;
            }
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParallelArray.Channel
        public void setCapacity(int i) {
            int i2 = this.strideSize * i;
            float[] fArr = new float[i2];
            float[] fArr2 = this.data;
            System.arraycopy(fArr2, 0, fArr, 0, Math.min(fArr2.length, i2));
            this.data = fArr;
            super.data = fArr;
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParallelArray.Channel
        public void swap(int i, int i2) {
            int i3 = this.strideSize;
            int i4 = i * i3;
            int i5 = i2 * i3;
            int i6 = i3 + i4;
            while (i4 < i6) {
                float[] fArr = this.data;
                float f = fArr[i4];
                fArr[i4] = fArr[i5];
                fArr[i5] = f;
                i4++;
                i5++;
            }
        }
    }

    public class IntChannel extends Channel {
        public int[] data;

        public IntChannel(int i, int i2, int i3) {
            super(i, new int[i3 * i2], i2);
            this.data = (int[]) super.data;
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParallelArray.Channel
        public void add(int i, Object... objArr) {
            int i2 = this.strideSize;
            int i3 = ParallelArray.this.size * i2;
            int i4 = i2 + i3;
            int i5 = 0;
            while (i3 < i4) {
                this.data[i3] = ((Integer) objArr[i5]).intValue();
                i3++;
                i5++;
            }
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParallelArray.Channel
        public void setCapacity(int i) {
            int i2 = this.strideSize * i;
            int[] iArr = new int[i2];
            int[] iArr2 = this.data;
            System.arraycopy(iArr2, 0, iArr, 0, Math.min(iArr2.length, i2));
            this.data = iArr;
            super.data = iArr;
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParallelArray.Channel
        public void swap(int i, int i2) {
            int i3 = this.strideSize;
            int i4 = i * i3;
            int i5 = i2 * i3;
            int i6 = i3 + i4;
            while (i4 < i6) {
                int[] iArr = this.data;
                int i7 = iArr[i4];
                iArr[i4] = iArr[i5];
                iArr[i5] = i7;
                i4++;
                i5++;
            }
        }
    }

    public class ObjectChannel<T> extends Channel {
        Class<T> componentType;
        public T[] data;

        public ObjectChannel(int i, int i2, int i3, Class<T> cls) {
            super(i, ArrayReflection.newInstance(cls, i3 * i2), i2);
            this.componentType = cls;
            this.data = (T[]) ((Object[]) super.data);
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParallelArray.Channel
        public void add(int i, Object... objArr) {
            int i2 = this.strideSize;
            int i3 = ParallelArray.this.size * i2;
            int i4 = i2 + i3;
            int i5 = 0;
            while (i3 < i4) {
                ((T[]) this.data)[i3] = objArr[i5];
                i3++;
                i5++;
            }
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParallelArray.Channel
        public void setCapacity(int i) {
            T[] tArr = (T[]) ((Object[]) ArrayReflection.newInstance(this.componentType, this.strideSize * i));
            T[] tArr2 = this.data;
            System.arraycopy(tArr2, 0, tArr, 0, Math.min(tArr2.length, tArr.length));
            this.data = tArr;
            super.data = tArr;
        }

        @Override // com.badlogic.gdx.graphics.g3d.particles.ParallelArray.Channel
        public void swap(int i, int i2) {
            int i3 = this.strideSize;
            int i4 = i * i3;
            int i5 = i2 * i3;
            int i6 = i3 + i4;
            while (i4 < i6) {
                T[] tArr = this.data;
                T t = tArr[i4];
                tArr[i4] = tArr[i5];
                tArr[i5] = t;
                i4++;
                i5++;
            }
        }
    }

    public ParallelArray(int i) {
        this.capacity = i;
    }

    private <T extends Channel> T allocateChannel(ChannelDescriptor channelDescriptor) {
        Class<?> cls = channelDescriptor.type;
        if (cls == Float.TYPE) {
            return new FloatChannel(channelDescriptor.id, channelDescriptor.count, this.capacity);
        }
        return cls == Integer.TYPE ? new IntChannel(channelDescriptor.id, channelDescriptor.count, this.capacity) : new ObjectChannel(channelDescriptor.id, channelDescriptor.count, this.capacity, cls);
    }

    private int findIndex(int i) {
        int i2 = 0;
        while (true) {
            Array<Channel> array = this.arrays;
            if (i2 >= array.size) {
                return -1;
            }
            if (array.items[i2].id == i) {
                return i2;
            }
            i2++;
        }
    }

    public <T extends Channel> T addChannel(ChannelDescriptor channelDescriptor) {
        return (T) addChannel(channelDescriptor, null);
    }

    public void addElement(Object... objArr) {
        if (this.size == this.capacity) {
            throw new GdxRuntimeException("Capacity reached, cannot add other elements");
        }
        Array.ArrayIterator<Channel> it = this.arrays.iterator();
        int i = 0;
        while (it.hasNext()) {
            Channel next = it.next();
            next.add(i, objArr);
            i += next.strideSize;
        }
        this.size++;
    }

    public void clear() {
        this.arrays.clear();
        this.size = 0;
    }

    public <T extends Channel> T getChannel(ChannelDescriptor channelDescriptor) {
        Array.ArrayIterator<Channel> it = this.arrays.iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.id == channelDescriptor.id) {
                return t;
            }
        }
        return null;
    }

    public <T> void removeArray(int i) {
        this.arrays.removeIndex(findIndex(i));
    }

    public void removeElement(int i) {
        int i2 = this.size - 1;
        Array.ArrayIterator<Channel> it = this.arrays.iterator();
        while (it.hasNext()) {
            it.next().swap(i, i2);
        }
        this.size = i2;
    }

    public void setCapacity(int i) {
        if (this.capacity != i) {
            Array.ArrayIterator<Channel> it = this.arrays.iterator();
            while (it.hasNext()) {
                it.next().setCapacity(i);
            }
            this.capacity = i;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public <T extends Channel> T addChannel(ChannelDescriptor channelDescriptor, ChannelInitializer<T> channelInitializer) {
        T t = (T) getChannel(channelDescriptor);
        if (t == null) {
            t = (T) allocateChannel(channelDescriptor);
            if (channelInitializer != null) {
                channelInitializer.init(t);
            }
            this.arrays.add(t);
        }
        return t;
    }
}
