/**
 * <code> 
 * 
 *  import org.metable.trek.sandbox.type.point.Point;
 *  
 *  type LineSegment {
 *  
 *      rep LineSegment {
 *          Point begin;
 *          Point end;
 *          
 *          constraint {
 *              !begin.equals(end);
 *          }
 *      }
 *      
 *      init {
 *          LineSegment(Point.cartesian(0, 0), Point.cartesian(10, 10);
 *      }
 *  }
 *  
 *  </code>
 */

package org.metable.trek.sandbox.type.linesegment;

import java.util.Collections;
import java.util.List;

import org.metable.trek.sandbox.type.point.Point;

public interface LineSegment {

    public static Point getBegin(LineSegment lineSegment) {
        return ((LineSegmentImpl) lineSegment).getBegin();
    }

    public static Point getEnd(LineSegment lineSegment) {
        return ((LineSegmentImpl) lineSegment).getEnd();
    }

    public static List<Class<?>> getSubtypes() {
        return Collections.emptyList();
    }

    public static boolean isType(Object value) {
        return (value instanceof LineSegment);
    }

    public static LineSegment lineSegment() {
        return lineSegment(Point.cartesian(0, 0), Point.cartesian(10, 10));
    }

    public static LineSegment lineSegment(LineSegment lineSegment) {
        return lineSegment(LineSegment.getBegin(lineSegment), LineSegment.getEnd(lineSegment));
    }

    public static LineSegment lineSegment(Point begin, Point end) {
        LineSegmentImpl lineSegment = new LineSegmentImpl();

        lineSegment.rep = new LineSegmentImpl.LineSegment(begin, end);

        assert (LineSegmentImpl.LineSegment.constraint(lineSegment.rep));

        return lineSegment;
    }

    public static void setBegin(LineSegment lineSegment, Point begin) {
        ((LineSegmentImpl) lineSegment).setBegin(begin);
    }
    
    public static void setEnd(LineSegment lineSegment, Point end) {
        ((LineSegmentImpl) lineSegment).setEnd(end);
    }
}
