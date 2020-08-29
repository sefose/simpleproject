import React, { useState, useEffect } from "react";
import DummyElement from "../components/DummyElement";
import { findAllDummies } from "../service/DummyService";

const DummyList = () => {
  const [dummies, setDummies] = useState([]);

  useEffect(() => {
    findAllDummies().then((resp) => {
      console.log("resp", resp)
      setDummies(resp.data)}
      ).catch(
        error => console.log('error', error)
      );
  }, [setDummies]);

  return (
    <div className="">
      {dummies.map(dummy => (
        <DummyElement dummy={dummy} key={dummy.id}></DummyElement>
      ))}
    </div>
  );
};

export default DummyList;
