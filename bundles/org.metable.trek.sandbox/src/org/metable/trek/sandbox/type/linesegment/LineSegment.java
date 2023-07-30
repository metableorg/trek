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
        return lineSegment(lineSegment.getBegin(), lineSegment.getEnd());
    }

    public static LineSegment lineSegment(Point begin, Point end) {
        LineSegmentImpl lineSegment = new LineSegmentImpl();

        lineSegment.rep = new LineSegmentImpl.LineSegment(begin, end);

        return lineSegment;
    }
    
    public static boolean instanceOfLineSegment(Object other) {
        return other instanceof LineSegment;
    }

    public Point getBegin();

    public Point getEnd();

    public void setBegin(Point begin);

    public void setEnd(Point end);
}
