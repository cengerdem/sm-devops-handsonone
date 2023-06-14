import java

from FieldDeclaration field
where
  field.getType().toString() = "String" and
  field.getVariableDeclarators().getNames().toString() = "password"
error "Potential security vulnerability: Password variable declaration found."