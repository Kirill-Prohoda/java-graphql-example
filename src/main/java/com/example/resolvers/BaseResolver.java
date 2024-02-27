package com.example.resolvers;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.schema.GraphQLImplementingType;

public class BaseResolver implements GraphQLQueryResolver {


  public Test(){
    return "test";
  }


  

}
