import sbt.Keys.libraryDependencies

lazy val checkoutCart = (project in file(".")).settings(
  Seq(
    name := "checkout-cart",
    version := "0.1",
    scalaVersion := "2.12.6",
    libraryDependencies := Seq(
      "org.scalatest"                %%  "scalatest"                    % "3.0.1"
    )
  )
)