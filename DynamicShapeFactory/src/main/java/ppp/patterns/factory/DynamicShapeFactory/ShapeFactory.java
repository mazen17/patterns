package ppp.patterns.factory.DynamicShapeFactory;

public interface ShapeFactory
{
  public Shape make(String shapeName) throws Exception;
}
